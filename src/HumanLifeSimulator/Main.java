package HumanLifeSimulator;

import HumanLifeSimulator.PersonagensJogo.Jogador;

public class Main {
    public static void main(String[] args) {
      //  Audio.playMusic("src/HumanLifeSimulator/Files/music.mp3");
      Sims jogo = new Sims();
      Jogador jogadorAtual = jogo.criarPessoa();

      jogo.jogo(jogadorAtual);
    }
}
