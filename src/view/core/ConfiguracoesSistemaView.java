package view.core;

import controlador.ConfiguracaoController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;

/*
 * @author Jonathan Gomes da Silva
 */

public class ConfiguracoesSistemaView extends javax.swing.JDialog {
    
    ConfiguracaoModel confModel = new ConfiguracaoModel();
    ConfiguracaoController cc = new ConfiguracaoController();
    
    public ConfiguracoesSistemaView(ConfiguracaoModel co) {        
        initComponents();        
        this.confModel = co;
        carregarDados();
        setLocationRelativeTo(null);
        if(co.getProcesso() ==0){
            jrbtnCompleto.setVisible(false);
            lblVersao.setText("Spark License Version - Standard");
        }else{
            lblVersao.setText("Spark License Version - Complete");
        }                
        setVisible(true);
    }

    private ConfiguracoesSistemaView(JFrame jFrame, boolean b) {
        jFrame.setVisible(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotao = new javax.swing.ButtonGroup();
        grupoConsultaMesser = new javax.swing.ButtonGroup();
        grupoTempoMonit = new javax.swing.ButtonGroup();
        panelModoTela = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbtnCompacto = new javax.swing.JRadioButton();
        jrbtnCompleto = new javax.swing.JRadioButton();
        lblVersao = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panelTema = new javax.swing.JPanel();
        lblTema = new javax.swing.JLabel();
        controleTema = new javax.swing.JSlider();
        btnSerial = new javax.swing.JButton();
        panelMonitoramento = new javax.swing.JPanel();
        lblConsulta = new javax.swing.JLabel();
        jrbtnAutomatico = new javax.swing.JRadioButton();
        jrbtnManual = new javax.swing.JRadioButton();
        lblTempo = new javax.swing.JLabel();
        txtTempo = new javax.swing.JTextField();
        jrbtnMinutos = new javax.swing.JRadioButton();
        jrbtnSegundos = new javax.swing.JRadioButton();
        menuConfigSistema = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações");
        setResizable(false);

        panelModoTela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo Spark", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Modo");

        grupoBotao.add(jrbtnCompacto);
        jrbtnCompacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCompacto.setText("Compacto");

        grupoBotao.add(jrbtnCompleto);
        jrbtnCompleto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnCompleto.setText("Completo");

        lblVersao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVersao.setText("Versão: Básica");

        javax.swing.GroupLayout panelModoTelaLayout = new javax.swing.GroupLayout(panelModoTela);
        panelModoTela.setLayout(panelModoTelaLayout);
        panelModoTelaLayout.setHorizontalGroup(
            panelModoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModoTelaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnCompacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbtnCompleto))
                    .addComponent(lblVersao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelModoTelaLayout.setVerticalGroup(
            panelModoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoTelaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelModoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrbtnCompacto)
                    .addComponent(jrbtnCompleto))
                .addGap(18, 18, 18)
                .addComponent(lblVersao)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnSair.setText("Cancelar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Aceitar.png"))); // NOI18N
        btnSalvar.setText("Confirmar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        panelTema.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblTema.setBackground(new java.awt.Color(255, 255, 255));
        lblTema.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTema.setText("Tema:   Nimbus");

        controleTema.setBackground(new java.awt.Color(255, 255, 255));
        controleTema.setMaximum(5);
        controleTema.setValue(0);
        controleTema.setOpaque(false);
        controleTema.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                controleTemaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelTemaLayout = new javax.swing.GroupLayout(panelTema);
        panelTema.setLayout(panelTemaLayout);
        panelTemaLayout.setHorizontalGroup(
            panelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTemaLayout.setVerticalGroup(
            panelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTema, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controleTema, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnSerial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Serial_32.png"))); // NOI18N
        btnSerial.setText("Serial");
        btnSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialActionPerformed(evt);
            }
        });

        panelMonitoramento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monitoramento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblConsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConsulta.setText("Consulta");

        grupoConsultaMesser.add(jrbtnAutomatico);
        jrbtnAutomatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnAutomatico.setText("Automático");
        jrbtnAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAutomaticoActionPerformed(evt);
            }
        });

        grupoConsultaMesser.add(jrbtnManual);
        jrbtnManual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnManual.setText("Manual");
        jrbtnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnManualActionPerformed(evt);
            }
        });

        lblTempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTempo.setText("Refresh:");

        grupoTempoMonit.add(jrbtnMinutos);
        jrbtnMinutos.setText("Minutos");

        grupoTempoMonit.add(jrbtnSegundos);
        jrbtnSegundos.setText("Segundos");

        javax.swing.GroupLayout panelMonitoramentoLayout = new javax.swing.GroupLayout(panelMonitoramento);
        panelMonitoramento.setLayout(panelMonitoramentoLayout);
        panelMonitoramentoLayout.setHorizontalGroup(
            panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMonitoramentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsulta)
                    .addComponent(lblTempo))
                .addGap(18, 18, 18)
                .addGroup(panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbtnAutomatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtnManual)
                    .addGroup(panelMonitoramentoLayout.createSequentialGroup()
                        .addComponent(jrbtnSegundos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtnMinutos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMonitoramentoLayout.setVerticalGroup(
            panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMonitoramentoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsulta)
                    .addComponent(jrbtnAutomatico)
                    .addComponent(jrbtnManual))
                .addGap(18, 18, 18)
                .addGroup(panelMonitoramentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempo)
                    .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbtnMinutos)
                    .addComponent(jrbtnSegundos))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setVisible(false);

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuConfigSistema.add(jMenu1);

        jMenu2.setText("Ajuda");
        menuConfigSistema.add(jMenu2);

        setJMenuBar(menuConfigSistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelModoTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMonitoramento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelModoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMonitoramento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private int salvar(){
        try {
            String conv = txtTempo.getText().replace(" Min", "");
            conv = conv.replace(" Seg", "");
            System.out.println("Convertido: " + conv);
            if(jrbtnCompacto.isSelected()){
                confModel.setModoTela(0);            
            }else{
                confModel.setModoTela(1);
            }
            String tema = lblTema.getText().replace("Tema:   ", "");
            confModel.setTema(tema.replace(" ", ""));
            cc.atualizarConfig(confModel);
            if(jrbtnAutomatico.isSelected()){                
                cc.atualizarMonit(1, converterTempoMonit(Integer.parseInt(conv)));
            }else if(jrbtnManual.isSelected()){
                cc.atualizarMonit(0, conv);
            }            
            return 1;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;            
        }        
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (salvar() == 1) {
            JOptionPane.showMessageDialog(this, "Alteração realizada com sucesso! O sistema será encerrado.\nPor favor inicie novamente, para que as mudanças sejam aplicadas","Aviso",JOptionPane.INFORMATION_MESSAGE);            
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao realizar alteração","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
        confModel.setTema(tema.replace(" ", ""));
    }//GEN-LAST:event_controleTemaStateChanged

    private void btnSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialActionPerformed
        
        if(cc.validarSerialSenha(JOptionPane.showInputDialog ("Informe a senha"))){
            this.dispose();
            GeradorSerialView gd = new GeradorSerialView(null,true);
        }else{
            JOptionPane.showMessageDialog(this, "Senha Incorreta","Aviso",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_btnSerialActionPerformed

    private void jrbtnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnManualActionPerformed
        if(jrbtnManual.isSelected()){
            txtTempo.setEditable(false);
        }
    }//GEN-LAST:event_jrbtnManualActionPerformed

    private void jrbtnAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAutomaticoActionPerformed
        if(jrbtnAutomatico.isSelected()){
            txtTempo.setEditable(true);
        }
    }//GEN-LAST:event_jrbtnAutomaticoActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracoesSistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesSistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesSistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesSistemaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ConfiguracoesSistemaView dialog = new ConfiguracoesSistemaView(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    
    private void carregarDados(){
        if(confModel.getModoTela() == 0){
            jrbtnCompacto.setSelected(true);
        }else{
            jrbtnCompleto.setSelected(true);
        }
        switch (confModel.getTema()) {
            case "Nimbus":
                controleTema.setValue(0);
                lblTema.setText("Tema:   Nimbus");
                break;
            case "Metal":
                controleTema.setValue(1);
                lblTema.setText("Tema:   Metal");
                break;
            case "FlatLight":
                controleTema.setValue(2);
                lblTema.setText("Tema:   Flat Light");
                break;
            case "FlatDark":
                controleTema.setValue(3);
                lblTema.setText("Tema:   Flat Dark");
                break;
            case "FlatIntelliJ":
                controleTema.setValue(4);
                lblTema.setText("Tema:   Flat IntelliJ");
                break;
            case "FlatDarcula":
                controleTema.setValue(5);
                lblTema.setText("Tema:   Flat Darcula");
                break;
            default:
                break;
        }        
        if(cc.verificarMonitoramentoAutomaticoMesser() == 1){
            jrbtnAutomatico.setSelected(true);
            txtTempo.setEditable(true);
        }else{
            jrbtnManual.setSelected(true);
            txtTempo.setEditable(false);
        }
        if(cc.verificarMonitoramentoAutomaticoMesserTempo()> 59999){
            jrbtnMinutos.setSelected(true);
            txtTempo.setText((cc.verificarMonitoramentoAutomaticoMesserTempo()/60000) + " Min");
        }else{
            jrbtnSegundos.setSelected(true);
            txtTempo.setText((cc.verificarMonitoramentoAutomaticoMesserTempo()/1000) + " Seg");
        }
        //txtTempo.setText(cc.verificarMonitoramentoAutomaticoMesserTempo().toString());
        
    }
    
    private String converterTempoMonit(Integer tempo){        
        Integer calc = 0;
        if(jrbtnSegundos.isSelected()){
            calc = tempo * 1000;
        }else if(jrbtnMinutos.isSelected()){
            calc = tempo * 60000; // MINUTO EM MILISEGUNDOS
        }
        return calc.toString();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSerial;
    private javax.swing.JSlider controleTema;
    private javax.swing.ButtonGroup grupoBotao;
    private javax.swing.ButtonGroup grupoConsultaMesser;
    private javax.swing.ButtonGroup grupoTempoMonit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jrbtnAutomatico;
    private javax.swing.JRadioButton jrbtnCompacto;
    private javax.swing.JRadioButton jrbtnCompleto;
    private javax.swing.JRadioButton jrbtnManual;
    private javax.swing.JRadioButton jrbtnMinutos;
    private javax.swing.JRadioButton jrbtnSegundos;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JMenuBar menuConfigSistema;
    private javax.swing.JPanel panelModoTela;
    private javax.swing.JPanel panelMonitoramento;
    private javax.swing.JPanel panelTema;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
}
