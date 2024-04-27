package HumanLifeSimulator;

public class RASCUNHO {

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

  */
        /* public void procurarEmprego(Jogador jogadorAtual) {
        Scanner input = new Scanner(System.in);

        CentroDeEmprego.imprimirListaProfissoes(); //imprimir todas as profissões do array listaDeProfissoes;

        System.out.println();
        System.out.println("👨🏼‍🌾👩🏼‍🍳👨🏼‍✈️🧑🏼‍🚒 Escreva o nome da profissão: 👮🏼👨🏼‍🌾👷🏼‍♀️👨🏼‍⚕️");
        String nomeProfissao = input.nextLine(); //profissão de escolha do utilizador depois de ver a lista de empregos

        ArrayList<Profissao> listaDeProfissoes = CentroDeEmprego.getListaDeProfissoes();

        boolean profissaoEncontrada = false;
        Profissao profissaoEscolhida = null;

        for (Profissao profissaoAtual : listaDeProfissoes) {

            if (profissaoAtual.getNome().equalsIgnoreCase(nomeProfissao)) {
                profissaoEncontrada = true;
                profissaoEscolhida = profissaoAtual;
                break;
            }
        }

        //se a profissão for encontrada, verificar se tem criterios para conseguir aquele emprego escolhido ou não;
        if (profissaoEncontrada) {
            boolean temAcessorioFormal = jogadorAtual.possuiAcessorioFormal(); //método para verificar se o jogador tem um acessorio de moda formal na lista de propriedade;

            if (jogadorAtual.getEstatuto() >= profissaoEscolhida.getEstatuto() && jogadorAtual.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao() && temAcessorioFormal) {
                jogadorAtual.setProfissao(profissaoEscolhida);
            } else {
                System.out.println("😥 Sinto muito, você ainda não atende aos critérios para esse cargo 😪");
            }
        }

        //teste para ver se foi aplicado o novo cargo
       // System.out.println(jogadorAtual.getProfissao());
        jogadorAtual.exibirDetalhes();
    }*/
}


