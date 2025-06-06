package tablemodel;

import controlador.ConexoesController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import model.core.DataBaseModel;

public class DataBaseTableModel extends AbstractTableModel{
           
    private final List<DataBaseModel> lista;
    
    private final String[] colunas = {" Código "," Servidor (Host)"," Base "," Usuário "," Senha "," Porta "," Descrição "," Tipo ", " Excluir"};
    
    public DataBaseTableModel(){
        lista = new ArrayList<>();
    }
    
    public DataBaseTableModel(List<DataBaseModel> lista){
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
                return Object.class;
            case 5:
                return Object.class;
            case 6:
                return Object.class;
            case 7:
                return Object.class;                
            case 8:
                return Boolean.class;
            default:
                throw new IndexOutOfBoundsException("Erro!!!!! NO GET COLLUMN");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //funcao = new Validar();
        DataBaseModel databaseModel = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return databaseModel.getCodigo();
            case 1:
                return databaseModel.getServidor();
            case 2:
                return databaseModel.getBanco();
            case 3:
                return databaseModel.getUsuario();
            case 4:
                return databaseModel.getSenha();
            case 5:
                return databaseModel.getPorta();
            case 6:
                return databaseModel.getDescricao();
            case 7:
                return databaseModel.getTipo();
            case 8:
                return databaseModel.isAtivo();
            default:
                throw new IndexOutOfBoundsException("Erro Indice!!!(getValueAt)");
        }
    }

    @Override
    public void setValueAt(Object aValue, int linhaIndice, int colunaIndice) {      
        DataBaseModel databaseModel = lista.get(linhaIndice);
        switch(colunaIndice){
            case 0:
                databaseModel.setCodigo((Integer) aValue);
                break;
            case 1:
                databaseModel.setServidor((String) aValue);
                break;
            case 2:
                databaseModel.setBanco((String) aValue);
                break;
            case 3:
                databaseModel.setUsuario((String) aValue);
                break;
            case 4:
                databaseModel.setSenha((String) aValue);
                break;
            case 5:
                databaseModel.setPorta((Integer) aValue);
                break;
            case 6:
                databaseModel.setDescricao((String) aValue);
                break;
            case 7:
                databaseModel.setTipo((String) aValue);
                break;                
            case 8:
                databaseModel.setAtivo((boolean) aValue);
                break;    
            default:
                throw new IndexOutOfBoundsException("Erro!!! NO SET VALEU AT");
        }        
        fireTableCellUpdated(linhaIndice, colunaIndice);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 8;
    }
    
    public DataBaseModel getDataBase(int indiceLinha){
        return lista.get(indiceLinha);
    }
    
    public void addDataBase(List<DataBaseModel> base){
        int indice = getRowCount();        
        lista.addAll(base);
        fireTableRowsInserted(indice, indice);        
    }

    public void addListaBase(List<DataBaseModel> base){
        int indice = getRowCount();
        lista.addAll(base);
        fireTableRowsInserted(indice, indice);        
    }
    
    public void limpar(){        
        lista.clear();	         
        fireTableDataChanged();
    }
    
    public void remover(int indiceLinha,int codigo) throws SQLException, ClassNotFoundException, Exception{    
        DataBaseModel base = new DataBaseModel();        
        ConexoesController cc = new ConexoesController();
        int x = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir a base selecionada?","Confirmar exclusão de DataBase",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.OK_OPTION){
            if(lista.get(indiceLinha).isAtivo() == true){
                base = lista.remove(indiceLinha);                                
                cc.excluirDataBase(codigo);                
                fireTableRowsDeleted(indiceLinha, indiceLinha);                
            }
        }else{            
            lista.get(indiceLinha).setAtivo(false);            
        }
    }
}