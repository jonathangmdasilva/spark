package backup;

import controlador.Funcoes;
import controlador.Logs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * @author Jonathan
 */
public class Backup {
    Funcoes f = new Funcoes();
    Logs log = new Logs();
    
    /*
    * REALIZAR BEACKUP USANDO O MYSQL 6
        
    JFileChooser salvarArquivo = new JFileChooser();
    
    public void relizarBackup(){
    // Botão Backup
        try{
            String arquivo = "";
            salvarArquivo.setVisible(true);                        
            int result = salvarArquivo.showSaveDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                arquivo = salvarArquivo.getSelectedFile().toString().concat(".sql");
                File file = new File(arquivo); 
                if(file.exists()){
                    Object[] options = { "Sim", "Não" };
                    int opcao = JOptionPane.showOptionDialog(null,"Este arquivo já existe. Quer sobreescrever este arquivo?", "Atenção!!!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,options, options[0]);
                    if (opcao == JOptionPane.YES_OPTION) {                                                
                        String caminho = "C:\\Program Files\\MySQL\\MySQL Workbench 8.0 CE\\mysqldump.exe";
                        ProcessBuilder pb = new ProcessBuilder(caminho, "--user=root","--password=root", "BD_VISION_LB", "--result-file=" + arquivo);
                        pb.start();                      
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Opção YES!", 1);
                    }else{
                        JOptionPane.showMessageDialog(null, "Backup não realizado!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                }else{                    
                    String caminho = "C:\\Program Files\\MySQL\\MySQL Workbench 8.0 CE\\mysqldump.exe";
                    ProcessBuilder pb = new ProcessBuilder(caminho, "--user=root","--password=root", "BD_VISION_LB", "--result-file=" + arquivo);
                    pb.start();
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Opção Não!", 1);   
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null,"Erro ao gerar Backup!:\n" + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        }
    }            
    */
    
    /*
    *REALIZAR BACKUP USANDO O SQL LITE (ZIPPANDO O ARQUIVO)
    */
    
    JFileChooser salvarArquivo = new JFileChooser();
    JFileChooser abrirArquivo = new JFileChooser();
    
    public void compactar(File file) {
        try {
            String arquivo = "";
            salvarArquivo.setVisible(true);
            int result = salvarArquivo.showSaveDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                String data = " (" + f.recuperarDataHoraAtual() + ")";
                data = data.replaceAll(":", " ");
                data = data.replaceAll("/", "-");
                arquivo = salvarArquivo.getSelectedFile() + data.concat(".zip");
                File arquivoSaida = new File(arquivo);
                if(!arquivoSaida.exists()){
                    byte[] buffer = new byte[2048];
                    try {                        
                        FileOutputStream fos = new FileOutputStream(arquivoSaida);
                        // Zip de saida
                        ZipOutputStream zos = new ZipOutputStream(fos);

                        // Arquivo a ser zipado
                        ZipEntry ze = new ZipEntry(file.getName());                        
                        System.out.println("zipando...: " + file.getName());
                        System.out.println("em: " + file.getAbsolutePath());
                        // Adciona arquivo no Zip de saida
                        zos.putNextEntry(ze);
                        // Ler o Arquivo que sera Zipado                        
                        FileInputStream in = new FileInputStream(file.getAbsolutePath());                       
                        int len;
                        while ((len = in.read(buffer)) > 0) {
                            zos.write(buffer, 0, len);
                        }

                        // Fecha Arquivos
                        in.close();

                        // Fecha Zip e entrada
                        zos.closeEntry();
                        zos.close();
                        System.out.println("Compactado com sucesso");
                    } catch (IOException ex) {
                        System.out.println("Erro ao compactar: " +ex.getMessage());                                                                        
                        log.gerarLogs(ex, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
                    }               
                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Opção YES!", 1);                    
                }else{
                    JOptionPane.showMessageDialog(null, "Já existe um arquivo com o nome informado!");
                }
            }
        } catch (Exception e) {
            log.gerarLogs(e, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()"); //AQUIIIII
        }
        

    }

    public void descompactar(File file) {
        String arquivo;
        salvarArquivo.setVisible(true);                        
        int result = salvarArquivo.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            arquivo = abrirArquivo.getSelectedFile().toString();            
            File arquivoEntrada = new File(arquivo); 
            byte[] buffer = new byte[1024];
            try {

                // Cria o input do arquivo ZIP
                ZipInputStream zinstream = new ZipInputStream(new FileInputStream(arquivoEntrada));

                // Pega a proxima entrada do arquivo
                ZipEntry zentry = zinstream.getNextEntry();
                // Enquanto existir entradas no ZIP
                while (zentry != null) {
                    // Pega o nome da entrada
                    String entryName = zentry.getName();
                    // Cria o output do arquivo , Sera extraido onde esta rodando a classe
                    FileOutputStream outstream = new FileOutputStream(new File(file.getAbsolutePath().replace(file.getName(), entryName)));
                    int n;
                    // Escreve no arquivo
                    while ((n = zinstream.read(buffer)) > -1) {
                        outstream.write(buffer, 0, n);
                    }
                    // Fecha arquivo
                    outstream.close();

                    // Fecha entrada e tenta pegar a proxima
                    zinstream.closeEntry();
                    zentry = zinstream.getNextEntry();
                }
                // Fecha o zip como um todo
                zinstream.close();
            } catch (IOException ex) {
                log.gerarLogs(ex, this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "()"); //AQUIIIII
                JOptionPane.showMessageDialog(null, "Erro ao recuperar arquivo de backup! " + ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }
        }                   
    }    
    
}