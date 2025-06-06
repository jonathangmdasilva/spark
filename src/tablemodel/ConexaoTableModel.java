package tablemodel;

import controlador.ConexoesController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import model.core.ConexaoModel;


public class ConexaoTableModel extends AbstractTableModel{
           
    private final List<ConexaoModel> lista;
    
    private final String[] colunas = {"Código ","Servidor ","Banco ","Cliente ","Excluir"};
    
    public ConexaoTableModel(){
        lista = new ArrayList<>();
    }
    
    public ConexaoTableModel(List<ConexaoModel> lista){
        this.lista = new ArrayList<>(lista);
    }
    
    @Override
    public int getRowCount() {        
        return lista.size();                
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Object.class;
            case 1:
                return Object.class;
            case 2:
                return Object.class;
            case 3:
                return Object.class;
            case 4:
                return Boolean.class;
            default:
                throw new IndexOutOfBoundsException("Erro!!!!! NO GET COLLUMN");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //funcao = new Validar();
        ConexaoModel conexao = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return conexao.getCodigo();
            case 1:
                return conexao.getServidor();
            case 2:
                return conexao.getBanco();
            case 3:
                return conexao.getCliente();
            case 4:
                return conexao.isAtivo();
            default:
                throw new IndexOutOfBoundsException("Erro Indice!!!(getValueAt)");
        }
    }

    @Override
    public void setValueAt(Object aValue, int linhaIndice, int colunaIndice) {      
        ConexaoModel conexao = lista.get(linhaIndice);
        switch(colunaIndice){
            case 0:
                conexao.setCodigo((Integer) aValue);
                break;
            case 1:
                conexao.setServidor((String) aValue);
                break;
            case 2:
                conexao.setBanco((String) aValue);
                break;
            case 3:
                conexao.setCliente((String) aValue);
                break;
            case 4:
                conexao.setAtivo((boolean) aValue);
                break;    
            default:
                throw new IndexOutOfBoundsException("Erro!!! NO SET VALEU AT");
        }        
        fireTableCellUpdated(linhaIndice, colunaIndice);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 4;
    }
    
    public ConexaoModel getKey(int indiceLinha){
        return lista.get(indiceLinha);
    }
    
    public void addConexao(List<ConexaoModel> con){
        int indice = getRowCount();        
        lista.addAll(con);
        fireTableRowsInserted(indice, indice);        
    }

    public void addListaConexoes(List<ConexaoModel> con){
        int indice = getRowCount();
        lista.addAll(con);
        fireTableRowsInserted(indice, indice);        
    }
    
    public void limpar(){        
        lista.clear();	         
        fireTableDataChanged();
    }
    
    public void remover(int indiceLinha,int codigo) throws SQLException, ClassNotFoundException, Exception{    
        ConexaoModel conexao = new ConexaoModel();        
        ConexoesController cc = new ConexoesController();
        int x = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir o serial selecionado?","Confirmar exclusão de Serial",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.OK_OPTION){
            if(lista.get(indiceLinha).isAtivo() == true){
                conexao = lista.remove(indiceLinha);                                
                cc.excluirConexao(codigo);                
                fireTableRowsDeleted(indiceLinha, indiceLinha);                
            }
        }else{            
            lista.get(indiceLinha).setAtivo(false);            
        }
    }
}