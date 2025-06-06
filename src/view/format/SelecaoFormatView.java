package view.format;

/*
 * @author jsilva
 */
public class SelecaoFormatView extends javax.swing.JFrame {
 
    public SelecaoFormatView() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSelecao = new javax.swing.JDesktopPane();
        btnJuntar = new javax.swing.JButton();
        btnComparador = new javax.swing.JButton();
        btnDuplicidade = new javax.swing.JButton();
        btnJuntar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnJuntar.setText("Juntar");
        btnJuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuntarActionPerformed(evt);
            }
        });

        btnComparador.setText("Comparador");
        btnComparador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComparadorActionPerformed(evt);
            }
        });

        btnDuplicidade.setText("Duplicidade");
        btnDuplicidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuplicidadeActionPerformed(evt);
            }
        });

        btnJuntar1.setText("Replace");
        btnJuntar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuntar1ActionPerformed(evt);
            }
        });

        panelSelecao.setLayer(btnJuntar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSelecao.setLayer(btnComparador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSelecao.setLayer(btnDuplicidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSelecao.setLayer(btnJuntar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelSelecaoLayout = new javax.swing.GroupLayout(panelSelecao);
        panelSelecao.setLayout(panelSelecaoLayout);
        panelSelecaoLayout.setHorizontalGroup(
            panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnJuntar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComparador, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDuplicidade, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btnJuntar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSelecaoLayout.setVerticalGroup(
            panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDuplicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJuntar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSelecao)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSelecao)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuntarActionPerformed
        this.dispose();
        JuntarView cv = new JuntarView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnJuntarActionPerformed

    private void btnComparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComparadorActionPerformed
        this.dispose();
        ComparadorView comparador = new ComparadorView();
    }//GEN-LAST:event_btnComparadorActionPerformed

    private void btnDuplicidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuplicidadeActionPerformed
        this.dispose();
        DuplicidadeView db = new DuplicidadeView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnDuplicidadeActionPerformed

    private void btnJuntar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuntar1ActionPerformed
        this.dispose();
        ReplaceView replace = new ReplaceView(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnJuntar1ActionPerformed

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
            java.util.logging.Logger.getLogger(SelecaoFormatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecaoFormatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecaoFormatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecaoFormatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecaoFormatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComparador;
    private javax.swing.JButton btnDuplicidade;
    private javax.swing.JButton btnJuntar;
    private javax.swing.JButton btnJuntar1;
    private javax.swing.JDesktopPane panelSelecao;
    // End of variables declaration//GEN-END:variables
}
