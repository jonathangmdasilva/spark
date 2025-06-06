package dao;

import banco.ConexaoSqlLite;
import controlador.Funcoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.core.KeyModel;

/**
 *
 * @author Jonathan
 */
public class KeyDao {
  
    private final Connection c ;
    Funcoes f = new Funcoes();
    
    //DEFININDO CONSTRUTOR DA CLASSE    
    public KeyDao() throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlLite().getConnection();
    }
    
    public void inserirKey(KeyModel km) throws SQLException {
        String sql = "INSERT INTO TB_KEYS(usuarioMaquina, descricaoProduto, sistemaOperacional, serial, dataCadastro, ativoSerial) VALUES (?,?,?,?,date(),?);";
        // seta os valores
        try ( 
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,km.getUsuario());
            stmt.setString(2,km.getDescricao());
            stmt.setString(3,km.getSo());
            stmt.setString(4,km.getSerial());
            stmt.setInt(5,1);
            // executa
            stmt.execute();            
            stmt.close();
        }catch(Exception e){
            System.out.println("Erro ao inserir Key: " + e.getMessage());
        }                
    } 
    
    
    public List<KeyModel> consultarTodos() {
        List<KeyModel> keys = new ArrayList<>();
        String sql = "SELECT codigoKeys as Código, usuarioMaquina as Usuário , sistemaOperacional as Sistema_Operacional, descricaoProduto as Produto,Serial as Key , dataCadastro as Data FROM TB_KEYS WHERE ativoSerial  = '1';";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) { 
                KeyModel km = new KeyModel();
                
                km.setCodigo(rs.getInt(1));
                km.setUsuario(rs.getString(2));
                km.setSo(rs.getString(3));                
                km.setDescricao(rs.getString(4));
                km.setSerial(rs.getString(5));                
                km.setData(f.formarData(rs.getString(6)));
                //km.setData(f.formatarDateString(rs.getString(6)));
                keys.add(km);
            }
            stmt.close();  
            rs.close();
        } catch (SQLException ex) {                
            System.out.println("(CONSULTA 01) - ERRO AO LISTAR TODAS KEYS: " + ex.getMessage());            
        }finally{
            return keys;
        }        
    }    
    
    
    public List<KeyModel> consultarTodosNome(String nome) {
        List<KeyModel> keys = new ArrayList<>();        
        String sql = "SELECT codigoKeys as Código, usuarioMaquina as Usuário , sistemaOperacional as Sistema_Operacional, descricaoProduto as Produto, serial as Key , dataCadastro as Data FROM TB_KEYS WHERE ativoSerial  = '1'  AND descricaoProduto LIKE ?;";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + nome + "%");
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) { 
                KeyModel km = new KeyModel();
                
                km.setCodigo(rs.getInt(1));
                km.setUsuario(rs.getString(2));
                km.setSo(rs.getString(3));                
                km.setDescricao(rs.getString(4));
                km.setSerial(rs.getString(5));
                //km.setData(rs.getString(6));
                km.setData(f.formarData(rs.getString(6)));                                
                keys.add(km);                    
            }
            stmt.close();  
            rs.close();
        } catch (SQLException ex) {                
            System.out.println("ERRO AO LISTAR TODAS KEYS PELO NOME: " + ex.getMessage());            
        }finally{
            return keys;
        }        
    }    
 
    public void excluirKey(Integer cod) {
        String sql = "UPDATE TB_KEYS SET ativoSerial = 0 WHERE codigoKeys = ?";
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores            
            stmt.setInt(1,cod);        
            // executa
            stmt.execute();                        
            stmt.close();            
        }catch(Exception e ){
            System.out.println("ERRO EXCLUIR KEY! " + e.getMessage());            
        }
    }    
}