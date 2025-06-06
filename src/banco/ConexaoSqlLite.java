package banco;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoSqlLite {
    
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    public PreparedStatement prep;
    
    public Connection getConnection() throws Exception {
        Class.forName("org.sqlite.JDBC");
        conexao = DriverManager.getConnection("jdbc:sqlite:DB\\Spark.db");        
        statement = conexao.createStatement();        
        conexao.setAutoCommit(true);        
        return conexao;
    }
	              
    @SuppressWarnings("deprecation")
    public void criarDataBase() throws Exception {
        try {
            new File("DB").mkdir();        
            Class.forName("org.sqlite.JDBC");
            conexao = DriverManager.getConnection("jdbc:sqlite:DB\\Spark.db");
            statement = conexao.createStatement();

            String comando = "C:\\WINDOWS\\System32\\ATTRIB.EXE +H DB"; //Esse comando define o banco como oculto  
            Runtime.getRuntime().exec(comando );
            //Process process = runtime.exec(command);
            

            //CRIAR TABELAS 
            statement.execute("CREATE TABLE IF NOT EXISTS TB_DPS(idDps INTEGER PRIMARY KEY AUTOINCREMENT,  seq TEXT NOT NULL, pesoSeq INT NOT NULL);");
            //statement.execute("CREATE TABLE IF NOT EXISTS TB_DPTABELAS(idDpTabelas INTEGER PRIMARY KEY AUTOINCREMENT,  dominioBanco TEXT NOT NULL, paraTabela INT NOT NULL);");
            statement.execute("CREATE TABLE IF NOT EXISTS TB_KEYS(codigoKeys INTEGER PRIMARY KEY AUTOINCREMENT, usuarioMaquina VARCHAR(25) NOT NULL, descricaoProduto VARCHAR(100) NOT NULL, sistemaOperacional VARCHAR(50) NOT NULL, serial VARCHAR(50) NOT NULL,dataCadastro DATE NOT NULL, ativoSerial INT NOT NULL  );");        
            statement.execute("CREATE TABLE IF NOT EXISTS TB_CONFIG(codigoConfig INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, asset INT(7) NOT NULL, formatador INT(7) NOT NULL, senhas INT(7) NOT NULL, lookFeel VARCHAR(25),processos INT(1)NOT NULL,modoTela INT(1) NOT NULL,userSys VARCHAR(55),userHier VARCHAR(55),serialSys VARCHAR(75),dataCadSys TEXT(30) NULL,dataAtualizacaoSys TEXT(20) NULL);");
            statement.execute("CREATE TABLE IF NOT EXISTS TB_CONEXAO(codigoConexao INTEGER PRIMARY KEY AUTOINCREMENT, servidorConexao VARCHAR(60) NOT NULL, bancoConexao VARCHAR(100) NOT NULL, clienteConexao VARCHAR(50) NOT NULL, ativoConexao INT NOT NULL);");
            statement.execute("CREATE TABLE IF NOT EXISTS TB_FTP(codigoFtp INTEGER PRIMARY KEY AUTOINCREMENT, servidorFtp VARCHAR(60) NOT NULL, enderecoFtp VARCHAR(100) NOT NULL, usuarioFtp VARCHAR(100) NOT NULL, senhaFtp VARCHAR(100) NOT NULL, portaFtp INT(10) NOT NULL, clienteFtp VARCHAR(50) NOT NULL, trocaSenhaFtp INT NOT NULL, ativoFtp INT NOT NULL);");
            statement.execute("CREATE TABLE IF NOT EXISTS TB_PARAMETROS(codigoParametro INTEGER PRIMARY KEY AUTOINCREMENT, xIdParametro VARCHAR(60) NOT NULL, descParametro VARCHAR(100) NOT NULL, atualizacaoParametro VARCHAR(100) NOT NULL ,ativoParametro INT NOT NULL);");
            statement.execute("CREATE TABLE IF NOT EXISTS TB_DATABASE(codigoConexao INTEGER PRIMARY KEY AUTOINCREMENT, servidorConexao VARCHAR(60) NOT NULL, bancoConexao VARCHAR(100) NOT NULL, usuarioConexao VARCHAR(50) NOT NULL, senhaConexao VARCHAR(50) NOT NULL, portaConexao VARCHAR(50) NOT NULL, descricaoConexao VARCHAR(60) NOT NULL,tipoConexao VARCHAR(60) NOT NULL, ativoConexao INT NOT NULL);");
                        
            //INSERINDO DADOS
            //statement.execute("INSERT INTO TB_USUARIO(Login_Usuario,Senha_Usuario,Nivel_Usuario,Ativo_Usuario)VALUES('YODA_ROOT','YODA_ROOT','ADMINISTRADOR',1);");
            //KEYS STARTER
            statement.execute("INSERT INTO TB_DPS (seq,pesoSeq) VALUES('cfcd208495d565ef66e7dff9f98764das',0),('c4ca4238a0b923820dcc509a6f75849bs',1),('eccbc87e4b5ce2fe28308fd9f2a7baf3s',3),('1679091c5a880faf6fb5e6087eb1b2dcs',6),('c20ad4d76fe97759aa27a0c99bff6710s',12);");
            //KEYS COMPLETE
            statement.execute("INSERT INTO TB_DPS (seq,pesoSeq) VALUES('cfcd208495d565ef66e7dff9f98764dac',0),('c4ca4238a0b923820dcc509a6f75849bc',1),('eccbc87e4b5ce2fe28308fd9f2a7baf3c',3),('1679091c5a880faf6fb5e6087eb1b2dcc',6),('c20ad4d76fe97759aa27a0c99bff6710c',12);");
            //KEYS MASTER
            statement.execute("INSERT INTO TB_DPS (seq,pesoSeq) VALUES('cfcd208495d565ef66e7dff9f98764dam',0),('c4ca4238a0b923820dcc509a6f75849bm',1),('eccbc87e4b5ce2fe28308fd9f2a7baf3m',3),('1679091c5a880faf6fb5e6087eb1b2dcm',6),('c20ad4d76fe97759aa27a0c99bff6710m',12);");
            
            
            //DE PARA TABELAS TESTE CONEXÃO
            //statement.execute("INSERT INTO TB_DPTABELAS (dominioBanco,paraTabela) VALUES('BO_WTM','MC1_Product'),('BO_WTM_ETL_','ETL_MARC'),('MDCS','MC1_Cartridge');");
            
            //TABELA DE PARÂMETROS                      
            statement.execute("INSERT INTO TB_PARAMETROS (xIdParametro,descParametro,atualizacaoParametro,ativoParametro) VALUES('MONITORAMENTO_AUT_TEMPO','10000',strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'),1),('MONITORAMENTO','MONITORAMENTO_AUTOMATICO',strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'),1),('VALIDA_SENHA_SERIAL','6e7a87c10fc44f86a598f1510add828f',strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'),1),('BASE_RANK_LEFT_SERVER_1','1',strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'),1);");
            conexao.setAutoCommit(true);
            conexao.close();
        } catch (IOException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao criar base local SqlLite" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);                        
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
            JOptionPane.showMessageDialog(null,"Não foi possivel fechar o banco de dados: " + fecha);
        }
    }
}