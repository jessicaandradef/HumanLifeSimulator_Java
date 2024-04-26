package HumanLifeSimulator;

import HumanLifeSimulator.PersonagensJogo.Jogador;

public class Main {
    public static void main(String[] args) {

      Sims jogo = new Sims();
      Jogador jogadorAtual = jogo.criarPessoa();

      jogo.jogo(jogadorAtual);

    }
}
