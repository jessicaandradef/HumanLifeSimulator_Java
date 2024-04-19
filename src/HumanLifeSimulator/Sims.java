package HumanLifeSimulator;

import java.util.Scanner;

public class Sims {

    private Scanner input;

    public Sims() {
        this.input = new Scanner(System.in);
    }

    public Pessoa criarPessoa(){
        System.out.println("Escolha o nome do seu personagem: ");
        String nome = input.nextLine();

        nome = input.nextLine(); //limpeza buffer;

        return Pessoa;
    }
}
