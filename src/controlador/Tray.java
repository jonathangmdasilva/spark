package controlador;

import backup.Backup;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;
import view.core.ConfiguracoesSistemaView;
import view.core.TelaPrincipalCompleto;
import view.core.CalcularDatasView;
import view.core.PrincipalStone;
import view.core.SerialView;
import view.core.SobreView;
import view.format.ComparadorView;
import view.format.DuplicidadeView;
import view.format.EstatisticaView;
import view.format.JuntarView;
import view.format.ReplaceView;
import view.suporte.GerenciadorFTPView;
import view.suporte.GerenciadorConexaoBdView;
import view.suporte.SeletorSenhaView;

/*
 * @author Jonathan Gomes da Silva
 */
public class Tray {
    ConfiguracaoController confContr = new ConfiguracaoController();
    ConfiguracaoModel c;// = new ConfiguracaoModel();
    Funcoes f = new Funcoes();
     
    
    protected PopupMenu criarPopupMenu() {
        c = confContr.validarConfig();
        final PopupMenu popup = new PopupMenu();
        MenuItem menuCompletoItem = new MenuItem("Modo Maximizado");
        MenuItem sobreItem = new MenuItem("Sobre");
        
        //Configurações
        Menu menuCadastro = new Menu("Cadastros");      
        Menu menuConfiguracao = new Menu("Configurações");
        
        MenuItem menuBackUp = new MenuItem("Backup");
        MenuItem menuConfiguracoesSistema = new MenuItem("Sistema");
        MenuItem menuConexoesSqlServer = new MenuItem("Conexões Data Base");
        MenuItem menuConexoesFtp = new MenuItem("Conexões Ftp");
        MenuItem keyItem = new MenuItem("Keys Softwares");
        MenuItem menuSerial = new MenuItem("Serial");
        
        
        menuCadastro.add(menuConexoesSqlServer);
        menuCadastro.add(menuConexoesFtp);
        menuCadastro.add(keyItem);
        //assetMenu.add(keyItem);
        
        
        
        menuConfiguracao.add(menuBackUp);
        menuConfiguracao.add(menuSerial);
        menuConfiguracao.add(menuConfiguracoesSistema);
        
        Menu assetMenu = new Menu("Asset");
        Menu formatadorMenu = new Menu("Formatador");
        Menu senhaMenu = new Menu("Senha");
        Menu enterpriseMenu = new Menu("Enterprise");
                              
        MenuItem sairItem = new MenuItem("Sair");                
        
        // Add componentes ao pop-up menu
        popup.add(menuCompletoItem);
        popup.add(menuCadastro);
        popup.add(menuConfiguracao);        
        popup.add(sobreItem);
        popup.addSeparator();
        popup.add(assetMenu);
        
        //ASSET        
        MenuItem datasItem = new MenuItem("Calculo de Datas");        
        assetMenu.add(datasItem);
        
        //SENHA
        MenuItem senhaItem = new MenuItem("Senha do Dia");        
        senhaMenu.add(senhaItem);
        
        //FORMATADOR
        MenuItem juntarItem = new MenuItem("Juntar");
        MenuItem replaceItem = new MenuItem("Replace");
        MenuItem doubleItem = new MenuItem("Duplicidade");
        MenuItem comparadorItem = new MenuItem("Comparador");
        MenuItem estatisticaItem = new MenuItem("Estatistica");
                     
        popup.add(formatadorMenu);
        formatadorMenu.add(juntarItem);
        formatadorMenu.add(replaceItem);
        formatadorMenu.add(doubleItem);
        formatadorMenu.add(estatisticaItem);
        formatadorMenu.add(comparadorItem);
                       
        ActionListener sair_botao = (ActionEvent ev) -> {
            sair();
        };            
        
        ActionListener sobre_botao = (ActionEvent ev) -> {
            SobreView sobre = new SobreView(null, true);
        };
        
        ActionListener juntar_botao = (ActionEvent ev) -> {
            JuntarView cv = new JuntarView(null, true);
        };
        
        ActionListener double_botao = (ActionEvent ev) -> {
            DuplicidadeView db = new DuplicidadeView(null, true);
        };
        
        ActionListener replace_botao = (ActionEvent ev) -> {
            ReplaceView replace = new ReplaceView(null, true);
        };
                
        ActionListener comparador_botao = (ActionEvent ev) -> {
            ComparadorView c = new ComparadorView();
        };
                
        ActionListener estatistica_botao = (ActionEvent ev) -> {
            EstatisticaView est = new EstatisticaView();
        };
                
        ActionListener datas_botao = (ActionEvent ev) -> {
            CalcularDatasView cdv = new CalcularDatasView(null, true);
        };
        
        ActionListener keys_botao = (ActionEvent ev) -> {
            PrincipalStone ps = new PrincipalStone();
        };
                
        ActionListener senha_botao = (ActionEvent ev) -> {
            SeletorSenhaView ssv = new SeletorSenhaView(null, true);            
        };
                                             
        ActionListener modoMaximizado_botao = (ActionEvent ev) -> {
            if(c.getProcesso()==1){
                TelaPrincipalCompleto tp = new TelaPrincipalCompleto(c);
            }else{
                JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        };
        
        
        ActionListener configuracoes_botao = (ActionEvent ev) -> {
            //if(c.getProcesso()==1){
            ConfiguracoesSistemaView cv = new ConfiguracoesSistemaView(c);
            //}else{
            //JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            //}                        
        };
                        
        ActionListener backup_botao = (ActionEvent ev) -> {
            if(c.getProcesso()==1){
                realizarBackup();
            }else{
                JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        };
        
        ActionListener conexoes_botao = (ActionEvent ev) -> {
            if(c.getProcesso()==1){
                GerenciadorConexaoBdView gc = new GerenciadorConexaoBdView();
            }else{
                JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        };
        
        ActionListener ftp_botao = (ActionEvent ev) -> {
            if(c.getProcesso() == 1){
                GerenciadorFTPView gf = new GerenciadorFTPView();
            }else{
                JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        };
        
                
        ActionListener serial_botao = (ActionEvent ev) -> {            
            SerialView sv = new SerialView(null, true);            
        };
                      
        popup.add(senhaMenu);       
        popup.addSeparator();
        popup.add(sairItem);
                
        //DIVERSOS
        menuCadastro.addActionListener(ftp_botao);        
        sairItem.addActionListener(sair_botao);
        sobreItem.addActionListener(sobre_botao);
        menuCompletoItem.addActionListener(modoMaximizado_botao);
        menuConfiguracoesSistema.addActionListener(configuracoes_botao);
        menuBackUp.addActionListener(backup_botao);
        menuConexoesSqlServer.addActionListener(conexoes_botao);
        menuSerial.addActionListener(serial_botao);
        
        //FORMATADOR
        juntarItem.addActionListener(juntar_botao);
        doubleItem.addActionListener(double_botao);
        replaceItem.addActionListener(replace_botao);
        estatisticaItem.addActionListener(estatistica_botao);
        comparadorItem.addActionListener(comparador_botao);
        
        //ASSET
        datasItem.addActionListener(datas_botao);        
        keyItem.addActionListener(keys_botao);
        
        //SENHAS
        senhaItem.addActionListener(senha_botao);
        
        
        if(c.getProcesso()==0){
            //menuConfiguracoesSistema.setEnabled(false);
            enterpriseMenu.setEnabled(false);
            keyItem.setEnabled(false);
            menuConexoesSqlServer.setEnabled(false);
            menuConexoesFtp.setEnabled(false);
        }                        
        return popup;
    }
    
    public void iniciarMinimizado(JFrame j){
        //this.setIconImage(new ImageIcon("Logo.png").getImage());
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();            
            Image image = Toolkit.getDefaultToolkit().getImage("Logo.png");

            final PopupMenu popup = criarPopupMenu();
            
            TrayIcon trayIcon = new TrayIcon(image, "Spark", popup);
            trayIcon.addActionListener((ActionEvent e) -> {
                j.setVisible(true);
            });
            trayIcon.setImageAutoSize(true); 
            try {
              tray.add(trayIcon);              
            } catch (AWTException e){
              System.err.println("Não pode adicionar a tray");
            }
        } else {
          System.err.println("Tray indisponível");
        }
    }    
    
    private static void sair(){
        int op = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair? ","Confirmação",JOptionPane.YES_NO_OPTION);        
        if(op == 0)System.exit(0);        
    }
    
    private void realizarBackup(){
        String arquivo = "DB\\Spark.db";
        Backup zip = new Backup();
        File fil = new File(arquivo);
        if(fil.exists()){
            zip.compactar(fil);
        }else{           
            JOptionPane.showMessageDialog(null, "Banco de dados não encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
        }        
    }
    
}
