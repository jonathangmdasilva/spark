package controlador;

import dao.ConexaoDao;
import dao.DataBaseDao;
import dao.FtpDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.core.ConexaoModel;
import model.core.DataBaseModel;
import model.core.FtpModel;

/* 
 * @author Jonathan
 */

public class ConexoesController {
    private Logs log = new Logs();
    
    public boolean inserirConexao(ConexaoModel cm){
        try {
            ConexaoDao cd = new ConexaoDao();
            cd.inserirConexao(cm);
            return true;
        } catch (Exception ex) {            
            return false;
        }        
    }
        
    public boolean excluirConexao(int cod){
        try {
            ConexaoDao cd = new ConexaoDao();
            cd.excluirConexao(cod);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            return false;
        }        
    }
        
    public List<ConexaoModel> verificarConexoes(){
        try{
            ConexaoDao cd = new ConexaoDao();
            return cd.verificarConexões();
        }catch(Exception e){
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
            System.out.println("Erro ao listar conexões: " + e.getMessage());
            return null;
        }               
    }    
    
    public List<ConexaoModel> verificarConexoesNome(String nome){
        try{
            ConexaoDao cd = new ConexaoDao();
            return cd.verificarConexõesNome(nome);
        }catch(Exception e){
            System.out.println("Erro ao listar conexões pelo nome: " + e.getMessage());
            return null;
        }               
    }        
    
    //FTP    
    public boolean inserirFtp(FtpModel fm){
        try {
            FtpDao fd = new FtpDao();
            fd.inserirFtp(fm);
            return true;
        } catch (Exception ex) {            
            return false;
        }        
    }
        
    public boolean excluirFtp(int cod){
        try {
            FtpDao fd = new FtpDao();
            fd.excluirFtp(cod);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            return false;
        }        
    }    
        
    public List<FtpModel> verificarFtp(){
        try{
            FtpDao fd = new FtpDao();
            return fd.verificarFTP();
        }catch(Exception e){
            System.out.println("Erro ao listar todos: " + e.getMessage());
            return null;
        }               
    }
    
    public List<FtpModel> verificarFtpNome(String nome){
        try{
            FtpDao fd = new FtpDao();
            return fd.verificarFtpNome(nome);
        }catch(Exception e){
            System.out.println("Erro ao listar ftps pelo nome: " + e.getMessage());
            return null;
        }               
    }                       
    
    //DATABASE 
    public boolean inserirDataBase(DataBaseModel dm){
        try {
            DataBaseDao dbDao = new DataBaseDao();
            dbDao.inserirDataBase(dm);
            return true;
        } catch (Exception ex) {            
            return false;
        }        
    }
        
    public boolean excluirDataBase(int cod){
        try {
            DataBaseDao dbDao = new DataBaseDao();
            dbDao.excluirDataBase(cod);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            return false;
        }        
    }    
        
    public List<DataBaseModel> verificarDataBase(){
        try{
            DataBaseDao dbDao = new DataBaseDao();
            return dbDao.verificarDataBase();
        }catch(Exception e){
            System.out.println("Erro ao listar todas databases: " + e.getMessage());
            return null;
        }               
    }
    
    public List<DataBaseModel> verificarDataBaseDescricao(String descricao){
        try{
            DataBaseDao dbDao = new DataBaseDao();
            return dbDao.verificarDataBaseDescricao(descricao);
        }catch(Exception e){
            System.out.println("Erro ao listar databases pela descricao: " + e.getMessage());
            return null;
        }               
    }        
}
