package HumanLifeSimulator.PersonagensJogo;

public class NPC extends Pessoa{
    private int estatutoMinimo;

    /**
     * Método construtor para a subclasse NPC(familia do jogador)
     * @param nome
     * @param dinheiro
     * @param estatutoMinimo
     */
    public NPC(String nome, double dinheiro, int estatutoMinimo) {
        super(nome, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }

    public void exibirDetalhes() {
        System.out.println();

        super.exibirDetalhes();
        System.out.println("Estatuto mínimo: " + this.estatutoMinimo);
        System.out.println("🔺🔻🔺🔻🔺🔻🔺🔻🔺🔻🔺🔻");
    }
}
