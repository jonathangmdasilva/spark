package tablemodel;

import controlador.KeyController;
import controlador.Funcoes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import model.core.KeyModel;


public class KeyTableModel extends AbstractTableModel{
    
    Funcoes funcao;
    
    private final List<KeyModel> lista;
    
    private final String[] colunas = {"Código ","Usuário ","Sistema Operacional ","Produto ","Key ","Data de Cadastro","Excluir"};
    
    public KeyTableModel(){
        lista = new ArrayList<>();
    }
    
    public KeyTableModel(List<KeyModel> lista){
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
                return Boolean.class;
            default:
                throw new IndexOutOfBoundsException("Erro!!!!! NO GET COLLUMN");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //funcao = new Validar();
        KeyModel key = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return key.getCodigo();
            case 1:
                return key.getUsuario();
            case 2:
                return key.getSo();
            case 3:
                return key.getDescricao();
            case 4:
                return key.getSerial();
            case 5:
                return key.getData();
            case 6:
                return key.isAtivo();
            default:
                throw new IndexOutOfBoundsException("Erro Indice!!!(getValueAt)");
        }
    }

    @Override
    public void setValueAt(Object aValue, int linhaIndice, int colunaIndice) {      
        KeyModel key = lista.get(linhaIndice);
        switch(colunaIndice){
            case 0:
                key.setCodigo((Integer) aValue);
                break;
            case 1:
                key.setUsuario((String) aValue);
                break;
            case 2:
                key.setSo((String) aValue);
                break;
            case 3:
                key.setDescricao((String) aValue);
                break;
            case 4:
                key.setSerial((String) aValue);
                break;
            case 5:
                //key.setData((java.sql.Date) aValue);
                key.setData((String) aValue);
                break;
            case 6:
                key.setAtivo((boolean) aValue);
                break;    
            default:
                throw new IndexOutOfBoundsException("Erro!!! NO SET VALEU AT");
        }        
        fireTableCellUpdated(linhaIndice, colunaIndice);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 6;
    }
    
    public KeyModel getKey(int indiceLinha){
        return lista.get(indiceLinha);
    }
    
    public void addKey(List<KeyModel> key){
        int indice = getRowCount();        
        lista.addAll(key);
        fireTableRowsInserted(indice, indice);        
    }

    public void addListaKeys(List<KeyModel> key){
        int indice = getRowCount();
        lista.addAll(key);
        fireTableRowsInserted(indice, indice);        
    }
    
    public void limpar(){        
        lista.clear();	         
        fireTableDataChanged();
    }
    
    public void remover(int indiceLinha,int codigo) throws SQLException, ClassNotFoundException, Exception{    
        KeyModel key = new KeyModel();        
        KeyController kc = new KeyController();
        int x = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir o serial selecionado?","Confirmar exclusão de Serial",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.OK_OPTION){
            if(lista.get(indiceLinha).isAtivo() == true){
                key = lista.remove(indiceLinha);                                
                kc.excluirSerial(codigo);                
                fireTableRowsDeleted(indiceLinha, indiceLinha);                
            }
        }else{            
            lista.get(indiceLinha).setAtivo(false);            
        }
    }
}