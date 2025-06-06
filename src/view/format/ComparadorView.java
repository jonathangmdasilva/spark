package view.format;

import controlador.Funcoes;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import view.core.AjudaView;

public class ComparadorView extends javax.swing.JFrame {

    Funcoes f = new Funcoes();
    
    public ComparadorView() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoComparador = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jrbtnListaDois = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaListaDois = new javax.swing.JTextArea();
        lblQtdListaDois = new javax.swing.JLabel();
        panelUm = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaListaUm = new javax.swing.JTextArea();
        lblQtdListaUm = new javax.swing.JLabel();
        jrbtnListaUm = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnConcatenar = new javax.swing.JButton();
        panelDiferencas = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaDiferencas = new javax.swing.JTextArea();
        lblDiferenca = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jmiDiferenciar = new javax.swing.JMenuItem();
        jmiCopiar = new javax.swing.JMenuItem();
        jmiLimpar = new javax.swing.JMenuItem();
        jmiAjuda = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comparador");

        panelPrincipal.setBackground(new java.awt.Color(102, 102, 255));

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        grupoComparador.add(jrbtnListaDois);
        jrbtnListaDois.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnListaDois.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnListaDois.setText("Possui");
        jrbtnListaDois.setContentAreaFilled(false);

        txaListaDois.setColumns(20);
        txaListaDois.setRows(5);
        jScrollPane2.setViewportView(txaListaDois);

        lblQtdListaDois.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtdListaDois.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdListaDois.setText("Qtd: 0 registros");

        jDesktopPane1.setLayer(jrbtnListaDois, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblQtdListaDois, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQtdListaDois)
                            .addComponent(jrbtnListaDois))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jrbtnListaDois)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQtdListaDois))
        );

        panelUm.setBackground(new java.awt.Color(102, 102, 255));
        panelUm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelUm.setForeground(new java.awt.Color(255, 255, 255));

        txaListaUm.setColumns(20);
        txaListaUm.setRows(5);
        jScrollPane1.setViewportView(txaListaUm);

        lblQtdListaUm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtdListaUm.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdListaUm.setText("Qtd: 0 registros");

        grupoComparador.add(jrbtnListaUm);
        jrbtnListaUm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtnListaUm.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnListaUm.setSelected(true);
        jrbtnListaUm.setText("Possui");
        jrbtnListaUm.setContentAreaFilled(false);

        panelUm.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelUm.setLayer(lblQtdListaUm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelUm.setLayer(jrbtnListaUm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelUmLayout = new javax.swing.GroupLayout(panelUm);
        panelUm.setLayout(panelUmLayout);
        panelUmLayout.setHorizontalGroup(
            panelUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(panelUmLayout.createSequentialGroup()
                        .addGroup(panelUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbtnListaUm)
                            .addComponent(lblQtdListaUm))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelUmLayout.setVerticalGroup(
            panelUmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUmLayout.createSequentialGroup()
                .addComponent(jrbtnListaUm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(lblQtdListaUm))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar (Esc)");
        btnCancelar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnCancelar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpar_32.png"))); // NOI18N
        btnLimpar.setToolTipText("Limpar (F3)");
        btnLimpar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnLimpar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copiar_32.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar (F2)");
        btnCopiar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnCopiar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnConcatenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Diferenca_32.png"))); // NOI18N
        btnConcatenar.setToolTipText("Diferenciar (F1)");
        btnConcatenar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcatenarActionPerformed(evt);
            }
        });

        panelDiferencas.setBackground(new java.awt.Color(102, 102, 255));
        panelDiferencas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diferenças", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelDiferencas.setForeground(new java.awt.Color(255, 255, 255));

        txaDiferencas.setEditable(false);
        txaDiferencas.setColumns(20);
        txaDiferencas.setRows(5);
        jScrollPane3.setViewportView(txaDiferencas);

        lblDiferenca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDiferenca.setForeground(new java.awt.Color(255, 255, 255));
        lblDiferenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiferenca.setText("Qtd: 0 registros");
        lblDiferenca.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panelDiferencas.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDiferencas.setLayer(lblDiferenca, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelDiferencasLayout = new javax.swing.GroupLayout(panelDiferencas);
        panelDiferencas.setLayout(panelDiferencasLayout);
        panelDiferencasLayout.setHorizontalGroup(
            panelDiferencasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(lblDiferenca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDiferencasLayout.setVerticalGroup(
            panelDiferencasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiferencasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiferenca))
        );

        panelPrincipal.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPrincipal.setLayer(panelUm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPrincipal.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPrincipal.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPrincipal.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPrincipal.setLayer(btnConcatenar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelPrincipal.setLayer(panelDiferencas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDiferencas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelUm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUm)
                    .addComponent(jDesktopPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDiferencas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        menuArquivo.setText("Arquivo");

        jmiDiferenciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiDiferenciar.setText("Diferenciar");
        jmiDiferenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDiferenciarActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiDiferenciar);

        jmiCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiCopiar.setText("Copiar");
        jmiCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCopiarActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiCopiar);

        jmiLimpar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiLimpar.setText("Limpar");
        jmiLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLimparActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiLimpar);

        jmiAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAjuda.setText("Ajuda");
        jmiAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjudaActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiAjuda);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiSair);

        menu.add(menuArquivo);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDiferenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDiferenciarActionPerformed
        diferenca();
    }//GEN-LAST:event_jmiDiferenciarActionPerformed

    private void jmiCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_jmiCopiarActionPerformed

    private void jmiLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jmiLimparActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcatenarActionPerformed
        diferenca();
    }//GEN-LAST:event_btnConcatenarActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("DIFERENCA"));
    }//GEN-LAST:event_jmiAjudaActionPerformed

    private void limpar (){
        lblQtdListaUm.setText("Qtd: 0 registros");
        lblQtdListaDois.setText("Qtd: 0 registros");
        txaListaUm.setText("");
        txaListaDois.setText("");
        txaDiferencas.setText("");
    }    
    
    private void copiar(){
        if(!txaDiferencas.getText().equals("")){
            try {
                f.copiar(txaDiferencas.getText());        
                JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Erro ao copiar dados" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(this, "Não existem dados no campo Diferença!","Atenção",JOptionPane.WARNING_MESSAGE);
        }                
    }
    
    private void diferenca(){  
        txaDiferencas.setText("");
        try {
            if(!txaListaUm.getText().equals("") || txaListaDois.getText().equals("") ){                                                
                List <String> listaUm = null;
                List <String> listaDois = null;
                listaUm = f.gerarListaPesquisa(txaListaUm.getText());
                lblQtdListaUm.setText("Qtd: " + listaUm.size() + " registros");
                listaDois = f.gerarListaPesquisa(txaListaDois.getText());
                lblQtdListaDois.setText("Qtd: " + listaDois.size() + " registros");
                listaUm = f.removerDuplicidade(listaUm);
                listaDois = f.removerDuplicidade(listaDois); 
                if(jrbtnListaUm.isSelected()){                    
                    f.diferenca(listaUm,listaDois).forEach((fre) -> {
                        txaDiferencas.append(fre + "\n");
                    });
                }else{                    
                    f.diferenca(listaDois,listaUm).forEach((fre) -> {
                        txaDiferencas.append(fre + "\n");                        
                    });
                }
                lblDiferenca.setText("Qtd: " + f.gerarListaPesquisa(txaDiferencas.getText()).size()+ " registros");
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
        
        
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
            java.util.logging.Logger.getLogger(ComparadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComparadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComparadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComparadorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComparadorView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcatenar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup grupoComparador;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JMenuItem jmiCopiar;
    private javax.swing.JMenuItem jmiDiferenciar;
    private javax.swing.JMenuItem jmiLimpar;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JRadioButton jrbtnListaDois;
    private javax.swing.JRadioButton jrbtnListaUm;
    private javax.swing.JLabel lblDiferenca;
    private javax.swing.JLabel lblQtdListaDois;
    private javax.swing.JLabel lblQtdListaUm;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JDesktopPane panelDiferencas;
    private javax.swing.JDesktopPane panelPrincipal;
    private javax.swing.JDesktopPane panelUm;
    private javax.swing.JTextArea txaDiferencas;
    private javax.swing.JTextArea txaListaDois;
    private javax.swing.JTextArea txaListaUm;
    // End of variables declaration//GEN-END:variables
}
