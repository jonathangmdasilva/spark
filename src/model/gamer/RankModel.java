package model.gamer;

/*
 * @author Jonathan
 */

public class RankModel {
    private Integer survidor_killed,survidor_incapped,infected_killed,infected_headshot,rank;
    private String idJogador,apelido,atualizacao,dataCadastro;
    private double pontuacao;

    public RankModel(){
        this.survidor_killed = 0;
        this.survidor_incapped = 0;
        this.infected_killed = 0;
        this.infected_headshot = 0;
        this.rank = 0;
        this.idJogador = "SEM ID";
        this.apelido = "SEM APELIDO";
        this.atualizacao = "00/00/0000";
        this.dataCadastro = "00/00/0000";
        this.pontuacao = 0.0;
    }

    public Integer getSurvidor_killed() {
        return survidor_killed;
    }

    public void setSurvidor_killed(Integer survidor_killed) {
        this.survidor_killed = survidor_killed;
    }

    public Integer getSurvidor_incapped() {
        return survidor_incapped;
    }

    public void setSurvidor_incapped(Integer survidor_incapped) {
        this.survidor_incapped = survidor_incapped;
    }

    public Integer getInfected_killed() {
        return infected_killed;
    }

    public void setInfected_killed(Integer infected_killed) {
        this.infected_killed = infected_killed;
    }

    public Integer getInfected_headshot() {
        return infected_headshot;
    }

    public void setInfected_headshot(Integer infected_headshot) {
        this.infected_headshot = infected_headshot;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(String idJogador) {
        this.idJogador = idJogador;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(String atualizacao) {
        this.atualizacao = atualizacao;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
}
