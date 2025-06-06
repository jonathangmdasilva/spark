package view.format;

import controlador.Funcoes;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import view.core.AjudaView;

/*
 * @author Jonathan
 */

public class ReplaceView extends javax.swing.JFrame {
    Funcoes f = new Funcoes();
    
    public ReplaceView(java.awt.Frame parent, boolean modal) {        
        initComponents();        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSaida = new javax.swing.JDesktopPane();
        scrollSaida = new javax.swing.JScrollPane();
        txaSaida = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnConcatenar = new javax.swing.JButton();
        panelEntrada = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaEntrada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPor = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jmiConcatenar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiLimpar = new javax.swing.JMenuItem();
        jmiAjuda = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Replace");
        setMinimumSize(new java.awt.Dimension(558, 482));

        panelSaida.setBackground(new java.awt.Color(27, 187, 125));
        panelSaida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saída", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSaida.setForeground(new java.awt.Color(255, 255, 255));

        txaSaida.setEditable(false);
        txaSaida.setColumns(20);
        txaSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txaSaida.setRows(5);
        scrollSaida.setViewportView(txaSaida);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar (Esc)");
        btnCancelar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnCancelar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpar_32.png"))); // NOI18N
        btnLimpar.setToolTipText("Limpar (F3)");
        btnLimpar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnLimpar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnLimpar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copiar_32.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar (F2)");
        btnCopiar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnCopiar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnCopiar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnConcatenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Troca_32.png"))); // NOI18N
        btnConcatenar.setToolTipText("Replace (F1)");
        btnConcatenar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcatenarActionPerformed(evt);
            }
        });

        panelSaida.setLayer(scrollSaida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnConcatenar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelSaidaLayout = new javax.swing.GroupLayout(panelSaida);
        panelSaida.setLayout(panelSaidaLayout);
        panelSaidaLayout.setHorizontalGroup(
            panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaidaLayout.createSequentialGroup()
                .addGap(0, 377, Short.MAX_VALUE)
                .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
        );
        panelSaidaLayout.setVerticalGroup(
            panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaidaLayout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addGroup(panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSaidaLayout.createSequentialGroup()
                    .addComponent(scrollSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addGap(69, 69, 69)))
        );

        panelEntrada.setBackground(new java.awt.Color(27, 187, 125));
        panelEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelEntrada.setForeground(new java.awt.Color(255, 255, 255));

        txaEntrada.setColumns(20);
        txaEntrada.setRows(5);
        jScrollPane1.setViewportView(txaEntrada);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Substituir:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por:");

        panelEntrada.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEntrada.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEntrada.setLayer(txtSub, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEntrada.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEntrada.setLayer(txtPor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPor))
            .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 115, Short.MAX_VALUE))
            .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jScrollPane1)))
        );

        menuArquivo.setText("Arquivo");

        jmiConcatenar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiConcatenar.setText("Replace");
        jmiConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConcatenarActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiConcatenar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Copiar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuArquivo.add(jMenuItem1);

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
            .addComponent(panelSaida)
            .addComponent(panelEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEntrada)
                .addGap(5, 5, 5)
                .addComponent(panelSaida))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcatenarActionPerformed
        replace();
    }//GEN-LAST:event_btnConcatenarActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConcatenarActionPerformed
        replace();
    }//GEN-LAST:event_jmiConcatenarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jmiLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jmiLimparActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        copiar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("REPLACE"));        
    }//GEN-LAST:event_jmiAjudaActionPerformed
   
    private void limpar(){        
        txtPor.setText("");
        txtSub.setText("");
        txaEntrada.setText("");
        txaSaida.setText("");        
    }
 
    private void replace(){        
        if(!txaEntrada.getText().equals("")){
            txaSaida.setText(txaEntrada.getText().replace(txtSub.getText(), txtPor.getText()));            
        }else{
            JOptionPane.showMessageDialog(this,"Campo vazio");
        }                
    }
 
    private void copiar(){
        if(!txaSaida.getText().equals("")){
            try {
                f.copiar(txaSaida.getText());        
                JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Erro ao copiar dados" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(this, "Não existem dados no campo Saída","Atenção",JOptionPane.WARNING_MESSAGE);
        }                
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcatenar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JMenuItem jmiConcatenar;
    private javax.swing.JMenuItem jmiLimpar;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JDesktopPane panelEntrada;
    private javax.swing.JDesktopPane panelSaida;
    private javax.swing.JScrollPane scrollSaida;
    private javax.swing.JTextArea txaEntrada;
    private javax.swing.JTextArea txaSaida;
    private javax.swing.JTextField txtPor;
    private javax.swing.JTextField txtSub;
    // End of variables declaration//GEN-END:variables
}