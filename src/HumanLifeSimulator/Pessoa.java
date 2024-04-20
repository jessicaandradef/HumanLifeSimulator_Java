package HumanLifeSimulator;

public abstract class Pessoa {
    private String nome; //nome da personagem
    private double dinheiro  = 0; //dinheiro que a Pessoa ganhou

    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
