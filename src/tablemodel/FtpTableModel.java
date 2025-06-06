package tablemodel;

import controlador.ConexoesController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import model.core.FtpModel;


public class FtpTableModel extends AbstractTableModel{
           
    private final List<FtpModel> lista;
    
    private final String[] colunas = {" Código "," Servidor (Host)"," Endereço "," Usuário "," Senha "," Porta "," Cliente "," Troca Senha ","Excluir"};
    
    public FtpTableModel(){
        lista = new ArrayList<>();
    }
    
    public FtpTableModel(List<FtpModel> lista){
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
        FtpModel ftp = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ftp.getCodigo();
            case 1:
                return ftp.getServidor();
            case 2:
                return ftp.getEndereco();
            case 3:
                return ftp.getUsuario();
            case 4:
                return ftp.getSenha();
            case 5:
                return ftp.getPorta();
            case 6:
                return ftp.getCliente();
            case 7:
                if (ftp.getTrocaSenha() == 1){
                    return "Sim";
                }else{
                    return "Não";                    
                }                
            case 8:
                return ftp.isAtivo();
            default:
                throw new IndexOutOfBoundsException("Erro Indice!!!(getValueAt)");
        }
    }

    @Override
    public void setValueAt(Object aValue, int linhaIndice, int colunaIndice) {      
        FtpModel ftp = lista.get(linhaIndice);
        switch(colunaIndice){
            case 0:
                ftp.setCodigo((Integer) aValue);
                break;
            case 1:
                ftp.setServidor((String) aValue);
                break;
            case 2:
                ftp.setEndereco((String) aValue);
                break;
            case 3:
                ftp.setUsuario((String) aValue);
                break;
            case 4:
                ftp.setSenha((String) aValue);
                break;
            case 5:
                ftp.setPorta((Integer) aValue);
                break;
            case 6:
                ftp.setCliente((String) aValue);
                break;                
            case 7:
                ftp.setTrocaSenha((Integer) aValue);
                break;                                
            case 8:
                ftp.setAtivo((boolean) aValue);
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
    
    public FtpModel getFtp(int indiceLinha){
        return lista.get(indiceLinha);
    }
    
    public void addFtp(List<FtpModel> ftp){
        int indice = getRowCount();        
        lista.addAll(ftp);
        fireTableRowsInserted(indice, indice);        
    }

    public void addListaFtps(List<FtpModel> ftp){
        int indice = getRowCount();
        lista.addAll(ftp);
        fireTableRowsInserted(indice, indice);        
    }
    
    public void limpar(){        
        lista.clear();	         
        fireTableDataChanged();
    }
    
    public void remover(int indiceLinha,int codigo) throws SQLException, ClassNotFoundException, Exception{    
        FtpModel ftp = new FtpModel();        
        ConexoesController cc = new ConexoesController();
        int x = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir o ftp selecionado?","Confirmar exclusão de Ftp",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.OK_OPTION){
            if(lista.get(indiceLinha).isAtivo() == true){
                ftp = lista.remove(indiceLinha);                                
                cc.excluirFtp(codigo);                
                fireTableRowsDeleted(indiceLinha, indiceLinha);                
            }
        }else{            
            lista.get(indiceLinha).setAtivo(false);            
        }
    }
}