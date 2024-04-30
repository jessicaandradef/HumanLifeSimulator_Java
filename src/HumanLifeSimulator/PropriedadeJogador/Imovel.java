package HumanLifeSimulator.PropriedadeJogador;

public class Imovel extends Propriedade{
    private int capacidadePessoas;

    /**
     * Método construtor para a subclasse imovel;
     * @param nome
     * @param custo
     * @param estatuto
     * @param capacidadePessoas
     */
    public Imovel(String nome, double custo, int estatuto, int capacidadePessoas) {
        super(nome, custo, estatuto);
        this.capacidadePessoas = capacidadePessoas;
    }

    /**
     * Método get que obtem a capacidade de pessoas do imóvel
     * @return num da capacidade
     */
    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    /**
     * Método que imprime a capacidade de lotação de um imovel;
     */
    @Override
    public void exibirDetalhesPropriedade() {
        super.exibirDetalhesPropriedade();
        System.out.println("👨‍👦👩‍👧🙆 Capacidade de lotação do imóvel: " + this.capacidadePessoas);
    }
}
