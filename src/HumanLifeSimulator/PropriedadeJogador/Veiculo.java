package HumanLifeSimulator.PropriedadeJogador;

public class Veiculo extends Propriedade{

    private String marca;
    private String modelo;

    /**
     * Método construtor da subclasse veículo
     * @param nome
     * @param custo
     * @param estatuto
     * @param marca
     * @param modelo
     */
    public Veiculo(String nome, double custo, int estatuto, String marca, String modelo) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     *Método que imprime os detalhes da propriedade
     */
    @Override
    public void exibirDetalhesPropriedade() {
        super.exibirDetalhesPropriedade();
        System.out.println("💲💲💲 Marca do veículo: ");
        System.out.println("🚗🚲🚁 Modelo do Veículo: ");
    }
}
