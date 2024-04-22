package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;

import java.util.Scanner;

public class Sims {
    Scanner input = new Scanner(System.in);

    public Pessoa criarJogador(){


        System.out.println("Escolha o nome do jogador: ");
        String nome = input.nextLine();

        System.out.println("Qual o objetivo de vida do seu jogador ?");
        System.out.println("1 - MILIONÁRIO 🤑💰💸💵");
        System.out.println("2- TER UMA FAMÍLIA COMPLETA 👰🏼‍♀️🤵🏼‍♂️🤰🏼👩🏻‍❤️‍👨🏻👨‍👩‍👧‍👦");
        System.out.println("3- SER UMA CELEBRIDADE 📽️💁🏼‍♀️✈️📺📸");
        System.out.println("4- SER UM ATLETA DE CROSSFIT 🏋️🤸🏼💪🏼");
        System.out.println("5- SER UM PROGRAMADOR BACK-END 💻👩🏼‍💻🤘🏼");
        System.out.println("6- SER UM INFLUENCER FITNESS 👙📲📸💸🤳🏼");
        int opcao = input.nextInt();

        Objetivo objetivoVida = null;

        switch (opcao){
            case 1:
                objetivoVida = Objetivo.MILIONARIO;
                break;
            case 2:
                objetivoVida = Objetivo.FAMILIA_COMPLETA;
                break;
            case 3:
                objetivoVida = Objetivo.CELEBRIDADE;
                break;
            case 4:
                objetivoVida = Objetivo.CROSSFITEIRO;
                break;
            case 5:
                objetivoVida = Objetivo.PROGRAMADOR;
                break;
            case 6:
                objetivoVida = Objetivo.INFLUENCER_FITNESS;
                break;

        }

        Pessoa jogador = new Jogador(nome, 0,objetivoVida, null, 100,100,100,0,0);
        return jogador;
    }

    public void momentoDia(){
        //primeiro ciclo para o ciclo de vida; definir valor de 50 para ser o numero total de dias;

        for (int cicloVida = 1; cicloVida <= 100; cicloVida++){
            for (int turnosDia = 0; turnosDia < 3; turnosDia ++){

               
            }
        }



    }

    //onde todas as instâncias de todos os objetos, onde está o fluxo da aplicação;
    //função de MOMENTO DO JOGO (no final vai chamar criarJogador);
    //faver 2 ciclos aninhados para o momento do dia (1 ciclo de 100 dias, 1 ciclo com 4 momentos)

    public void jogo(){

        int opcao;

        do {
            System.out.println("✨ Ótimo, o que te apetece fazer agora? ");

            System.out.println("Bora movimentar esse jogo! 😜 Posso te dar umas opções para ocupares teu tempo: 👌");

            System.out.println();

            System.out.println("1. "+"🔸----- O que achas de começar agora um belo dia de trabalho? 👨🏼‍💻🤑 Não vai te custar nadinha 😊 -----🔸");

            System.out.println("2. "+"🔸----- Estás com sono? 😴😴😴 Que tal descansar e dormir um pouco? -----🔸");

            System.out.println("3. "+"🔸----- Pensando melhor uma boa refeição não seria nada mal agora, hein ? 🍕🍔🍟 Queres comer? 🥞🥙🌮 -----🔸");

            System.out.println("4. "+"🔸----- Preferes tirar o dia para conversar com os amigos/jogar no pc/praticar um hobby -----🔸");

            System.out.println("5. "+"🔸----- Torrar uma boa grana comprando no shopping não seria má ideia, vem comigo 💸💸💸💸 -----🔸");

            System.out.println("6. "+"🔸----- Estudar um pouco me parece uma excelente ideia, que tal uma formação em POO ? 📚💻 -----🔸");

            System.out.println("7. "+"🔸----- Faz tempo que não visitas as tuas propriedades... vamos dar um passeio por elas ? 🚗🌅🏡 -----🔸");

            System.out.println("8. "+"🔸----- Estás aborrecido com teu trabalho atual e queres procurar um novo? 😭🥵🥺 Eu te entendo, vem que te ajudo nisso 😎😎😎 -----🔸");

            opcao=input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("trabalho");
                    //aumenta dinheiro do jogador com base no salário/dia da sua profissão;
                    break;
                case 2:
                    System.out.println("dormir");
                    //repõe a necessidade de sono e volta a 100;
                    break;
                case 3:
                    System.out.println("comer");
                    //repõe a necessidade de refeição de volta e diminui 5 dinheiroa
                    break;
                case 4:
                    //repõe a necessidade social de volta a 100
                    System.out.println("conversar");
                    break;
                case 5:
                    //invocar o método VENDER do shopping
                    System.out.println("Comprar");
                    break;
                case 6:
                    //listar todas as propriedades do jogador
                    System.out.println("visitar propriedades");
                    break;
                case 7:
                    //
                    System.out.println("procurar novo emprego");
                    break;
                default:
                    System.out.println("Tantas opções disponiveis e tu escolheu logo uma que não existe? 😤😤😤");
                    System.out.println("Escolhe uma opção do menu, vai la. 😎🤪");
                    break;
            }

        } while (opcao != 8);
    }

    public void trabalhar(){

    }
}
