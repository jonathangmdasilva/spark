package controlador;


import java.io.*;
import javax.swing.JOptionPane;

public class CommandsUpdate {
    static final Runtime run = Runtime.getRuntime();
    static Process pro;
    static BufferedReader read;

    public static void executar(){
        String[] cmds = {
            "winget upgrade",
            "winget upgrade --all",
            "echo 4"
        };
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd", "/c",
                String.join("& ", cmds));

            builder.redirectErrorStream(true);

            Process p = builder.start();

            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;

            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }

                System.out.println(line);
            }
            JOptionPane.showMessageDialog(null, "Atualização sendo realizada com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar softwares: " + e,"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void executarComando(String comando){
        try{
            Runtime.getRuntime().exec(comando);            
        }catch(IOException e){   
            JOptionPane.showMessageDialog(null,"Erro." + e,"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void executarProcesso(String comando){
        try{
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec("cmd start /c " + comando);
        }catch(IOException e){   
            JOptionPane.showMessageDialog(null,"Erro." + e,"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
