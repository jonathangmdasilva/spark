package view.core;

import backup.Backup;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controlador.ConfiguracaoController;
import controlador.Funcoes;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import javax.swing.ImageIcon;
import view.suporte.GerenciadorConexaoBdView;
import view.format.EstatisticaView;
import view.format.ReplaceView;
import view.format.ComparadorView;
import view.format.JuntarView;
import view.format.DuplicidadeView;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.core.ConfiguracaoModel;
import view.suporte.GerenciadorDatabaseView;
import view.suporte.GerenciadorFTPView;

/*
 * @author Jonathan
 */

public final class TelaPrincipalCompleto extends javax.swing.JFrame {

    
    ConfiguracaoModel c;
    ConfiguracaoController confContr = new ConfiguracaoController();
    Funcoes f = new Funcoes();
    
    public TelaPrincipalCompleto(ConfiguracaoModel cm) {
        initComponents();
        setIcone();
        setLocationRelativeTo(null);        
        lblUsuario.setText("Usuário: " + System.getProperty("user.name"));
        this.c = cm;
        configurar();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //iniciarMinimizado();
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }

    private TelaPrincipalCompleto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalCompleto = new jpanelGradient();
        lblLogo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnCalendario = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        menuCompleto = new javax.swing.JMenuBar();
        menuFormatadores = new javax.swing.JMenu();
        menuItemFormatadoresComparador = new javax.swing.JMenuItem();
        menuItemFormatadoresDuplicidade = new javax.swing.JMenuItem();
        menuItemFormatadoresEstatistica = new javax.swing.JMenuItem();
        menuItemFormatadoresJuntar = new javax.swing.JMenuItem();
        menuItemFormatadoresReplace = new javax.swing.JMenuItem();
        menuUtilitarios = new javax.swing.JMenu();
        menuGerenciadorDataBase = new javax.swing.JMenuItem();
        menuConexaoFtp = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuGestaoSerial = new javax.swing.JMenu();
        menuGestaoSerialCadastrar = new javax.swing.JMenuItem();
        menuGestaoSerialConsultar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        menuCongifuracoesBackUp = new javax.swing.JMenuItem();
        menuCongifuracoesSistema = new javax.swing.JMenuItem();
        menuCongifuracoesParametrizacao = new javax.swing.JMenu();
        menuCongifuracoesParametrizarAssoc = new javax.swing.JMenuItem();
        menuCongifuracoesParametrizarInserir = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Spark");
        setMinimumSize(new java.awt.Dimension(580, 380));

        panelPrincipalCompleto.setForeground(new java.awt.Color(0, 51, 255));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sair.png"))); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setFocusPainted(false);
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendario.png"))); // NOI18N
        btnCalendario.setToolTipText("Calendário");
        btnCalendario.setBorderPainted(false);
        btnCalendario.setContentAreaFilled(false);
        btnCalendario.setFocusPainted(false);
        btnCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioActionPerformed(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Oculto_32.png"))); // NOI18N
        btnMinimizar.setToolTipText("Ocultar");
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setText("Usuário: ");

        javax.swing.GroupLayout panelPrincipalCompletoLayout = new javax.swing.GroupLayout(panelPrincipalCompleto);
        panelPrincipalCompleto.setLayout(panelPrincipalCompletoLayout);
        panelPrincipalCompletoLayout.setHorizontalGroup(
            panelPrincipalCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalCompletoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(panelPrincipalCompletoLayout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPrincipalCompletoLayout.setVerticalGroup(
            panelPrincipalCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalCompletoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addComponent(btnCalendario)
                    .addComponent(lblUsuario))
                .addContainerGap())
        );

        menuFormatadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juntar_32.png"))); // NOI18N
        menuFormatadores.setText("Formatadores");

        menuItemFormatadoresComparador.setText("Comparador");
        menuItemFormatadoresComparador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFormatadoresComparadorActionPerformed(evt);
            }
        });
        menuFormatadores.add(menuItemFormatadoresComparador);

        menuItemFormatadoresDuplicidade.setText("Duplicidade");
        menuItemFormatadoresDuplicidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFormatadoresDuplicidadeActionPerformed(evt);
            }
        });
        menuFormatadores.add(menuItemFormatadoresDuplicidade);

        menuItemFormatadoresEstatistica.setText("Estatistica");
        menuItemFormatadoresEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFormatadoresEstatisticaActionPerformed(evt);
            }
        });
        menuFormatadores.add(menuItemFormatadoresEstatistica);

        menuItemFormatadoresJuntar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemFormatadoresJuntar.setText("Juntar");
        menuItemFormatadoresJuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFormatadoresJuntarActionPerformed(evt);
            }
        });
        menuFormatadores.add(menuItemFormatadoresJuntar);

        menuItemFormatadoresReplace.setText("Replace");
        menuItemFormatadoresReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFormatadoresReplaceActionPerformed(evt);
            }
        });
        menuFormatadores.add(menuItemFormatadoresReplace);

        menuCompleto.add(menuFormatadores);

        menuUtilitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Control_32.png"))); // NOI18N
        menuUtilitarios.setText("Utilitários");

        menuGerenciadorDataBase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuGerenciadorDataBase.setText("Conexões DB - Clientes");
        menuGerenciadorDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciadorDataBaseActionPerformed(evt);
            }
        });
        menuUtilitarios.add(menuGerenciadorDataBase);

        menuConexaoFtp.setText("Conexões Ftp");
        menuConexaoFtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConexaoFtpActionPerformed(evt);
            }
        });
        menuUtilitarios.add(menuConexaoFtp);

        jMenuItem3.setText("Gerenciador DataBase");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuUtilitarios.add(jMenuItem3);

        menuGestaoSerial.setText("Gestão de Serial");

        menuGestaoSerialCadastrar.setText("Cadastrar");
        menuGestaoSerialCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoSerialCadastrarActionPerformed(evt);
            }
        });
        menuGestaoSerial.add(menuGestaoSerialCadastrar);

        menuGestaoSerialConsultar.setText("Consultar");
        menuGestaoSerialConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoSerialConsultarActionPerformed(evt);
            }
        });
        menuGestaoSerial.add(menuGestaoSerialConsultar);

        menuUtilitarios.add(menuGestaoSerial);

        jMenuItem1.setText("Sofwate Update");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuUtilitarios.add(jMenuItem1);

        menuCompleto.add(menuUtilitarios);

        menuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Configuracoes_32.png"))); // NOI18N
        menuConfiguracoes.setText("Configurações");

        menuCongifuracoesBackUp.setText("Backup");
        menuCongifuracoesBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCongifuracoesBackUpActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuCongifuracoesBackUp);

        menuCongifuracoesSistema.setText("Sistema");
        menuCongifuracoesSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCongifuracoesSistemaActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuCongifuracoesSistema);

        menuCongifuracoesParametrizacao.setText("Parametrização");

        menuCongifuracoesParametrizarAssoc.setText("Associar");
        menuCongifuracoesParametrizarAssoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCongifuracoesParametrizarAssocActionPerformed(evt);
            }
        });
        menuCongifuracoesParametrizacao.add(menuCongifuracoesParametrizarAssoc);

        menuCongifuracoesParametrizarInserir.setText("Gestor");
        menuCongifuracoesParametrizarInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCongifuracoesParametrizarInserirActionPerformed(evt);
            }
        });
        menuCongifuracoesParametrizacao.add(menuCongifuracoesParametrizarInserir);

        menuConfiguracoes.add(menuCongifuracoesParametrizacao);

        menuCompleto.add(menuConfiguracoes);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sobre_32.png"))); // NOI18N
        menuAjuda.setText("Ajuda");

        menuAjudaSobre.setText("Sobre");
        menuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjudaSobre);

        menuCompleto.add(menuAjuda);

        setJMenuBar(menuCompleto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void menuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaSobreActionPerformed
        SobreView sobre = new SobreView(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuAjudaSobreActionPerformed

    private void menuItemFormatadoresJuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFormatadoresJuntarActionPerformed
        JuntarView cv = new JuntarView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuItemFormatadoresJuntarActionPerformed

    private void menuItemFormatadoresComparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFormatadoresComparadorActionPerformed
        ComparadorView comparador = new ComparadorView();
    }//GEN-LAST:event_menuItemFormatadoresComparadorActionPerformed

    private void menuItemFormatadoresDuplicidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFormatadoresDuplicidadeActionPerformed
        DuplicidadeView db = new DuplicidadeView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuItemFormatadoresDuplicidadeActionPerformed

    private void menuItemFormatadoresEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFormatadoresEstatisticaActionPerformed
        EstatisticaView ct = new EstatisticaView();        
    }//GEN-LAST:event_menuItemFormatadoresEstatisticaActionPerformed

    private void menuItemFormatadoresReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFormatadoresReplaceActionPerformed
        ReplaceView replace = new ReplaceView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuItemFormatadoresReplaceActionPerformed

    private void menuGerenciadorDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciadorDataBaseActionPerformed
        GerenciadorConexaoBdView gc = new GerenciadorConexaoBdView();
    }//GEN-LAST:event_menuGerenciadorDataBaseActionPerformed

    private void menuCongifuracoesSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCongifuracoesSistemaActionPerformed
        ConfiguracoesSistemaView cv = new ConfiguracoesSistemaView(c);
    }//GEN-LAST:event_menuCongifuracoesSistemaActionPerformed

    private void menuCongifuracoesBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCongifuracoesBackUpActionPerformed
        realizarBackup();
    }//GEN-LAST:event_menuCongifuracoesBackUpActionPerformed

    private void btnCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioActionPerformed
        CalendarioView calendario = new CalendarioView(c);
    }//GEN-LAST:event_btnCalendarioActionPerformed

    private void menuConexaoFtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConexaoFtpActionPerformed
        GerenciadorFTPView gFtp = new GerenciadorFTPView();
    }//GEN-LAST:event_menuConexaoFtpActionPerformed

    private void menuGestaoSerialConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoSerialConsultarActionPerformed
        ConsultaKey ck = new ConsultaKey();
    }//GEN-LAST:event_menuGestaoSerialConsultarActionPerformed

    private void menuGestaoSerialCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoSerialCadastrarActionPerformed
        CadastroKey  cad = new CadastroKey(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuGestaoSerialCadastrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        WindowsAgentView suv = new WindowsAgentView(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        GerenciadorDatabaseView gdbv = new GerenciadorDatabaseView();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuCongifuracoesParametrizarAssocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCongifuracoesParametrizarAssocActionPerformed
        AssociadorDatabaseView adbv = new AssociadorDatabaseView();
    }//GEN-LAST:event_menuCongifuracoesParametrizarAssocActionPerformed

    private void menuCongifuracoesParametrizarInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCongifuracoesParametrizarInserirActionPerformed
        GerenciadorParametrosView gpv = new GerenciadorParametrosView();
    }//GEN-LAST:event_menuCongifuracoesParametrizarInserirActionPerformed

    private void realizarBackup(){
        String arquivo = "DB\\Spark.db";
        Backup zip = new Backup();
        File fil = new File(arquivo);
        if(fil.exists()){
            zip.compactar(fil);
            System.out.println("Arquivo: " + fil.getName());
            System.out.println("Arquivo: " + fil.getAbsolutePath());
        }else{           
            JOptionPane.showMessageDialog(this, "Banco de dados não encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
        }        
    }
    
    private static void sair(){
        int op = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair? ","Confirmação",JOptionPane.YES_NO_OPTION);
        if(op == 0)System.exit(0);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipalCompleto().setVisible(true);
        });
    }
        
    private void configurar(){
        iniciarTema(c.getTema());
        if((c.getTema().contains("FlatLight")) || (c.getTema().contains("Metal")) || (c.getTema().contains("FlatIntelliJ"))||(c.getTema().contains("Nimbus"))){
            menuCompleto.setForeground(Color.black);
            menuFormatadores.setForeground(Color.black);
            menuAjuda.setForeground(Color.black);            
            menuConfiguracoes.setForeground(Color.black);
            menuUtilitarios.setForeground(Color.black);
            //menuSerialSpark.setForeground(Color.black);
            lblUsuario.setForeground(Color.black);
        }else{
            menuCompleto.setForeground(Color.white);
            menuFormatadores.setForeground(Color.white);
            menuAjuda.setForeground(Color.white);
            menuConfiguracoes.setForeground(Color.white);
            menuUtilitarios.setForeground(Color.white);
            lblUsuario.setForeground(Color.white);
            //menuSerialSpark.setForeground(Color.white);
        }
        this.panelPrincipalCompleto.updateUI();
        menuCompleto.updateUI();
        this.repaint();                        
    }
    
    private void iniciarTema(String tema){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (tema.equals(info.getName())){                    
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }else if(tema.equals("FlatLight")){
                    UIManager.setLookAndFeel( new FlatLightLaf());
                }else if(tema.equals("FlatDark")){
                    UIManager.setLookAndFeel( new FlatDarkLaf());
                }else if(tema.equals("FlatIntelliJ")){
                    UIManager.setLookAndFeel( new FlatIntelliJLaf());
                }else if(tema.equals("FlatDarcula")){
                    UIManager.setLookAndFeel( new FlatDarculaLaf());
                }                
            }           
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregador UI - Look And Feel! " + e.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }              
    
    private void validaSerial(){
        try {
            String login =  System.getProperty("user.name");
            String serial = confContr.serialConfig();
            String trataString = f.tratarSerial(serial);
            boolean serialValido = f.validarSerial(login, trataString); 
            if (serialValido){
                int peso = confContr.validaPeso(f.tratarValidadeSerial(serial));             
                if(!confContr.validadeDataAtualizacaoSerial(peso)){ 
                    menuCompleto.setVisible(false);
                    panelPrincipalCompleto.updateUI();                    
                    SerialView cv = new SerialView(this, true);
                }                                
            }else{
                JOptionPane.showMessageDialog(this,"Serial Inválido entre em contato com o suporte! ", "Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }                       
    }
    
    private void setIcone(){
        try {
            this.setIconImage(new ImageIcon("Logo.png").getImage());
        } catch (Exception e) {
            System.out.println("Erro: ao carregar icone: " +e.getMessage());
        }
        
    }
    
    class jpanelGradient extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
                       
            //Color cor1 = new Color(52,143,80);
            //Color cor2 = new Color(86,180,211);
            
            Color cor1 = new Color(0,31,85);            
            Color cor2 = new Color(86,180,211);
            
            GradientPaint gp = new GradientPaint(0,0,cor1,180,height,cor2);
            
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendario;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenuBar menuCompleto;
    private javax.swing.JMenuItem menuConexaoFtp;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenuItem menuCongifuracoesBackUp;
    private javax.swing.JMenu menuCongifuracoesParametrizacao;
    private javax.swing.JMenuItem menuCongifuracoesParametrizarAssoc;
    private javax.swing.JMenuItem menuCongifuracoesParametrizarInserir;
    private javax.swing.JMenuItem menuCongifuracoesSistema;
    private javax.swing.JMenu menuFormatadores;
    private javax.swing.JMenuItem menuGerenciadorDataBase;
    private javax.swing.JMenu menuGestaoSerial;
    private javax.swing.JMenuItem menuGestaoSerialCadastrar;
    private javax.swing.JMenuItem menuGestaoSerialConsultar;
    private javax.swing.JMenuItem menuItemFormatadoresComparador;
    private javax.swing.JMenuItem menuItemFormatadoresDuplicidade;
    private javax.swing.JMenuItem menuItemFormatadoresEstatistica;
    private javax.swing.JMenuItem menuItemFormatadoresJuntar;
    private javax.swing.JMenuItem menuItemFormatadoresReplace;
    private javax.swing.JMenu menuUtilitarios;
    private javax.swing.JPanel panelPrincipalCompleto;
    // End of variables declaration//GEN-END:variables
}