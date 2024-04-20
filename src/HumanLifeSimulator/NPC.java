package HumanLifeSimulator;

public class NPC extends Pessoa{
    private int estatutoMinimo;

    public NPC(String nome, double dinheiro, int estatutoMinimo) {
        super(nome, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }

    public void exibirDetalhes() {
        System.out.println("Informações do NPC: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Dinheiro: " + this.getDinheiro());
    }
}
