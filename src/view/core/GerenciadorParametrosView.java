package view.core;

import controlador.ConfiguracaoController;
import controlador.Funcoes;
import dao.DaoTesteSqlConexao;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.core.ConfiguracaoModel;
import model.core.ParametroModel;
import tablemodel.ParametrosTableModel;

/**
 * @author jsilva
 */

public final class GerenciadorParametrosView extends javax.swing.JFrame {

    List<ParametroModel> listaParametros = new ArrayList<>();
    ParametrosTableModel parametrosTableModel= new ParametrosTableModel();
    ParametroModel parametro = new ParametroModel();
    ConfiguracaoController cController = new ConfiguracaoController();
    Funcoes f = new Funcoes();
    ConfiguracaoModel configModel = new ConfiguracaoModel();
    ConfiguracaoController confController = new ConfiguracaoController();
    
    public GerenciadorParametrosView() {
        initComponents();
        setLocationRelativeTo(null);
        carregarConfiguracao();        
        configurarTabela();        
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }      
    
    public ParametrosTableModel getModelo() {
	if(parametrosTableModel == null){
            parametrosTableModel = new ParametrosTableModel(listaParametros);
	}
	return parametrosTableModel;
    }
    
    public JTable getTabela(){
	if(tabela_parametros == null){
            tabela_parametros = new JTable();
            tabela_parametros.setModel(getModelo());
	}
        return tabela_parametros;
    }
    
    //@SuppressWarnings("unchecked")
    @SuppressWarnings("deprecation")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCancelar = new javax.swing.JButton();
        panelDadosBancos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_parametros = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        lblQtdRegistros = new javax.swing.JLabel();
        panelServers = new javax.swing.JDesktopPane();
        lblxIdParametro = new javax.swing.JLabel();
        txtxIdParametro = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtDescParametro = new javax.swing.JTextField();
        btnConfirma = new javax.swing.JButton();
        menuPrncipal = new javax.swing.JMenuBar();
        menuPrncipalArquivo = new javax.swing.JMenu();
        jmiAjuda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Conexões DB");
        setMinimumSize(new java.awt.Dimension(890, 420));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setToolTipText("Excluir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tabela_parametros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_parametros.setModel(getModelo());
        tabela_parametros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tabela_parametros.setAutoscrolls(false);
        tabela_parametros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabela_parametros);

        javax.swing.GroupLayout panelDadosBancosLayout = new javax.swing.GroupLayout(panelDadosBancos);
        panelDadosBancos.setLayout(panelDadosBancosLayout);
        panelDadosBancosLayout.setHorizontalGroup(
            panelDadosBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelDadosBancosLayout.setVerticalGroup(
            panelDadosBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
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

        panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblxIdParametro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblxIdParametro.setForeground(new java.awt.Color(255, 255, 255));
        lblxIdParametro.setText("xIdParametro");

        txtxIdParametro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtxIdParametro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtxIdParametro.setNextFocusableComponent(txtDescParametro);

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Descrição");

        txtDescParametro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtDescParametro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        panelServers.setLayer(lblxIdParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtxIdParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtDescParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelServersLayout = new javax.swing.GroupLayout(panelServers);
        panelServers.setLayout(panelServersLayout);
        panelServersLayout.setHorizontalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblxIdParametro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtxIdParametro, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescParametro, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        panelServersLayout.setVerticalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblxIdParametro)
                    .addComponent(txtxIdParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmar_32.png"))); // NOI18N
        btnConfirma.setToolTipText("Confirmar");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelDadosBancos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtBusca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblQtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelServers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnConfirma, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDadosBancos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblQtdRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(738, 738, 738)))
                .addContainerGap())
            .addComponent(panelServers)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelServers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDadosBancos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(lblQtdRegistros)
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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        excluirParametro();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if(!txtBusca.getText().isEmpty()){
            listarParametrosDescri(txtBusca.getText());
        }else{
            listarParametros();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        if(!(txtDescParametro.getText().isEmpty())&& !(txtxIdParametro.getText().isEmpty())){
            gravarParametros();
        }else{
            JOptionPane.showMessageDialog(this, "Todos os campos precisam estar preenchido","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        txtBusca.setText("");        
        txtxIdParametro.grabFocus();
        txtDescParametro.setEditable(true);
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("PARAMETRO"));
    }//GEN-LAST:event_jmiAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciadorParametrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorParametrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorParametrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorParametrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciadorParametrosView().setVisible(true);
        });
    }
    
    
    private void gravarParametros(){
        try {
            parametro.setxIdParametro(txtxIdParametro.getText());
            parametro.setDescricao(txtDescParametro.getText());            
            //DaoTesteSqlConexao daoTeste = new DaoTesteSqlConexao(txtServidor.getText(),txtBanco.getText());
            //String retorno = daoTeste.consultarTesteConexao();
            boolean validaInsercao = cController.inserirParametro(parametro);
            if(validaInsercao){
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao realiza cadastro","Aviso",JOptionPane.ERROR_MESSAGE);
            }
            listarParametros();
            limpar();            
        } catch (HeadlessException e) {
            System.out.println("Erro insert: " + e.getMessage());
        }finally{
            txtxIdParametro.grabFocus();
        }                
    }
    
    private void excluirParametro(){
        try {
            int cod = listaParametros.get(tabela_parametros.getSelectedRow()).getCodigo();            
            if(cController.excluirParametro(cod)){
                JOptionPane.showMessageDialog(this, "Parametro excluido com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Não foi possível excluir o parametro","Aviso",JOptionPane.ERROR_MESSAGE); 
            }
            listarParametros();
            limpar();
        } catch (HeadlessException e) {
            System.out.println("Erro exclusão: " + e.getMessage());
        }            
    }
    
    private void limpar(){
        txtxIdParametro.setText("");
        txtDescParametro.setText("");
    }
    
    
    public void configurarTabela(){
        tabela_parametros.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabela_parametros.getColumnModel().getColumn(1).setPreferredWidth(75);
        tabela_parametros.getColumnModel().getColumn(2).setPreferredWidth(75);
        tabela_parametros.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabela_parametros.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    
    
    public void listarParametros(){
        parametrosTableModel.limpar();
        listaParametros = cController.listarParametros();
        parametrosTableModel.addListaParametro(listaParametros);
        if(listaParametros.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaParametros.size() + " registros");
        }
    }
    
    public void listarParametrosDescri(String descricao){
        parametrosTableModel.limpar();
        listaParametros = cController.listarParametrosDescri(descricao);
        parametrosTableModel.addListaParametro(listaParametros);
        if(listaParametros.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaParametros.size() + " registros");
        }
    }    
            
    private void carregarConfiguracao(){
        configModel = confController.validarConfig();        
        if((configModel.getTema().contains("FlatLight")) || (configModel.getTema().contains("Metal")) || (configModel.getTema().contains("FlatIntelliJ"))){
            lblDescricao.setForeground(Color.black);
            lblxIdParametro.setForeground(Color.black);
            lblQtdRegistros.setForeground(Color.black);
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.black));
        }else{
            panelServers.setForeground(Color.white);
            lblDescricao.setForeground(Color.white);
            lblxIdParametro.setForeground(Color.white);
            lblQtdRegistros.setForeground(Color.white);
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.white));
        }
        listarParametros();
        //this.panelEstati.updateUI();
    }   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblQtdRegistros;
    private javax.swing.JLabel lblxIdParametro;
    private javax.swing.JMenuBar menuPrncipal;
    private javax.swing.JMenu menuPrncipalArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel panelDadosBancos;
    private javax.swing.JDesktopPane panelServers;
    private javax.swing.JTable tabela_parametros;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtDescParametro;
    private javax.swing.JTextField txtxIdParametro;
    // End of variables declaration//GEN-END:variables
}
