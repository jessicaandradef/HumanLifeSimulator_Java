package HumanLifeSimulator.PropriedadeJogador;

public class Propriedade {
    protected String nome;
    protected double custo;
    protected int estatuto;

    /**
     * Método construtor para a classe Propriedade
     * @param nome
     * @param custo
     * @param estatuto
     */
    public Propriedade(String nome, double custo, int estatuto) {
        this.nome = nome;
        this.custo = custo;
        this.estatuto = estatuto;
    }

    public String getNome() {
        return nome;
    }

    public double getCusto() {
        return custo;
    }

    public int getEstatuto() {
        return estatuto;
    }

    /**
     *Método que imprime os detalhes da propriedade
     */
   public void exibirDetalhesPropriedade(){
        System.out.println(" 🔶 Nome da propriedade: " + this.nome);
        System.out.println(" 💲 Custo: " + this.custo);
        System.out.println(" 🎋 Estatuto: " + this.estatuto);
    }
}
