package HumanLifeSimulator;

public class Veiculo extends Propriedade{

    private String marca;
    private String modelo;

    public Veiculo(String nome, double custo, int estatuto, String marca, String modelo) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.modelo = modelo;
    }

}
