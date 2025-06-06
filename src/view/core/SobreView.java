package view.core;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;

/**
 * @author Jonathan
 */

public class SobreView extends javax.swing.JDialog {
    
    ConfiguracaoController cc = new ConfiguracaoController();
    ConfiguracaoModel config = new ConfiguracaoModel();
    Funcoes f = new Funcoes();
    
    public SobreView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregadorConfig();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogo = new javax.swing.JButton();
        lblInstalacao = new javax.swing.JLabel();
        txaDescricao = new javax.swing.JTextArea();
        btnSerial = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setMinimumSize(new java.awt.Dimension(551, 359));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                F1(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        btnLogo.setToolTipText("Clique aqui para sair");
        btnLogo.setBorderPainted(false);
        btnLogo.setContentAreaFilled(false);
        btnLogo.setFocusPainted(false);
        btnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 380, 360));

        lblInstalacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstalacao.setForeground(new java.awt.Color(255, 255, 255));
        lblInstalacao.setText("Instalado em");
        getContentPane().add(lblInstalacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        txaDescricao.setEditable(false);
        txaDescricao.setColumns(20);
        txaDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txaDescricao.setRows(5);
        txaDescricao.setText("Sistema de apoio ( Spark ), desenvolvido por Jonathan Gomes da Silva\n\nCriado:10/09/2018\nVersão: 6.3           Data: 27/04/2024                Hora: 14:20:15\nCopyright 2018\nE-mail: jonathangmdasilva@gmail.com");
        getContentPane().add(txaDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 580, 110));

        btnSerial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Serial_32.png"))); // NOI18N
        btnSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialActionPerformed(evt);
            }
        });
        getContentPane().add(btnSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 40, 40));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sobre.jpeg"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoActionPerformed
        dispose();
    }//GEN-LAST:event_btnLogoActionPerformed

    private void F1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F1
        if (evt.getKeyCode() == KeyEvent.VK_F1){
            JOptionPane.showMessageDialog(this, "Passou");
        }
    }//GEN-LAST:event_F1

    private void btnSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialActionPerformed
        this.dispose();
        SerialView updateSerial = new SerialView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnSerialActionPerformed

    private void carregadorConfig(){
        try {
            this.config = cc.validarConfig();            
            lblInstalacao.setText("Instalado em " + config.getDataCadastro());
            //txtInstalacao.setText();
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogo;
    private javax.swing.JButton btnSerial;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblInstalacao;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
}