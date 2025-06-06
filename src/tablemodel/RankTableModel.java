package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.gamer.RankModel;


public class RankTableModel extends AbstractTableModel{
           
    private final List<RankModel> lista;
    
    //private final String[] colunas = {"Id_Steam ","Apelido ","Atualização ","Sobreviventes Mortos ","Sobreviventes Incapacitados","Infectados Mortos", "Infectados Mortos por HS", "Pontuação", "Rank", "Data Cadastro"};
    private final String[] colunas = {"Rank ","Apelido ","Id_Steam","Sobreviventes Mortos ","Sobreviventes Incapacitados","Infectados Mortos", "Infectados Mortos por HS", "Pontuação", "Data Cadastro"," Atualização",};
    
    public RankTableModel(){
        lista = new ArrayList<>();
    }
    
    public RankTableModel(List<RankModel> lista){
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
                return Object.class;
            case 9:
                return Object.class;                
            default:
                throw new IndexOutOfBoundsException("Erro!!!!! NO GET COLLUMN");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //funcao = new Validar();
        RankModel rank = lista.get(rowIndex);
        switch(columnIndex){
            case 0:                
                return rank.getRank();
            case 1:
                return rank.getApelido();                
            case 2:
                return rank.getIdJogador();
            case 3:
                return rank.getSurvidor_killed();
            case 4:
                return rank.getSurvidor_incapped();
            case 5:
                return rank.getInfected_killed();
            case 6:
                return rank.getInfected_headshot();
            case 7:                
                return rank.getPontuacao();
            case 8:
                return rank.getDataCadastro();                
            case 9:
                return rank.getAtualizacao();                
            default:
                throw new IndexOutOfBoundsException("Erro Indice!!!(getValueAt)");
        }
    }

    @Override
    public void setValueAt(Object aValue, int linhaIndice, int colunaIndice) {      
        RankModel rank = lista.get(linhaIndice);
        switch(colunaIndice){
            case 0:
                rank.setRank((Integer) aValue);                
                break;
            case 1:
                rank.setApelido((String) aValue);                
                break;
            case 2:
                rank.setIdJogador((String) aValue);                
                break;
            case 3:
                rank.setSurvidor_killed((Integer) aValue);
                break;
            case 4:
                rank.setSurvidor_incapped((Integer) aValue);
                break;
            case 5:
                rank.setInfected_killed((Integer) aValue);
                break;
            case 6:
                rank.setInfected_headshot((Integer) aValue);
                break;
            case 7:
                rank.setPontuacao((Double) aValue);
                break;
            case 8:
                rank.setDataCadastro((String) aValue);
                break;
            case 9:                
                rank.setAtualizacao((String) aValue);
                break;                
            default:
                throw new IndexOutOfBoundsException("Erro!!! NO SET VALEU AT");
        }        
        fireTableCellUpdated(linhaIndice, colunaIndice);
    }

      public RankModel getRank(int indiceLinha){
        return lista.get(indiceLinha);
    }
    
    public void addRank(List<RankModel> rank){
        int indice = getRowCount();        
        lista.addAll(rank);
        fireTableRowsInserted(indice, indice);        
    }

    public void addListaRanks(List<RankModel> rank){
        int indice = getRowCount();
        lista.addAll(rank);
        fireTableRowsInserted(indice, indice);        
    }
    
    public void limpar(){        
        lista.clear();	         
        fireTableDataChanged();
    }    
}