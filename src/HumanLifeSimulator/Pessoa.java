package HumanLifeSimulator;

public abstract class Pessoa {
    private String nome; //nome da personagem
    private double dinheiro; //dinheiro que a Pessoa ganhou

    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }
}
