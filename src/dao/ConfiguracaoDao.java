package dao;

import banco.ConexaoSqlLite;
import controlador.Logs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;
import model.core.ParametroModel;


public class ConfiguracaoDao {
    
    private final Connection c;
    Logs log = new Logs();
    
    public ConfiguracaoDao() throws SQLException, ClassNotFoundException, Exception{
        this.c = new ConexaoSqlLite().getConnection();
    }
    
    public void inserirConfig(ConfiguracaoModel cm) throws SQLException {        
        String sql = "INSERT INTO TB_CONFIG(asset,formatador,senhas,lookFeel,processos,modoTela,userSys,userHier,serialSys,dataCadSys,dataAtualizacaoSys) VALUES (?,?,?,?,0,?,?,'standard',?,strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'),strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'));";
        // seta os valores
        try (
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,cm.getAsset());
            stmt.setInt(2,cm.getFormatador());
            stmt.setInt(3,cm.getSenhas());                        
            stmt.setString(4,cm.getTema());
            stmt.setInt(5,cm.getModoTela());
            stmt.setString(6,cm.getUsuario());
            stmt.setString(7,cm.getSerial());
            // executa
            stmt.execute();            
            stmt.close();
        }catch(Exception e){
            System.out.println("Erro ao inserir Configuração: " + e.getMessage());
        }                
    }
    
    public ConfiguracaoModel verificarConfiguracao(){
        ConfiguracaoModel conf = new ConfiguracaoModel();
        String sql = "SELECT *FROM TB_CONFIG WHERE codigoConfig = 1;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {
                //ConfiguracaoModel cm = new ConfiguracaoModel();                
                conf.setCodigo(rs.getInt(1));
                conf.setAsset(rs.getInt(2));
                conf.setFormatador(rs.getInt(3));                
                conf.setSenhas(rs.getInt(4));                                
                conf.setTema(rs.getString(5));
                conf.setProcesso(rs.getInt(6));
                conf.setModoTela(rs.getInt(7));
                conf.setUsuario(rs.getString(8));
                conf.setHierarquia(rs.getString(9));
                conf.setSerial(rs.getString(10));
                conf.setDataCadastro(rs.getString(11));
                conf.setDataAtualizacao(rs.getString(12));
            }
            stmt.close();  
            rs.close();
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR CONFIGURAÇÕES: " + ex.getMessage());
            System.exit(0);
        }finally{            
            return conf;            
        }
    }
    
    public void atualizarConfig(ConfiguracaoModel config) {
        String sql = "UPDATE TB_CONFIG SET modoTela = ?,lookFeel = ? WHERE codigoConfig = 1";
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores            
            stmt.setInt(1,config.getModoTela());
            stmt.setString(2,config.getTema());
            // executa
            stmt.execute();                        
            stmt.close();
        }catch(Exception e ){
            System.out.println("ERRO AO ATUALIZAR CONFIGURAÇÃO DE MODO TELA! " + e.getMessage());            
        }
    }
        
    public List<String> listarValidaSerial(String loginCript) {
        List<String> seriais = new ArrayList<>();
        String sql = "SELECT seq FROM TB_DPS";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {                                 
                seriais.add(loginCript + "@" + rs.getString(1));
            }
            stmt.close();  
            rs.close();            
        } catch (SQLException ex) {                
            System.out.println("ERRO AO LISTAR VALIDAÇÃO DO SERIAL: " + ex.getMessage());            
        }finally{
            return seriais;
        }
    }
    
    public String consultarLoginUsuario() throws SQLException{        
        String cnpj = "";
        String sql = "SELECT userSys FROM TB_CONFIG WHERE codigoConfig =1";
        // seta os valores
        try ( 
           PreparedStatement stmt = this.c.prepareStatement(sql)) {           
            // executa
            ResultSet rs = stmt.executeQuery();            
            while (rs.next()) {                
                cnpj = (rs.getString(1));                
            }
            rs.close();
            stmt.close();
        }
        return cnpj;
    }
    
    public boolean atualizarSerialConfig(String s){
        String sql = "";
        if(s.substring(s.length()-1,s.length()).equals("s")){
            sql = "UPDATE TB_CONFIG SET serialSys = ?,processos = 0,userHier = 'standard' ,dataAtualizacaoSys = strftime ('%d/%m/%Y - %H:%M:%S',DATETIME('NOW', 'localtime'));";
        }else if(s.substring(s.length()-1,s.length()).equals("c")){
            sql = "UPDATE TB_CONFIG SET serialSys = ?,processos = 1,userHier = 'complete' ,dataAtualizacaoSys = strftime ('%d/%m/%Y - %H:%M:%S',DATETIME('NOW', 'localtime'));";
        }else if(s.substring(s.length()-1,s.length()).equals("m")){
            sql = "UPDATE TB_CONFIG SET serialSys = ?,processos = 1,userHier = 'master' ,dataAtualizacaoSys = strftime ('%d/%m/%Y - %H:%M:%S',DATETIME('NOW', 'localtime'));";
        }
        // seta os valores
        
        try ( 
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1, s);
            // executa
            stmt.execute();
            stmt.close();
            return true;
        }catch(Exception e ){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public String validadeDataAtualizacaoSerial() throws SQLException{
        String dataAtualizacao = "";
        String sql = "SELECT dataAtualizacaoSys FROM TB_CONFIG";
        // seta os valores
        try ( 
           PreparedStatement stmt = this.c.prepareStatement(sql)){            
            // executa
            ResultSet rs = stmt.executeQuery();            
            while (rs.next()) {                
                dataAtualizacao = (rs.getString(1));
            }
            rs.close();
            stmt.close();
        }
        return dataAtualizacao;
    }
    
    
    public String serialConfig() throws SQLException{        
        String serial = "";
        String sql = "SELECT serialSys FROM TB_CONFIG";
        // seta os valores
        try ( 
           PreparedStatement stmt = this.c.prepareStatement(sql)) {           
            // executa
            ResultSet rs = stmt.executeQuery();            
            while (rs.next()) {
                serial = (rs.getString(1));                
            }
            rs.close();
            stmt.close();
        }
        return serial;
    }
    
    public int validaPeso(String periodo) throws SQLException{        
        int peso = 0;
        String sql = "SELECT pesoSeq FROM TB_DPS WHERE seq = ?";
        // seta os valores
        try ( 
           PreparedStatement stmt = this.c.prepareStatement(sql)){
            stmt.setString(1,periodo);
            // executa
            ResultSet rs = stmt.executeQuery();            
            while (rs.next()) {                
                peso = (rs.getInt(1));                
            }
            rs.close();
            stmt.close();                        
        }
        return peso;
    }
    
    
    public int verificarMonitoramentoAutomatico()throws SQLException{
        int tipo = 0;
        String sql = "SELECT 1 FROM TB_PARAMETROS WHERE xIdParametro = 'MONITORAMENTO' AND descParametro = 'MONITORAMENTO_AUTOMATICO' AND ativoParametro = 1;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {                
                tipo = rs.getInt(1);                
            }
            stmt.close();  
            rs.close();
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR CONFIGURAÇÕES DO MONITORAMNTO: " + ex.getMessage());
            System.exit(0);
        }finally{            
            return tipo;
        }
    }

    public Integer verificarMonitoramentoAutomaticoTempo()throws SQLException{
        int tempo = 0;
        String sql = "SELECT descParametro FROM TB_PARAMETROS WHERE xIdParametro = 'MONITORAMENTO_AUT_TEMPO' AND ativoParametro = 1;";
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {                
                tempo = rs.getInt(1);                
            }
            stmt.close();  
            rs.close();
        } catch (SQLException ex) {                
            System.out.println("ERRO AO CONSULTAR CONFIGURAÇÕES DO MONITORAMNTO(TEMPO): " + ex.getMessage());
            System.exit(0);
        }finally{
            return tempo;
        }
    }    
        
    public boolean atualizarMonit(int automatico, String tempo) {
        String sql = "";
        if(automatico == 0){
            sql = "UPDATE TB_PARAMETROS SET ativoParametro = 0, atualizacaoParametro = strftime ('%d/%m/%Y - %H:%M:%S',DATETIME('NOW', 'localtime')) WHERE xIdParametro IN ('MONITORAMENTO_AUT_TEMPO','MONITORAMENTO')";
        }else if (automatico == 1){
            ativarMonitAutomatico();
           sql = "UPDATE TB_PARAMETROS SET descParametro = ? WHERE xIdParametro = 'MONITORAMENTO_AUT_TEMPO';";
            
        }        
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores             
            if (automatico == 1) stmt.setString(1,tempo);            
            // executa
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            System.out.println("ERRO AO ATUALIZAR CONFIGURAÇÃO DE MONITORAMENTO MESSER! " + e.getMessage());   
            return false;
        }                        
    }
    
    public boolean ativarMonitAutomatico(){
        String sql = "UPDATE TB_PARAMETROS SET ativoParametro = 1, atualizacaoParametro = strftime ('%d/%m/%Y - %H:%M:%S',DATETIME('NOW', 'localtime')) WHERE xIdParametro IN ('MONITORAMENTO_AUT_TEMPO','MONITORAMENTO')";        
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores                         
            // executa
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            System.out.println("ERRO AO ATIVAR CONFIGURAÇÃO AUTOMÁTICA DE MONITORAMENTO MESSER! " + e.getMessage());               
            return false;
        }                        
    }
            
    public String validaSenhaGeradorSenhaSpark() throws SQLException{        
        String senha = "";
        String sql = "SELECT descParametro FROM TB_PARAMETROS WHERE xIdParametro = 'VALIDA_SENHA_SERIAL' AND ativoParametro = '1'";
        // seta os valores
        try ( 
           PreparedStatement stmt = this.c.prepareStatement(sql)) {           
            // executa
            ResultSet rs = stmt.executeQuery();            
            while (rs.next()) {
                senha = (rs.getString(1));                
            }
            rs.close();
            stmt.close();
        }
        return senha;
    }
    
    
    public List<String> listarIdParametros(){
        List<String> parametros = new ArrayList<>();
        String sql = "SELECT DISTINCT xIdParametro FROM TB_PARAMETROS WHERE ativoParametro = 1";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {                                 
                parametros.add(rs.getString(1));
            }
            stmt.close();  
            rs.close();            
        } catch (SQLException ex) {                
            System.out.println("ERRO AO LISTAR PARAMETROS DA BASE: " + ex.getMessage());            
        }finally{
            return parametros;
        }
    }

    public boolean associarServidorBase(String xIdParametro, String descParametro){
        String sql = "UPDATE TB_PARAMETROS SET descParametro = ?, atualizacaoParametro = strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours') WHERE xIdParametro = ? AND ativoParametro = 1";
        try (
            PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,descParametro);
            stmt.setString(2,xIdParametro);
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            JOptionPane.showMessageDialog(null, "ERRO AO REALIZAR ASSOCIAÇÃO DE BASE A TABELA DE RANKS ! " + e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);            
            return false;
        }
    }
    
    
    public void inserirParametro(ParametroModel pm) throws SQLException{
        String sql = "INSERT INTO TB_PARAMETROS(xIdParametro,descParametro,atualizacaoParametro,ativoParametro) VALUES (?,?,strftime ('%d/%m/%Y - %H:%M:%S','now','-3 hours'),1);";
        // seta os valores
        try (
            // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,pm.getxIdParametro());
            stmt.setString(2,pm.getDescricao());
            // executa
            stmt.execute();            
            stmt.close();            
        }catch(Exception e){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            c.close();
            JOptionPane.showMessageDialog(null, "ERRO AO REALIZAR CADASTRO DE PARAMETROS! " + e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
        }                
    }
    
    
    public List<ParametroModel> listarParametros(){
        List<ParametroModel> listaParametros = new ArrayList<>();
        String sql = "SELECT DISTINCT codigoParametro,xIdParametro,descParametro,atualizacaoParametro FROM TB_PARAMETROS WHERE ativoParametro = 1";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {
                ParametroModel p = new ParametroModel();
                p.setCodigo(rs.getInt(1));
                p.setxIdParametro(rs.getString(2));
                p.setDescricao(rs.getString(3));
                p.setAtualizacao(rs.getString(4));                
                listaParametros.add(p);
            }
            stmt.close();  
            rs.close();
        } catch (SQLException e) {
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            c.close();
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR PARAMETROS! " + e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
        }finally{
            return listaParametros;
        }
    }
    
    public List<ParametroModel> listarParametrosDescri(String descricao){
        List<ParametroModel> listaParametros = new ArrayList<>();
        String sql = "SELECT DISTINCT codigoParametro,xIdParametro,descParametro,atualizacaoParametro FROM TB_PARAMETROS WHERE 1=1 AND (ativoParametro = 1 AND xIdParametro LIKE ?) OR (ativoParametro = 1 AND descParametro LIKE ?) ;";
        // seta os valores
        try ( 
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + descricao + "%");
            stmt.setString(2,"%" + descricao + "%");
            ResultSet rs = stmt.executeQuery();                            
            while (rs.next()) {
                ParametroModel p = new ParametroModel();
                p.setCodigo(rs.getInt(1));
                p.setxIdParametro(rs.getString(2));
                p.setDescricao(rs.getString(3));
                p.setAtualizacao(rs.getString(4));                
                listaParametros.add(p);
            }
            stmt.close();  
            rs.close();
        } catch (SQLException e) {
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            c.close();
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR PARAMETROS! " + e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
        }finally{
            return listaParametros;
        }
    }
        
    
    public boolean excluirParametro(int cod) {
        String sql = "UPDATE TB_PARAMETROS SET ativoParametro = 0 WHERE ativoParametro = 1 AND codigoParametro = ?";
        try (
            PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,cod);
            stmt.execute();                        
            stmt.close();
            return true;
        }catch(Exception e ){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("ERRO AO INATIVAR PARAMETRO! " + e.getMessage());            
            return false;
        }
    }
    
}