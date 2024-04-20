package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;

public class Main {
    public static void main(String[] args) {
        //a classe Pessoa não pode ser instanciada porque é abstrata, causa erro de compilação;
        //começar a testar as classes que estou criando

        //criando um jogador
        Jogador jogador1 = new Jogador("Jessica", 200, Objetivo.CROSSFITEIRO, "developer", 50, 40, 10, 5, 20);

        jogador1.exibirDetalhes();


    }
}
