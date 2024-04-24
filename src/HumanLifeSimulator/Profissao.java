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

    public void exibirDetalhesProfissao(){
        System.out.println("🔹 Nome: " + this.nome);
        System.out.println("💰 Valor do salário por dia: " + this.salarioDia);
        System.out.println("🎋 Estatuto: " + this.estatuto);
        System.out.println("📑📒 Nível mín. de educação: " + this.nivelMinimoEducacao);

        if (formal){
            System.out.println("Que chique!🤩 Essa profissão é considerada formal 👨🏼‍💼🧑🏼‍✈️");
        } else {
            System.out.println("Bem a vontade... 🏄🏼 essa profissão não é formal 😌🕺🏼");
        }
    }
}
