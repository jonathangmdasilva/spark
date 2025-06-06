package model.core;

/*
 * @author Jonathan
 */

public class ConfiguracaoModel {
            
    Integer codigo,asset,formatador,senhas,processo,modoTela;
    String tema,usuario,serial,dataCadastro,dataAtualizacao,hierarquia;
    

    public ConfiguracaoModel() {
        this.codigo = 0;
        this.asset = 0;
        this.formatador = 1;
        this.senhas = 0;
        this.tema = "Nimbus";
        this.usuario = System.getProperty("user.name");
        this.serial = "";
        this.dataCadastro = "";
        this.dataAtualizacao = "";
        this.hierarquia = "";
    }   
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }    

    public Integer getSenhas() {
        return senhas;
    }

    public void setSenhas(Integer senhas) {
        this.senhas = senhas;
    }

    public Integer getFormatador() {
        return formatador;
    }

    public void setFormatador(Integer formatador) {
        this.formatador = formatador;
    }        

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Integer getProcesso() {
        return processo;
    }

    public void setProcesso(Integer processo) {
        this.processo = processo;
    }

    public Integer getModoTela() {
        return modoTela;
    }

    public void setModoTela(Integer modoTela) {
        this.modoTela = modoTela;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }        
}