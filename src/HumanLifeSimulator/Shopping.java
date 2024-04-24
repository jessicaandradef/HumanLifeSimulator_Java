package HumanLifeSimulator;

import HumanLifeSimulator.PersonagensJogo.Jogador;
import HumanLifeSimulator.PersonagensJogo.Pessoa;
import HumanLifeSimulator.PropriedadeJogador.AcessorioModa;
import HumanLifeSimulator.PropriedadeJogador.Imovel;
import HumanLifeSimulator.PropriedadeJogador.Propriedade;
import HumanLifeSimulator.PropriedadeJogador.Veiculo;

import java.util.*;

public class Shopping {
    //vai simular um conjunto de lojas
    private ArrayList<Propriedade> coisasParaComprar;

    public Shopping() {
        this.coisasParaComprar = new ArrayList<Propriedade>();
    }

    /**
     * Método que adiciona uma nova propriedade ao array coisasParaComprar;
     *
     * @param propriedadeNova
     */
    public void addPropriedade(Propriedade propriedadeNova) {
        coisasParaComprar.add(propriedadeNova);
    }

    /**
     * Método que retorna os itens que há no array de CoisasParaComprar;
     * @return
     */
    public ArrayList<Propriedade> getCoisasParaComprar() {
        return coisasParaComprar;
    }

    /**
     * Método que imprime a lista de coisas(Propriedades) que o jogador pode comprar;
     */
    public void imprimirCoisasParaComprar(ArrayList<Propriedade> coisasParaComprar) {

        int contador=0;
       int numeroItens = Math.min(10, coisasParaComprar.size());   // numero máx de itens a ser impresso;

        System.out.println();
        System.out.println("LISTA DE ITENS DISPONÍVEIS PARA COMPRA: ");

        for (Propriedade propriedadeAtual : coisasParaComprar){
            if (contador >= numeroItens){
                break;
            }

            System.out.println("ID: " + contador);
            propriedadeAtual.exibirDetalhesPropriedade();
            System.out.println("▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️▫️");
            contador++;

        }
    }

    /**
     * Método que remove do array de CoisasParaComprar um item de propriedade;
     * @param indexPropriedade index da propriedade a ser removida;
     */
    public void removerPropriedade (int indexPropriedade){
        coisasParaComprar.remove(indexPropriedade);
    }


    /**
     * Método que pergunta ao utilizador qual secção do shopping a pessoa quer ir,
     * de acordo com a escolha imprime na consola 10 itens disponiveis da secção adequada;
     *
     * @param pessoaAtual
     */
    public void vender(Pessoa pessoaAtual) {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(this.coisasParaComprar); //vai embaralhar a lista de coisasParaComprar de forma aleatória, não vai imprimir os repetidos;

        int opcao;

        do {

            System.out.println("Seja bem vindo ao Shopping SIMS DEV");
            System.out.println("Qual secção do shopping você quer ir ? ");
            System.out.println();
            System.out.println("1- IMOBILIARIA 🏢🏡🏬🏘️️");
            System.out.println("2- STAND 🚗🚚🚎");
            System.out.println("3- FASHION OUTLET 👙👗🩳👛");
            System.out.println("4- Sair do shopping 🙋🏼🙋🏼‍♀️");
            System.out.println();
            System.out.println("Escolhe aqui a tua opção: ");
            opcao = input.nextInt();

            int idImovel; //para selecionar o id do imovel escolhido
            int idVeiculo; //para selecionar o id do veiculo escolhido
            int idRoupa; //para selecionar o id da roupa escolhida

            switch (opcao){
                case 1:
                    //criar novo array para ter 10 itens na vitrine de imóveis ;
                    ArrayList<Propriedade> vitrineImoveis = new ArrayList<>();

                    //ciclo foreach para percorrer todos os itens do array coisasParaComprar
                    for (Propriedade propriedadeAtual : coisasParaComprar){
                        //condição para verificar se o obj atual é instancia de Imovel
                        if (propriedadeAtual instanceof Imovel){
                            vitrineImoveis.add(propriedadeAtual); //se for, adiciona
                        }
                    }

                    imprimirCoisasParaComprar(vitrineImoveis);

                    System.out.println("Queres comprar algum imóvel? Escolhe o teu: ");
                    idImovel = input.nextInt();

                    Propriedade imovelEscolhido = vitrineImoveis.get(idImovel); //tenho acesso ao id do imovel que o usuario deseja comprar

                    if (pessoaAtual instanceof Jogador){ //verificar se pessoaAtual é instancia de Jogador para conseguir comprar imovel
                        if (((Jogador) pessoaAtual).addPropriedade(imovelEscolhido)){ //casting para converter pessoaAtual em Jogador; presumo que pessoaAtual é uma referencia a um obj do tipo Jogador
                            vitrineImoveis.remove(imovelEscolhido); //remover imovel da vitrine
                            this.coisasParaComprar.remove(imovelEscolhido); //remover imovel do array CoisasParaComprar
                        }
                    }

                    break;

                case 2:
                    //criar novo array para a vitrine de veiculos
                    ArrayList<Propriedade> vitrineVeiculos = new ArrayList<>();

                    for (Propriedade propriedadeAtual : coisasParaComprar){

                        if(propriedadeAtual instanceof Veiculo){
                            vitrineVeiculos.add(propriedadeAtual);
                        }
                    }

                    imprimirCoisasParaComprar(vitrineVeiculos);

                    System.out.println("Qual o veículo que queres comprar ? Diz-me 😜😎 ");
                    idVeiculo = input.nextInt();

                    Propriedade veiculoEscolhido = vitrineVeiculos.get(idVeiculo);
                    if (pessoaAtual instanceof Jogador){
                        if (((Jogador) pessoaAtual).addPropriedade(veiculoEscolhido)){
                            vitrineVeiculos.remove(veiculoEscolhido);
                            this.coisasParaComprar.remove(veiculoEscolhido);
                        }
                    }
                    break;

                case 3:
                    ArrayList<Propriedade> vitrineAcessorios = new ArrayList<>();

                    for (Propriedade propriedadeAtual : coisasParaComprar){

                        if (propriedadeAtual instanceof AcessorioModa){
                            vitrineAcessorios.add(propriedadeAtual);
                        }
                    }

                    imprimirCoisasParaComprar(vitrineAcessorios);

                    System.out.println("Queres comprar novos itens e renovar o guarda roupa? 👗👖🩱👙🩲👚👛👜🛍️🩴🎒 ");
                    System.out.println(" Escolhe ai, vai 😎 ");
                    idRoupa = input.nextInt();

                    Propriedade roupaEscolhida = vitrineAcessorios.get(idRoupa);
                    if (pessoaAtual instanceof Jogador){
                        if (((Jogador)pessoaAtual).addPropriedade(roupaEscolhida)){
                            vitrineAcessorios.remove(roupaEscolhida);
                            this.coisasParaComprar.remove(roupaEscolhida);
                        }
                    }
                    break;

                default:
                    System.out.println("BYE BYEEEE, não demore a voltar 🤪 ");
                    break;
            }


        }while (opcao != 3);


    /*    switch (opcao) {
            case 1:
                imprimirPropriedades("Imovel");
                break;
            case 2:
                imprimirPropriedades("Veiculo");
                break;
            case 3:
                imprimirPropriedades("AcessorioModa");
                break;
            default:
                System.out.println("Escolha uma opção válida 😤");
                break;
        }

        Propriedade propriedadeEscolhida = coisasParaComprar.get(opcao - 1);
        double preco = propriedadeEscolhida.getCusto();

        if (pessoaAtual.getDinheiro() >= preco) {
            pessoaAtual.setDinheiro(pessoaAtual.getDinheiro() - preco);
            System.out.println( pessoaAtual.getDinheiro());
            //pessoaAtual.addPropriedade(propriedadeEscolhida); //editar classe propriedade
            System.out.println("UHUUULLL, ficou um pouco mais pobre mas comprou o item que desejado! É isso ai 🎉🎉🎉🎉");
        } else {
            System.out.println("Sinto muito, você não tem dinheiro suficiente para comprar esse item 😫");
            System.out.println("Que tal trabalhar mais um pouco e juntar um pouco mais ?");
            System.out.println("Fica a dica 😘");
        }

        /*notas para fazer nessa função:
        * criar um novo array para adicionar os itens aleatorios da montra
        * tentar usar do while ??
        * verificar se já existe na montra, se sim, sorteia outro numero, se não, acrescenta à montra
        * não precisa fazer o remove do item pelo index, faz pelo proprio objeto
        * */
    }

    /**
     * Método que imprime na consola dos 10 itens de uma secção escolhida;
     *
     * @param nomeSeccao
     */
 /*   private void imprimirPropriedades(String nomeSeccao) {
        //editar essa função para refazer a parte do random
        System.out.println();
        System.out.println("Ahhh, curioso, então queres ver o que temos disponível nessa secção, certo ?");
        System.out.println("Vamos então matar essa tua curiosidade, segue a lista de itens: ");
        System.out.println();
        Random random = new Random(); //não usar o random, tentar usar o collection ou criar um novo array

        int contador = 0; // variavel contador para controlar os numeros impressos, até 10 itens;
        for (Propriedade propriedadeAtual : coisasParaComprar) {
            //verificar qual secção propriedadeAtual pertence
            if (("Imovel".equals(nomeSeccao) && propriedadeAtual instanceof Imovel) ||
                    ("Veiculo".equals(nomeSeccao) && propriedadeAtual instanceof Veiculo) ||
                    ("AcessorioModa".equals(nomeSeccao) && propriedadeAtual instanceof AcessorioModa)) {
                if (contador < 10) {
                    System.out.println((contador + 1) + "- " + propriedadeAtual.getNome() + " ; Valor: " + propriedadeAtual.getCusto());
                    contador++;
                } else {
                    break;
                }
            }
        }
    }*/
}
