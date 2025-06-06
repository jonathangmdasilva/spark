package controlador;

import dao.ConfiguracaoDao;
import dao.DataBaseDao;
import dao.GamerDao;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.core.ConfiguracaoModel;
import model.core.DataBaseModel;
import model.core.ParametroModel;
import model.gamer.RankModel;

/*
 * @author jsilva
 */

public class ConfiguracaoController {
    
    private Logs log = new Logs();
 
    public boolean inserirConfiguracao(ConfiguracaoModel cm){
        try {
            ConfiguracaoDao cd = new ConfiguracaoDao();
            cd.inserirConfig(cm);            
            return true;
        } catch (Exception ex) {            
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar configuração: " + ex.getMessage());
            return false;
        }        
    }
    
    public ConfiguracaoModel validarConfig(){
        ConfiguracaoModel cm = new ConfiguracaoModel();
        try {
            ConfiguracaoDao cd = new ConfiguracaoDao();
            return cd.verificarConfiguracao();       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar configuração: " + e.getMessage());
            return null;
        }
    }
        
    public void atualizarConfig(ConfiguracaoModel config){
        try {
            ConfiguracaoDao cd = new ConfiguracaoDao();
            cd.atualizarConfig(config);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar configuraçã do sistema: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public boolean validarSerial(String loginCript,String serial) throws SQLException, Exception{
        List<String> seriais = new ArrayList<>();
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        seriais =  confDao.listarValidaSerial(loginCript);
        for (String ser : seriais) {
            if(serial.equals(ser)) return true;
        }                
        return false;
    }
    
    public String consultarLoginUsuario(){
        try {
            ConfiguracaoDao confDao = new ConfiguracaoDao();
            return confDao.consultarLoginUsuario();
        } catch (Exception e) {
            System.out.println("Erro consultarLoginUsuario()" + e.getMessage());
            return "";
        }        
    } 
    
    public boolean atualizarSerialConfig(String serial) throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        return confDao.atualizarSerialConfig(serial);
    }
    
    public String validadeDataAtualizacaoSerial() throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        return confDao.validadeDataAtualizacaoSerial();
    }
    
    public String serialConfig() throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        return confDao.serialConfig();
    }
    
    public String validaSenhaGeradorSenhaSpark() throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        return confDao.validaSenhaGeradorSenhaSpark();
    }
                
    public int validaPeso(String periodo) throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        return confDao.validaPeso(periodo);
    }
       
    public boolean validadeDataAtualizacaoSerial(int peso) throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        String dataAtualizacao = confDao.validadeDataAtualizacaoSerial();        
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dataAtualizacao);
        Calendar cal = Calendar.getInstance();
        Calendar dataAtual = Calendar.getInstance();        
        cal.setTime(d);
        if(peso ==0) peso = 1200;
        cal.add(Calendar.MONTH, peso);
        cal.add(Calendar.DAY_OF_YEAR, 1);        
        if (cal.after(dataAtual)){
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"Serial Expirado ou inválido " , "Aviso",JOptionPane.WARNING_MESSAGE);            
            return false;
        }        
    }
    
    public int verificarMonitoramentoAutomaticoMesser(){         
        int opMonit = 0;
        try {
            ConfiguracaoDao confDao = new ConfiguracaoDao();
            opMonit = confDao.verificarMonitoramentoAutomatico();            
        } catch (SQLException e) {
            System.out.println(" Erro verificarMonitoramentoAutomaticoMesser()");
        }finally{
            return opMonit;
        }
    }
    
    public Integer verificarMonitoramentoAutomaticoMesserTempo(){         
        int tempo = 0;
        try {
            ConfiguracaoDao confDao = new ConfiguracaoDao();
            tempo = confDao.verificarMonitoramentoAutomaticoTempo();
        } catch (SQLException e) {
            System.out.println("EROOOOOOOO verificarMonitoramentoAutomaticoMesserTempo()");
        }finally{
            return tempo;
        }
    }    
        
    public boolean atualizarMonit(int automatico, String tempo) throws SQLException, Exception{
        ConfiguracaoDao confDao = new ConfiguracaoDao();
        return confDao.atualizarMonit(automatico, tempo);
    }
        
    public boolean validarSerialSenha(String senha){
        try {
            String senhaLocal = "";                                
            ConfiguracaoDao confDao = new ConfiguracaoDao();
            senhaLocal = confDao.validaSenhaGeradorSenhaSpark();           
            if(Funcoes.criptMD5(senha).equals(senhaLocal)){
                return true;
            }else{
                return false;
            }                        
        } catch (Exception e){
            return false;
        }
    }
    
    
    //PARAMETRIZAÇÃO    
    public List<String> listarIdParametros(){
        try{
            ConfiguracaoDao cDao = new ConfiguracaoDao();
            return cDao.listarIdParametros();
        }catch(Exception e){
            System.out.println("Erro ao listar parametros: " + e.getMessage());
            return null;
        }               
    }
    

        
    public List<ParametroModel> listarParametros(){
        try{
            ConfiguracaoDao cDao = new ConfiguracaoDao();
            return cDao.listarParametros();
        }catch(Exception e){
            System.out.println("Erro ao listar parametros: " + e.getMessage());
            return null;
        }               
    }
    
    public List<ParametroModel> listarParametrosDescri(String desc){
        try{
            ConfiguracaoDao cDao = new ConfiguracaoDao();
            return cDao.listarParametrosDescri(desc);
        }catch(Exception e){
            System.out.println("Erro ao listar parametros: " + e.getMessage());
            return null;
        }               
    }
    
    public boolean excluirParametro(int cod){
        try {
            ConfiguracaoDao confDao = new ConfiguracaoDao();
            confDao.excluirParametro(cod);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            return false;
        }        
    }
    
    
    
    public boolean inserirParametro(ParametroModel pm){
        try {
            ConfiguracaoDao cd = new ConfiguracaoDao();
            cd.inserirParametro(pm);            
            return true;
        } catch (Exception ex) {            
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar parametro: " + ex.getMessage());
            return false;
        }        
    }
    
    
    //GAMER ZONE
    public List<RankModel> verificarClassificaoGeral(DataBaseModel base){
        try{
            GamerDao gd = new GamerDao(base);
            return gd.verificarClassificaoGeral();
        }catch(Exception e){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("Erro ao listar classificação Geral: " + e.getMessage() + "\n\n-->" + this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            JOptionPane.showMessageDialog(null,"Erro ao listar classificação Geral: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            return null;
        }               
    }
    
    public List<RankModel> verificarClassificaoUsuários(String apelido,DataBaseModel base){
        try{
            GamerDao gd = new GamerDao(base);
            return gd.verificarClassificaoUsuários(apelido);
        }catch(Exception e){
            System.out.println("Erro ao listar todos: " + e.getMessage());
            return null;
        }               
    }
    
    
    public DataBaseModel verificarDataBaseRank(String parametro){
        try{
            DataBaseDao dbDao = new DataBaseDao();
            return dbDao.verificarDataBaseRank(parametro);
        }catch(Exception e){
            System.out.println("Erro ao listar base: " + e.getMessage());
            return null;
        }               
    } 
    
    
    public boolean associarServidorBase(String xIdParametro, String descParametro){
        try {
            ConfiguracaoDao cDao = new ConfiguracaoDao();
            cDao.associarServidorBase(xIdParametro, descParametro);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao associar: " + ex.getMessage());
            return false;
        }        
    }
}
