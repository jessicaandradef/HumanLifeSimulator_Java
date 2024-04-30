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

    /**
     * Método get para obter o estatuto mínimo do NPC
     * @return o num do estatuto do NPC
     */
    public int getEstatutoMinimo() {
        return estatutoMinimo;
    }

    /**
     * Método que imprime na consola todos os detalhes da pessoa;
     * Faz override do método exibirDetalhes da super classe Pessoa
     */
    public void exibirDetalhes() {
        System.out.println();

        super.exibirDetalhes();
        System.out.println("Estatuto mínimo: " + this.estatutoMinimo);
        System.out.println("🔺🔻🔺🔻🔺🔻🔺🔻🔺🔻🔺🔻");
    }
}
