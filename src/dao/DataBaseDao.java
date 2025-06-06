package dao;

import banco.ConexaoSqlLite;
import controlador.Logs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.core.DataBaseModel;

public class DataBaseDao {
    
    private final Connection c ;
    private Logs log = new Logs();
    
    public DataBaseDao() throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlLite().getConnection();
    }
    
    public boolean inserirDataBase(DataBaseModel databaseModel) throws SQLException {
        String sql = "INSERT INTO TB_DATABASE(servidorConexao, bancoConexao, usuarioConexao, senhaConexao, portaConexao, descricaoConexao, tipoConexao, ativoConexao) VALUES (?,?,?,?,?,?,?,1);";
        // seta os valores
        try ( 
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,databaseModel.getServidor());
            stmt.setString(2,databaseModel.getBanco());
            stmt.setString(3,databaseModel.getUsuario());
            stmt.setString(4,databaseModel.getSenha());
            stmt.setInt(5,databaseModel.getPorta());
            stmt.setString(6,databaseModel.getDescricao());
            stmt.setString(7,databaseModel.getTipo());
                     
            // executa
            stmt.execute();            
            stmt.close();
            return true;
        }catch(Exception e){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("Erro ao inserir DATABASE: " + e.getMessage());
            return false;
        }                
    }
    
    
    public DataBaseModel verificarDataBaseRank(String parametro){
        DataBaseModel baseMod = new DataBaseModel();        
        String sql = "SELECT DB.codigoConexao,DB.servidorConexao,DB.bancoConexao,DB.usuarioConexao,DB.senhaConexao,DB.portaConexao,DB.descricaoConexao,DB.tipoConexao FROM TB_DATABASE DB INNER JOIN TB_PARAMETROS P ON (P.descParametro = DB.codigoConexao) AND ativoConexao = '1' WHERE P.xIdParametro LIKE ?;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + parametro + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    baseMod.setCodigo(rs.getInt(1));
                    baseMod.setServidor(rs.getString(2));
                    baseMod.setBanco(rs.getString(3));                
                    baseMod.setUsuario(rs.getString(4));
                    baseMod.setSenha(rs.getString(5));
                    baseMod.setPorta(rs.getInt(6));
                    baseMod.setDescricao(rs.getString(7));
                    baseMod.setTipo(rs.getString(8));                    
                }
                stmt.close();
            }
        } catch (SQLException e) {
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("ERRO AO CONSULTAR RANKS DO SERVIDOR : " + e.getMessage());            
        }finally{
            return baseMod;
        }
    }
    
    
    public List<DataBaseModel> verificarDataBase(){
        List<DataBaseModel> bases = new ArrayList<>();
        String sql = "SELECT *FROM TB_DATABASE WHERE ativoConexao = 1;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql); 
            ResultSet rs = stmt.executeQuery()) {                            
            while (rs.next()) {
                DataBaseModel baseMod = new DataBaseModel();
                baseMod.setCodigo(rs.getInt(1));
                baseMod.setServidor(rs.getString(2));
                baseMod.setBanco(rs.getString(3));                
                baseMod.setUsuario(rs.getString(4));
                baseMod.setSenha(rs.getString(5));
                baseMod.setPorta(rs.getInt(6));
                baseMod.setDescricao(rs.getString(7));
                baseMod.setTipo(rs.getString(8));
                bases.add(baseMod);
            }
            stmt.close();  
        } catch (SQLException e) { 
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("ERRO AO CONSULTAR LISTA DE BASES: " + e.getMessage());            
        }finally{
            return bases;
        }
    }
    
    public List<DataBaseModel> verificarDataBaseDescricao(String descricao){
        List<DataBaseModel> bases = new ArrayList<>();
        String sql = "SELECT *FROM TB_DATABASE WHERE 1=1 AND (ativoConexao = 1 AND descricaoConexao LIKE ?) OR( ativoConexao = 1 AND servidorConexao LIKE ?);";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + descricao + "%");
            stmt.setString(2,"%" + descricao + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DataBaseModel baseMod = new DataBaseModel();
                    baseMod.setCodigo(rs.getInt(1));
                    baseMod.setServidor(rs.getString(2));
                    baseMod.setBanco(rs.getString(3));                
                    baseMod.setUsuario(rs.getString(4));
                    baseMod.setSenha(rs.getString(5));
                    baseMod.setPorta(rs.getInt(6));
                    baseMod.setDescricao(rs.getString(7));
                    baseMod.setTipo(rs.getString(8));
                    bases.add(baseMod);
                }
                stmt.close();
            }
        } catch (SQLException e) {
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("ERRO AO CONSULTAR LISTA DE BASES POR DESCRIÇÃO OU SERVIDOR : " + e.getMessage());            
        }finally{
            return bases;
        }
    }
        
    public boolean excluirDataBase(int cod) {
        String sql = "UPDATE TB_DATABASE SET ativoConexao = 0 WHERE ativoConexao = ?";
        try (
            PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,cod);
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("ERRO AO INATIVAR DATABASE! " + e.getMessage());            
            return false;
        }
    }
}