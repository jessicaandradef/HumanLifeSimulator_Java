package HumanLifeSimulator;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    //vai simular um conjunto de lojas
    private ArrayList<Propriedade> coisasParaComprar;

    public Shopping() {
        this.coisasParaComprar = new ArrayList<Propriedade>();
    }

    /**
     * Método que pergunta ao utilizador qual secção do shopping a pessoa quer ir
     * De acordo com a escolha imprime na consola 10 itens disponiveis da secção adequada;
     * @param pessoaAtual
     */
    public void vender(Pessoa pessoaAtual){

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Qual secção do shopping você quer ir ? ");
            System.out.println("1- IMOBILIARIA");
            System.out.println("2- STAND");
            System.out.println("3- FASHION OUTLET");

            System.out.println("Escolha a sua opção: ");
            opcao = input.nextInt();

            //switch case para verificar o tipo de secção;
            switch (opcao){
                //imprimir na consola 10 itens disponiveis da secção adequada;
                case 1:
                    //para a imobiliaria;
                    System.out.println("imobiliaria");
                    break;
                case 2:
                    // para o stand
                    System.out.println("stand");
                    break;
                case 3:
                    //para o fashion outlet
                    System.out.println("fashion outlet");
                    break;
                default:
                    System.out.println("Por favor, escolha uma opção válida! ");
                    break;
            }

        }while (opcao != 3);

    }
}
