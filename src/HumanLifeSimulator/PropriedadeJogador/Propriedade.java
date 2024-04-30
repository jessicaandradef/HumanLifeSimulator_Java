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

    /**
     * Método get para obter o nome da propriedade
     * @return o nome da propriedade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método get para obter o custo da propriedade
     * @return o custo da propriedade
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Método get para obter o estatuto
     * @return o estatuto da propriedade
     */
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
