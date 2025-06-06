package view.suporte;

import controlador.ConexoesController;
import controlador.ConfiguracaoController;
import controlador.Funcoes;
import dao.DaoTesteSqlConexao;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.core.ConexaoModel;
import model.core.ConfiguracaoModel;
import tablemodel.ConexaoTableModel;
import view.core.AjudaView;

/**
 * @author jsilva
 */

public final class GerenciadorConexaoBdView extends javax.swing.JFrame {

    List<ConexaoModel> listaConexoes = new ArrayList<>();
    ConexaoTableModel conexoesTableModel= new ConexaoTableModel();
    ConexaoModel conexao = new ConexaoModel();
    ConexoesController cController = new ConexoesController();
    Funcoes f = new Funcoes();
    ConfiguracaoModel configModel = new ConfiguracaoModel();
    ConfiguracaoController confController = new ConfiguracaoController();
    
    public GerenciadorConexaoBdView() {
        initComponents();
        setLocationRelativeTo(null);
        carregarConfiguracao();        
        configurarTabela();        
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }      
    
    public ConexaoTableModel getModelo() {
	if(conexoesTableModel == null){
            conexoesTableModel = new ConexaoTableModel(listaConexoes);
	}
	return conexoesTableModel;
    }
    
    public JTable getTabela(){
	if(tabela_conexoes == null){
            tabela_conexoes = new JTable();
            tabela_conexoes.setModel(getModelo());
	}
        return tabela_conexoes;
    }
    
    private void copiar(){        
        String copiar = "-----------LISTA DE CONEXÕES-----------\n\n";        
        if(!this.listaConexoes.isEmpty()){            
            System.out.println("Passou");
            try {
                for(ConexaoModel c : listaConexoes){
                    String dados ="";
                    dados += "Servidor: " + c.getServidor() + "\nBanco:    " + c.getBanco() + "\nCliente:  " + c.getCliente() + "\n\n";
                    copiar = copiar.concat(dados);
                }
                copiar = copiar.concat("---------------------------------------");
                f.copiar(copiar);
                JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Erro ao copiar dados" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }        
        }else{
            JOptionPane.showMessageDialog(this, "Não existem dados para cópia","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }
    

    //@SuppressWarnings("unchecked")
    @SuppressWarnings("deprecation")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCancelar = new javax.swing.JButton();
        panelDadosBancos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_conexoes = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        btnCopiar = new javax.swing.JButton();
        lblQtdRegistros = new javax.swing.JLabel();
        panelServers = new javax.swing.JDesktopPane();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnStatusConexao = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblDescricaoConexao = new javax.swing.JLabel();
        lblServidor = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        lblBanco = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        btnConfirma = new javax.swing.JButton();
        chkRemoto = new javax.swing.JCheckBox();
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

        tabela_conexoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_conexoes.setModel(getModelo());
        tabela_conexoes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tabela_conexoes.setAutoscrolls(false);
        tabela_conexoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_conexoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_conexoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_conexoes);

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

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copiar_32.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        lblQtdRegistros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQtdRegistros.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdRegistros.setText("0 registro");

        panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");

        txtCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setNextFocusableComponent(btnConfirma);

        btnStatusConexao.setBackground(new java.awt.Color(0, 102, 255));
        btnStatusConexao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStatusConexao.setText("Verificar Conexão");
        btnStatusConexao.setToolTipText("Clique para verificar conexão");
        btnStatusConexao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatusConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusConexaoActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status");

        lblDescricaoConexao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDescricaoConexao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoConexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricaoConexao.setText("Conexão");
        lblDescricaoConexao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblServidor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblServidor.setForeground(new java.awt.Color(255, 255, 255));
        lblServidor.setText("Servidor");

        txtServidor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtServidor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtServidor.setNextFocusableComponent(txtBanco);

        lblBanco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblBanco.setForeground(new java.awt.Color(255, 255, 255));
        lblBanco.setText("Banco");

        txtBanco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtBanco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBanco.setNextFocusableComponent(txtCliente);

        panelServers.setLayer(lblCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(btnStatusConexao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblDescricaoConexao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelServersLayout = new javax.swing.GroupLayout(panelServers);
        panelServers.setLayout(panelServersLayout);
        panelServersLayout.setHorizontalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServidor)
                            .addComponent(lblCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCliente)
                            .addComponent(txtServidor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBanco)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBanco)
                            .addComponent(btnStatusConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
        );
        panelServersLayout.setVerticalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServidor)
                    .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBanco)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatusConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricaoConexao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmar_32.png"))); // NOI18N
        btnConfirma.setToolTipText("Confirmar");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        chkRemoto.setText("Servidor de acesso remoto");
        chkRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRemotoActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelDadosBancos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtBusca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblQtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelServers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnConfirma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(chkRemoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDadosBancos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblQtdRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(738, 738, 738)))
                .addContainerGap())
            .addComponent(panelServers)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(chkRemoto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelServers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(chkRemoto)
                        .addGap(24, 24, 24)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        excluirConexao();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnStatusConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusConexaoActionPerformed
       new ConsultaParalela().start();
        /*if(!chkRemoto.isSelected()){
            try {
                if(!txtBanco.getText().equals("Servidor de acesso remoto")){
                    if (!txtServidor.getText().equals("") && !txtBanco.getText().equals("")){
                        DaoTesteSqlConexao daoTeste = new DaoTesteSqlConexao(txtServidor.getText(),txtBanco.getText());
                        String retorno = daoTeste.consultarTesteConexao();
                        lblDescricaoConexao.setText(retorno);
                        if (retorno.contains("Erro na conexão : ")){
                            //Seta cor vermelha no botão
                           btnStatusConexao.setBackground(new Color(255,51,51));
                           if (retorno.contains("permission was denied ")){
                               lblDescricaoConexao.setText("Sem acesso a base. Verifique suas permissões");
                           }
                        }else if(retorno.contains("Conectado: ")){
                            btnStatusConexao.setBackground(new Color(0,153,153));
                            lblDescricaoConexao.setText(retorno.replaceAll("Conectado: ", ""));
                        }else{
                            lblDescricaoConexao.setText("Conexão não realizada!");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Preencha todos os campos!", "Aviso",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Não é possível verificar conexão de servidor de acesso remoto!", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(this,"Erro: " + e.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);                
            }finally{
                txtServidor.grabFocus();
            }
        }else{
            JOptionPane.showMessageDialog(this,"Não é possível fazer teste de conexão nesse tipo de Servidor!", "Aviso",JOptionPane.WARNING_MESSAGE);
        }*/
    }//GEN-LAST:event_btnStatusConexaoActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if(!txtBusca.getText().isEmpty()){
            listarConexoesNome(txtBusca.getText());
        }else{
            listarConexoes();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabela_conexoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_conexoesMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            if (evt.getClickCount() == 2) {
                try {
                    conexao = conexoesTableModel.getKey(tabela_conexoes.getSelectedRow());
                    String dados = "-----------LISTA DE CONEXÕES-----------\n\nServidor: ".concat(conexao.getServidor()).concat("\nBanco:    ").concat(conexao.getBanco()).concat("\nCliente:  ").concat(conexao.getCliente()).concat("\n\n---------------------------------------");                    
                    f.copiar(dados);
                    JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(this, "Problema ao copiar dados! " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }                
            }
        }
    }//GEN-LAST:event_tabela_conexoesMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        if(!(txtBanco.getText().isEmpty())&& !(txtCliente.getText().isEmpty()) && !(txtServidor.getText().isEmpty())){
            gravarConexao();
        }else{
            JOptionPane.showMessageDialog(this, "Todos os campos precisam estar preenchido","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        txtBusca.setText("");        
        txtServidor.grabFocus();
        txtBanco.setEditable(true);
        btnStatusConexao.setEnabled(true);
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void chkRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRemotoActionPerformed
        if(chkRemoto.isSelected()){
            btnStatusConexao.setEnabled(false);
            btnStatusConexao.setToolTipText("Teste não habilitado");            
            txtBanco.setText("Servidor de acesso remoto");
            txtBanco.setEditable(false);
        }else{
            btnStatusConexao.setToolTipText("Clique para verificar conexão");
            txtBanco.setText("");
            txtBanco.setEditable(true);
            btnStatusConexao.setEnabled(true);
        }
        txtServidor.grabFocus();
    }//GEN-LAST:event_chkRemotoActionPerformed

    private void jmiAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("CONEXAO"));
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
            java.util.logging.Logger.getLogger(GerenciadorConexaoBdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorConexaoBdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorConexaoBdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorConexaoBdView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciadorConexaoBdView().setVisible(true);
        });
    }
    
    
    private void gravarConexao(){
        try {
            conexao.setServidor(txtServidor.getText());
            conexao.setBanco(txtBanco.getText());
            conexao.setCliente(txtCliente.getText());
            //DaoTesteSqlConexao daoTeste = new DaoTesteSqlConexao(txtServidor.getText(),txtBanco.getText());
            //String retorno = daoTeste.consultarTesteConexao();
            boolean validaInsercao = cController.inserirConexao(conexao);
            if(validaInsercao){
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao realiza cadastro","Aviso",JOptionPane.ERROR_MESSAGE);
            }
            /*if(cController.inserirConexao(conexao)){
                if(!retorno.equals("")){
                    JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso! E Conexão OK","Aviso",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso! Porém erro de conexão","Aviso",JOptionPane.WARNING_MESSAGE);
                }                                 
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao realiza cadastro","Aviso",JOptionPane.ERROR_MESSAGE);
            }*/
            listarConexoes();
            limpar();            
        } catch (HeadlessException e) {
            System.out.println("Erro insert: " + e.getMessage());
        }finally{
            chkRemoto.setSelected(false);
            txtServidor.grabFocus();
        }                
    }
    
    private void excluirConexao(){
        try {
            int cod = listaConexoes.get(tabela_conexoes.getSelectedRow()).getCodigo();            
            if(cController.excluirConexao(cod)){
                JOptionPane.showMessageDialog(this, "Conexão excluida com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Não foi possível excluir a conexão","Aviso",JOptionPane.ERROR_MESSAGE); 
            }
            listarConexoes();
            limpar();
        } catch (HeadlessException e) {
            System.out.println("Erro exclusão: " + e.getMessage());
        }            
    }
    
    private void limpar(){
        txtServidor.setText("");
        txtBanco.setText("");
        txtCliente.setText("");        
    }
    
    
    public void configurarTabela(){
        tabela_conexoes.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabela_conexoes.getColumnModel().getColumn(1).setPreferredWidth(75);
        tabela_conexoes.getColumnModel().getColumn(2).setPreferredWidth(75);
        tabela_conexoes.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabela_conexoes.getColumnModel().getColumn(4).setPreferredWidth(10);
    }
    
    
    public void listarConexoes(){
        conexoesTableModel.limpar();
        listaConexoes = cController.verificarConexoes();
        conexoesTableModel.addListaConexoes(listaConexoes);
        if(listaConexoes.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaConexoes.size() + " registros");
        }
    }
    
    public void listarConexoesNome(String nome){
        conexoesTableModel.limpar();
        listaConexoes = cController.verificarConexoesNome(nome);
        conexoesTableModel.addListaConexoes(listaConexoes);
        if(listaConexoes.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaConexoes.size() + " registros");
        }
    }    
            
    private void carregarConfiguracao(){
        configModel = confController.validarConfig();        
        if((configModel.getTema().contains("FlatLight")) || (configModel.getTema().contains("Metal")) || (configModel.getTema().contains("FlatIntelliJ"))){
            lblBanco.setForeground(Color.black);
            lblCliente.setForeground(Color.black);
            lblServidor.setForeground(Color.black);
            lblDescricaoConexao.setForeground(Color.black);
            lblQtdRegistros.setForeground(Color.black);
            lblStatus.setForeground(Color.black);
            //panelServers.getBorder().
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.black));
        }else{
            panelServers.setForeground(Color.white);
            lblBanco.setForeground(Color.white);
            lblCliente.setForeground(Color.white);
            lblServidor.setForeground(Color.white);
            lblDescricaoConexao.setForeground(Color.white);
            lblQtdRegistros.setForeground(Color.white);
            lblStatus.setForeground(Color.white);
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.white));
        }
        listarConexoes();
        //this.panelEstati.updateUI();
    }   
    
    
    public class ConsultaParalela extends Thread{
        @Override
        public void run(){
            if(!chkRemoto.isSelected()){
                try {
                    if(!txtBanco.getText().equals("Servidor de acesso remoto")){
                        if (!txtServidor.getText().equals("") && !txtBanco.getText().equals("")){
                            DaoTesteSqlConexao daoTeste = new DaoTesteSqlConexao(txtServidor.getText(),txtBanco.getText());
                            String retorno = daoTeste.consultarTesteConexao();
                            lblDescricaoConexao.setText(retorno);
                            if (retorno.contains("Erro na conexão : ")){
                                //Seta cor vermelha no botão
                                btnStatusConexao.setBackground(new Color(255,51,51));
                                if (retorno.contains("permission was denied ")){
                                    lblDescricaoConexao.setText("Sem acesso a base. Verifique suas permissões");
                                }
                            }else if(retorno.contains("Conectado: ")){
                                btnStatusConexao.setBackground(new Color(0,153,153));
                                lblDescricaoConexao.setText(retorno.replaceAll("Conectado: ", ""));
                            }else{
                                lblDescricaoConexao.setText("Conexão não realizada!");
                                btnStatusConexao.setBackground(new Color(255,51,51));
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Preencha todos os campos!", "Aviso",JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Não é possível verificar conexão de servidor de acesso remoto!", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage(), "Erro",JOptionPane.ERROR_MESSAGE);
                }finally{
                    txtServidor.grabFocus();
                }
            }else{                        
                JOptionPane.showMessageDialog(null,"Não é possível realizar teste de conexão nesse tipo de Servidor!", "Aviso",JOptionPane.WARNING_MESSAGE);
            }
        }        
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnStatusConexao;
    private javax.swing.JCheckBox chkRemoto;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiAjuda;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDescricaoConexao;
    private javax.swing.JLabel lblQtdRegistros;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuBar menuPrncipal;
    private javax.swing.JMenu menuPrncipalArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel panelDadosBancos;
    private javax.swing.JDesktopPane panelServers;
    private javax.swing.JTable tabela_conexoes;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtServidor;
    // End of variables declaration//GEN-END:variables
}
