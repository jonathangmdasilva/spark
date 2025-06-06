package model.core;

/*
 * @author Jonathan
 */

public class ParametroModel {
    int codigo;
    String xIdParametro,descricao,atualizacao;
    boolean ativo;

    public ParametroModel(){
        this.codigo = 0;
        this.xIdParametro = "VAZIO";
        this.descricao = "VAZIO";
        this.atualizacao = "VAZIO";
        this.ativo = false;
    }
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getxIdParametro() {
        return xIdParametro;
    }

    public void setxIdParametro(String xIdParametro) {
        this.xIdParametro = xIdParametro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }    
}
