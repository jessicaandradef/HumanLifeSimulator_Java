package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;

public class Main {
    public static void main(String[] args) {
        //a classe Pessoa não pode ser instanciada porque é abstrata, causa erro de compilação;
        //começar a testar as classes que estou criando

        //criando um jogador
        //Jogador jogador1 = new Jogador("Jessica", 200, Objetivo.CROSSFITEIRO, , 50, 40, 10, 5, 20);

        //jogador1.exibirDetalhes();


        //teste para add propriedades:

        Shopping shopping1= new Shopping();

        shopping1.addPropriedade(new Imovel("Loft", 250400, 6, 3));
        shopping1.addPropriedade(new AcessorioModa("Blusinha assimetrica", 30, 4, "Zara", true));
        shopping1.addPropriedade(new Veiculo("Carro", 30000, 9, "Mercedes", "A-45" ));

        for (Propriedade propriedadeAtual : shopping1.getCoisasParaComprar()){
            System.out.println("Nome: " + propriedadeAtual.getNome() + " ;Custo: " + propriedadeAtual.getCusto());
        }

        //teste para profissão:

        Profissao profissao1 = new Profissao("Atleta Cross", 10000, false, 30, 50);

        Jogador jogador1 = new Jogador("Jessica", 0, Objetivo.CROSSFITEIRO, profissao1, 6,5,190,30,30);
        jogador1.exibirDetalhes();

        //teste para a função VENDER
        shopping1.vender(jogador1);

       // Jogador jogador2 = Jogador.criarJogador();
        // jogador2.exibirDetalhes();

        shopping1.addPropriedade(new Imovel("Casa de Praia", 250400, 6, 3));
        shopping1.addPropriedade(new AcessorioModa("Vestidinho", 30, 4, "Zara", true));
        shopping1.addPropriedade(new Veiculo("Mota", 30000, 9, "Mercedes", "A-45" ));

        //shopping1.imprimirCoisasParaComprar();
    }
}
