package view.core;

import controlador.ConexoesController;
import controlador.ConfiguracaoController;
import controlador.Funcoes;
import controlador.Logs;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.core.ConfiguracaoModel;
import model.core.DataBaseModel;
import tablemodel.DataBaseTableModel;

/**
 * @author jsilva
 */

public final class AssociadorDatabaseView extends javax.swing.JFrame {

    List<DataBaseModel> listaDataBase = new ArrayList<>();
    List<String> listaParametros = new ArrayList<>();
    DataBaseTableModel dataBaseTableModel= new DataBaseTableModel();
    DataBaseModel dataModel = new DataBaseModel();
    ConexoesController cController = new ConexoesController();
    Funcoes f = new Funcoes();
    ConfiguracaoModel configModel = new ConfiguracaoModel();
    ConfiguracaoController confController = new ConfiguracaoController();
    private Logs log = new Logs();
    
    String xIdParametro = "SEM PARAMETRO";
    String descParametro = "SEM PARAMETRO";
    
    
    public AssociadorDatabaseView() {
        initComponents();
        setLocationRelativeTo(null);
        carregarConfiguracao();        
        configurarTabela();        
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }      
    
    public DataBaseTableModel getModelo() {
	if(dataBaseTableModel == null){
            dataBaseTableModel = new DataBaseTableModel(listaDataBase);
	}
	return dataBaseTableModel;
    }
    
    public JTable getTabela(){
	if(tabela_bases == null){
            tabela_bases = new JTable();
            tabela_bases.setModel(getModelo());
	}
        return tabela_bases;
    }
    
    private void copiar(){        
        String copiar = "-------------------LISTA DE DATABASES-------------------\n\n";
        if(!this.listaDataBase.isEmpty()){                        
            try {
                for(DataBaseModel d : listaDataBase){
                    String dados ="";
                    dados += "Servidor:   " + d.getServidor() + "\nBanco:      " + d.getBanco()+ "\nUsuário:    " + d.getUsuario() + "\nSenha:      " + d.getSenha()+ "\nPorta:      " + d.getPorta() + "\nDescrição:  " + d.getDescricao() + "\nTipo:       " + d.getTipo() + "\n\n";
                    copiar = copiar.concat(dados);
                }
                copiar = copiar.concat("--------------------------------------------------------");
                f.copiar(copiar);
                JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Erro ao copiar dados" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(this, "Não existem dados para cópia","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @SuppressWarnings("deprecation")
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTrocaSenha = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panelDadosFtp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_bases = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        lblQtdRegistros = new javax.swing.JLabel();
        lblParametro = new javax.swing.JLabel();
        cmbParametro = new javax.swing.JComboBox<>();
        btnAssociar = new javax.swing.JButton();
        menuPrncipal = new javax.swing.JMenuBar();
        menuPrncipalArquivo = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de DataBase");
        setMinimumSize(new java.awt.Dimension(1100, 520));

        tabela_bases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_bases.setModel(getModelo());
        tabela_bases.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabela_bases.setAutoscrolls(false);
        tabela_bases.setColumnSelectionAllowed(true);
        tabela_bases.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_bases.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_bases);

        javax.swing.GroupLayout panelDadosFtpLayout = new javax.swing.GroupLayout(panelDadosFtp);
        panelDadosFtp.setLayout(panelDadosFtpLayout);
        panelDadosFtpLayout.setHorizontalGroup(
            panelDadosFtpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelDadosFtpLayout.setVerticalGroup(
            panelDadosFtpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosFtpLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
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

        lblParametro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblParametro.setForeground(new java.awt.Color(255, 255, 255));
        lblParametro.setText("Parametros");

        cmbParametro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnAssociar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Aceitar.png"))); // NOI18N
        btnAssociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(panelDadosFtp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtBusca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblQtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cmbParametro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAssociar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosFtp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(lblParametro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbParametro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblQtdRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addGap(647, 647, 647)
                        .addComponent(btnAssociar)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParametro))
                    .addComponent(cmbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDadosFtp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdRegistros)
                    .addComponent(btnAssociar))
                .addContainerGap())
        );

        menuPrncipalArquivo.setText("Arquivo");

        menuAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuAjuda.setText("Ajuda");
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });
        menuPrncipalArquivo.add(menuAjuda);

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

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if(!txtBusca.getText().isEmpty()){
            listarDataBaseDescricao(txtBusca.getText());
        }else{
            listarDataBases();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("DATA_BASE"));
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void btnAssociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarActionPerformed
        associar();
    }//GEN-LAST:event_btnAssociarActionPerformed

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
            java.util.logging.Logger.getLogger(AssociadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssociadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssociadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssociadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AssociadorDatabaseView().setVisible(true);
        });
    }               
    
    public void configurarTabela(){
        tabela_bases.getColumnModel().getColumn(0).setPreferredWidth(75);
        tabela_bases.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabela_bases.getColumnModel().getColumn(2).setPreferredWidth(180);
        tabela_bases.getColumnModel().getColumn(3).setPreferredWidth(135);
        tabela_bases.getColumnModel().getColumn(4).setPreferredWidth(135);
        tabela_bases.getColumnModel().getColumn(5).setPreferredWidth(65);
        tabela_bases.getColumnModel().getColumn(6).setPreferredWidth(250);
        tabela_bases.getColumnModel().getColumn(7).setPreferredWidth(200);
        tabela_bases.getColumnModel().getColumn(7).setPreferredWidth(115);
    }
    
    
    public void listarDataBases(){
        dataBaseTableModel.limpar();
        listaDataBase = cController.verificarDataBase();
        listaParametros = confController.listarIdParametros();
        dataBaseTableModel.addListaBase(listaDataBase);
        if(listaDataBase.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaDataBase.size() + " registros");
        }
        if(listaParametros.isEmpty()){
            cmbParametro.addItem("SEM PARAMETROS NA BASE");
        }else{
            for (String parametro : listaParametros) {
                cmbParametro.addItem(parametro);
            }
        }
        
    }
    
    public void listarDataBaseDescricao(String descricao){
        dataBaseTableModel.limpar();
        listaDataBase = cController.verificarDataBaseDescricao(descricao);
        dataBaseTableModel.addListaBase(listaDataBase);
        if(listaDataBase.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaDataBase.size() + " registros");
        }
    }    
            
    private void carregarConfiguracao(){
        configModel = confController.validarConfig();
        if((configModel.getTema().contains("FlatLight")) || (configModel.getTema().contains("Metal")) || (configModel.getTema().contains("FlatIntelliJ"))){
            lblQtdRegistros.setForeground(Color.black);
        }else{
            lblQtdRegistros.setForeground(Color.white);
        }
        listarDataBases();
        xIdParametro = cmbParametro.getSelectedItem().toString();
    }   
    
    
    private void associar(){                
        if(tabela_bases.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this, "Selecione a base antes de prosseguir!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            xIdParametro = cmbParametro.getSelectedItem().toString();
            descParametro = dataBaseTableModel.getDataBase(tabela_bases.getSelectedRow()).getCodigo() + "";
            if(confController.associarServidorBase(xIdParametro, descParametro)){
                JOptionPane.showMessageDialog(this, "Associação realizada com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Problema ao realizar associação","Aviso",JOptionPane.ERROR_MESSAGE);
            }
        }                                    
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssociar;
    private javax.swing.JComboBox<String> cmbParametro;
    private javax.swing.ButtonGroup grupoTrocaSenha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblParametro;
    private javax.swing.JLabel lblQtdRegistros;
    private javax.swing.JMenuItem menuAjuda;
    private javax.swing.JMenuBar menuPrncipal;
    private javax.swing.JMenu menuPrncipalArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel panelDadosFtp;
    private javax.swing.JTable tabela_bases;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
