package model.core;

/*
 * @author Jonathan
 */

public class DataBaseModel {
    private int codigo,porta;
    private String servidor,banco,usuario,senha,descricao,tipo;
    private boolean ativo;

    public DataBaseModel(){
        this.codigo = 0;
        this.porta = 0;
        this.servidor = "0.0.0.0";
        this.banco = "SEM DATABASE";
        this.usuario = "SEM USER";
        this.senha = "SEM SENHA";
        this.descricao = "SEM DESCRICAO";
        this.ativo = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }       
}
