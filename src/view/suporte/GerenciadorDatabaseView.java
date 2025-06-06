package view.suporte;

import controlador.ConexoesController;
import controlador.ConfiguracaoController;
import controlador.Funcoes;
import controlador.Logs;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.core.ConfiguracaoModel;
import model.core.DataBaseModel;
import tablemodel.DataBaseTableModel;
import view.core.AjudaView;

/**
 * @author jsilva
 */

public final class GerenciadorDatabaseView extends javax.swing.JFrame {

    List<DataBaseModel> listaDataBase = new ArrayList<>();
    DataBaseTableModel dataBaseTableModel= new DataBaseTableModel();
    DataBaseModel dataModel = new DataBaseModel();
    ConexoesController cController = new ConexoesController();
    Funcoes f = new Funcoes();
    ConfiguracaoModel configModel = new ConfiguracaoModel();
    ConfiguracaoController confController = new ConfiguracaoController();
    private final Logs log = new Logs();
    
    public GerenciadorDatabaseView() {
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
        panelGerenciadorDataBase = new javax.swing.JDesktopPane();
        btnCancelar = new javax.swing.JButton();
        panelDadosFtp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_bases = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        btnCopiar = new javax.swing.JButton();
        lblQtdRegistros = new javax.swing.JLabel();
        panelServers = new javax.swing.JDesktopPane();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblBanco = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        lblPorta = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        lblServidor = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnConfirma = new javax.swing.JButton();
        menuPrncipal = new javax.swing.JMenuBar();
        menuPrncipalArquivo = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de DataBase");
        setMinimumSize(new java.awt.Dimension(1100, 520));
        setPreferredSize(new java.awt.Dimension(950, 550));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setToolTipText("Excluir");
        btnCancelar.setNextFocusableComponent(tabela_bases);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tabela_bases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_bases.setModel(getModelo());
        tabela_bases.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabela_bases.setAutoscrolls(false);
        tabela_bases.setColumnSelectionAllowed(true);
        tabela_bases.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_bases.getTableHeader().setReorderingAllowed(false);
        tabela_bases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_basesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_bases);

        javax.swing.GroupLayout panelDadosFtpLayout = new javax.swing.GroupLayout(panelDadosFtp);
        panelDadosFtp.setLayout(panelDadosFtpLayout);
        panelDadosFtpLayout.setHorizontalGroup(
            panelDadosFtpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelDadosFtpLayout.setVerticalGroup(
            panelDadosFtpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosFtpLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
        );

        txtBusca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBusca.setNextFocusableComponent(btnConfirma);
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copiar_32.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.setNextFocusableComponent(btnCancelar);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        lblQtdRegistros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQtdRegistros.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdRegistros.setText("0 registro");

        panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Descrição");

        txtDescricao.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescricao.setNextFocusableComponent(txtBanco);

        lblBanco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblBanco.setForeground(new java.awt.Color(255, 255, 255));
        lblBanco.setText("Banco");

        txtBanco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtBanco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBanco.setNextFocusableComponent(txtUsuario);

        lblPorta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPorta.setForeground(new java.awt.Color(255, 255, 255));
        lblPorta.setText("Porta");

        txtPorta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPorta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorta.setNextFocusableComponent(cmbTipo);

        lblServidor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblServidor.setForeground(new java.awt.Color(255, 255, 255));
        lblServidor.setText("Servidor");

        txtServidor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtServidor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtServidor.setNextFocusableComponent(txtDescricao);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setNextFocusableComponent(txtSenha);

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setNextFocusableComponent(txtPorta);

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");

        cmbTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MySql", "SQL Server", "Sql Lite" }));
        cmbTipo.setNextFocusableComponent(txtBusca);

        panelServers.setLayer(lblDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblPorta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtPorta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(cmbTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelServersLayout = new javax.swing.GroupLayout(panelServers);
        panelServers.setLayout(panelServersLayout);
        panelServersLayout.setHorizontalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServidor)
                    .addComponent(lblBanco)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBanco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtServidor)
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addComponent(txtUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPorta)
                        .addGap(14, 14, 14)
                        .addComponent(txtPorta))
                    .addComponent(txtDescricao))
                .addContainerGap())
        );
        panelServersLayout.setVerticalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addComponent(lblServidor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(lblPorta)
                            .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipo)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmar_32.png"))); // NOI18N
        btnConfirma.setToolTipText("Confirmar");
        btnConfirma.setNextFocusableComponent(btnCopiar);
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        panelGerenciadorDataBase.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGerenciadorDataBase.setLayer(panelDadosFtp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGerenciadorDataBase.setLayer(txtBusca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGerenciadorDataBase.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGerenciadorDataBase.setLayer(lblQtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGerenciadorDataBase.setLayer(panelServers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGerenciadorDataBase.setLayer(btnConfirma, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGerenciadorDataBaseLayout = new javax.swing.GroupLayout(panelGerenciadorDataBase);
        panelGerenciadorDataBase.setLayout(panelGerenciadorDataBaseLayout);
        panelGerenciadorDataBaseLayout.setHorizontalGroup(
            panelGerenciadorDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciadorDataBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGerenciadorDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGerenciadorDataBaseLayout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDadosFtp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGerenciadorDataBaseLayout.createSequentialGroup()
                        .addComponent(lblQtdRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addGap(738, 738, 738)))
                .addContainerGap())
            .addComponent(panelServers)
        );
        panelGerenciadorDataBaseLayout.setVerticalGroup(
            panelGerenciadorDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGerenciadorDataBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelServers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGerenciadorDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGerenciadorDataBaseLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDadosFtp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQtdRegistros)
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
            .addComponent(panelGerenciadorDataBase)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGerenciadorDataBase)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        excluirDataBase();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if(!txtBusca.getText().isEmpty()){
            listarDataBaseDescricao(txtBusca.getText());
        }else{
            listarDataBases();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabela_basesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_basesMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            if (evt.getClickCount() == 2) {
                try {
                    dataModel = dataBaseTableModel.getDataBase(tabela_bases.getSelectedRow());
                    String dados = "---------------LISTA DE DATABASE-------------------------\n\nServidor:   " + dataModel.getServidor() + "\nBanco:   " + dataModel.getBanco()+ "\nUsuário:    " + dataModel.getUsuario() + "\nSenha:      " + dataModel.getSenha()+ "\nPorta:      " + dataModel.getPorta() + "\nDescricao:    " + dataModel.getDescricao().concat("\n\n-----------------------------------------------------");                    
                    f.copiar(dados);
                    JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(this, "Problema ao copiar dados! " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }                
            }
        }else if (evt.getButton() == MouseEvent.BUTTON1){
            if (evt.getClickCount() == 2) {
                JOptionPane.showMessageDialog(this, "Clicou");
            }                        
        }
    }//GEN-LAST:event_tabela_basesMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        if(!(txtPorta.getText().isEmpty())&& !(txtDescricao.getText().isEmpty()) && !(txtBanco.getText().isEmpty())){
            gravarDatabase();
        }else{
            JOptionPane.showMessageDialog(this, "Todos os campos precisam estar preenchido","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        txtBusca.setText("");        
        txtBanco.grabFocus();
        txtPorta.setEditable(true);
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("DATA_BASE"));
    }//GEN-LAST:event_menuAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDatabaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciadorDatabaseView().setVisible(true);
        });
    }
    
    
    private void gravarDatabase(){
        try {
            dataModel.setServidor(txtServidor.getText());
            dataModel.setBanco(txtBanco.getText());
            dataModel.setUsuario(txtUsuario.getText());
            dataModel.setSenha(txtSenha.getText());
            dataModel.setPorta(Integer.parseInt(txtPorta.getText()));
            dataModel.setDescricao(txtDescricao.getText());
            dataModel.setTipo(cmbTipo.getSelectedItem().toString().replaceAll(" ", "").toLowerCase());
            boolean validaInsercao = cController.inserirDataBase(dataModel);
            if(validaInsercao){
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao realiza cadastro","Aviso",JOptionPane.ERROR_MESSAGE);
            }
            listarDataBases();
            limpar();            
        } catch (HeadlessException e) {
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("Erro insert: " + e.getMessage());
        }finally{            
            txtServidor.grabFocus();
        }                
    }
    
    private void excluirDataBase(){
        try {
            int cod = listaDataBase.get(tabela_bases.getSelectedRow()).getCodigo();            
            if(cController.excluirDataBase(cod)){
                JOptionPane.showMessageDialog(this, "Registro excluído com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Não foi possível excluir o registro","Aviso",JOptionPane.ERROR_MESSAGE); 
            }
            listarDataBases();
            limpar();
        } catch (HeadlessException e) {
            System.out.println("Erro exclusão: " + e.getMessage());
        }            
    }
    
    private void limpar(){
        txtServidor.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtBanco.setText("");
        txtPorta.setText("");
        txtDescricao.setText("");
        txtServidor.grabFocus();        
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
        dataBaseTableModel.addListaBase(listaDataBase);
        if(listaDataBase.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaDataBase.size() + " registros");
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
            lblPorta.setForeground(Color.black);
            lblDescricao.setForeground(Color.black);
            lblBanco.setForeground(Color.black);
            lblUsuario.setForeground(Color.black);
            lblQtdRegistros.setForeground(Color.black);
            lblSenha.setForeground(Color.black);
            lblServidor.setForeground(Color.black);
            //panelServers.getBorder().
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.black));
        }else{
            panelServers.setForeground(Color.white);
            lblPorta.setForeground(Color.white);
            lblDescricao.setForeground(Color.white);
            lblBanco.setForeground(Color.white);
            lblUsuario.setForeground(Color.white);
            lblQtdRegistros.setForeground(Color.white);
            lblSenha.setForeground(Color.white);
            lblServidor.setForeground(Color.white);
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.white));
        }
        listarDataBases();
        //this.panelEstati.updateUI();
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.ButtonGroup grupoTrocaSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPorta;
    private javax.swing.JLabel lblQtdRegistros;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menuAjuda;
    private javax.swing.JMenuBar menuPrncipal;
    private javax.swing.JMenu menuPrncipalArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel panelDadosFtp;
    private javax.swing.JDesktopPane panelGerenciadorDataBase;
    private javax.swing.JDesktopPane panelServers;
    private javax.swing.JTable tabela_bases;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
