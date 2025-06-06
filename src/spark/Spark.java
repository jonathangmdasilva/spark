package spark;

import banco.ConexaoSqlLite;
import controlador.ConfiguracaoController;
import controlador.Funcoes;
import controlador.Logs;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;
import view.core.InstalacaoModulosView;
import view.core.SparkPrincipal;
import view.core.SplashView;

/*
 * @author Jonathan
 */

public class Spark {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Funcoes f = new Funcoes();
        ConexaoSqlLite banco = new ConexaoSqlLite();  
        Logs log = new Logs();
        try {
            File bd = new File("DB\\Spark.db");            
            //System.out.println(System.getProperty( "java.home", "<unknown java home>" ));            
            f.copiarDll(f.verificarDiretorioJava());
            try {
                if(!bd.exists()){
                    banco.criarDataBase();
                }
                //OCULTAR DIRETÓRIOS BASE DO SISTEMA SPARK
                String comando = "C:\\WINDOWS\\System32\\ATTRIB.EXE +H DB";
                Runtime.getRuntime().exec(comando);
                comando = "C:\\WINDOWS\\System32\\ATTRIB.EXE +H System";
                Runtime.getRuntime().exec(comando);
                comando = "C:\\WINDOWS\\System32\\ATTRIB.EXE +H Dll";
                Runtime.getRuntime().exec(comando);
                
            } catch (IOException e) {
                
                JOptionPane.showMessageDialog(null, "Erro ao ocultar a base" + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                System.out.println("Erro : " + ex.getMessage());
            }
            ConfiguracaoController cl = new ConfiguracaoController();
            ConfiguracaoModel cm;
            cm = cl.validarConfig();
            if(cm.getCodigo()==1){
                if(cm.getUsuario().equals(System.getProperty("user.name"))){
                    SparkPrincipal sp = new SparkPrincipal(cm);
                    SplashView splash = new SplashView(cm);
                    Thread.sleep(1000);
                    splash.dispose();                                            
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário/Serial inválidos! \nVerifique com o Adm do sistema.", "Aviso",JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                }                
            }else{                
                InstalacaoModulosView cv = new InstalacaoModulosView(null, true);
            }
        } catch (HeadlessException | InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Erro ao iniciar sistema: " +e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
}
