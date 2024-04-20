package HumanLifeSimulator;

public class Propriedade {
    private String nome; //usar protected ?
    private double custo;
    private int estatuto;

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
}
