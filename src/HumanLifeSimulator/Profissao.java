package HumanLifeSimulator;

public class Profissao {

    private String nome;
    private double salarioDia;
    private boolean formal;
    private int estatuto;
    private int nivelMinimoEducacao;

    public Profissao(String nome, double salarioDia, boolean formal, int estatuto, int nivelMinimoEducacao) {
        this.nome = nome;
        this.salarioDia = salarioDia;
        this.formal = formal;
        this.estatuto = estatuto;
        this.nivelMinimoEducacao = nivelMinimoEducacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public boolean isFormal() {
        return formal;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getNivelMinimoEducacao() {
        return nivelMinimoEducacao;
    }
}
