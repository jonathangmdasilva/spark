package view.core;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;

/**
 * @author Jonathan
 */
public class SerialView extends javax.swing.JDialog {   
    
    ConfiguracaoController cc = new ConfiguracaoController();
    ConfiguracaoModel config = new ConfiguracaoModel();
    Funcoes f = new Funcoes();
    
    
    public SerialView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregadorconfig();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblSerial = new javax.swing.JLabel();
        lblAtualizacao = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        txtAtualizacao = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serial");
        setMinimumSize(new java.awt.Dimension(520, 360));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 510, 360));

        lblSerial.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblSerial.setForeground(new java.awt.Color(255, 255, 255));
        lblSerial.setText("Serial");
        getContentPane().add(lblSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        lblAtualizacao.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblAtualizacao.setText("Atualização");
        getContentPane().add(lblAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        txtSerial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSerial.setEnabled(false);
        getContentPane().add(txtSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 340, -1));

        txtAtualizacao.setEditable(false);
        txtAtualizacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAtualizacao.setEnabled(false);
        getContentPane().add(txtAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 340, -1));

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Atualizar_32.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 500, 40));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 500, 40));

        btnHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ok_24.png"))); // NOI18N
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnHabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 50, 50));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sobre.jpeg"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregadorconfig(){
        try {
            this.config = cc.validarConfig();           
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConfiguracaoController cc = new ConfiguracaoController();        
        try {
            String senhaBanco = cc.validaSenhaGeradorSenhaSpark();
            String senhaDigitada = JOptionPane.showInputDialog("Informe a senha");
            if (senhaBanco.equals(Funcoes.criptMD5(senhaDigitada))){
                GeradorSerialView gsv = new GeradorSerialView(null, true);                                
            }else{
                JOptionPane.showMessageDialog(this, "Senha inválida! Tente novamente","Aviso",JOptionPane.WARNING_MESSAGE);
                this.dispose();
            }                            
        } catch (Exception e){
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
        String serialAntigo = "";
        try {
            serialAntigo = cc.serialConfig();
            if(txtSerial.isEnabled()){
                txtSerial.setEnabled(false);
                btnAtualizar.setEnabled(false);
                txtSerial.setText(serialAntigo);
            }else{
                txtSerial.setEnabled(true);
                txtSerial.setText("");
                txtSerial.grabFocus();
                btnAtualizar.setEnabled(true);
            }            
        } catch (Exception e) {
            txtSerial.setText(serialAntigo);
            JOptionPane.showMessageDialog(this, "Erro ao habilitar campos " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }            
    }//GEN-LAST:event_btnHabilitarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            String teste = "ola"; 
            String serial = "";
            Integer senhaDia = Integer.parseInt(JOptionPane.showInputDialog(this,"Informe a senha"));
            if (senhaDia == f.senhaDiaAtual()){
                serial = txtSerial.getText();                
                if (cc.validarSerial(Funcoes.criptMD5(cc.consultarLoginUsuario()), txtSerial.getText())){                    
                    if(cc.atualizarSerialConfig(serial)){
                        JOptionPane.showMessageDialog(this, "Atualização realizada com sucesso! Necessário reiniciar o sistema para atualizar","Aviso",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }else{                    
                    JOptionPane.showMessageDialog(this, "Serial Invalido","Aviso",JOptionPane.WARNING_MESSAGE);
                    
                }
            }else{
                JOptionPane.showMessageDialog(this, "Senha do dia invalida!!","Aviso",JOptionPane.WARNING_MESSAGE);
            }
            txtSerial.setText(cc.serialConfig());
            txtSerial.setEnabled(false);
            btnAtualizar.setEnabled(false);
            btnHabilitar.grabFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o serial!: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);            
        }        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try{
            txtAtualizacao.setText(cc.validadeDataAtualizacaoSerial());
            txtSerial.setText(cc.serialConfig());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAtualizacao;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JTextField txtAtualizacao;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables
}