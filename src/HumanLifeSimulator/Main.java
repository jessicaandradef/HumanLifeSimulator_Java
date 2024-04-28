package HumanLifeSimulator;

import HumanLifeSimulator.PersonagensJogo.Jogador;

public class Main {
    public static void main(String[] args) {
      Audio.playMusic("src/HumanLifeSimulator/Files/017-Carnival-Night-Zone-Act-1.wav", true);
      Sims jogo = new Sims();
      Jogador jogadorAtual = jogo.criarPessoa();

      jogo.jogo(jogadorAtual);
    }
}
