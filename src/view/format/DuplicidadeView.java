package view.format;

import controlador.Funcoes;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import view.core.AjudaView;

/*
 * @author Jonathan
 */

public class DuplicidadeView extends javax.swing.JFrame {
    Funcoes f = new Funcoes();
    Integer valorMin = 1;
    int cont = 0;
    
    
    public DuplicidadeView(java.awt.Frame parent, boolean modal) {
        initComponents(); 
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnConcatenar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaFrequencia = new javax.swing.JTextArea();
        txtValorMinimo = new javax.swing.JTextField();
        chkHabMin = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSaida = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jmiPreparar = new javax.swing.JMenuItem();
        jmiCopiar = new javax.swing.JMenuItem();
        jmiLimpar = new javax.swing.JMenuItem();
        jmiAjuda = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Duplicidade");
        setMinimumSize(new java.awt.Dimension(700, 530));

        panelEntrada.setBackground(new java.awt.Color(153, 204, 255));
        panelEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelEntrada.setForeground(new java.awt.Color(255, 255, 255));

        txaEntrada.setColumns(20);
        txaEntrada.setRows(5);
        jScrollPane1.setViewportView(txaEntrada);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("0 registros");
        lblTotal.setToolTipText("Lista de Entrada");

        panelEntrada.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEntrada.setLayer(lblTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addComponent(lblTotal))
            .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEntradaLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 24, Short.MAX_VALUE)))
        );

        jDesktopPane1.setBackground(new java.awt.Color(153, 204, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saída", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

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

        btnConcatenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pesquisax32.png"))); // NOI18N
        btnConcatenar.setToolTipText("Preparar (F1)");
        btnConcatenar.setMaximumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setMinimumSize(new java.awt.Dimension(70, 59));
        btnConcatenar.setPreferredSize(new java.awt.Dimension(70, 59));
        btnConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcatenarActionPerformed(evt);
            }
        });

        txaFrequencia.setEditable(false);
        txaFrequencia.setColumns(20);
        txaFrequencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txaFrequencia.setRows(5);
        jScrollPane3.setViewportView(txaFrequencia);

        txtValorMinimo.setEditable(false);
        txtValorMinimo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorMinimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorMinimo.setText("1");
        txtValorMinimo.setEnabled(false);
        txtValorMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorMinimoKeyPressed(evt);
            }
        });

        chkHabMin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkHabMin.setForeground(new java.awt.Color(255, 255, 255));
        chkHabMin.setText("Habilitar Filtro (valor minimo)");
        chkHabMin.setContentAreaFilled(false);
        chkHabMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHabMinActionPerformed(evt);
            }
        });

        txaSaida.setEditable(false);
        txaSaida.setColumns(20);
        txaSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txaSaida.setRows(5);
        txaSaida.setToolTipText("Sem duplicidade");
        jScrollPane2.setViewportView(txaSaida);

        jDesktopPane1.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnConcatenar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtValorMinimo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(chkHabMin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkHabMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHabMin)))
        );

        menuArquivo.setText("Arquivo");

        jmiPreparar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiPreparar.setText("Preparar");
        jmiPreparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrepararActionPerformed(evt);
            }
        });
        menuArquivo.add(jmiPreparar);

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
            .addComponent(panelEntrada)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcatenarActionPerformed
        procurar();
    }//GEN-LAST:event_btnConcatenarActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiPrepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrepararActionPerformed
       procurar();
    }//GEN-LAST:event_jmiPrepararActionPerformed

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

    private void chkHabMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHabMinActionPerformed
        if (chkHabMin.isSelected()){
            txtValorMinimo.setEnabled(true);
            txtValorMinimo.setEditable(true);
        }else{
            txtValorMinimo.setEnabled(false);
            txtValorMinimo.setEditable(false);
        }
    }//GEN-LAST:event_chkHabMinActionPerformed

    private void txtValorMinimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorMinimoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){                 
            try {
                procurar();
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }        
    }//GEN-LAST:event_txtValorMinimoKeyPressed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("DOUBLE"));        
    }//GEN-LAST:event_jmiAjudaActionPerformed
   
    private void limpar(){        
        txaEntrada.setText("");
        txaSaida.setText("");
        txaFrequencia.setText("");
        lblTotal.setText("0 registros no total");
    }
 
    private void procurar(){        
        try {
            txaSaida.setText("");
            txaFrequencia.setText("");
            lblTotal.setText("0 registros no total");
            if(!txaEntrada.getText().equals("")){            

                //ORDENAR A LISTA
                List listaOrdenada = f.ordernarLista(f.gerarListaPesquisa(txaEntrada.getText()));            
                if(listaOrdenada.size()==1){
                    lblTotal.setText(listaOrdenada.size() + " registro no total");
                }else{
                    lblTotal.setText(listaOrdenada.size() + " registros no total");
                }
                //DUPLICIDADE
                List semDuplicidade;
                semDuplicidade = f.removerDuplicidade(listaOrdenada);

                if(semDuplicidade.size()==1){                
                    txaSaida.setToolTipText(semDuplicidade.size() + " registro");
                }else{                
                    txaSaida.setToolTipText(semDuplicidade.size() + " registros");
                }            
                f.removerDuplicidade(f.gerarListaPesquisa(txaEntrada.getText())).forEach((dados) -> {
                    txaSaida.append(dados + "\n");
                });                         

                boolean op = true;
                if(chkHabMin.isSelected())op = true;
                if(!chkHabMin.isSelected())op = false;                             
                valorMin = Integer.parseInt(txtValorMinimo.getText());
                f.frequencia(listaOrdenada,op,valorMin).forEach((fre) -> {
                    txaFrequencia.append(fre + "\n");
                    cont++;
                });
                
                if(cont>1){
                    txaFrequencia.setToolTipText(cont + " duplicados");
                }else{
                    txaFrequencia.setToolTipText(cont + " duplicado");
                }                
                cont =0;
            }else{
                JOptionPane.showMessageDialog(this,"Campo vazio");
            }        
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro: \nInforme números positivos!  (" + e.getMessage()+")","Erro",JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JCheckBox chkHabMin;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JMenuItem jmiCopiar;
    private javax.swing.JMenuItem jmiLimpar;
    private javax.swing.JMenuItem jmiPreparar;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JDesktopPane panelEntrada;
    private javax.swing.JTextArea txaEntrada;
    private javax.swing.JTextArea txaFrequencia;
    private javax.swing.JTextArea txaSaida;
    private javax.swing.JTextField txtValorMinimo;
    // End of variables declaration//GEN-END:variables
}