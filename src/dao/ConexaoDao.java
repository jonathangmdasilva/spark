package dao;

import banco.ConexaoSqlLite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.core.ConexaoModel;

public class ConexaoDao {
    
    private final Connection c ;
    
    public ConexaoDao() throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlLite().getConnection();
    }
    
    public boolean inserirConexao(ConexaoModel cm) throws SQLException {
        String sql = "INSERT INTO TB_CONEXAO(servidorConexao,bancoConexao,clienteConexao,ativoConexao) VALUES (?,?,?,1);";
        // seta os valores
        try ( 
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,cm.getServidor());
            stmt.setString(2,cm.getBanco());
            stmt.setString(3,cm.getCliente());                        
                     
            // executa
            stmt.execute();            
            stmt.close();
            return true;
        }catch(Exception e){
            System.out.println("Erro ao inserir Conexão com servidor: " + e.getMessage());
            return false;
        }                
    }
    
    public List<ConexaoModel> verificarConexões(){
        List<ConexaoModel> conexoes = new ArrayList<>();
        String sql = "SELECT *FROM TB_CONEXAO WHERE ativoConexao = 1;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {
                ConexaoModel con = new ConexaoModel();
                con.setCodigo(rs.getInt(1));
                con.setServidor(rs.getString(2));
                con.setBanco(rs.getString(3));                
                con.setCliente(rs.getString(4));
                conexoes.add(con);
            }
            stmt.close();  
            rs.close();
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR LISTA DE SERVIDORES: " + ex.getMessage());            
        }finally{
            return conexoes;
        }
    }
    
    public List<ConexaoModel> verificarConexõesNome(String nome){
        List<ConexaoModel> conexoes = new ArrayList<>();
        String sql = "SELECT *FROM TB_CONEXAO WHERE 1=1 AND (ativoConexao = 1 AND clienteConexao LIKE ?) OR (ativoConexao = 1 AND bancoConexao LIKE ?) ;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + nome + "%");
            stmt.setString(2,"%" + nome + "%");
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {
                ConexaoModel con = new ConexaoModel();
                con.setCodigo(rs.getInt(1));
                con.setServidor(rs.getString(2));
                con.setBanco(rs.getString(3));                
                con.setCliente(rs.getString(4));
                conexoes.add(con);
            }
            stmt.close();  
            rs.close();            
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR LISTA DE SERVIDORES PELO NOME: " + ex.getMessage());            
        }finally{
            return conexoes;
        }
    }
    
    
    public boolean excluirConexao(int cod) {
        String sql = "UPDATE TB_CONEXAO SET ativoConexao = 0 WHERE codigoConexao = ?";
        try (
            PreparedStatement stmt = c.prepareStatement(sql)) {            
            stmt.setInt(1,cod);
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            System.out.println("ERRO AO INATIVAR CONEXÃO DB! " + e.getMessage());            
            return false;
        }
    }
}
