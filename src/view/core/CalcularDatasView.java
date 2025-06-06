package view.core;

import view.core.AjudaView;
import controlador.Funcoes;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * @author Jonathan
 */

public class CalcularDatasView extends javax.swing.JFrame {

    Funcoes f = new Funcoes();
    Date hoje = new Date(System.currentTimeMillis()); 
    
    public CalcularDatasView(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jftInicial = new javax.swing.JFormattedTextField();
        jftFinal = new javax.swing.JFormattedTextField();
        panelDias = new javax.swing.JPanel();
        lblDias = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jmiMenuArquivo = new javax.swing.JMenu();
        jmiCalcular = new javax.swing.JMenuItem();
        jmiLimpar = new javax.swing.JMenuItem();
        jmiAjuda = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculo de datas");
        setResizable(false);

        panelDatas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicial:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Final:");

        try {
            jftInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftInicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            jftFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jftFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelDatasLayout = new javax.swing.GroupLayout(panelDatas);
        panelDatas.setLayout(panelDatasLayout);
        panelDatasLayout.setHorizontalGroup(
            panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelDatasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)))
                .addGroup(panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftInicial)
                    .addComponent(jftFinal))
                .addContainerGap())
        );
        panelDatasLayout.setVerticalGroup(
            panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jftInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jftFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDias.setBackground(new java.awt.Color(255, 255, 255));
        panelDias.setForeground(new java.awt.Color(255, 255, 255));

        lblDias.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblDias.setForeground(new java.awt.Color(0, 51, 204));
        lblDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDias.setText("0 Dias");
        lblDias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDiasLayout = new javax.swing.GroupLayout(panelDias);
        panelDias.setLayout(panelDiasLayout);
        panelDiasLayout.setHorizontalGroup(
            panelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDiasLayout.setVerticalGroup(
            panelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpar_32.png"))); // NOI18N
        btnLimpar.setToolTipText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calcular_32.png"))); // NOI18N
        btnCalcular.setToolTipText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jmiMenuArquivo.setText("Arquivo");

        jmiCalcular.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiCalcular.setText("Calcular");
        jmiCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCalcularActionPerformed(evt);
            }
        });
        jmiMenuArquivo.add(jmiCalcular);

        jmiLimpar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiLimpar.setText("Limpar");
        jmiLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLimparActionPerformed(evt);
            }
        });
        jmiMenuArquivo.add(jmiLimpar);

        jmiAjuda.setText("Ajuda");
        jmiAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjudaActionPerformed(evt);
            }
        });
        jmiMenuArquivo.add(jmiAjuda);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmiMenuArquivo.add(jmiSair);

        menuPrincipal.add(jmiMenuArquivo);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        f.limpar(panelDatas);
        lblDias.setText("0 Dias");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jmiCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCalcularActionPerformed
        calcular();
    }//GEN-LAST:event_jmiCalcularActionPerformed

    private void jmiLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLimparActionPerformed
        f.limpar(panelDatas);
        lblDias.setText("0 Dias");
    }//GEN-LAST:event_jmiLimparActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(null, rootPaneCheckingEnabled, f.textoAjuda("DATA"));
    }//GEN-LAST:event_jmiAjudaActionPerformed

    private void calcular(){
        try {
            String d1 = f.inverterData(jftInicial.getText());
            String d2 = f.inverterData(jftFinal.getText()); 
            lblDias.setText(f.diferencaData(d1,d2).replace("-","") + " dias");        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Insira datas válidas!","Informativo",JOptionPane.WARNING_MESSAGE);
            System.out.println("Erro nas datas: " + e.getMessage());
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JFormattedTextField jftFinal;
    private javax.swing.JFormattedTextField jftInicial;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JMenuItem jmiCalcular;
    private javax.swing.JMenuItem jmiLimpar;
    private javax.swing.JMenu jmiMenuArquivo;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JLabel lblDias;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JPanel panelDatas;
    private javax.swing.JPanel panelDias;
    // End of variables declaration//GEN-END:variables
}