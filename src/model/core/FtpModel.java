package model.core;

/*
 * @author Jonathan
 */

public class FtpModel {    
    private Integer codigo,porta,trocaSenha;
    private String servidor,endereco,usuario,senha,cliente;
    private boolean ativo;

    public FtpModel(){
        this.codigo = 0;
        this.porta = 0;
        this.trocaSenha = 0;
        this.servidor = "SEM INFORMAÇÃO";
        this.endereco = "SEM INFORMAÇÃO";
        this.usuario = "SEM INFORMAÇÃO";
        this.senha = "SEM INFORMAÇÃO";
        this.cliente = "SEM INFORMAÇÃO";
        this.ativo = false;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public Integer getTrocaSenha() {
        return trocaSenha;
    }

    public void setTrocaSenha(Integer trocaSenha) {
        this.trocaSenha = trocaSenha;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
}
