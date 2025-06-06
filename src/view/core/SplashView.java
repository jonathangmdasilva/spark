package view.core;

import controlador.Tray;
import javax.swing.ImageIcon;
import model.core.ConfiguracaoModel;

/*
 * @author Jonathan Gomes da Silva
 */
public final class SplashView extends javax.swing.JFrame {
    ConfiguracaoModel config = new ConfiguracaoModel();
    
    public SplashView(ConfiguracaoModel cm){        
        initComponents();
        setIcone();
        this.config = cm;        
        setLocationRelativeTo(null);
        if(cm.getProcesso() == 1){
            lblVersao.setText("Spark Complete");
        }else{
            lblVersao.setText("Spark Standard");
        }
        setVisible(true);
        new Temporizador().start();
    }

    private SplashView() {
        initComponents();
    }
    
    public class Temporizador extends Thread{
        @Override
        public void run(){
            while(barraProgresso.getValue()<100){
                try {
                    sleep(45);
                    barraProgresso.setValue(barraProgresso.getValue()+5);
                } catch (InterruptedException ex) {
                    System.out.println("Erro ao carregar barra de progresso" + ex.getMessage());
                }                
            }
            //JOptionPane.showMessageDialog(null, "Carregamento realizado com sucesso.");
            Tray barra = new Tray();
            if (config.getModoTela() == 1) {                
                TelaPrincipalCompleto tp = new TelaPrincipalCompleto(config);
                barra.iniciarMinimizado(tp);
            }else{
                SparkPrincipal sp = new SparkPrincipal(config);
                barra.iniciarMinimizado(sp);
            }
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSplah = new javax.swing.JPanel();
        btnLogo = new javax.swing.JButton();
        lblVersao = new javax.swing.JLabel();
        barraProgresso = new javax.swing.JProgressBar();
        panelSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setOpacity(0.85F);
        setResizable(false);

        panelSplah.setBackground(new java.awt.Color(255, 255, 255));

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        btnLogo.setBorder(null);
        btnLogo.setBorderPainted(false);
        btnLogo.setContentAreaFilled(false);
        btnLogo.setFocusPainted(false);

        lblVersao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersao.setText("Spark Complete");
        lblVersao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        barraProgresso.setBackground(new java.awt.Color(255, 255, 255));
        barraProgresso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        barraProgresso.setForeground(new java.awt.Color(0, 102, 255));
        barraProgresso.setStringPainted(true);

        javax.swing.GroupLayout panelSplahLayout = new javax.swing.GroupLayout(panelSplah);
        panelSplah.setLayout(panelSplahLayout);
        panelSplahLayout.setHorizontalGroup(
            panelSplahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSplahLayout.createSequentialGroup()
                .addGroup(panelSplahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSplahLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelSplahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVersao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                            .addComponent(barraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSplahLayout.setVerticalGroup(
            panelSplahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSplahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVersao)
                .addGap(5, 5, 5)
                .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSuperior.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSplah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelSplah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashView().setVisible(true);
            }
        });
    }
    
    private void setIcone(){
        try {
            this.setIconImage(new ImageIcon("Logo.png").getImage());
        } catch (Exception e) {
            System.out.println("Erro: ao carregar icone: " +e.getMessage());
        }
        
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JButton btnLogo;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel panelSplah;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
