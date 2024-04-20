package HumanLifeSimulator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shopping {
    //vai simular um conjunto de lojas
    private ArrayList<Propriedade> coisasParaComprar;

    public Shopping() {
        this.coisasParaComprar = new ArrayList<Propriedade>();
    }

    /**
     * Método que pergunta ao utilizador qual secção do shopping a pessoa quer ir,
     * de acordo com a escolha imprime na consola 10 itens disponiveis da secção adequada;
     * @param pessoaAtual
     */
    public void vender(Pessoa pessoaAtual){
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Shopping SIMS DEV");
        System.out.println("Qual secção do shopping você quer ir ? ");
        System.out.println();
        System.out.println("1- IMOBILIARIA 🏢🏡🏬🏘️️");
        System.out.println("2- STAND 🚗🚚🚎🛻");
        System.out.println("3- FASHION OUTLET 👙👗🩳👛🩴");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                imprimirPropriedades("Imobiliaria");
                break;
            case 2:
                imprimirPropriedades("Stand");
                break;
            case 3:
                imprimirPropriedades("Fashion Outlet");
                break;
            default:
                System.out.println("Escolha uma opção válida 😤");
                break;
        }

        Propriedade propriedadeEscolhida = coisasParaComprar.get(opcao - 1); //porque -1 ?
        double preco = propriedadeEscolhida.getCusto();

        if (pessoaAtual.getDinheiro() >= preco){
            pessoaAtual.setDinheiro(pessoaAtual.getDinheiro() - preco);
          //  pessoaAtual.addPropriedade(propriedadeEscolhida); //editar classe propriedade
            System.out.println("UHUUULLL, ficou um pouco mais pobre mas comprou o item que desejado! É isso ai 🎉🎉🎉🎉");
        } else {
            System.out.println("Sinto muito, você não tem dinheiro suficiente para comprar esse item 😫");
            System.out.println("Que tal trabalhar mais um pouco e juntar um pouco mais ?");
            System.out.println("Fica a dica 😘");
        }
    }

    private void imprimirPropriedades(String nomeSeccao){
        System.out.println("Ahhh, curioso, então queres ver o que temos disponível nessa secção, certo ?");
        System.out.println("Vamos então matar essa tua curiosidade, segue a lista de itens: ");

        Random random = new Random();
        int contador = 0; // variavel contador para controlar os numeros imprissos, até 10 itens;
        for (Propriedade propriedadeAtual : coisasParaComprar){
            if (contador >= 10){
                break;
            }
            int indexImprimir = random.nextInt(coisasParaComprar.size());
            Propriedade propriedade = coisasParaComprar.get(indexImprimir);
            System.out.println((contador + 1) + "- " + propriedade.getNome() + " ; Valor: " + propriedade.getCusto());
            contador++;
        }

    }
}
