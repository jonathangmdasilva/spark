package dao;

import banco.ConexaoMySql;
import controlador.Logs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.core.DataBaseModel;
import model.gamer.RankModel;

public class GamerDao {
    
    private final Connection c ;
    Logs log = new Logs();
    
    public GamerDao(DataBaseModel base) throws SQLException, ClassNotFoundException, Exception{
        //this.c = new ConexaoMySql().getConnection("192.168.15.7:3306", "LEFT2", "left", "223705");                        
        this.c = new ConexaoMySql().getConnection(base.getServidor()+ ":" +base.getPorta(), base.getBanco(), base.getUsuario(), base.getSenha());     
    }
      
    public List<RankModel> verificarClassificaoGeral(){
        List<RankModel> listaRanking = new ArrayList<>();
        String sql = "SELECT rank_num,apelido,id_jogador,survivor_killed,survivor_incapped,infected_killed,infected_headshot,total_points,data_criacao,atualizacao FROM VW_RANKS_PLAYER;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql); 
            ResultSet rs = stmt.executeQuery()) {                            
            while (rs.next()) {
                RankModel ranking = new RankModel();
                ranking.setRank(rs.getInt(1));
                ranking.setApelido(rs.getString(2));
                ranking.setIdJogador(rs.getString(3));
                ranking.setSurvidor_killed(rs.getInt(4));
                ranking.setSurvidor_incapped(rs.getInt(5));
                ranking.setInfected_killed(rs.getInt(6));
                ranking.setInfected_headshot(rs.getInt(7));
                ranking.setPontuacao(rs.getDouble(8));
                ranking.setDataCadastro(rs.getString(9));                
                ranking.setAtualizacao(rs.getString(10));
                listaRanking.add(ranking);
            }
            stmt.close();
            c.close();
        }catch (SQLException ex){
            log.gerarLogs(ex, this.getClass().toString());
            JOptionPane.showMessageDialog(null, "Erro ao consultar lista de Rank! " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            c.close();
        }finally{
            return listaRanking;            
        }
    }
    
    public List<RankModel> verificarClassificaoUsuários(String apelido){
        List<RankModel> listaRanking = new ArrayList<>();
        String sql = "SELECT rank_num,apelido,id_jogador,survivor_killed,survivor_incapped,infected_killed,infected_headshot,total_points,data_criacao,atualizacao FROM VW_RANKS_PLAYER WHERE Apelido LIKE ?;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + apelido + "%");
            try (ResultSet rs = stmt.executeQuery()){
                while (rs.next()) {
                    RankModel ranking = new RankModel();
                    ranking.setRank(rs.getInt(1));
                    ranking.setApelido(rs.getString(2));
                    ranking.setIdJogador(rs.getString(3));
                    ranking.setSurvidor_killed(rs.getInt(4));
                    ranking.setSurvidor_incapped(rs.getInt(5));
                    ranking.setInfected_killed(rs.getInt(6));
                    ranking.setInfected_headshot(rs.getInt(7));
                    ranking.setPontuacao(rs.getDouble(8));
                    ranking.setDataCadastro(rs.getString(9));                
                    ranking.setAtualizacao(rs.getString(10));
                    listaRanking.add(ranking);
                }
                stmt.close();
                c.close();
            }
        } catch (SQLException ex){
            c.close();
            JOptionPane.showMessageDialog(null, "Erro ao consultar lista de Rank! " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);            
        }finally{
            return listaRanking;
        }
    }  
}
