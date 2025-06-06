package view.gamer;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import controlador.Logs;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import model.core.ConfiguracaoModel;
import model.core.ParametroModel;
import model.gamer.RankModel;
import tablemodel.RankTableModel;
import view.core.AjudaView;
import view.core.AssociadorDatabaseView;

/**
 * @author jsilva
 */

public final class GerenciadorRankGamer extends javax.swing.JFrame {

    List<RankModel> listaRank = new ArrayList<>();
    //List<String> listaParametros = new ArrayList<>();
    List<ParametroModel> listaParametros = new ArrayList<>();
    RankTableModel rankTableModel= new RankTableModel();
    RankModel rank = new RankModel();
    ConfiguracaoController cController = new ConfiguracaoController();
    Funcoes f = new Funcoes();
    ConfiguracaoModel configModel = new ConfiguracaoModel();
    ConfiguracaoController confController = new ConfiguracaoController();
    
    public GerenciadorRankGamer() {
        initComponents();
        setLocationRelativeTo(null);
        carregarConfiguracao();        
        configurarTabela();        
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        new ConsultaParalela().start();
    }      
    
    public RankTableModel getModelo() {
	if(rankTableModel == null){
            rankTableModel = new RankTableModel(listaRank);
	}
	return rankTableModel;
    }
    
    public JTable getTabela(){
	if(tabela_rank_geral == null){
            tabela_rank_geral = new JTable();
            tabela_rank_geral.setModel(getModelo());
	}
        return tabela_rank_geral;
    }
    
  

    //@SuppressWarnings("unchecked")
    @SuppressWarnings("deprecation")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panelDadosRank = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_rank_geral = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        lblQtdRegistros = new javax.swing.JLabel();
        btnParametro = new javax.swing.JButton();
        cmbParametro = new javax.swing.JComboBox<>();
        lblParametro = new javax.swing.JLabel();
        menuPrncipal = new javax.swing.JMenuBar();
        menuPrncipalArquivo = new javax.swing.JMenu();
        jmiAjuda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ranking Left 4 Dead 2 (Server Vigilante Noturno)");
        setMinimumSize(new java.awt.Dimension(1155, 580));

        tabela_rank_geral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_rank_geral.setModel(getModelo());
        tabela_rank_geral.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tabela_rank_geral.setAutoscrolls(false);
        tabela_rank_geral.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_rank_geral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_rank_geralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_rank_geral);

        javax.swing.GroupLayout panelDadosRankLayout = new javax.swing.GroupLayout(panelDadosRank);
        panelDadosRank.setLayout(panelDadosRankLayout);
        panelDadosRankLayout.setHorizontalGroup(
            panelDadosRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelDadosRankLayout.setVerticalGroup(
            panelDadosRankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        txtBusca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        lblQtdRegistros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQtdRegistros.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdRegistros.setText("0 registro");

        btnParametro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Parameter_32.png"))); // NOI18N
        btnParametro.setToolTipText("Parametrização");
        btnParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametroActionPerformed(evt);
            }
        });

        cmbParametro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbParametroActionPerformed(evt);
            }
        });

        lblParametro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblParametro.setForeground(new java.awt.Color(255, 255, 255));
        lblParametro.setText("Parametros");

        jDesktopPane1.setLayer(panelDadosRank, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtBusca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblQtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cmbParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblParametro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblQtdRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addGap(671, 671, 671)
                        .addComponent(btnParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParametro)
                    .addComponent(cmbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDadosRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQtdRegistros)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        menuPrncipalArquivo.setText("Arquivo");

        jmiAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAjuda.setText("Ajuda");
        jmiAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAjudaActionPerformed(evt);
            }
        });
        menuPrncipalArquivo.add(jmiAjuda);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuPrncipalArquivo.add(menuSair);

        menuPrncipal.add(menuPrncipalArquivo);

        setJMenuBar(menuPrncipal);
        setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if(!txtBusca.getText().isEmpty()){
            listarConexoesNome(txtBusca.getText());
        }else{
            listarClassificacao();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void tabela_rank_geralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_rank_geralMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            if (evt.getClickCount() == 2) {

            }
        }
    }//GEN-LAST:event_tabela_rank_geralMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("LEFT2_RANK"));
    }//GEN-LAST:event_jmiAjudaActionPerformed

    private void btnParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametroActionPerformed
        AssociadorDatabaseView adbv = new AssociadorDatabaseView();
    }//GEN-LAST:event_btnParametroActionPerformed

    private void cmbParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbParametroActionPerformed
        listarClassificacao();
    }//GEN-LAST:event_cmbParametroActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciadorRankGamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorRankGamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorRankGamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorRankGamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciadorRankGamer().setVisible(true);
        });
    }
    
    private void limpar(){
        //txtServidor.setText("");
        //txtBanco.setText("");
        //txtCliente.setText("");
    }
    
    
    public void configurarTabela(){
        tabela_rank_geral.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabela_rank_geral.getColumnModel().getColumn(1).setPreferredWidth(75);
        tabela_rank_geral.getColumnModel().getColumn(2).setPreferredWidth(75);
        tabela_rank_geral.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabela_rank_geral.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    
    
    public void listarClassificacao(){        
        rankTableModel.limpar();                
        listaRank = cController.verificarClassificaoGeral(cController.verificarDataBaseRank(cmbParametro.getSelectedItem().toString()));                                      
        if(listaRank.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaRank.size() + " registros");
            rankTableModel.addListaRanks(listaRank);
        }                        
    }
    
    public void listarConexoesNome(String apelido){
        rankTableModel.limpar();
        
        //listaRank = cController.verificarClassificaoUsuários(apelido);
        //listaRank = cController.verificarClassificaoUsuários(apelido);
        listaRank = cController.verificarClassificaoUsuários(apelido,cController.verificarDataBaseRank(cmbParametro.getSelectedItem().toString()));
        rankTableModel.addListaRanks(listaRank);
        if(listaRank.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaRank.size() + " registros");
        }
    }
            
    private void carregarConfiguracao(){
        configModel = confController.validarConfig();        
        if((configModel.getTema().contains("FlatLight")) || (configModel.getTema().contains("Metal")) || (configModel.getTema().contains("FlatIntelliJ"))){
            lblQtdRegistros.setForeground(Color.black);
        }else{
            lblQtdRegistros.setForeground(Color.white);
        }
        this.listaParametros.clear();
        listaParametros = confController.listarParametrosDescri("BASE_GAMER_SERVER");
        if(listaParametros.isEmpty()){
            cmbParametro.addItem("SEM PARAMETROS NA BASE");
        }else{
            listaParametros.forEach((parametro) -> {
                cmbParametro.addItem(parametro.getxIdParametro());
            });
        }
    }   
    
    
    public class ConsultaParalela extends Thread{
        private Logs log = new Logs();
        @Override
        public void run(){            
            try {
                listarClassificacao();
            } catch (Exception e) {
                log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");                
            }
        }     
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParametro;
    private javax.swing.JComboBox<String> cmbParametro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JLabel lblParametro;
    private javax.swing.JLabel lblQtdRegistros;
    private javax.swing.JMenuBar menuPrncipal;
    private javax.swing.JMenu menuPrncipalArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel panelDadosRank;
    private javax.swing.JTable tabela_rank_geral;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
