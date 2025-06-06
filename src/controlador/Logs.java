package controlador;

//import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * @author Jonathan
 */

public class Logs {    
    
    public void gerarLogs(Exception e,String metodo){
        // Verifica se o arquivo não existe
        File file = new File("Logs"); 
        file.mkdir();
        GregorianCalendar calendar = new GregorianCalendar();
        String dataAtual = calendar.get(GregorianCalendar.DAY_OF_MONTH) + "-" + calendar.get(GregorianCalendar.MONTH)+1 + "-" + calendar.get(GregorianCalendar.YEAR);
        String caminho = new File("").getAbsolutePath()+ "/Logs/log "+ dataAtual + ".txt";                
        Calendar c = Calendar.getInstance(); //retorna um calendar com a hora do sistema        
        String data = calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.MONTH)+1 + "/" + calendar.get(GregorianCalendar.YEAR) + "  " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) +":"+ c.get(Calendar.SECOND);
        try {            
            FileWriter fileWriter = new FileWriter (caminho, true);
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            
            String formatLog = data +  " -->: \t\t" + metodo +"\t\t\t" + e.getMessage() + "\n"+ sw.toString() + "\n\n";
            fileWriter.write(formatLog);
            fileWriter.close();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null,"Erro ao gerar Logs " + e.getMessage()+"\n\n\nPor gentileza, verifique os arquivos de logs. Se deseja maiores detalhes.");
        }
        
    }

}
