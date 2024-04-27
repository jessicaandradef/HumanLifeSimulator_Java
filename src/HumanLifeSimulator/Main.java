package HumanLifeSimulator;

import HumanLifeSimulator.PersonagensJogo.Jogador;

public class Main {
    public static void main(String[] args) {
        Audio.playMusic("src/HumanLifeSimulator/Files/021 Carnival Night Zone - Act 2.mp3");
      Sims jogo = new Sims();
      Jogador jogadorAtual = jogo.criarPessoa();

      jogo.jogo(jogadorAtual);
    }
}
