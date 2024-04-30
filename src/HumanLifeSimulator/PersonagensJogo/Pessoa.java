package HumanLifeSimulator.PersonagensJogo;

public abstract class Pessoa {
    protected String nome;
    protected double dinheiro;

    /**
     * Método construtor da classe abstrata Pessoa
     * @param nome da Pessoa
     * @param dinheiro da Pessoa
     */
    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    /**
     * Método get que obtem o nome da Pessoa
     * @return nome da Pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método get que obtem o dinheiro da Pessoa
     * @return dinheiro da Pessoa
     */
    public double getDinheiro() {
        return dinheiro;
    }

    /**
     * Método set que altera o nome da Pessoa
     * @param nome; novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método set que altera o dinheiro da Pessoa
     * @param dinheiro; novo dinheiro
     */
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * Método que imprime na consola todos os detalhes da pessoa;
     */
    public void exibirDetalhes(){
        System.out.println("✨ Nome: " + this.nome);
        System.out.println("💰 Dinheiro: "+ this.dinheiro);
    }
}
