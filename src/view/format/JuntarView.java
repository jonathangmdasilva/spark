package view.format;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.core.ConfiguracaoModel;
import view.core.AjudaView;

/*
 * @author Jonathan
 */

//public class JuntarViewer extends javax.swing.JDialog {
public class JuntarView extends javax.swing.JFrame {
    Funcoes f = new Funcoes();
    
    public JuntarView(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
        carregarConfiguracao();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEntrada = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaEntrada = new javax.swing.JTextArea();
        lblTotal = new javax.swing.JLabel();
        panelSaida = new javax.swing.JDesktopPane();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnConcatenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSaida = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiConcatenar = new javax.swing.JMenuItem();
        jmiCopiar = new javax.swing.JMenuItem();
        jmiLimpar = new javax.swing.JMenuItem();
        jmiAjuda = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juntar");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(633, 458));

        panelEntrada.setBackground(new java.awt.Color(0, 102, 204));
        panelEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelEntrada.setForeground(new java.awt.Color(255, 255, 255));

        txaEntrada.setColumns(20);
        txaEntrada.setRows(5);
        jScrollPane1.setViewportView(txaEntrada);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("0 Registros");

        panelEntrada.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEntrada.setLayer(lblTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal))
        );

        panelSaida.setBackground(new java.awt.Color(0, 102, 204));
        panelSaida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saída", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSaida.setForeground(new java.awt.Color(255, 255, 255));

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

        btnConcatenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juntar_32.png"))); // NOI18N
        btnConcatenar.setToolTipText("Juntar (F1)");
        btnConcatenar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcatenarActionPerformed(evt);
            }
        });

        txaSaida.setEditable(false);
        txaSaida.setColumns(20);
        txaSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txaSaida.setRows(5);
        jScrollPane2.setViewportView(txaSaida);

        panelSaida.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(btnConcatenar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelSaida.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelSaidaLayout = new javax.swing.GroupLayout(panelSaida);
        panelSaida.setLayout(panelSaidaLayout);
        panelSaidaLayout.setHorizontalGroup(
            panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
        panelSaidaLayout.setVerticalGroup(
            panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaidaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        jmiConcatenar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiConcatenar.setText("Concatenar");
        jmiConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConcatenarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiConcatenar);

        jmiCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiCopiar.setText("Copiar");
        jmiCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCopiarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCopiar);

        jmiLimpar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiLimpar.setText("Limpar");
        jmiLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLimparActionPerformed(evt);
            }
        });
        jMenu1.add(jmiLimpar);

        jmiAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAjuda.setText("Ajuda");
        jmiAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjudaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAjuda);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);

        menu.add(jMenu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEntrada)
            .addComponent(panelSaida)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSaida))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcatenarActionPerformed
        juntar();
    }//GEN-LAST:event_btnConcatenarActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConcatenarActionPerformed
       juntar();
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

    private void jmiCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_jmiCopiarActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("JUNTAR"));        
    }//GEN-LAST:event_jmiAjudaActionPerformed
   
    private void limpar(){        
        txaEntrada.setText("");
        txaSaida.setText("");
        lblTotal.setText("0 registros");
    }
 
    private void juntar(){
        if(!txaEntrada.getText().equals("")){
            txaEntrada.setText(f.tratamento(txaEntrada.getText()));            
            txaSaida.setText(f.formatar(txaEntrada.getText()));        
            lblTotal.setText(f.contador() + " registros");
            txaEntrada.setText(f.tratamento(txaEntrada.getText())); 
            f.limparVar();
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
    
    
    private void carregarConfiguracao(){
        ConfiguracaoModel configModel = new ConfiguracaoModel();
        ConfiguracaoController confController = new ConfiguracaoController();
        configModel = confController.validarConfig();        
        if((configModel.getTema().contains("FlatLight")) || (configModel.getTema().contains("Metal")) || (configModel.getTema().contains("FlatIntelliJ"))){                        
            lblTotal.setForeground(Color.white);
            panelEntrada.setBackground(new Color(0,102,204));
            panelSaida.setBackground(new Color(0,102,204));
        }else{                        
            //panelSaidaAntigo.setBackground(Color.white);            
            lblTotal.setForeground(Color.white);
        }
        //this.panelEntradaAntigo.updateUI();
        //this.panelSaidaAntigo.updateUI();
    }
    
    
    class jpanelGradient extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
                       
            //Color cor1 = new Color(52,143,80);
            //Color cor2 = new Color(86,180,211);
            
            Color cor1 = new Color(0,31,85);            
            Color cor2 = new Color(86,180,211);
            
            GradientPaint gp = new GradientPaint(0,0,cor1,180,height,cor2);
            
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcatenar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JMenuItem jmiConcatenar;
    private javax.swing.JMenuItem jmiCopiar;
    private javax.swing.JMenuItem jmiLimpar;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuBar menu;
    private javax.swing.JDesktopPane panelEntrada;
    private javax.swing.JDesktopPane panelSaida;
    private javax.swing.JTextArea txaEntrada;
    private javax.swing.JTextArea txaSaida;
    // End of variables declaration//GEN-END:variables
}