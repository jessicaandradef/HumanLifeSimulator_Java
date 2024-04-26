package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;
import HumanLifeSimulator.PersonagensJogo.Jogador;
import HumanLifeSimulator.PersonagensJogo.NPC;
import HumanLifeSimulator.PropriedadeJogador.AcessorioModa;
import HumanLifeSimulator.PropriedadeJogador.Imovel;
import HumanLifeSimulator.PropriedadeJogador.Veiculo;

public class Main {
    public static void main(String[] args) {
        //a classe Pessoa não pode ser instanciada porque é abstrata, causa erro de compilação;
        //começar a testar as classes que estou criando

        //criando um jogador
        //Jogador jogador1 = new Jogador("Jessica", 200, Objetivo.CROSSFITEIRO, , 50, 40, 10, 5, 20);

        //jogador1.exibirDetalhes();

      Sims jogo = new Sims();
      Jogador jogadorAtual = jogo.criarPessoa();

      jogo.jogo(jogadorAtual);

      //teste para NPC
      NPC npc1 = new NPC("jenny marombeira", 30000, 5);
      NPC npc2 = new NPC("sarinha lindinha", 50000, 10);
      NPC npc3 = new NPC("Jéssica lalal", 600000,20);


      //teste para profissão:

      Profissao profissao1 = new Profissao("Atleta Cross", 10000, false, 30, 50);
      Profissao profissao2 = new Profissao("Investidor", 700, true, 9, 20);

      Jogador jogador1 = new Jogador("Jessica", 500000, Objetivo.CROSSFITEIRO, profissao1, 6,5,190,30,30);
      Jogador jogador2 = new Jogador("Luis", 0, Objetivo.MILIONARIO, profissao2, 7, 10, 250, 44,60);


        //teste para add propriedades:

      Shopping shopping1= new Shopping();

      //adicionando propriedades no shopping

      Imovel casa = new Imovel("Casa", 100000, 5, 4);
      Imovel casa1 = new Imovel("Casa1", 100000, 5, 4);
      Imovel casa2 = new Imovel("Casa2", 100000, 5, 4);
      Imovel casa3 = new Imovel("Casa3", 100000, 5, 4);
      Imovel casa4 = new Imovel("Casa4", 100000, 5, 4);
      Imovel casa5 = new Imovel("Casa5", 100000, 5, 4);
      Imovel casa6 = new Imovel("Casa6", 100000, 5, 4);
      Imovel casa7 = new Imovel("Casa7", 100000, 5, 4);
      Imovel casa8 = new Imovel("Casa8", 100000, 5, 4);
      Imovel casa9 = new Imovel("Casa9", 100000, 5, 4);
      Imovel casa10 = new Imovel("Casa10", 100000, 5, 4);

      Veiculo carro = new Veiculo("Mercedes", 15000,4, "Mercedes", "A-45");

      AcessorioModa acessorioModa1 = new AcessorioModa("Fato de treino", 50, 3, "Nike", false);
      AcessorioModa acessorioModa2 = new AcessorioModa("Óculos de sol", 150, 1, "RayBan", false);
      AcessorioModa acessorioModa3 = new AcessorioModa("Saia Jeans", 70, 2, "Diesel", true);
      AcessorioModa acessorioModa4 = new AcessorioModa("Sneakers", 120, 2, "Adidas", false);

      shopping1.addPropriedade(acessorioModa1);
      shopping1.addPropriedade(acessorioModa2);
      shopping1.addPropriedade(acessorioModa3);
      shopping1.addPropriedade(acessorioModa4);

      shopping1.addPropriedade(carro);
      shopping1.addPropriedade(casa);
      shopping1.addPropriedade(casa1);
      shopping1.addPropriedade(casa2);
      shopping1.addPropriedade(casa3);
      shopping1.addPropriedade(casa4);
      shopping1.addPropriedade(casa5);
      shopping1.addPropriedade(casa6);
      shopping1.addPropriedade(casa7);
      shopping1.addPropriedade(casa8);
      shopping1.addPropriedade(casa9);
      shopping1.addPropriedade(casa10);

      shopping1.imprimirCoisasParaComprar(shopping1.getCoisasParaComprar());

      jogador1.addPropriedade(acessorioModa1);
      jogador1.addPropriedade(acessorioModa3);
      jogador1.exibirDetalhes();
      jogador1.possuiAcessorioFormal(); //teste para confirmar se tem ou nao acessorio formal - eu adicionei 1
      //teste ok!!

     // shopping1.vender(jogador1);
      //jogador1.exibirDetalhes();


       /* for (Propriedade propriedadeAtual : shopping1.getCoisasParaComprar()){
            System.out.println("Nome: " + propriedadeAtual.getNome() + " ;Custo: " + propriedadeAtual.getCusto());
        } */

     /* Sims sims = new Sims();
      Pessoa jogador = sims.criarPessoa(); // Criar jogador
      sims.jogo(jogador); // Iniciar o ciclo do jogo   */

        jogador2.addNPC(npc1);
        jogador2.addNPC(npc2);
        jogador2.addNPC(npc3);

        //shopping1.vender(jogador1);


        //  jogador2.exibirDetalhes();


        //Sims.criarJogador();

      CentroDeEmprego ce1 = new CentroDeEmprego();
      ce1.addProfissao(profissao1);
      ce1.addProfissao(profissao2);

      ce1.imprimirListaProfissoes();












       // shopping1.vender(jogador2);
       // System.out.println(jogador2.getDinheiro());
        //jogador1.exibirDetalhes();

        //teste para a função VENDER
       // shopping1.vender(jogador1);


       // Jogador jogador2 = Jogador.criarJogador();
        // jogador2.exibirDetalhes();

     /*   shopping1.addPropriedade(new Imovel("Casa de Praia", 250400, 6, 3));
        shopping1.addPropriedade(new AcessorioModa("Vestidinho", 30, 4, "Zara", true));
        shopping1.addPropriedade(new Veiculo("Mota", 30000, 9, "Mercedes", "A-45" )); */

       // jogador1.exibirDetalhes(); //mesmo quando há dinheiro para
        //teste de impressão de todos os elementos que há no array de compras
      //  shopping1.imprimirCoisasParaComprar();
    }
}
