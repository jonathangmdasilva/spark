package view.core;

import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;
import view.format.SelecaoFormatView;
import view.suporte.GerenciadorFTPView;
import view.suporte.GerenciadorConexaoBdView;

/*
 * @author Jonathan
 */

public class TelaPiloto extends javax.swing.JFrame {

    ConfiguracaoModel c;
    
    public TelaPiloto(ConfiguracaoModel cm) {
        initComponents();
        this.c = cm;
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPiloto = new javax.swing.JDesktopPane();
        panelBotoes = new javax.swing.JPanel();
        btnFormatadores = new javax.swing.JButton();
        btnSync = new javax.swing.JButton();
        btnDataBase = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnMonitoramentoNotas = new javax.swing.JButton();
        lblSpark = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Piloto");
        setMinimumSize(new java.awt.Dimension(650, 400));
        setPreferredSize(new java.awt.Dimension(688, 410));

        panelPiloto.setPreferredSize(new java.awt.Dimension(590, 400));

        btnFormatadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juntar_32.png"))); // NOI18N
        btnFormatadores.setText("Format");
        btnFormatadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormatadoresActionPerformed(evt);
            }
        });

        btnSync.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sync_32.png"))); // NOI18N
        btnSync.setText("Sync");
        btnSync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSyncActionPerformed(evt);
            }
        });

        btnDataBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DataBase_32.png"))); // NOI18N
        btnDataBase.setText("Data Base");
        btnDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBaseActionPerformed(evt);
            }
        });

        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ftp_32.png"))); // NOI18N
        btnSobre.setText("Ftp");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnMonitoramentoNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Invoice_32.png"))); // NOI18N
        btnMonitoramentoNotas.setText("Monit");
        btnMonitoramentoNotas.setToolTipText("Monitoramento de notas paradas Messer");
        btnMonitoramentoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitoramentoNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonitoramentoNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFormatadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSync, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataBase, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFormatadores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSync, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMonitoramentoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblSpark.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N

        panelPiloto.setLayer(panelBotoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPiloto.setLayer(lblSpark, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelPilotoLayout = new javax.swing.GroupLayout(panelPiloto);
        panelPiloto.setLayout(panelPilotoLayout);
        panelPilotoLayout.setHorizontalGroup(
            panelPilotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSpark, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPilotoLayout.setVerticalGroup(
            panelPilotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPilotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSpark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPiloto, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPiloto, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBaseActionPerformed
        GerenciadorConexaoBdView gc = new GerenciadorConexaoBdView();
    }//GEN-LAST:event_btnDataBaseActionPerformed

    private void btnSyncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSyncActionPerformed
        
    }//GEN-LAST:event_btnSyncActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        GerenciadorFTPView gFtp = new GerenciadorFTPView();
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnFormatadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormatadoresActionPerformed
        SelecaoFormatView sf = new SelecaoFormatView();
    }//GEN-LAST:event_btnFormatadoresActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnMonitoramentoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitoramentoNotasActionPerformed

    }//GEN-LAST:event_btnMonitoramentoNotasActionPerformed

    private static void sair(){
        int op = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair? ","Confirmação",JOptionPane.YES_NO_OPTION);        
        if(op == 0)System.exit(0);        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataBase;
    private javax.swing.JButton btnFormatadores;
    private javax.swing.JButton btnMonitoramentoNotas;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnSync;
    private javax.swing.JLabel lblSpark;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JDesktopPane panelPiloto;
    // End of variables declaration//GEN-END:variables
}
