package view.core;

import controlador.KeyController;
import controlador.Funcoes;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import model.core.KeyModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tablemodel.KeyTableModel;

/**
 *
 * @author Jonathan
 */
public class ConsultaKey extends javax.swing.JFrame {
    KeyController kc = new KeyController();
    Funcoes f = new Funcoes();
    KeyModel keyModel;
    KeyTableModel keyTableModel= new KeyTableModel();
    
    public ConsultaKey() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        tabela_key.setModel(keyTableModel);
        configurarTabela();
        setVisible(true);
    }

    List<KeyModel> listaKeys = new ArrayList<>();
    
    public KeyTableModel getModelo() {
	if(keyTableModel == null){
            keyTableModel = new KeyTableModel(listaKeys);
	}
	return keyTableModel;
    }
    
    public JTable getTabela(){
	if(tabela_key == null){
            tabela_key = new JTable();
            tabela_key.setModel(getModelo());
	}
            return tabela_key;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDadosCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_key = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbParametro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtChave = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiArquivoNovo = new javax.swing.JMenuItem();
        jmiArquivoCopiar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Keys");
        setExtendedState(100);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        tabela_key.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_key.setModel(getModelo());
        tabela_key.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tabela_key.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_key.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_keyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_key);

        javax.swing.GroupLayout panelDadosClienteLayout = new javax.swing.GroupLayout(panelDadosCliente);
        panelDadosCliente.setLayout(panelDadosClienteLayout);
        panelDadosClienteLayout.setHorizontalGroup(
            panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelDadosClienteLayout.setVerticalGroup(
            panelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar Cadastro");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apagar_32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir Registro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExcluirKeyPressed(evt);
            }
        });

        jLabel1.setText("Parametro");

        cmbParametro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome" }));
        cmbParametro.setSelectedItem(0);
        cmbParametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbParametroItemStateChanged(evt);
            }
        });

        jLabel2.setText("Produto");

        txtChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChaveKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChaveKeyReleased(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ok_24.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        btnConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarKeyPressed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copiar_32.png"))); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.setToolTipText("Copiar Dados");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        btnCopiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCopiarKeyPressed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adicionar_32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Novo Cadastro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovoKeyPressed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jmiArquivoNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiArquivoNovo.setText("Novo");
        jmiArquivoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArquivoNovoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArquivoNovo);

        jmiArquivoCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiArquivoCopiar.setText("Copiar");
        jmiArquivoCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArquivoCopiarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArquivoCopiar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem2.setText("Ajuda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDadosCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtChave))
                    .addComponent(cmbParametro)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCopiar)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            excluir();
        } catch (Exception ex) {
            Logger.getLogger(ConsultaKey.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //v.exibirAjudaConsulta("Funcionário");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            int num = cmbParametro.getSelectedIndex();
            String parametro = txtChave.getText();              
            lista(num, parametro);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao carregar dados","Erro",JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaKey.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {        
            confirmar();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtChaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyReleased
        txtChave.setText(txtChave.getText().toUpperCase());
    }//GEN-LAST:event_txtChaveKeyReleased

    private void cmbParametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbParametroItemStateChanged
        txtChave.setText("");        
    }//GEN-LAST:event_cmbParametroItemStateChanged

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                confirmar();
            } catch (Exception ex) {
                Logger.getLogger(ConsultaKey.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                   
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                excluir();
            } catch (Exception ex) {
                Logger.getLogger(ConsultaKey.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            dispose();
        }        
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void tabela_keyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_keyMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON1){
            if (evt.getClickCount() == 2) {
                keyModel = keyTableModel.getKey(tabela_key.getSelectedRow());
                //keyModel = keyTableModel.getKey(tabela_key.getSelectedRow()).getSerial();
                //String serial = keyTableModel.getKey(tabela_key.getSelectedRow()).getSerial();
                copiar();
            }
        }     
    }//GEN-LAST:event_tabela_keyMouseClicked

    private void txtChaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){                 
            try {
                confirmar();
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }        
    }//GEN-LAST:event_txtChaveKeyPressed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCopiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCopiarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){                             
            copiar();            
        }        
    }//GEN-LAST:event_btnCopiarKeyPressed

    private void jmiArquivoCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArquivoCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_jmiArquivoCopiarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.dispose();
        CadastroKey ck = new CadastroKey(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyPressed

    }//GEN-LAST:event_btnNovoKeyPressed

    private void jmiArquivoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArquivoNovoActionPerformed
        this.dispose();
        CadastroKey ck = new CadastroKey(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmiArquivoNovoActionPerformed

    public void configurarTabela(){
        tabela_key.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabela_key.getColumnModel().getColumn(1).setPreferredWidth(75);
        tabela_key.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabela_key.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabela_key.getColumnModel().getColumn(5).setPreferredWidth(150);
        tabela_key.getColumnModel().getColumn(6).setPreferredWidth(50);
        tabela_key.getColumnModel().getColumn(6).setPreferredWidth(10);
    }
    
    
    public void lista(int num, String param) throws SQLException, ClassNotFoundException, Exception{
        switch (num) {
            case 0:
                keyTableModel.limpar();
                listaKeys = kc.listarTodasKeys();
                keyTableModel.addListaKeys(listaKeys);
                break;
            case 1:
                keyTableModel.limpar();
                listaKeys = kc.listarTodasKeysNome(param);                        
                keyTableModel.addListaKeys(listaKeys);                
                break;
            default:
                throw new NullPointerException("Erro!!!! NA LISTA");
        }       
    }
    
    public void excluir() throws Exception{
        try {            
            int codigo  = listaKeys.get(tabela_key.getSelectedRow()).getCodigo();            
            keyTableModel.remover(tabela_key.getSelectedRow(),codigo);            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro no excluir","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void confirmar() throws Exception{
        try {
            int num = cmbParametro.getSelectedIndex();
            String parametro = txtChave.getText();              
            lista(num, parametro);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro no confirmar","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void copiar(){
        String dados = "\t\t INFORMAÇÕES DO PRODUTO \nUsuário: \t" + keyTableModel.getKey(tabela_key.getSelectedRow()).getUsuario() + "\nSO: \t\t" + keyTableModel.getKey(tabela_key.getSelectedRow()).getSo()+ "\nProduto: \t" +keyTableModel.getKey(tabela_key.getSelectedRow()).getDescricao()+ "\nSerial: \t" + keyTableModel.getKey(tabela_key.getSelectedRow()).getSerial() + "\nData Cadastro: \t" +keyTableModel.getKey(tabela_key.getSelectedRow()).getData();
        f.copiar(dados);
        JOptionPane.showMessageDialog(this, "Copiado com sucesso!","Informativo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cmbParametro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiArquivoCopiar;
    private javax.swing.JMenuItem jmiArquivoNovo;
    private javax.swing.JPanel panelDadosCliente;
    private javax.swing.JTable tabela_key;
    private javax.swing.JTextField txtChave;
    // End of variables declaration//GEN-END:variables
}