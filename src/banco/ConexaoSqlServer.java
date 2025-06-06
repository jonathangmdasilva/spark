package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * @author jonathan
 */

public class ConexaoSqlServer {  
    
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    public PreparedStatement prep;
    
    public Connection getConnection(String servidor,String banco) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");                        
        conexao = DriverManager.getConnection("jdbc:sqlserver://" + servidor + ";databaseName = " + banco + ";IntegratedSecurity=true;Persist Security Info=False;");
        try {            
            statement = conexao.createStatement();          
            return conexao;
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null,"Erro no ConexaoSqlServer - getConnection() " + e.getMessage());
            //desconecta();
            conexao.close();
            return null;
        }
    }

    public void exec(String sql) throws Exception {
       resultset = statement.executeQuery(sql);
    }
        
    public void desconecta(){
        try{
            conexao.close();
        }
        catch(SQLException fecha){
            JOptionPane.showMessageDialog(null,"Não foi possivel fechar o banco de dados(MC1): " + fecha);        
        }
    }
}