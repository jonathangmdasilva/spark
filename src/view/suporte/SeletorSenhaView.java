package view.suporte;

import view.suporte.SenhaDiaView;
import controlador.Funcoes;
import javax.swing.JOptionPane;

/*
 * @author Jonathan
 */

public class SeletorSenhaView extends javax.swing.JDialog {

    Funcoes f = new Funcoes();
    
    public SeletorSenhaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnOutro = new javax.swing.JButton();
        btnHoje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opção de Datas");
        setUndecorated(true);
        setResizable(false);

        jDesktopPane1.setToolTipText("");

        btnOutro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOutro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dois_64.png"))); // NOI18N
        btnOutro.setText("(Outra data)");
        btnOutro.setToolTipText(null);
        btnOutro.setBorderPainted(false);
        btnOutro.setFocusPainted(false);
        btnOutro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnOutro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOutro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutroActionPerformed(evt);
            }
        });

        btnHoje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHoje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/um_64.png"))); // NOI18N
        btnHoje.setText("(Data atual)");
        btnHoje.setToolTipText(null);
        btnHoje.setBorderPainted(false);
        btnHoje.setFocusPainted(false);
        btnHoje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHojeActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnOutro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnHoje, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOutro)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutroActionPerformed
        this.dispose();
        SenhaDiaView sd = new SenhaDiaView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnOutroActionPerformed

    private void btnHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHojeActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(null,f.senhaDiaAtual(),"Senha do Dia",JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_btnHojeActionPerformed
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoje;
    private javax.swing.JButton btnOutro;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
