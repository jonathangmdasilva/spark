package view.core;

//import com.sun.awt.AWTUtilities;
import backup.Backup;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controlador.ConfiguracaoController;
import view.format.EstatisticaView;
import view.suporte.SeletorSenhaView;
import view.format.ReplaceView;
import view.format.ComparadorView;
import view.format.JuntarView;
import view.format.DuplicidadeView;
import controlador.Funcoes;
import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.core.ConfiguracaoModel;
import view.suporte.GerenciadorConexaoBdView;

/*
 * @author Jonathan
 */

public final class SparkPrincipal extends javax.swing.JFrame {
    
    Funcoes f = new Funcoes();
    ConfiguracaoModel c;
    ConfiguracaoController confContr = new ConfiguracaoController();
    final PopupMenu popup = new PopupMenu();
    
    public SparkPrincipal(ConfiguracaoModel cm) {
        initComponents();
        this.c = cm;
        configurar(cm);        
        setIcone();        
        //iniciarMinimizado();
        display();        
        setVisible(true);        
        this.add(popupMenu);
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        jmiSobre = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        panelSenhas = new javax.swing.JPanel();
        btnSobre = new javax.swing.JButton();
        btnCalendario = new javax.swing.JButton();
        panelFormatador = new javax.swing.JPanel();
        btnJuntar = new javax.swing.JButton();
        btnReplace = new javax.swing.JButton();
        btnDouble = new javax.swing.JButton();
        btnComparador = new javax.swing.JButton();
        panelAsset = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnCaixaAlta = new javax.swing.JButton();
        btnCalcularDatas = new javax.swing.JButton();
        btnKey = new javax.swing.JButton();
        btnSenhaDia = new javax.swing.JButton();

        jmiSobre.setText("jMenuItem1");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        popupMenu.add(jmiSobre);

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        popupMenu.add(jmiSair);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spark");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setIconImages(null);
        setUndecorated(true);
        setOpacity(0.7F);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        panelSenhas.setBackground(new java.awt.Color(0, 0, 0));

        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sobre_32.png"))); // NOI18N
        btnSobre.setToolTipText("Sobre");
        btnSobre.setBorderPainted(false);
        btnSobre.setContentAreaFilled(false);
        btnSobre.setFocusPainted(false);
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
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

        javax.swing.GroupLayout panelSenhasLayout = new javax.swing.GroupLayout(panelSenhas);
        panelSenhas.setLayout(panelSenhasLayout);
        panelSenhasLayout.setHorizontalGroup(
            panelSenhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSenhasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSenhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSenhasLayout.setVerticalGroup(
            panelSenhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSenhasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSobre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalendario)
                .addContainerGap())
        );

        panelFormatador.setBackground(new java.awt.Color(0, 0, 0));

        btnJuntar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juntar_32.png"))); // NOI18N
        btnJuntar.setToolTipText("Juntar");
        btnJuntar.setBorderPainted(false);
        btnJuntar.setContentAreaFilled(false);
        btnJuntar.setFocusPainted(false);
        btnJuntar.setFocusable(false);
        btnJuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuntarActionPerformed(evt);
            }
        });

        btnReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Troca_32.png"))); // NOI18N
        btnReplace.setToolTipText("Replace");
        btnReplace.setBorderPainted(false);
        btnReplace.setContentAreaFilled(false);
        btnReplace.setFocusPainted(false);
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });

        btnDouble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pesquisax32.png"))); // NOI18N
        btnDouble.setToolTipText("Duplicados");
        btnDouble.setBorderPainted(false);
        btnDouble.setContentAreaFilled(false);
        btnDouble.setFocusPainted(false);
        btnDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoubleActionPerformed(evt);
            }
        });

        btnComparador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Diferenca_32.png"))); // NOI18N
        btnComparador.setToolTipText("Comparador de Listas");
        btnComparador.setBorderPainted(false);
        btnComparador.setContentAreaFilled(false);
        btnComparador.setFocusPainted(false);
        btnComparador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormatadorLayout = new javax.swing.GroupLayout(panelFormatador);
        panelFormatador.setLayout(panelFormatadorLayout);
        panelFormatadorLayout.setHorizontalGroup(
            panelFormatadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormatadorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormatadorLayout.setVerticalGroup(
            panelFormatadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDouble, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnReplace, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnJuntar, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnComparador, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panelFormatadorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnJuntar, btnReplace});

        panelAsset.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelAssetLayout = new javax.swing.GroupLayout(panelAsset);
        panelAsset.setLayout(panelAssetLayout);
        panelAssetLayout.setHorizontalGroup(
            panelAssetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelAssetLayout.setVerticalGroup(
            panelAssetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

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

        btnCaixaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Soma_32.png"))); // NOI18N
        btnCaixaAlta.setToolTipText("Calcular (Média e Mediana)");
        btnCaixaAlta.setBorderPainted(false);
        btnCaixaAlta.setContentAreaFilled(false);
        btnCaixaAlta.setFocusPainted(false);
        btnCaixaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaAltaActionPerformed(evt);
            }
        });

        btnCalcularDatas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calcular_32.png"))); // NOI18N
        btnCalcularDatas.setToolTipText("Calcular Datas");
        btnCalcularDatas.setBorderPainted(false);
        btnCalcularDatas.setContentAreaFilled(false);
        btnCalcularDatas.setFocusPainted(false);
        btnCalcularDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularDatasActionPerformed(evt);
            }
        });

        btnKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Keys_32.png"))); // NOI18N
        btnKey.setToolTipText("Keys");
        btnKey.setBorderPainted(false);
        btnKey.setContentAreaFilled(false);
        btnKey.setFocusPainted(false);
        btnKey.setFocusable(false);
        btnKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeyActionPerformed(evt);
            }
        });

        btnSenhaDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Senha_32.png"))); // NOI18N
        btnSenhaDia.setToolTipText("Senha do Dia");
        btnSenhaDia.setBorderPainted(false);
        btnSenhaDia.setContentAreaFilled(false);
        btnSenhaDia.setFocusPainted(false);
        btnSenhaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnSenhaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKey, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcularDatas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaixaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelFormatador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMinimizar)
                            .addComponent(panelAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCaixaAlta)
                                .addComponent(btnCalcularDatas, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnKey, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnSenhaDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelFormatador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelSenhas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuntarActionPerformed
        JuntarView cv = new JuntarView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnJuntarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        SobreView sobre = new SobreView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnCalcularDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularDatasActionPerformed
        CalcularDatasView cdv = new CalcularDatasView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnCalcularDatasActionPerformed

    private void btnCaixaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaAltaActionPerformed
        EstatisticaView ct = new EstatisticaView();        
    }//GEN-LAST:event_btnCaixaAltaActionPerformed

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed
        ReplaceView replace = new ReplaceView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnComparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparadorActionPerformed
        ComparadorView c = new ComparadorView();
    }//GEN-LAST:event_btnComparadorActionPerformed

    private void btnDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoubleActionPerformed
        DuplicidadeView db = new DuplicidadeView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnDoubleActionPerformed

    private void btnKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeyActionPerformed
        PrincipalStone ps = new PrincipalStone();                
    }//GEN-LAST:event_btnKeyActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        sair();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        SobreView sobre = new SobreView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void btnCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioActionPerformed
        CalendarioView calendario = new CalendarioView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnCalendarioActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        validaSerial();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnSenhaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaDiaActionPerformed
        SeletorSenhaView ssv = new SeletorSenhaView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnSenhaDiaActionPerformed

    private static void sair(){
        int op = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair? ","Confirmação",JOptionPane.YES_NO_OPTION);        
        if(op == 0)System.exit(0);        
    }
    
    public void display(){        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - this.getWidth();
        int y = (int) (rect.getMaxY() - this.getHeight());        
        this.setLocation(x,y-40);
        this.setVisible(true);
    }
    
    
    private void setIcone(){
        try {
            this.setIconImage(new ImageIcon("Logo.png").getImage());
        } catch (Exception e) {
            System.out.println("Erro: ao carregar icone: " +e.getMessage());
        }
        
    }
    
    public void iniciarMinimizado(){
        //new SparkPrincipal().display();
        this.setIconImage(new ImageIcon("Logo.png").getImage());
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();            
            Image image = Toolkit.getDefaultToolkit().getImage("Logo.png");
            //PopupMenu popup = new PopupMenu();  
            final PopupMenu popup = criarPopupMenu();
                                   
            TrayIcon trayIcon = new TrayIcon(image, "Spark", popup);
            trayIcon.addActionListener((ActionEvent e) -> {
                this.setVisible(true);
            });
            trayIcon.setImageAutoSize(true); 
            try {
              tray.add(trayIcon);              
            } catch (AWTException e){
                JOptionPane.showMessageDialog(this,"Não pode adicionar a tray","Aviso",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,"Tray indisponível","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }

    protected PopupMenu criarPopupMenu() {        
        MenuItem menuCompletoItem = new MenuItem("Modo Maximizado");
        MenuItem sobreItem = new MenuItem("Sobre");
        
        //Configurações
        Menu menuConfiguracao = new Menu("Configurações");
        MenuItem menuBackUp = new MenuItem("Backup");
        MenuItem menuConfiguracoesSistema = new MenuItem("Sistema");
        MenuItem menuConexoesSqlServer = new MenuItem("Conexões Data Base");
        menuConfiguracao.add(menuBackUp);
        menuConfiguracao.add(menuConfiguracoesSistema);
        menuConfiguracao.add(menuConexoesSqlServer);
                        
        Menu assetMenu = new Menu("Asset");
        Menu formatadorMenu = new Menu("Formatador");
        Menu senhaMenu = new Menu("Senha");
                              
        MenuItem sairItem = new MenuItem("Sair");                
        
        // Add componentes ao pop-up menu
        popup.add(menuCompletoItem);
        popup.add(menuConfiguracao);        
        popup.add(sobreItem);
        popup.addSeparator();
        popup.add(assetMenu);
        
        //ASSET
        MenuItem keyItem = new MenuItem("Keys");
        MenuItem datasItem = new MenuItem("Calculo de Datas");
        assetMenu.add(keyItem);
        assetMenu.add(datasItem);
        
        //SENHA
        MenuItem senhaItem = new MenuItem("Senha do Dia");
        MenuItem decryptItem = new MenuItem("Decrypt MC1");        
        senhaMenu.add(senhaItem);
        senhaMenu.add(decryptItem);        
        
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
            SobreView sobre = new SobreView(this, rootPaneCheckingEnabled);
        };
        
        ActionListener juntar_botao = (ActionEvent ev) -> {
            JuntarView cv = new JuntarView(this, rootPaneCheckingEnabled);
        };
        
        ActionListener double_botao = (ActionEvent ev) -> {
            DuplicidadeView db = new DuplicidadeView(null, rootPaneCheckingEnabled);
        };
        
        ActionListener replace_botao = (ActionEvent ev) -> {
            ReplaceView replace = new ReplaceView(this, rootPaneCheckingEnabled);
        };
                
        ActionListener comparador_botao = (ActionEvent ev) -> {
            ComparadorView c = new ComparadorView();
        };
                
        ActionListener estatistica_botao = (ActionEvent ev) -> {
            EstatisticaView est = new EstatisticaView();
        };
                
        ActionListener datas_botao = (ActionEvent ev) -> {
            CalcularDatasView cdv = new CalcularDatasView(this, rootPaneCheckingEnabled);
        };
        
        ActionListener keys_botao = (ActionEvent ev) -> {
            PrincipalStone ps = new PrincipalStone();
        };
                
        ActionListener senha_botao = (ActionEvent ev) -> {
            SeletorSenhaView ssv = new SeletorSenhaView(this, rootPaneCheckingEnabled);            
        };
                                                
        ActionListener modoMaximizado_botao = (ActionEvent ev) -> {
            if(c.getProcesso()==1){
                TelaPrincipalCompleto tp = new TelaPrincipalCompleto(c);
            }else{
                JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        };
        
        
        ActionListener configuracoes_botao = (ActionEvent ev) -> {
            if(c.getProcesso()==1){
                ConfiguracoesSistemaView cv = new ConfiguracoesSistemaView(c);
            }else{
                JOptionPane.showMessageDialog(null, "Sem opções habilitadas!","Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
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
        
        
        popup.add(senhaMenu);
        popup.addSeparator();
        popup.add(sairItem);
                    
        //DIVERSOS
        sairItem.addActionListener(sair_botao);
        sobreItem.addActionListener(sobre_botao);
        menuCompletoItem.addActionListener(modoMaximizado_botao);
        menuConfiguracoesSistema.addActionListener(configuracoes_botao);
        menuBackUp.addActionListener(backup_botao);
        menuConexoesSqlServer.addActionListener(conexoes_botao);
        
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
                       
        return popup;
    }
             
    private void configurar(ConfiguracaoModel cm){
        iniciarTema(cm.getTema());
        if(cm.getAsset()==0){
            this.panelPrincipal.remove(this.panelAsset);
        }
        if(cm.getFormatador()==0){
            this.panelPrincipal.remove(this.panelFormatador);
        }
        if(cm.getSenhas()==0){
            this.panelPrincipal.remove(this.panelSenhas);
        }
        if(cm.getSenhas()== 0){
            this.setSize(150,50);
            this.panelPrincipal.setSize(150,50);
        }
        //this..updateUI();
        pack();        
        this.panelPrincipal.updateUI();
        
        this.repaint();                
    }
    
    private void iniciarTema(String tema){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (tema.equals(info.getName())){                    
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }else if(tema.equals("FlatLight")){
                    //FlatLightLaf.setup();                    
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
    
    private void realizarBackup(){
        String arquivo = "Spark.db";
        Backup zip = new Backup();
        File fil = new File(arquivo);
        if(fil.exists()){
            zip.compactar(fil);
        }else{           
            JOptionPane.showMessageDialog(this, "Banco de dados não encontrado!","Aviso",JOptionPane.WARNING_MESSAGE);
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
                    panelAsset.setEnabled(false);
                    panelFormatador.setEnabled(false);                   
                    //panelPrincipalCompleto.updateUI();                    
                    SerialView cv = new SerialView(this, true);
                }                                
            }else{
                JOptionPane.showMessageDialog(this,"Serial Invalido entre em contato com o suporte! ", "Aviso",JOptionPane.WARNING_MESSAGE);
            }                        
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }                       
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixaAlta;
    private javax.swing.JButton btnCalcularDatas;
    private javax.swing.JButton btnCalendario;
    private javax.swing.JButton btnComparador;
    private javax.swing.JButton btnDouble;
    private javax.swing.JButton btnJuntar;
    private javax.swing.JButton btnKey;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnReplace;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSenhaDia;
    private javax.swing.JButton btnSobre;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JPanel panelAsset;
    private javax.swing.JPanel panelFormatador;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSenhas;
    private javax.swing.JPopupMenu popupMenu;
    // End of variables declaration//GEN-END:variables
}