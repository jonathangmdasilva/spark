package view.suporte;

import controlador.ConexoesController;
import controlador.ConfiguracaoController;
import controlador.Funcoes;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.core.ConfiguracaoModel;
import model.core.FtpModel;
import tablemodel.FtpTableModel;
import view.core.AjudaView;

/**
 * @author jsilva
 */

public final class GerenciadorFTPView extends javax.swing.JFrame {

    List<FtpModel> listaFtps = new ArrayList<>();
    FtpTableModel ftpTableModel= new FtpTableModel();
    FtpModel ftpModel = new FtpModel();
    ConexoesController cController = new ConexoesController();
    Funcoes f = new Funcoes();
    ConfiguracaoModel configModel = new ConfiguracaoModel();
    ConfiguracaoController confController = new ConfiguracaoController();
    
    public GerenciadorFTPView() {
        initComponents();
        setLocationRelativeTo(null);
        carregarConfiguracao();        
        configurarTabela();        
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }      
    
    public FtpTableModel getModelo() {
	if(ftpTableModel == null){
            ftpTableModel = new FtpTableModel(listaFtps);
	}
	return ftpTableModel;
    }
    
    public JTable getTabela(){
	if(tabela_ftp == null){
            tabela_ftp = new JTable();
            tabela_ftp.setModel(getModelo());
	}
        return tabela_ftp;
    }
    
    private void copiar(){        
        String copiar = "-------------------LISTA DE FTPS-------------------\n\n";
        if(!this.listaFtps.isEmpty()){                        
            try {
                for(FtpModel f : listaFtps){
                    String dados ="";
                    dados += "Servidor:   " + f.getServidor() + "\nEndereço:   " + f.getEndereco()+ "\nUsuário:    " + f.getUsuario() + "\nSenha:      " + f.getSenha()+ "\nPorta:      " + f.getPorta() + "\nCliente:    " + f.getCliente() + "\nMuda Senha: ".concat(f.getTrocaSenha()== 1? "Sim":"Não")  +  "\n\n";
                    copiar = copiar.concat(dados);
                }
                copiar = copiar.concat("---------------------------------------------------");
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
        btnCancelar = new javax.swing.JButton();
        panelDadosFtp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_ftp = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        btnCopiar = new javax.swing.JButton();
        lblQtdRegistros = new javax.swing.JLabel();
        panelServers = new javax.swing.JDesktopPane();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblPorta = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        lblServidor = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblTrocaSenha = new javax.swing.JLabel();
        jrbtnSim = new javax.swing.JRadioButton();
        jrbtnNao = new javax.swing.JRadioButton();
        btnConfirma = new javax.swing.JButton();
        menuPrncipal = new javax.swing.JMenuBar();
        menuPrncipalArquivo = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Conexões FTP");
        setMinimumSize(new java.awt.Dimension(875, 520));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar_32.png"))); // NOI18N
        btnCancelar.setToolTipText("Excluir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tabela_ftp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_ftp.setModel(getModelo());
        tabela_ftp.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabela_ftp.setAutoscrolls(false);
        tabela_ftp.setColumnSelectionAllowed(true);
        tabela_ftp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela_ftp.getTableHeader().setReorderingAllowed(false);
        tabela_ftp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_ftpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_ftp);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
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
        txtCliente.setNextFocusableComponent(jrbtnSim);

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndereco.setNextFocusableComponent(txtUsuario);

        lblPorta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPorta.setForeground(new java.awt.Color(255, 255, 255));
        lblPorta.setText("Porta");

        txtPorta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPorta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorta.setNextFocusableComponent(txtCliente);

        lblServidor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblServidor.setForeground(new java.awt.Color(255, 255, 255));
        lblServidor.setText("Servidor");

        txtServidor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtServidor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtServidor.setNextFocusableComponent(txtEndereco);

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

        lblTrocaSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTrocaSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblTrocaSenha.setText("Troca Senha");

        grupoTrocaSenha.add(jrbtnSim);
        jrbtnSim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbtnSim.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnSim.setSelected(true);
        jrbtnSim.setText("Sim");
        jrbtnSim.setContentAreaFilled(false);
        jrbtnSim.setNextFocusableComponent(btnConfirma);

        grupoTrocaSenha.add(jrbtnNao);
        jrbtnNao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbtnNao.setForeground(new java.awt.Color(255, 255, 255));
        jrbtnNao.setText("Não");
        jrbtnNao.setContentAreaFilled(false);

        panelServers.setLayer(lblCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblPorta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtPorta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(txtSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(lblTrocaSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(jrbtnSim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelServers.setLayer(jrbtnNao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelServersLayout = new javax.swing.GroupLayout(panelServers);
        panelServers.setLayout(panelServersLayout);
        panelServersLayout.setHorizontalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServidor)
                            .addComponent(lblUsuario))
                        .addGap(19, 19, 19)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelServersLayout.createSequentialGroup()
                                .addComponent(txtUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(lblPorta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelServersLayout.createSequentialGroup()
                                .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCliente))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                    .addGroup(panelServersLayout.createSequentialGroup()
                        .addComponent(lblTrocaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbtnSim)
                        .addGap(10, 10, 10)
                        .addComponent(jrbtnNao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelServersLayout.setVerticalGroup(
            panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServidor)
                    .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha)
                        .addComponent(lblPorta)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(panelServersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrocaSenha)
                    .addComponent(jrbtnSim)
                    .addComponent(jrbtnNao))
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
        jDesktopPane1.setLayer(panelDadosFtp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtBusca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCopiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDadosFtp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblQtdRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(738, 738, 738)))
                .addContainerGap())
            .addComponent(panelServers)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelServers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        excluirFtp();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        if(!txtBusca.getText().isEmpty()){
            listarFtpsNome(txtBusca.getText());
        }else{
            listarFtps();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabela_ftpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_ftpMouseClicked
        if(evt.getButton() == MouseEvent.BUTTON3){
            if (evt.getClickCount() == 2) {
                try {
                    ftpModel = ftpTableModel.getFtp(tabela_ftp.getSelectedRow());
                    String dados = "---------------LISTA DE FTPs-------------------------\n\nServidor:   " + ftpModel.getServidor() + "\nEndereço:   " + ftpModel.getEndereco()+ "\nUsuário:    " + ftpModel.getUsuario() + "\nSenha:      " + ftpModel.getSenha()+ "\nPorta:      " + ftpModel.getPorta() + "\nCliente:    " + ftpModel.getCliente() + "\nMuda Senha: ".concat(ftpModel.getTrocaSenha()== 1? "Sim":"Não").concat("\n\n-----------------------------------------------------");                    
                    f.copiar(dados);
                    JOptionPane.showMessageDialog(this, "Dados copiados com sucesso!","Cópia",JOptionPane.INFORMATION_MESSAGE);
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(this, "Problema ao copiar dados! " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }                
            }
        }
    }//GEN-LAST:event_tabela_ftpMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        if(!(txtPorta.getText().isEmpty())&& !(txtCliente.getText().isEmpty()) && !(txtEndereco.getText().isEmpty())){
            gravarFtp();
        }else{
            JOptionPane.showMessageDialog(this, "Todos os campos precisam estar preenchido","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        txtBusca.setText("");        
        txtEndereco.grabFocus();
        txtPorta.setEditable(true);
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        AjudaView ajuda = new AjudaView(this, rootPaneCheckingEnabled, f.textoAjuda("FTP"));
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
            java.util.logging.Logger.getLogger(GerenciadorFTPView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFTPView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFTPView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFTPView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciadorFTPView().setVisible(true);
        });
    }
    
    
    private void gravarFtp(){
        try {
            ftpModel.setServidor(txtServidor.getText());
            ftpModel.setEndereco(txtEndereco.getText());
            ftpModel.setUsuario(txtUsuario.getText());
            ftpModel.setSenha(txtSenha.getText());
            ftpModel.setPorta(Integer.parseInt(txtPorta.getText()));
            ftpModel.setCliente(txtCliente.getText());
            if(jrbtnSim.isSelected()){
                ftpModel.setTrocaSenha(1);
            }else{
                ftpModel.setTrocaSenha(0);
            }            
            boolean validaInsercao = cController.inserirFtp(ftpModel);
            if(validaInsercao){
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao realiza cadastro","Aviso",JOptionPane.ERROR_MESSAGE);
            }
            listarFtps();
            limpar();            
        } catch (HeadlessException e) {
            System.out.println("Erro insert: " + e.getMessage());
        }finally{            
            txtServidor.grabFocus();
        }                
    }
    
    private void excluirFtp(){
        try {
            int cod = listaFtps.get(tabela_ftp.getSelectedRow()).getCodigo();            
            if(cController.excluirFtp(cod)){
                JOptionPane.showMessageDialog(this, "Registro excluído com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(this, "Não foi possível excluir o registro","Aviso",JOptionPane.ERROR_MESSAGE); 
            }
            listarFtps();
            limpar();
        } catch (HeadlessException e) {
            System.out.println("Erro exclusão: " + e.getMessage());
        }            
    }
    
    private void limpar(){
        txtServidor.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtEndereco.setText("");
        txtPorta.setText("");
        txtCliente.setText("");
        jrbtnSim.setSelected(true);
        txtServidor.grabFocus();        
    }
    
    
    public void configurarTabela(){
        tabela_ftp.getColumnModel().getColumn(0).setPreferredWidth(75);
        tabela_ftp.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabela_ftp.getColumnModel().getColumn(2).setPreferredWidth(350);
        tabela_ftp.getColumnModel().getColumn(3).setPreferredWidth(135);
        tabela_ftp.getColumnModel().getColumn(4).setPreferredWidth(135);
        tabela_ftp.getColumnModel().getColumn(5).setPreferredWidth(65);
        tabela_ftp.getColumnModel().getColumn(6).setPreferredWidth(200);
        tabela_ftp.getColumnModel().getColumn(7).setPreferredWidth(115);
        tabela_ftp.getColumnModel().getColumn(8).setPreferredWidth(83);
    }
    
    
    public void listarFtps(){
        ftpTableModel.limpar();
        listaFtps = cController.verificarFtp();
        ftpTableModel.addListaFtps(listaFtps);
        if(listaFtps.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaFtps.size() + " registros");
        }
    }
    
    public void listarFtpsNome(String nome){
        ftpTableModel.limpar();
        listaFtps = cController.verificarFtpNome(nome);
        ftpTableModel.addListaFtps(listaFtps);
        if(listaFtps.isEmpty()){
            lblQtdRegistros.setText("0 registros");
        }else{
            lblQtdRegistros.setText(listaFtps.size() + " registros");
        }
    }    
            
    private void carregarConfiguracao(){
        configModel = confController.validarConfig();        
        if((configModel.getTema().contains("FlatLight")) || (configModel.getTema().contains("Metal")) || (configModel.getTema().contains("FlatIntelliJ"))){
            lblPorta.setForeground(Color.black);
            lblCliente.setForeground(Color.black);
            lblEndereco.setForeground(Color.black);
            lblUsuario.setForeground(Color.black);
            lblQtdRegistros.setForeground(Color.black);
            lblSenha.setForeground(Color.black);
            lblServidor.setForeground(Color.black);
            lblTrocaSenha.setForeground(Color.black);
            jrbtnSim.setForeground(Color.black);
            jrbtnNao.setForeground(Color.black);
            //panelServers.getBorder().
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.black));
        }else{
            panelServers.setForeground(Color.white);
            lblPorta.setForeground(Color.white);
            lblCliente.setForeground(Color.white);
            lblEndereco.setForeground(Color.white);
            lblUsuario.setForeground(Color.white);
            lblQtdRegistros.setForeground(Color.white);
            lblSenha.setForeground(Color.white);
            lblServidor.setForeground(Color.white);
            lblTrocaSenha.setForeground(Color.white);
            jrbtnSim.setForeground(Color.white);
            jrbtnNao.setForeground(Color.white);
            panelServers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), Color.white));
        }
        listarFtps();
        //this.panelEstati.updateUI();
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCopiar;
    private javax.swing.ButtonGroup grupoTrocaSenha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbtnNao;
    private javax.swing.JRadioButton jrbtnSim;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblPorta;
    private javax.swing.JLabel lblQtdRegistros;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JLabel lblTrocaSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menuAjuda;
    private javax.swing.JMenuBar menuPrncipal;
    private javax.swing.JMenu menuPrncipalArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JPanel panelDadosFtp;
    private javax.swing.JDesktopPane panelServers;
    private javax.swing.JTable tabela_ftp;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
