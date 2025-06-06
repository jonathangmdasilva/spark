package view.core;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author Jonathan
 */
public class GeradorSerialView extends javax.swing.JDialog {
    Funcoes f = new Funcoes();
    
    public GeradorSerialView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPeriodo = new javax.swing.ButtonGroup();
        grupoVersao = new javax.swing.ButtonGroup();
        grupoParametro = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JLabel();
        lblPeriodo1 = new javax.swing.JLabel();
        jrbtnInfinito = new javax.swing.JRadioButton();
        jrbtnUm = new javax.swing.JRadioButton();
        jrbtnTres = new javax.swing.JRadioButton();
        jrbtnSeis = new javax.swing.JRadioButton();
        jrbtnDoze = new javax.swing.JRadioButton();
        btnCopiar = new javax.swing.JButton();
        lblVersao = new javax.swing.JLabel();
        jrbtnStarter = new javax.swing.JRadioButton();
        jrbtnCompleta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSerial = new javax.swing.JTextArea();
        jrbtnMaster = new javax.swing.JRadioButton();
        lblSenhadia = new javax.swing.JLabel();
        lblParametro = new javax.swing.JLabel();
        jrbtnAtual = new javax.swing.JRadioButton();
        jrbtnTerceiro = new javax.swing.JRadioButton();
        jmiMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuArquivoSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serial Spark");
        setMinimumSize(new java.awt.Dimension(675, 330));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Aceitar.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");

        txtLogin.setEditable(false);
        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPeriodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setText("Período");

        lblPeriodo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPeriodo1.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo1.setText("Serial:");

        grupoPeriodo.add(jrbtnInfinito);
        jrbtnInfinito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnInfinito.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnInfinito.setText("∞");
        jrbtnInfinito.setContentAreaFilled(false);

        grupoPeriodo.add(jrbtnUm);
        jrbtnUm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnUm.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnUm.setSelected(true);
        jrbtnUm.setText("1");
        jrbtnUm.setContentAreaFilled(false);

        grupoPeriodo.add(jrbtnTres);
        jrbtnTres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnTres.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnTres.setText("3");
        jrbtnTres.setContentAreaFilled(false);

        grupoPeriodo.add(jrbtnSeis);
        jrbtnSeis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnSeis.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnSeis.setText("6");
        jrbtnSeis.setContentAreaFilled(false);

        grupoPeriodo.add(jrbtnDoze);
        jrbtnDoze.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnDoze.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnDoze.setText("12");
        jrbtnDoze.setContentAreaFilled(false);

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copiar_32.png"))); // NOI18N
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        lblVersao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVersao.setForeground(new java.awt.Color(255, 255, 255));
        lblVersao.setText("Versão");

        grupoVersao.add(jrbtnStarter);
        jrbtnStarter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnStarter.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnStarter.setText("Starter");
        jrbtnStarter.setContentAreaFilled(false);

        grupoVersao.add(jrbtnCompleta);
        jrbtnCompleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCompleta.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnCompleta.setText("Completa");
        jrbtnCompleta.setContentAreaFilled(false);

        txaSerial.setColumns(20);
        txaSerial.setRows(5);
        jScrollPane1.setViewportView(txaSerial);

        grupoVersao.add(jrbtnMaster);
        jrbtnMaster.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnMaster.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnMaster.setText("Master");
        jrbtnMaster.setContentAreaFilled(false);

        lblSenhadia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSenhadia.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhadia.setText("Senha: 0000");

        lblParametro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParametro.setForeground(new java.awt.Color(255, 255, 255));
        lblParametro.setText("Parametro");

        grupoParametro.add(jrbtnAtual);
        jrbtnAtual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnAtual.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnAtual.setSelected(true);
        jrbtnAtual.setText("Atual");
        jrbtnAtual.setContentAreaFilled(false);
        jrbtnAtual.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbtnAtualItemStateChanged(evt);
            }
        });

        grupoParametro.add(jrbtnTerceiro);
        jrbtnTerceiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnTerceiro.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnTerceiro.setText("Terceiro");
        jrbtnTerceiro.setContentAreaFilled(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblSenhadia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCopiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPeriodo)
                            .addComponent(lblLogin)
                            .addComponent(lblVersao)
                            .addComponent(lblParametro)
                            .addComponent(lblPeriodo1))
                        .addGap(32, 32, 32)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(txtLogin)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jrbtnAtual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbtnTerceiro))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jrbtnStarter)
                                        .addGap(13, 13, 13)
                                        .addComponent(jrbtnCompleta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbtnMaster))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jrbtnUm)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbtnTres)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbtnSeis)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbtnDoze)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbtnInfinito)))
                                .addGap(0, 296, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParametro)
                    .addComponent(jrbtnAtual)
                    .addComponent(jrbtnTerceiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeriodo)
                    .addComponent(jrbtnInfinito)
                    .addComponent(jrbtnUm)
                    .addComponent(jrbtnTres)
                    .addComponent(jrbtnSeis)
                    .addComponent(jrbtnDoze))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVersao)
                    .addComponent(jrbtnStarter)
                    .addComponent(jrbtnCompleta)
                    .addComponent(jrbtnMaster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeriodo1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSenhadia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10))
        );

        menuArquivo.setText("Arquivo");

        menuArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuArquivoSair.setText("Sair");
        menuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuArquivoSair);

        jmiMenu.add(menuArquivo);

        menuAjuda.setText("Ajuda");

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem1);

        jmiMenu.add(menuAjuda);

        setJMenuBar(jmiMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String peso = "";
        if(jrbtnInfinito.isSelected()){
            peso = "0";
        }else if(jrbtnUm.isSelected()){
            peso = "1";
        }else if(jrbtnTres.isSelected()){
            peso = "3";
        }else if (jrbtnSeis.isSelected()){
            peso = "6";
        }else{
            peso = "12";
        }        
        String serial = Funcoes.criptMD5(txtLogin.getText()) + "@" + Funcoes.criptMD5(peso);
        if (jrbtnStarter.isSelected()) {
            txaSerial.setText(serial.concat("s"));
        }else if (jrbtnCompleta.isSelected()){
            txaSerial.setText(serial.concat("c"));
        }else if (jrbtnMaster.isSelected()){
            txaSerial.setText(serial.concat("m"));
        }
        lblSenhadia.setText("Senha: " + f.senhaDiaAtual());        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void menuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoSairActionPerformed
        sair();
    }//GEN-LAST:event_menuArquivoSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*ConfiguracaoController cc = new ConfiguracaoController();        
        try {
            String senhaBanco = cc.validaSenhaGeradorSenhaSpark();
            String senhaDigitada = JOptionPane.showInputDialog("Informe a senha");
            if (senhaBanco.equals(Funcoes.criptMD5(senhaDigitada))){
                txtLogin.setText(System.getProperty("user.name"));
            }else{
                this.dispose();
            }                            
        } catch (Exception e){
            this.dispose();
        }       
        */
        txtLogin.setText(System.getProperty("user.name"));
    }//GEN-LAST:event_formWindowOpened

    private void jrbtnAtualItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbtnAtualItemStateChanged
        if (jrbtnAtual.isSelected()){
            txtLogin.setText(System.getProperty("user.name"));
            txtLogin.setEditable(false);
        }else{
            txtLogin.setText("");
            txtLogin.requestFocus();
            txtLogin.setEditable(true);
        }
    }//GEN-LAST:event_jrbtnAtualItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SobreView s = new SobreView(null, true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void copiar(){
        if(!txaSerial.getText().equals("")){
            try {
                f.copiar(txaSerial.getText());        
                JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Erro ao copiar dados" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(this, "Não existem dados no campo Serial","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void sair(){
        this.dispose();
    }
    
    
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
            java.util.logging.Logger.getLogger(GeradorSerialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeradorSerialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeradorSerialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeradorSerialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GeradorSerialView dialog = new GeradorSerialView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.ButtonGroup grupoParametro;
    private javax.swing.ButtonGroup grupoPeriodo;
    private javax.swing.ButtonGroup grupoVersao;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar jmiMenu;
    private javax.swing.JRadioButton jrbtnAtual;
    private javax.swing.JRadioButton jrbtnCompleta;
    private javax.swing.JRadioButton jrbtnDoze;
    private javax.swing.JRadioButton jrbtnInfinito;
    private javax.swing.JRadioButton jrbtnMaster;
    private javax.swing.JRadioButton jrbtnSeis;
    private javax.swing.JRadioButton jrbtnStarter;
    private javax.swing.JRadioButton jrbtnTerceiro;
    private javax.swing.JRadioButton jrbtnTres;
    private javax.swing.JRadioButton jrbtnUm;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblParametro;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPeriodo1;
    private javax.swing.JLabel lblSenhadia;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuArquivoSair;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea txaSerial;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
