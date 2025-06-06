package dao;

import banco.ConexaoSqlLite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.core.FtpModel;

public class FtpDao {
    
    private final Connection c ;
    
    public FtpDao() throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlLite().getConnection();
    }
    
    public boolean inserirFtp(FtpModel ftpModel) throws SQLException {
        String sql = "INSERT INTO TB_FTP(servidorFtp, enderecoFtp, usuarioFtp, senhaFtp, portaFtp, clienteFtp, trocaSenhaFtp, ativoFtp) VALUES (?,?,?,?,?,?,?,1);";
        // seta os valores
        try ( 
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,ftpModel.getServidor());
            stmt.setString(2,ftpModel.getEndereco());
            stmt.setString(3,ftpModel.getUsuario());
            stmt.setString(4,ftpModel.getSenha());
            stmt.setInt(5,ftpModel.getPorta());
            stmt.setString(6,ftpModel.getCliente());
            stmt.setInt(7,ftpModel.getTrocaSenha());
                     
            // executa
            stmt.execute();            
            stmt.close();
            return true;
        }catch(Exception e){
            System.out.println("Erro ao inserir FTP: " + e.getMessage());
            return false;
        }                
    }
    
    public List<FtpModel> verificarFTP(){
        List<FtpModel> ftps = new ArrayList<>();
        String sql = "SELECT *FROM TB_FTP WHERE ativoFtp = 1;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql); 
            ResultSet rs = stmt.executeQuery()) {                            
            while (rs.next()) {
                FtpModel ftpMod = new FtpModel();
                ftpMod.setCodigo(rs.getInt(1));
                ftpMod.setServidor(rs.getString(2));
                ftpMod.setEndereco(rs.getString(3));                
                ftpMod.setUsuario(rs.getString(4));
                ftpMod.setSenha(rs.getString(5));
                ftpMod.setPorta(rs.getInt(6));
                ftpMod.setCliente(rs.getString(7));
                ftpMod.setTrocaSenha(rs.getInt(8));                
                ftps.add(ftpMod);
            }
            stmt.close();  
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR LISTA DE FTPS: " + ex.getMessage());            
        }finally{
            return ftps;
        }
    }
    
    public List<FtpModel> verificarFtpNome(String nome){
        List<FtpModel> ftps = new ArrayList<>();
        String sql = "SELECT *FROM TB_FTP WHERE 1=1 AND (ativoFtp = 1 AND clienteFtp LIKE ?) OR( ativoFtp = 1 AND servidorFtp LIKE ?);";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + nome + "%");
            stmt.setString(2,"%" + nome + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    FtpModel ftpMod = new FtpModel();
                    ftpMod.setCodigo(rs.getInt(1));
                    ftpMod.setServidor(rs.getString(2));
                    ftpMod.setEndereco(rs.getString(3));
                    ftpMod.setUsuario(rs.getString(4));
                    ftpMod.setSenha(rs.getString(5));
                    ftpMod.setPorta(rs.getInt(6));
                    ftpMod.setCliente(rs.getString(7));
                    ftpMod.setTrocaSenha(rs.getInt(8));
                    //ftpMod.setAtivo(rs.getBoolean(9));
                    ftps.add(ftpMod);
                }
                stmt.close();
            }
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR LISTA DE FTPS : " + ex.getMessage());            
        }finally{
            return ftps;
        }
    }
    
    
    public boolean excluirFtp(int cod) {
        String sql = "UPDATE TB_FTP SET ativoFtp = 0 WHERE codigoFtp = ?";
        try (
            PreparedStatement stmt = c.prepareStatement(sql)) {            
            stmt.setInt(1,cod);
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            System.out.println("ERRO AO INATIVAR FTP! " + e.getMessage());            
            return false;
        }
    }
}
