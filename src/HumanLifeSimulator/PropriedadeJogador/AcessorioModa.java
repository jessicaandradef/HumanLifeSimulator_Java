package HumanLifeSimulator.PropriedadeJogador;

public class AcessorioModa extends Propriedade{

    private String marca;
    private boolean formal;

    /**
     * Método construtor para a subclasse AcessorioModa
     * @param nome
     * @param custo
     * @param estatuto
     * @param marca
     * @param formal
     */
    public AcessorioModa(String nome, double custo, int estatuto, String marca, boolean formal) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.formal = formal;
    }

    /**
     * Método que verifica se o acessorio de moda é formal ou nao
     * @return TRUE se for || FALSE se nao for
     */
    public boolean isFormal() {
        return formal;
    }

    /**
     * Método que imprime os detalhes de um AcessorioModa;
     * Faz override do método exibirDetalhesPropriedade da super classe Propriedade
     */
    @Override
    public void exibirDetalhesPropriedade() {
        super.exibirDetalhesPropriedade();
        if (formal){
            System.out.println("Nossa, que look formal! Para onde vais tão arrumado ? 👔🧥");
        } else {
            System.out.println("Roupa informal e bem despojada 🩳👚");
        }
    }
}
