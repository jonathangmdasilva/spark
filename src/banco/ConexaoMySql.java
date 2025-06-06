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

public class ConexaoMySql {  
    
    private Connection conexao;
    private Statement statement;
    private ResultSet resultset;
    private PreparedStatement prep;
    private static String status = "Não conectado...";
    
    
    public Connection getConnection(String servidor,String banco,String usuario, String senha) throws Exception {        
        String url = "jdbc:mysql://" + servidor + "/" + banco;        
        conexao =  DriverManager.getConnection(url, usuario, senha);        
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try{
            //Testa a conexão com o banco
            if (conexao == null) {
                statement = conexao.createStatement();                
            } else {
                status = ("STATUS: Conectado com sucesso!");
            }            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro no ConexaoMySql - getConnection() " + e.getMessage());            
            desconecta();
            return null;
        }finally{
            return conexao;
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
            JOptionPane.showMessageDialog(null,"Não foi possivel fechar o banco de dados Mysql Server: " + fecha);        
        }
    }
            
    public static String statusConection() {
        return status;
    }    
}