package HumanLifeSimulator;

import java.util.Scanner;

public class Sims {

    private static Scanner input;

    public Sims() {
        this.input = new Scanner(System.in);
    }

   /* public static Pessoa criarPessoa(){
        //receber as informações do usuario na consola para criar o personagem;
        System.out.println("Escolha o nome do seu personagem: ");
        String nome = input.nextLine();

        nome = input.nextLine(); //limpeza buffer;

        System.out.println("Escolha o tipo de pessoa: ");
        System.out.println("1 - jogador");
        System.out.println("2 - NPC");
        int opcao = input.nextInt();

        if (opcao == 1){
            return criarJogador();
        } else if (opcao == 2) {
            return criarNPC(nome);
        } else {
            System.out.println("Escolha uma opção válida!");
        }
    }*/


}
