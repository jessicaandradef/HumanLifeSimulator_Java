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

    public String getNome() {
        return nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void exibirDetalhes(){
        System.out.println("✨ Nome: " + this.nome);
        System.out.println("💰 Dinheiro: "+ this.dinheiro);
    }
}
