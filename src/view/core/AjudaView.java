package view.core;

/*
 * @author Jonathan
 */

public class AjudaView extends javax.swing.JDialog {

    public AjudaView(java.awt.Frame parent, boolean modal,String ajuda) {
        super(parent, modal);
        initComponents();
        iniciarAjuda(ajuda);        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAjuda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAjuda = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        panelAjuda.setBackground(new java.awt.Color(0, 102, 204));

        txaAjuda.setEditable(false);
        txaAjuda.setColumns(20);
        txaAjuda.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txaAjuda.setRows(5);
        jScrollPane1.setViewportView(txaAjuda);

        javax.swing.GroupLayout panelAjudaLayout = new javax.swing.GroupLayout(panelAjuda);
        panelAjuda.setLayout(panelAjudaLayout);
        panelAjudaLayout.setHorizontalGroup(
            panelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAjudaLayout.setVerticalGroup(
            panelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus
    
    private void iniciarAjuda(String texto){
        txaAjuda.setText(texto);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAjuda;
    private javax.swing.JTextArea txaAjuda;
    // End of variables declaration//GEN-END:variables
}
