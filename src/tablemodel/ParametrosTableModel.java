package tablemodel;

import controlador.ConfiguracaoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;

import model.core.ParametroModel;


public class ParametrosTableModel extends AbstractTableModel{
           
    private final List<ParametroModel> lista;
    
    private final String[] colunas = {"Código "," xIdParametro"," Descrição "," Atualização ", "Excluir"};
    
    public ParametrosTableModel(){
        lista = new ArrayList<>();
    }
    
    public ParametrosTableModel(List<ParametroModel> lista){
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
        ParametroModel par = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return par.getCodigo();
            case 1:
                return par.getxIdParametro();
            case 2:
                return par.getDescricao();
            case 3:
                return par.getAtualizacao();
            case 4:
                return par.isAtivo();
            default:
                throw new IndexOutOfBoundsException("Erro Indice!!!(getValueAt)");
        }
    }

    @Override
    public void setValueAt(Object aValue, int linhaIndice, int colunaIndice) {      
        ParametroModel par = lista.get(linhaIndice);
        switch(colunaIndice){
            case 0:
                par.setCodigo((Integer) aValue);
                break;
            case 1:
                par.setxIdParametro((String) aValue);
                break;
            case 2:
                par.setDescricao((String) aValue);
                break;
            case 3:
                par.setAtualizacao((String) aValue);
                break;
            case 4:
                par.setAtivo((boolean) aValue);
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
    
    public ParametroModel getParametro(int indiceLinha){
        return lista.get(indiceLinha);
    }
    
    public void addParametro(List<ParametroModel> par){
        int indice = getRowCount();        
        lista.addAll(par);
        fireTableRowsInserted(indice, indice);        
    }

    public void addListaParametro(List<ParametroModel> par){
        int indice = getRowCount();
        lista.addAll(par);
        fireTableRowsInserted(indice, indice);        
    }
    
    public void limpar(){        
        lista.clear();	         
        fireTableDataChanged();
    }
    
    public void remover(int indiceLinha,int codigo) throws SQLException, ClassNotFoundException, Exception{    
        ParametroModel par = new ParametroModel();        
        ConfiguracaoController cc = new ConfiguracaoController();
        int x = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir o parametro selecionado?","Confirmar exclusão de Parametro",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.OK_OPTION){
            if(lista.get(indiceLinha).isAtivo() == true){
                par = lista.remove(indiceLinha);                                
                cc.excluirParametro(codigo);                
                fireTableRowsDeleted(indiceLinha, indiceLinha);                
            }
        }else{            
            lista.get(indiceLinha).setAtivo(false);            
        }
    }
}