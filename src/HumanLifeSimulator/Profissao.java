package HumanLifeSimulator;

public class Profissao {

    private String nome;
    private double salarioDia;
    private boolean formal;
    private int estatuto;
    private int nivelMinimoEducacao;

    /**
     * Método construtor da classe Profissão
     * @param nome
     * @param salarioDia
     * @param formal
     * @param estatuto
     * @param nivelMinimoEducacao
     */
    public Profissao(String nome, double salarioDia, boolean formal, int estatuto, int nivelMinimoEducacao) {
        this.nome = nome;
        this.salarioDia = salarioDia;
        this.formal = formal;
        this.estatuto = estatuto;
        this.nivelMinimoEducacao = nivelMinimoEducacao;
    }

    /**
     * Método get para obter nome da profissão
     * @return nome da profissão
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método get para obter o salário do dia da profissão
     * @return valor do salario do dia da profissão
     */
    public double getSalarioDia() {
        return salarioDia;
    }

    /**
     * Método get para verificar SE profissão éforml ou nao
     * @return TRUE se for || FALSE se nao for
     */
    public boolean isFormal() {
        return formal;
    }

    /**
     * Método get para obter o estatuto da profissão
     * @return num do estatuto da profissão
     */
    public int getEstatuto() {
        return estatuto;
    }

    /**
     * Método get para obter o nível mínimo da profissão
     * @return num do nivel minimo da profissão
     */
    public int getNivelMinimoEducacao() {
        return nivelMinimoEducacao;
    }

    /**
     * Método para imprimir na consola os detalhes da profissões
     */
    public void exibirDetalhesProfissao(){
        System.out.println("🔹 Nome da profissão: " + this.nome);
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
