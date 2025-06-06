package controlador;

import dao.KeyDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.core.KeyModel;

/* 
 * @author Jonathan
 */

public class KeyController {
    
    public boolean inserirSerial(KeyModel km){
        try {
            KeyDao kd = new KeyDao();
            kd.inserirKey(km);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex.getMessage());
            return false;
        }        
    }
    
    
    public boolean excluirSerial(Integer cod){
        try {
            KeyDao kd = new KeyDao();
            kd.excluirKey(cod);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            return false;
        }        
    }
    
    
    public List<KeyModel> listarTodasKeys(){
        try{
            KeyDao keyDao = new KeyDao();        
            return keyDao.consultarTodos();
        }catch(Exception e){
            System.out.println("Erro ao listar todos: " + e.getMessage());
            return null;
        }               
    }
    
    
    public List<KeyModel> listarTodasKeysNome(String nome){
        try{
            KeyDao keyDao = new KeyDao();        
            return keyDao.consultarTodosNome(nome);
        }catch(Exception e){
            System.out.println("Erro ao listar todos: " + e.getMessage());
            return null;
        }               
    }
    
}
