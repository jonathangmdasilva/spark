package controlador;

import com.opencsv.CSVWriter;
import java.awt.Component;
import java.util.List;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * @author Jonathan
 */

public class Funcoes {
    
    public Integer contagem = null;
    public String principal = "";        
    
    //método para efetuar limpeza de campos
    public void limpar(JPanel panel){        
        Component components[] = panel.getComponents();        
        for (Component component : components) {
            //Textfield
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");                
            }
            //ComboBox
            if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(0);
            }
            //PassWordField
            if (component instanceof JPasswordField) {
                ((JPasswordField) component).setText("");
            }
            //RadioButtons
            if (component instanceof JRadioButton) {
                ((JRadioButton) component).setSelected(false);
            }
            //TextArea            
            if(component instanceof JTextArea){  
                ((JTextArea) component).setText("");                      
            } 
        }
    }
    
    //Método para concatenar arquivos        
    public String formatar(String texto){
        contagem =0;     
        try {            
            StringTokenizer st = new StringTokenizer(texto,"\n") ;            
            while (st.hasMoreTokens()) {
                String line = "'" + st.nextToken() + "',";                        
                principal = principal.concat(line);
                contagem++;
            }             
            principal = principal.substring(0,principal.length() - 1);        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao formatar! " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);            
        }
        principal =  principal.replaceAll(" ", "");
        principal = "(" + principal + ")";
        return principal;
    }
    
    /*
    *Método responsável por gerar uma lista a partir de uma String
    *coletada de um JTextArea
    */
    public List<String> gerarListaPesquisa(String texto){
        contagem =0;
        List <String> lista = new ArrayList<>();
        try {
            StringTokenizer st = new StringTokenizer(texto,"\n") ;            
            while (st.hasMoreTokens()) {
                String line = st.nextToken();                        
                lista.add(line);                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao remover duplicidade!"+ e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);            
        }        
        //Collections.sort(lista);
        return lista;
    }
    
    public HashSet<String> gerarListaHash(String texto){
        contagem =0;
        HashSet<String> lista = new HashSet<>();
        try {            
            StringTokenizer st = new StringTokenizer(texto,"\n") ;            
            while (st.hasMoreTokens()) {
                String line = st.nextToken();                        
                lista.add(line);                
            }                                     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao remover duplicidade!","Erro",JOptionPane.ERROR_MESSAGE);            
        }        
        //Collections.sort(lista);
        return lista;
    }

    public List<String> gerarListaMediana(String texto){        
        List <String> lista = new ArrayList<>();
        DecimalFormat formatter = new DecimalFormat("#");
        try {
            StringTokenizer st = new StringTokenizer(texto,"\n") ;            
            while (st.hasMoreTokens()) {
                String line = st.nextToken();
                lista.add(""+ formatter.format(Float.parseFloat(line)));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Erro ao gerar lista da Mediana! \n" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);            
        }
        //Collections.sort(lista);
        return lista;
    }
      
    /*
    *Ordenar um JList
    */
    @SuppressWarnings("unchecked")
    public List<String> ordernarLista (List lista){    
        Collections.sort(lista); 
        return lista;                        
    }
      
    /*
    *Remover a duplicidade de uma lista
    */
    @SuppressWarnings("unchecked")
    public List<String> removerDuplicidade (List lista){
        List novaLista = new ArrayList(new HashSet(lista));
        Collections.sort(novaLista);
        return novaLista;
    }
    
    @SuppressWarnings("unchecked")
    public List<String> corrigirLista(List<String> listaAntiga){
        List novaLista = new ArrayList();                                
        listaAntiga.forEach((String valor) -> {
            if(Float.parseFloat(valor)<10){
                novaLista.add("00000000" + valor);
            }else if (Float.parseFloat(valor)<100){
                novaLista.add("0000000" + valor);
            }else if (Float.parseFloat(valor)<1000){
                novaLista.add("000000" + valor);
            }else if (Float.parseFloat(valor)<10000){
                novaLista.add("00000" + valor);
            }else if (Float.parseFloat(valor)<100000){
                novaLista.add("0000" + valor);
            }else if (Float.parseFloat(valor)<1000000){
                novaLista.add("000" + valor);  
            }else if (Float.parseFloat(valor)<10000000){
                novaLista.add("00" + valor);  
            }else if (Float.parseFloat(valor)<100000000){
                novaLista.add("0" + valor);  
            }else{
                novaLista.add(valor);
            }
        });
        return novaLista;
    }
    
    /*
    *Retortar lista de frenquência de um determinado dado
    */
    @SuppressWarnings("unchecked")
    public List<String> frequencia(List lista,boolean op,int qtd){
        //https://pt.stackoverflow.com/questions/302140/como-recuperar-um-objeto-de-um-hashset
        try {
            //int indice = 0;
            List <String> frequencia = new ArrayList();
            Map<String, Integer> map = new LinkedHashMap<>();
            Iterator<String> it = lista.iterator();
            while(it.hasNext()) {
                Object obj = it.next();
                int frequency = Collections.frequency(lista, obj);
                map.put(String.valueOf(obj), frequency);
            }
            
            //https://receitasdecodigo.com.br/java/como-obter-chaves-e-valores-de-map-em-java-e-usando-foreach
            if(op){
                map.entrySet().forEach((entry) -> {
                    String dado = entry.getKey();
                    Integer valor = entry.getValue();
                    if (valor >= qtd) {
                        frequencia.add( dado + "\tX " + valor  + ( valor == 1? "  vez":"  vezes"));
                    }                    
                }); /*for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String dado = entry.getKey();
                Integer valor = entry.getValue();
                if (valor >= qtd){
                frequencia.add( dado + "\tX " + valor  + ( valor == 1? "  vez":"  vezes"));
                }
                }*/
            }else if (!op){
                /*
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String dado = entry.getKey();
                Integer valor = entry.getValue();
                frequencia.add( dado + "\tX " + valor  + ( valor == 1? "  vez":"  vezes"));
                }
                 */
                map.entrySet().forEach((entry) -> {
                    String dado = entry.getKey();
                    Integer valor = entry.getValue();                    
                    frequencia.add( dado + "\tX " + valor  + ( valor == 1? "  vez":"  vezes"));
                });
            }
            return frequencia;            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista de frequência:  " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            return null;
        }           
    }

    @SuppressWarnings("unchecked")
    public List<String> diferenca(List um, List dois){        
        //List <String> tres = um;        
        um.removeAll(dois);
        List <String> diferenca = um;                               
        return diferenca;
    }
    

    //Contador do método de junto (PARA QUERY)
    public Integer contador(){
        return contagem;
    }
    
    
    public void copiar(String texto){
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
	ClipboardOwner selection = new StringSelection(texto);
	board.setContents((Transferable) selection, selection);
    }

    public String tratamento(String texto){        
        texto = texto.replaceAll("\t", "\n");
        texto = texto.replaceAll(" ", "\n");
        texto = texto.replaceAll(" ", "");
        return texto;
    }
    
    public void limparVar(){
        principal = "";
        contagem = 0;
    }    
    
    /*
    *Calcula a diferença entra datas (dias)
    */
    public String diferencaData(String inicio, String fim){        
        inicio = inicio.replaceAll("/","-");
        fim = fim.replaceAll("/","-");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime ini = LocalDateTime.parse(inicio,formatter);
        LocalDateTime ultimo = LocalDateTime.parse(fim,formatter);                
        Long dias = ultimo.until(ini, ChronoUnit.DAYS);                      
        return dias.toString();
    }
 
    public String FormatarData(Date data){
        try{
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String formato = formatter.format(data);            
            return formato;
        }catch(Exception e){
            System.out.println("Erro ao formatar Data: " + e.getMessage());
            return null;
        }
    }
    
    public String inverterData(String data){        
        String invertida;// = "";
        String hora = " 00:00";
        String ano = data.substring(6, 10);        
        invertida = ano + "/" + data.charAt(3) + data.charAt(4) + "/" + data.charAt(0) + data.charAt(1) + hora;                        
        return invertida;
    }

    public String formarData(String data){                
        String formatada = data.substring(8,9) + data.substring(9,10) + "/" + data.substring(5,6) + data.substring(6,7) + "/" + data.substring(0,4);        
        return formatada;        
    }
    
    public String recuperarDataHoraAtual(){
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatterData.format(agora);

        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(agora);
        return dataFormatada.concat(" "+ horaFormatada);
    }
    
    //Calcula a senha do dia
    public int senhaDia(int dia, int mes, int ano){        
        return (dia*23)+(mes*12)+(ano*2);
    }   
    
    public int senhaDiaAtual(){
        GregorianCalendar calendar = new GregorianCalendar();
        int dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);        
        int mes = calendar.get(GregorianCalendar.MONTH)+1;
        int ano = calendar.get(GregorianCalendar.YEAR);
        return (dia*23)+(mes*12)+(ano*2);
    }
    
    //Executar arquivos
    @SuppressWarnings("deprecation")
    public void executarArquivos(String arquivo){
        try{   
            Process p = Runtime.getRuntime().exec(arquivo);
        }catch(IOException e){   
            JOptionPane.showMessageDialog(null, "Erro ao executar arquivo" + e.getMessage()+ "\n\n" + this.getClass().getTypeName(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Executar o programa Decrypt (MC1 - Senhas)
    @SuppressWarnings("deprecation")
    public void executarDecriptPassword(){
        try{   
            Process p = Runtime.getRuntime().exec("System\\Criptografia_Mc1");               
        }catch(IOException e){   
            JOptionPane.showMessageDialog(null, "Erro ao executar Decrypt MC1" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Executar o programa Decrypt (MC1 - Senhas)
    @SuppressWarnings("deprecation")
    public void executarDecriptLogs(){
        try{   
            Process p = Runtime.getRuntime().exec("System\\DecryptMC1Logs");               
        }catch(IOException e){   
            JOptionPane.showMessageDialog(null, "Erro ao executar Decrypt de Logs" + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String lerArquivo(String arquivo){
        File file = new File(arquivo);
        String texto = "\t\t\t\t\t-- ACESSOS-- \n\n";
        try {
          FileReader reader = new FileReader(file);
          BufferedReader input = new BufferedReader(reader);          
          String linha;
          while ((linha = input.readLine()) != null) {
            //System.out.println(linha);            
            texto = texto.concat(linha+"\n");
          }          
          input.close();
        } catch (IOException ioe) {
           System.out.println(ioe);
        }
        return texto;
    }
    

    public String textoAjuda(String tela){
        switch (tela) {
            case "JUNTAR":
                return "Essa tela tem o intuito de formatar a entrada para ser utilizada.\n Além de contar com o contador de elementos!\n\nNão aplicável à registros compostos(Exemplos: Maria Clementina e Andresa Galdino)";
            case "FONTE":
                return "Essa tela tem o intuito de converter caixa baixa em caixa alta e vice versa!";
            case "DATA":
                return "Essa tela tem o intuito calcular a diferença em dias entre duas datas!";
            case "REPLACE":
                return "Essa tela tem o intuito substituir um caractere por outro!";
            case "DOUBLE":
                return "Essa tela tem o intuito remover registros repetidos!";
            case "DIFERENCA":
                return "Essa tela tem o intuito de identificar registros que existem em uma lista, \nmas não em outra!";
            case "CONTAGEM":
                return "Essa tela tem o intuito de mostrar média e mediana de um determinado conjunto";
            case "CANCELAR":
                return "Essa tela tem o intuito de gerar query (INSERT) para realizar paliativo na \nMC1_InvoiceCancellationExt.";
            case "CONEXAO":
                return "Essa tela tem o intuito de gerenciar as conexões do usuário \n(serve para servidores de banco e acesso remoto)";
            case "FTP":
                return "Essa tela tem o intuito de gerenciar as conexões ftps do usuário";
            case "WINDOWS_AGENT":
                return "Essa tela tem o intuito de gerenciar os recursos no Windows.";
            case "LEFT2_RANK":
                return "Essa tela tem o intuito de exibir o rank de classificação do servidor Left 4 Dead 2";
            case "DATA_BASE":
                return "Essa tela tem o intuito de gerenciar as conexoes de Databases";
            case "PARAMETRO":
                return "Essa tela tem o intuito de gerenciar os parametros do sistema";    
            default:
                return "Sem opção de ajuda!";        
        }
    }        
             
    /*
    *CONVERTER STRING (DINHEIRO), PARA PONTOS FLUTUANTES     
    */
    public Float converteValorDigitadoemFloat(String valor) {
        String formatoFloat = valor;
        formatoFloat = formatoFloat.replace(".", "");
        formatoFloat = formatoFloat.replace(",", ".");
        formatoFloat = formatoFloat.replace("R$ ", "");
        formatoFloat = formatoFloat.replace("%", "");
        Float val = Float.parseFloat(formatoFloat);
        return val;
    }

    public Double converteValorDigitadoemDouble(String valor) {
        String formatoDouble = valor;
        formatoDouble = formatoDouble.replace(".", "");
        formatoDouble = formatoDouble.replace(",", ".");
        formatoDouble = formatoDouble.replace("R$ ", "");
        formatoDouble = formatoDouble.replace("%", "");
        Double val = Double.parseDouble(formatoDouble);
        return val;
    }    
    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    /*
    *FORMATAR EM MASCARA MONETÁRIA
    */    
    public String converterMoeda(String valor){
        NumberFormat nf = new DecimalFormat("R$ ###,##0.00");                
        Float moeda = converteValorDigitadoemFloat(valor);        
        return nf.format(moeda);        
    }
    
    public String converterMoeda(Double valor){
        NumberFormat nf = new DecimalFormat("R$ ###,##0.00");                                
        return nf.format(valor);        
    }
    
    public String converterMoeda(Float valor){
        NumberFormat nf = new DecimalFormat("R$ ###,##0.00");                
        return nf.format(valor);        
    }    
    
    /*
    *CONVERTER DOUBLE EM STRING COM PERCENTUAL
    */
    public String converterPercentual(Double valor){
        NumberFormat nf = new DecimalFormat("##0.00"); 
        return nf.format(valor).concat("%");        
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /*
    *FORMATANDO DATAS PARA STRING
    */
    
    // DATA UTIL -> STRING (PADRÃO DIA - MÊS - ANO)
    public String formatarDateUtilString(java.util.Date data){    
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formato = formatter.format(data);            
        return formato;    
    }    
    
    // DATE -> STRING (COM HORAS MINUTOS E SEGUNDO)
    public static String formatarData(java.util.Date date){
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:sss");
        return formatarDate.format(date);
    }
        
    // DATA LOCALDATE -> STRING (PADRÃO DIA - MÊS - ANO)
    public String formatarDateLocalDateString(LocalDate data){        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formato = data.format(formatter);        
        return formato;
    }                       
    
    // DATA SQLDATE -> STRING (PADRÃO DIA - MÊS - ANO)
    public String formatarDateSqlString(java.sql.Date dataBanco){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataBanco);
    }
    
    // DATA STRING -> STRING(FORMATADA)- (PADRÃO DIA - MÊS - ANO)
    public String formatarDateString(String data){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /*
    *FORMATANDO STRING PARA DATAS
    */
            
    
    //RECUPERAR HORAS E MINUTOS DE UMA STRING
    public Date formatarStringEmHora(String hora) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");        
	Date d = sdf.parse(hora);
        return d;
    }                  
                
    // STRING -> DATA UTIL    
    public Date formatarStringDateUtil(String data) throws ParseException{
        try{
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");       
            return new Date(formatter.parse(data).getTime());
        }catch(ParseException e){
            return null;
        }
    }

    //STRING -> DATA SQL
    public java.sql.Date converterTextoEmData(String data) {
        java.sql.Date sql = null;
        try {
            //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse(data);
            sql = new java.sql.Date(parsed.getTime());            
        } catch (ParseException ex) {
            System.out.println("Erro ao converter Texto em data " + ex.getMessage());            
        }
        return sql;
    }               
    
    public void limpar(JScrollPane panel){        
        Component components[] = panel.getComponents();
        
        for (Component component : components) {
            //Textfield
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");                
            }
            //ComboBox
            if (component instanceof JComboBox) {
                ((JComboBox) component).setSelectedIndex(0);
            }
            //PassWordField
            if (component instanceof JPasswordField) {
                ((JPasswordField) component).setText("");
            }
            //RadioButtons
            if (component instanceof JRadioButton) {
                ((JRadioButton) component).setSelected(false);
            }
            //TextArea            
            if(component instanceof JTextArea){  
                ((JTextArea) component).setText(null);                      
            } 
        }
    }  
    
    /**
    * Metodo que valida se um campo de texto esta vazio ou nao, percorre um array de componentes recolhidos de um JPanel
    * apos isso verifica se eles contem algum valor.
    * @param panel 
    */
    public  void validarCampos(JPanel panel){
        Component components[] = panel.getComponents();        
        for (Component component : components) {
            if (component instanceof JTextField) {
                if (((JTextField) component).getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Existem campos vazios","Aviso",JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }
    }
    /**
     * Metodo de validação que deixa um campo aceitar apenas letras em campos de textos, recolhe um jtextfield
     * e valida-o deixando apenas receber letras.
     * @param campo 
     */
    public void validarLetras(JTextField campo){
        String num = campo.getText();
        //Character t = null;
        for (char c : num.toCharArray()){            
            if(Character.isDigit(c)){
                JOptionPane.showMessageDialog(null,"Este campo deve conter somente letras","Alerta", JOptionPane.WARNING_MESSAGE);
                campo.setText("");
                break;
            }
        }
    }
    /**
     * Metodo que valida um campo de texto para receber apenas numeros, recebe um paramentro de JTextField, recolhe o valor
     * no campo e valida-o.
     * @param campo 
     */
    public void validarNumeros(JTextField campo){
        String num = campo.getText();
        //Character t = null;
        for (char c : num.toCharArray()) {            
            if(Character.isLetter(c)){
                JOptionPane.showMessageDialog(null,"Este campo deve conter somente numeros","Alerta", JOptionPane.WARNING_MESSAGE);
                campo.setText("");
                break;
            }
        }
    }
    /*
     * VALIDAR CPF        
     */
    public boolean validarCPF(String teste){
      if("".equals(teste)){
            return true;
      }
      teste = teste.replace(".", "");
      teste = teste.replace("-", "");        
      char digito1;
      char digito2;
      int soma;
      int num;
      int peso;
      int r;      
      if (teste.equals("00000000000") || teste.equals("11111111111") ||
        teste.equals("22222222222") || teste.equals("33333333333") ||
        teste.equals("44444444444") || teste.equals("55555555555") ||
        teste.equals("66666666666") || teste.equals("77777777777") ||
        teste.equals("88888888888") || teste.equals("99999999999") ||
       (teste.length() != 11)){
          JOptionPane.showMessageDialog(null, "Erro, CPF invalido","Validação",JOptionPane.ERROR_MESSAGE);
          return false;
      }             
      try{
          soma = 0;
          peso = 10;
          for (int i = 0; i < 9; i++) {
              num = (int)(teste.charAt(i) - 48);
              soma = soma +(num * peso);
              peso -=1;
          }          
          r = 11 - (soma % 11);          
          if(r == 10 || r == 11){
              digito1 = '0';
          }else{
              digito1 = (char)(r + 48);
          }
          soma = 0;
          peso = 11;
          for (int i = 0; i < 10; i++) {
              num = (int)(teste.charAt(i) - 48);
              soma = soma + (num * peso);
              peso -= 1;
          }          
          r = 11 - (soma % 11);
          if(r == 10 || r == 11){
              digito2 = '0';
          }else{
              digito2 = (char) (r + 48);
          }          
          if (digito1 == teste.charAt(9) && (digito2 == teste.charAt(10))){              
              return true;
          }else{
              JOptionPane.showMessageDialog(null, "Erro, CPF invalido","Validação",JOptionPane.ERROR_MESSAGE);
              return false;
          }      
      }catch(InputMismatchException e){
              e.getMessage();
              JOptionPane.showMessageDialog(null, "Erro, validação cancelada","Erro",JOptionPane.ERROR_MESSAGE);
              return false;
          }
  }
    /*
     * VALIDAR CNPJ.     
     */
    public boolean validarCNPJ(String CNPJ) {
        if("".equals(CNPJ)){
            return true;
        }
        CNPJ = CNPJ.replace(".","");
        CNPJ = CNPJ.replace("-","");
        CNPJ = CNPJ.replace("/","");
    // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
    if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
       (CNPJ.length() != 14))
       return(false);
 
    char dig13, dig14;
    int sm, i, r, num, peso;
 
    // "try" - protege o código para eventuais erros de conversao de tipo (int)
    try {
    // Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=11; i>=0; i--) {
    // converte o i-ésimo caractere do CNPJ em um número:
    // por exemplo, transforma o caractere '0' no inteiro 0
    // (48 eh a posição de '0' na tabela ASCII)
        num = (int)(CNPJ.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }
 
      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig13 = '0';
      else dig13 = (char)((11-r) + 48);
 
    // Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=12; i>=0; i--) {
        num = (int)(CNPJ.charAt(i)- 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }
 
      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig14 = '0';
      else dig14 = (char)((11-r) + 48);
 
    // Verifica se os dígitos calculados conferem com os dígitos informados.
      if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }                    
    
    public static String formatarDataCheia(Date date){
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:sss");
        return formatarDate.format(date);
    }    

    public String calcularMedia(List <String> lista){
        Double total = 0.0;
        /*for(String valor : lista){
        total += Double.parseDouble(valor);
        }*/
        total = lista.stream().map((valor) -> Double.parseDouble(valor)).reduce(total, (accumulator, _item) -> accumulator + _item);
        double media = total / lista.size(); 
                        
        DecimalFormat formato = new DecimalFormat("#.##");
        //numero = Double.valueOf(formato.format(media));        
        return formato.format(media);
    }
    
    public void confirmarSaida(){
        Integer op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Confirmação",JOptionPane.YES_NO_OPTION);        
        if(op == 0){
            System.exit(0);
        } 
    }
    
    //CRIPTOGRAFIA MD5
    public static String criptMD5(String inf){
        String criptografado;
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(inf.getBytes(),0,inf.length());            
            criptografado = new BigInteger(1,m.digest()).toString(16);            
            return criptografado;
        }catch(NoSuchAlgorithmException e){
            JOptionPane.showMessageDialog(null,"Erro: +\n" + e.getMessage());
            return "";
        }      
    }
    
    /*MENSAGENS DE VALIDAÇÃO*/
    public void exibirConfirmacaoCadastro(String obj){
        JOptionPane.showMessageDialog(null,obj + " Cadastrado com Sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
    }        
    
    public void exibirConfirmacaoAlterarCadastro(String obj){
        JOptionPane.showMessageDialog(null,obj + " Alterado com Sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
    }   
    
    public void exibirErroCadastro(String obj){
        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar " + obj,"Erro",JOptionPane.ERROR_MESSAGE);
    }
    
    public void exibirErroAlterarCadastro(String obj){
        JOptionPane.showMessageDialog(null, "Erro ao Alterar " + obj,"Erro",JOptionPane.ERROR_MESSAGE);
    }    
         
    public void exibirAjudaConsulta(String obj){
        JOptionPane.showMessageDialog(null, " Essa tela serve para efetuar o consulta de "+ obj,"Ajuda",JOptionPane.INFORMATION_MESSAGE);
    }        
    
    public void exibirAjudaCadastro(String obj){
        JOptionPane.showMessageDialog(null, " Essa tela serve para efetuar o cadastro de "+ obj,"Ajuda",JOptionPane.INFORMATION_MESSAGE);
    }        
    
    public void exibirAjudaAlterar(String obj){
        JOptionPane.showMessageDialog(null, " Essa tela serve para efetuar o alteração do cadstro de "+ obj,"Ajuda",JOptionPane.INFORMATION_MESSAGE);
    }    
    
    public boolean validarSerial(String login,String serial){
        boolean retorno;
        String loginCrip = criptMD5(login);
        //String serialTratado = "";        
        retorno = loginCrip.equals(serial); 
        return retorno;
    }    
    
    public String tratarSerial(String serial){
        int indice = serial.indexOf('@');        
        String tratado = serial.substring(0, indice);
        return tratado;                
    }
    
    public String tratarValidadeSerial(String serial){
        String tratado = "";
        int indice = serial.indexOf('@');        
        tratado = serial.substring(indice+1, serial.length());
        return tratado;                
    }
        
    public boolean copiarArquivo(String arquivoOri,String arquivoDestino){
        try {
            File dll64Bits = new File("C:\\Program Files\\Java");
            File dll32Bits = new File("C:\\Program Files (x86)\\Java");
            if(dll64Bits.exists()){
                System.out.println("Java 64 bits");
            }else if (dll32Bits.exists()){
                System.out.println("Java 32 bits");
            }else{
                System.out.println("Java não instalado");
            }
            //File arquivoOrigem=new File(arquivoOri);
            //FileUtils.copyFile();
            //FileHandler.copy(arquivoOri, arquivoDestino);
            return true;
        } catch (Exception ex) {
            System.out.println("ERRO! " + ex);
            return false;
        }
    }
            
    public boolean copiarDll(String versao){
        boolean retorno = false;
        try {
            String diretorioAtual = System.getProperty("user.dir");
            String origem = "";
            File arquivoExisteBin = new File(versao+"\\bin\\sqljdbc_auth.dll");
            File arquivoExisteLib = new File(versao+"\\lib\\sqljdbc_auth.dll");
            
            if (!arquivoExisteBin.exists() && !arquivoExisteLib.exists()) {                            
                if(versao.contains("x86")){                
                    origem = diretorioAtual + "\\Dll\\trintaBits\\sqljdbc_auth.dll";
                }else{
                    origem = diretorioAtual + "\\Dll\\sessentaBits\\sqljdbc_auth.dll";
                }
                File arquivoOrigem = new File(origem);
                File arquivoDestinoBin = new File(versao+"\\bin");
                File arquivoDestinoLib = new File(versao+"\\lib");
                        
                if (!arquivoOrigem.isDirectory()) {
                    InputStream in = new FileInputStream(arquivoOrigem);
                    OutputStream out = new FileOutputStream(arquivoDestinoBin);

                    // Copy the bits from instream to outstream
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    in.close();
                    out.close();

                    OutputStream outLib = new FileOutputStream(arquivoDestinoLib);

                    // Copy the bits from instream to outstream
                    byte[] bufLib = new byte[1024];
                    int lenLib;
                    while ((lenLib = in.read(bufLib)) > 0) {
                        out.write(bufLib, 0, lenLib);
                    }
                    in.close();
                    outLib.close();
                    JOptionPane.showMessageDialog(null, "Arquivos copiados com sucesso","Aviso",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            retorno = true;
        } catch (IOException ex) {
            System.out.println("ERRO! " + ex);
            JOptionPane.showMessageDialog(null, "Erro ao copiar aquivos - " + ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            retorno = false;
        }
        return retorno;
    }
    
    public String verificarDiretorioJava(){
        String caminhoJava = System.getProperty( "java.home", "<unknown java home>" );
        return caminhoJava;
    }
    
    public boolean gerarCsv(){
        boolean ret = false;
        String arquivoCsv = "teste.txt";
        System.out.println("Gerando CSV");
        try {
            FileWriter fw = new FileWriter(new File(arquivoCsv));
            CSVWriter cw = new CSVWriter(fw);
            String [] cabecalho = {"Nome;","Email;","Senha;"};
                        
            List<String[]> data= new ArrayList<String[]>();
            String [] item1 = {"Jonathan","jonathangmdailva@gmail.com","123"};
            String [] item2 = {"Lucia","lucia@gmail.com","657891"};
            
            data.add(cabecalho);
            data.add(item1);
            data.add(item2);
            cw.writeAll(data);
            
            cw.close();
            fw.close();
            
            ret = true;            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
            ret= false;
        }finally{
            return ret;
        }                                                
    }
    
    public String invertterCaracteresDataMascara(String data){
        String invertida = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);        
        return invertida;
    }
    
    public boolean abrirLink(String link){
        try {
            java.awt.Desktop.getDesktop().browse( new java.net.URI(link));
            return true;
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel abrir o link solicitado" + e.getMessage());
            return false;
        }        
    }
        
    public String recuperarMetodo(){
        String metodo = "SEM MÉTODO";
        return metodo = this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + "(";
    }
    
}