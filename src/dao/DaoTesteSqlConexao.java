package dao;

import banco.ConexaoSqlServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Jonathan
 */

public class DaoTesteSqlConexao {
            
    private final Connection c ;
    private PreparedStatement stmt ;
    private final ResultSet rs = null;
    
    public DaoTesteSqlConexao(String servidor, String banco) throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlServer().getConnection(servidor,banco);
    }
               
    public String consultarTesteConexao() throws SQLException {
        String retorno = "";
        String sql = "SELECT TOP 1 cCompanyName from MC1_Company WITH (NOLOCK) WHERE mc1Enabled = 1";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {                            
            while (rs.next()) {                                                 
                retorno = "Conectado: " + rs.getString(1);                
            }
            stmt.close();  
        } catch (SQLException ex) {                
            //System.out.println("Erro ao consultar Company:  " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"Erro no DaoTesteConexao - consultarTesteConexao() " + ex.getMessage());
            retorno = "Erro na conexão : " + ex.getMessage();
            c.close();
        }finally{
            c.close();
            return retorno;            
        }                        
    }    
}
