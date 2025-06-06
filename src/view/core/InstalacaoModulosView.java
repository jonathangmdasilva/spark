package view.core;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;

/*
 * @author jsilva
 */

public class InstalacaoModulosView extends javax.swing.JDialog {

    ConfiguracaoModel cm = new ConfiguracaoModel();
    Funcoes f = new Funcoes();
        
    public InstalacaoModulosView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cm.setTema("Nimbus");
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTema = new javax.swing.ButtonGroup();
        buttonGroupModoSistema = new javax.swing.ButtonGroup();
        btnConfirmar = new javax.swing.JButton();
        panelOpcoes = new javax.swing.JPanel();
        panelAsset = new javax.swing.JPanel();
        btnAsset = new javax.swing.JButton();
        panelConsulta = new javax.swing.JPanel();
        btnFormatador = new javax.swing.JButton();
        panelSenhas = new javax.swing.JPanel();
        btnSenha = new javax.swing.JButton();
        lblModulos = new javax.swing.JLabel();
        jrbtnAsset = new javax.swing.JRadioButton();
        jrbtnFormatador = new javax.swing.JRadioButton();
        jrbtnSenhas = new javax.swing.JRadioButton();
        lblTema = new javax.swing.JLabel();
        controleTema = new javax.swing.JSlider();
        lblModo = new javax.swing.JLabel();
        jrbtnMaximizado = new javax.swing.JRadioButton();
        jrbtnCompacto = new javax.swing.JRadioButton();
        lblConfiguracao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Aceitar.png"))); // NOI18N
        btnConfirmar.setToolTipText("");
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 600, 50));

        panelOpcoes.setOpaque(false);

        btnAsset.setBackground(new java.awt.Color(255, 255, 255));
        btnAsset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Asset_64.png"))); // NOI18N
        btnAsset.setEnabled(false);
        btnAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAssetLayout = new javax.swing.GroupLayout(panelAsset);
        panelAsset.setLayout(panelAssetLayout);
        panelAssetLayout.setHorizontalGroup(
            panelAssetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAssetLayout.createSequentialGroup()
                .addComponent(btnAsset, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panelAssetLayout.setVerticalGroup(
            panelAssetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAsset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnFormatador.setBackground(new java.awt.Color(255, 255, 255));
        btnFormatador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Formatador_64.png"))); // NOI18N
        btnFormatador.setToolTipText("Formatadores");

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFormatador, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFormatador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSenhas.setPreferredSize(new java.awt.Dimension(230, 90));

        btnSenha.setBackground(new java.awt.Color(255, 255, 255));
        btnSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Criptografia_64.png"))); // NOI18N
        btnSenha.setToolTipText("Senhas");
        btnSenha.setEnabled(false);

        javax.swing.GroupLayout panelSenhasLayout = new javax.swing.GroupLayout(panelSenhas);
        panelSenhas.setLayout(panelSenhasLayout);
        panelSenhasLayout.setHorizontalGroup(
            panelSenhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelSenhasLayout.setVerticalGroup(
            panelSenhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblModulos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblModulos.setForeground(new java.awt.Color(255, 255, 255));
        lblModulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModulos.setText("Módulos");

        jrbtnAsset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbtnAsset.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnAsset.setText("Asset");
        jrbtnAsset.setContentAreaFilled(false);
        jrbtnAsset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbtnAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAssetActionPerformed(evt);
            }
        });

        jrbtnFormatador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbtnFormatador.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnFormatador.setSelected(true);
        jrbtnFormatador.setText("Formatadores");
        jrbtnFormatador.setContentAreaFilled(false);
        jrbtnFormatador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbtnFormatador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFormatadorActionPerformed(evt);
            }
        });

        jrbtnSenhas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbtnSenhas.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnSenhas.setText("Senhas");
        jrbtnSenhas.setContentAreaFilled(false);
        jrbtnSenhas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbtnSenhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnSenhasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcoesLayout = new javax.swing.GroupLayout(panelOpcoes);
        panelOpcoes.setLayout(panelOpcoesLayout);
        panelOpcoesLayout.setHorizontalGroup(
            panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcoesLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcoesLayout.createSequentialGroup()
                                .addComponent(panelAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcoesLayout.createSequentialGroup()
                        .addComponent(jrbtnAsset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(jrbtnFormatador, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jrbtnSenhas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        panelOpcoesLayout.setVerticalGroup(
            panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblModulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAsset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSenhas, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnAsset)
                    .addComponent(jrbtnFormatador)
                    .addComponent(jrbtnSenhas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 610, 180));

        lblTema.setBackground(new java.awt.Color(255, 255, 255));
        lblTema.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTema.setForeground(new java.awt.Color(255, 255, 255));
        lblTema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTema.setText("Tema:   Flat IntelliJ");
        getContentPane().add(lblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, -1));

        controleTema.setBackground(new java.awt.Color(255, 255, 255));
        controleTema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        controleTema.setMaximum(5);
        controleTema.setValue(4);
        controleTema.setOpaque(false);
        controleTema.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                controleTemaStateChanged(evt);
            }
        });
        getContentPane().add(controleTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 580, 20));

        lblModo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblModo.setForeground(new java.awt.Color(255, 255, 255));
        lblModo.setText("Modo: ");
        getContentPane().add(lblModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        buttonGroupModoSistema.add(jrbtnMaximizado);
        jrbtnMaximizado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnMaximizado.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnMaximizado.setText("Completo");
        jrbtnMaximizado.setContentAreaFilled(false);
        jrbtnMaximizado.setEnabled(false);
        getContentPane().add(jrbtnMaximizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        buttonGroupModoSistema.add(jrbtnCompacto);
        jrbtnCompacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCompacto.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnCompacto.setSelected(true);
        jrbtnCompacto.setText("Compacto");
        jrbtnCompacto.setContentAreaFilled(false);
        getContentPane().add(jrbtnCompacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        lblConfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config_BackGround.jpg"))); // NOI18N
        getContentPane().add(lblConfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtnAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAssetActionPerformed
        if(jrbtnAsset.isSelected()){
            btnAsset.setEnabled(true);
            cm.setAsset(1);            
        }else{
            btnAsset.setEnabled(false);
            cm.setAsset(0);
        }        
    }//GEN-LAST:event_jrbtnAssetActionPerformed

    private void jrbtnFormatadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFormatadorActionPerformed
        if(jrbtnFormatador.isSelected()){
            btnFormatador.setEnabled(true);
            cm.setFormatador(1);            
        }else{
            btnFormatador.setEnabled(false);
            cm.setFormatador(0);
        }        
    }//GEN-LAST:event_jrbtnFormatadorActionPerformed

    private void jrbtnSenhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnSenhasActionPerformed
        if(jrbtnSenhas.isSelected()){
            btnSenha.setEnabled(true);
            cm.setSenhas(1);            
        }else{
            btnSenha.setEnabled(false);
            cm.setSenhas(0);
        }        
    }//GEN-LAST:event_jrbtnSenhasActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            ConfiguracaoController cl = new ConfiguracaoController();
            cm.setProcesso(0);
            if (jrbtnCompacto.isSelected()){
                cm.setModoTela(0);
            }else{
                cm.setModoTela(1);
            }
            String serialBase  = Funcoes.criptMD5(System.getProperty("user.name"))+ "@" + "c4ca4238a0b923820dcc509a6f75849bs";
            //String login =  System.getProperty("user.name");             
            cm.setSerial(serialBase);
            String tema = lblTema.getText().replace("Tema:   ", "");        
            cm.setTema(tema.replace(" ", ""));
            if(cl.inserirConfiguracao(cm)){
                this.dispose();
                SplashView splash = new SplashView(cm);
                Thread.sleep(1000);                
                splash.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao inserir Configuração: ","Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Configuração: ","Erro",JOptionPane.ERROR_MESSAGE);            
        }                        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void controleTemaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_controleTemaStateChanged
        //controleTema.getValue();
        switch (controleTema.getValue()) {
            case 0:
                lblTema.setText("Tema:   Nimbus");
                break;
            case 1:
                lblTema.setText("Tema:   Metal");
                break;
            case 2:
                lblTema.setText("Tema:   Flat Light");
                break;
            case 3:
                lblTema.setText("Tema:   Flat Dark");
                break;
            case 4:
                lblTema.setText("Tema:   Flat IntelliJ");
                break;
            case 5:
                lblTema.setText("Tema:   Flat Darcula");
                break;                
            default:
                break;
        }
        String tema = lblTema.getText().replace("Tema:   ", "");        
        cm.setTema(tema.replace(" ", ""));
    }//GEN-LAST:event_controleTemaStateChanged

    private void btnAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstalacaoModulosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstalacaoModulosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstalacaoModulosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstalacaoModulosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InstalacaoModulosView dialog = new InstalacaoModulosView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsset;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFormatador;
    private javax.swing.JButton btnSenha;
    private javax.swing.ButtonGroup buttonGroupModoSistema;
    private javax.swing.ButtonGroup buttonGroupTema;
    private javax.swing.JSlider controleTema;
    private javax.swing.JRadioButton jrbtnAsset;
    private javax.swing.JRadioButton jrbtnCompacto;
    private javax.swing.JRadioButton jrbtnFormatador;
    private javax.swing.JRadioButton jrbtnMaximizado;
    private javax.swing.JRadioButton jrbtnSenhas;
    private javax.swing.JLabel lblConfiguracao;
    private javax.swing.JLabel lblModo;
    private javax.swing.JLabel lblModulos;
    private javax.swing.JLabel lblTema;
    private javax.swing.JPanel panelAsset;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelOpcoes;
    private javax.swing.JPanel panelSenhas;
    // End of variables declaration//GEN-END:variables
}
