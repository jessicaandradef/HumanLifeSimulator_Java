package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;
import HumanLifeSimulator.PersonagensJogo.Jogador;
import HumanLifeSimulator.PersonagensJogo.NPC;
import HumanLifeSimulator.PropriedadeJogador.AcessorioModa;
import HumanLifeSimulator.PropriedadeJogador.Imovel;
import HumanLifeSimulator.PropriedadeJogador.Propriedade;
import HumanLifeSimulator.PropriedadeJogador.Veiculo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sims {

    /**
     * Método que permite criar Pessoa a partir da consola;
     * @return retorna uma instância de Jogador;
     */
    public static Jogador criarPessoa() {

        //variaveis para guardar os atributos iniciais do jogador;

        String nome;
        double dinheiro = 0;
        Profissao profissaoJogador = null;
        int necessidadeSono = 100;
        int necessidadeRefeicao = 100;
        int necessidadeSocial = 100;
        int estatuto = 0;
        int educacao = 0;
        ArrayList<Propriedade> propriedades = new ArrayList<>();
        Objetivo objetivoDeVida = null;
        int condicionamentoFisico = 0;

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("✨✨✨✨✨\t\t\t\t\tEscolha o nome do jogador:\t\t\t\t\t ✨✨✨✨✨");
        nome = input.nextLine();

        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t Qual o objetivo de vida do seu jogador ?");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t🤑💰💸💵       1- SER UM  M I L I O N Á R I O   🤑💰💸💵");
        System.out.println("\t\t\t\t\t\t\t\t\t\t👰🏼‍♀️🤵🏼‍♂️🤰🏼👩🏻‍❤️‍👨🏻       2- TER UMA   F A M Í L I A   C O M P L E T A   👰🏼‍♀️🤵🏼‍♂️🤰🏼👩🏻‍❤️‍👨🏻");
        System.out.println("\t\t\t\t\t\t\t\t\t\t📽️💁🏼‍♀️✈️📺📸     3- SER UMA   C E L E B R I D A D E     📽️💁🏼‍♀️✈️📺📸");
        System.out.println("\t\t\t\t\t\t\t\t\t\t🏋️🤸🏼💪🏼🏃🏼‍       4- SER UM   A T L E T A   D E   C R O S S F I T   🏋️🤸🏼💪🏼🏃🏼‍♂️");
        System.out.println("\t\t\t\t\t\t\t\t\t\t💻👩🏼‍💻🤘🏼💻       5- SER UM   P R O G R A M A D O R   B A C K-E N D   💻👩🏼‍💻🤘🏼💻");
        System.out.println("\t\t\t\t\t\t\t\t\t\t👙📲📸💸🤳🏼     6- SER UM   I N F L U E N C E R   F I T N E S S    👙📲📸💸🤳🏼");
        System.out.println("\t\t\t\t\t\t\t\t\t\t🌏🧭🏞️🏕️🏝️🏖️   7- SER UM   N Ô M A D E   D I G I T A L   🌏🧭🏞️🏕️🏝️🏖️");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t◻️ Escolhe aqui a tua opção: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                objetivoDeVida = Objetivo.MILIONARIO;
                break;
            case 2:
                objetivoDeVida = Objetivo.FAMILIA_COMPLETA;
                break;
            case 3:
                objetivoDeVida = Objetivo.CELEBRIDADE;
                break;
            case 4:
                objetivoDeVida = Objetivo.CROSSFITEIRO;
                break;
            case 5:
                objetivoDeVida = Objetivo.PROGRAMADOR;
                break;
            case 6:
                objetivoDeVida = Objetivo.INFLUENCER_FITNESS;
                break;
            case 7:
                objetivoDeVida = Objetivo.NOMADE_DIGITAL;
                break;

            default:
                System.out.println("Volta lá e escolhes uma opção válida, please 🙃");
                break;
        }

        Jogador jogador = new Jogador(nome, 50000, objetivoDeVida, null, 100, 100, 100, 0, 0, 0);
        return jogador;
    }

    /**
     * Método onde estão todas as instâncias de todos os objetos e onde está o fluxo da aplicação;
     */
    public void jogo(Jogador jogador) {

        Scanner input = new Scanner(System.in);

        //instância dos AcessoriosModa

        AcessorioModa acessorioModa1 = new AcessorioModa("Fato de treino", 50, 3, "Nike", false);
        AcessorioModa acessorioModa2 = new AcessorioModa("Óculos de sol", 20, 1, "RayBan", false);
        AcessorioModa acessorioModa3 = new AcessorioModa("Saia Jeans", 70, 2, "Diesel", true);
        AcessorioModa acessorioModa4 = new AcessorioModa("Sneakers", 120, 2, "Adidas", false);
        AcessorioModa acessorioModa5 = new AcessorioModa("Calça de alfaiataria em linho", 150, 3, "Massimo Dutti", true);
        AcessorioModa acessorioModa6 = new AcessorioModa("Sweater de lã", 100, 1, "Lacoste", true);
        AcessorioModa acessorioModa7 = new AcessorioModa("Cinto de pele ", 70, 1, "Mango", true);
        AcessorioModa acessorioModa8 = new AcessorioModa("Relógio em aço inoxidável ", 250, 3, "Daniel Wellington", false);
        AcessorioModa acessorioModa9 = new AcessorioModa("Pulseira de ouro", 2000, 4, "Hermès", true);
        AcessorioModa acessorioModa10 = new AcessorioModa("Perfume", 35, 4, "Jo Malone", true);
        AcessorioModa acessorioModa11 = new AcessorioModa("Biquine", 50, 3, "Nike", false);
        AcessorioModa acessorioModa12 = new AcessorioModa("Meias ", 15, 1, "Primark", false);
        AcessorioModa acessorioModa13 = new AcessorioModa("Fato clássico", 1500, 3, "Dior", true);
        AcessorioModa acessorioModa14 = new AcessorioModa("Vestido de seda", 1000, 4, "Channel", true);
        AcessorioModa acessorioModa15 = new AcessorioModa("T-shirt", 5, 3, "Nike", true);


        //instancia dos imoveis

        Imovel imovel1 = new Imovel("Casa de praia", 70000, 4, 6);
        Imovel imovel2 = new Imovel("Loft", 40000, 2, 2);
        Imovel imovel3 = new Imovel("Casa geminada", 55000, 4, 4);
        Imovel imovel4 = new Imovel("Sobrado", 1000, 3, 3);
        Imovel imovel5 = new Imovel("Apartamento R/C", 45000, 4, 3);
        Imovel imovel6 = new Imovel("Studio", 30000, 3, 2);
        Imovel imovel7 = new Imovel("Flat", 35000, 2, 2);
        Imovel imovel8 = new Imovel("Bangalô", 40000, 4, 3);
        Imovel imovel9 = new Imovel("Duplex", 80000, 5, 5);
        Imovel imovel10 = new Imovel("Triplex", 90000, 5, 6);
        Imovel imovel11 = new Imovel("Apartamento Rooftop", 65000, 4, 4);
        Imovel imovel12 = new Imovel("Barraca de Camping", 100, 1, 2);
        Imovel imovel13 = new Imovel("Quinta ", 60000, 5, 10);
        Imovel imovel14 = new Imovel("Casa de campo", 50000, 5, 6);
        Imovel imovel15 = new Imovel("Palácio", 100000, 5, 12);

        //instancia dos veículos

        Veiculo veiculo1 = new Veiculo("Carro elétrico", 7000, 4, "Tesla", "ZZZ");
        Veiculo veiculo2 = new Veiculo("Mota ", 2000, 3, "Yamaha", "MT-125");
        Veiculo veiculo3 = new Veiculo("Scotter", 3000, 2, "Vespa", "Zard");
        Veiculo veiculo4 = new Veiculo("Super carro de corrida", 10000, 5, "Lamborghini ", "Urus ");
        Veiculo veiculo5 = new Veiculo("Lancha ", 30000, 4, "Focker ", "MasterCraft");
        Veiculo veiculo6 = new Veiculo("Barquinho pescador", 1000, 3, "Hodgon", "Rei dos Mares");
        Veiculo veiculo7 = new Veiculo("Camião", 12000, 3, "Volkswagem", "Tomba Tudo");
        Veiculo veiculo8 = new Veiculo("Bike para criança", 100, 1, "AllBike", "Miudinhos");
        Veiculo veiculo9 = new Veiculo("Bike de aventura/montanha", 500, 3, "AllBike", "Aventureiros");
        Veiculo veiculo10 = new Veiculo("Trotinete", 350, 2, "Segway", "NineBot");
        Veiculo veiculo11 = new Veiculo("Iate", 50000, 4, "Yachts", "Ferretti");
        Veiculo veiculo12 = new Veiculo("Carro de mão", 25, 4, "Tesla", "ZZZ");
        Veiculo veiculo13 = new Veiculo("Helicoptero", 90000, 5, "Pantera do Céu", "BlackPanther");
        Veiculo veiculo14 = new Veiculo("Jetski ", 4000, 2, "Hayley Sea", "HS-55");
        Veiculo veiculo15 = new Veiculo("Velocipe", 70, 1, "Kids Toys", "Reizinho dos Passeios");

        //instancias dos NPC (familia do jogador)

        NPC npc1 = new NPC("Luis", 30000, 2);
        NPC npc2 = new NPC("Caio", 9000, 4);
        NPC npc3 = new NPC("Sarinha", 10000, 5);
        NPC npc4 = new NPC("Anna", 8000, 3);
        NPC npc5 = new NPC("Manu", 15000, 2);
        NPC npc6 = new NPC("Marcelo", 20000, 4);
        NPC npc7 = new NPC("Bruna", 25000, 3);
        NPC npc8 = new NPC("Veronica", 17000, 5);
        NPC npc9 = new NPC("Paulo", 6000, 3);
        NPC npc10 = new NPC("Tiago", 22000, 2);

        //npc para adoção: NPC aleatório sem dinheiro e estatutoMinimo ao Array da família

        NPC npcAdocao1 = new NPC("Bibi", 0, 0);
        NPC npcAdocao2 = new NPC("Lolo", 0, 0);
        NPC npcAdocao3 = new NPC("Nuno", 0, 0);
        NPC npcAdocao4 = new NPC("Mila", 0, 0);
        NPC npcAdocao5 = new NPC("Ruizinho", 0, 0);
        NPC npcAdocao6 = new NPC("Kaya", 0, 0);
        NPC npcAdocao7 = new NPC("Roma", 0, 0);
        NPC npcAdocao8 = new NPC("Nina", 0, 0);
        NPC npcAdocao9 = new NPC("Leo", 0, 0);
        NPC npcAdocao10 = new NPC("Luna", 0, 0);


        //instancias das profissões

        Profissao profissao1 = new Profissao("Atleta CrossFit", 300, false, 2, 2);
        Profissao profissao2 = new Profissao("Software Developer", 350, true, 1, 4);
        Profissao profissao3 = new Profissao("Design Interiores", 250, false, 2, 3);
        Profissao profissao4 = new Profissao("Agricultor", 200, false, 0, 0);
        Profissao profissao5 = new Profissao("Contabilista", 210, true, 2, 3);
        Profissao profissao6 = new Profissao("Chef de Cozinha", 240, true, 3, 3);
        Profissao profissao7 = new Profissao("Professor", 200, true, 3, 4);
        Profissao profissao8 = new Profissao("Médico", 400, true, 3, 4);
        Profissao profissao9 = new Profissao("Gerente de Loja", 230, false, 2, 2);
        Profissao profissao10 = new Profissao("Nutricionista", 230, true, 2, 3);

        //adicionar os empregos no Centro de Emprego

        CentroDeEmprego centroDeEmprego = new CentroDeEmprego();
        centroDeEmprego.addProfissao(profissao1);
        centroDeEmprego.addProfissao(profissao4);
        centroDeEmprego.addProfissao(profissao2);
        centroDeEmprego.addProfissao(profissao3);
        centroDeEmprego.addProfissao(profissao5);
        centroDeEmprego.addProfissao(profissao6);
        centroDeEmprego.addProfissao(profissao7);
        centroDeEmprego.addProfissao(profissao8);
        centroDeEmprego.addProfissao(profissao9);
        centroDeEmprego.addProfissao(profissao10);

        //adicionar propriedades de acessorios de moda no Shopping

        Shopping shopping = new Shopping();
        shopping.addPropriedade(acessorioModa1);
        shopping.addPropriedade(acessorioModa2);
        shopping.addPropriedade(acessorioModa3);
        shopping.addPropriedade(acessorioModa4);
        shopping.addPropriedade(acessorioModa5);
        shopping.addPropriedade(acessorioModa6);
        shopping.addPropriedade(acessorioModa7);
        shopping.addPropriedade(acessorioModa8);
        shopping.addPropriedade(acessorioModa9);
        shopping.addPropriedade(acessorioModa10);
        shopping.addPropriedade(acessorioModa11);
        shopping.addPropriedade(acessorioModa12);
        shopping.addPropriedade(acessorioModa13);
        shopping.addPropriedade(acessorioModa14);
        shopping.addPropriedade(acessorioModa15);


        //adicionar propriedades de imóveis no Shopping

        shopping.addPropriedade(imovel1);
        shopping.addPropriedade(imovel2);
        shopping.addPropriedade(imovel3);
        shopping.addPropriedade(imovel4);
        shopping.addPropriedade(imovel5);
        shopping.addPropriedade(imovel6);
        shopping.addPropriedade(imovel7);
        shopping.addPropriedade(imovel8);
        shopping.addPropriedade(imovel9);
        shopping.addPropriedade(imovel10);
        shopping.addPropriedade(imovel11);
        shopping.addPropriedade(imovel12);
        shopping.addPropriedade(imovel13);
        shopping.addPropriedade(imovel14);
        shopping.addPropriedade(imovel15);

        //adicionar propriedades de veiculos no Shopping

        shopping.addPropriedade(veiculo1);
        shopping.addPropriedade(veiculo2);
        shopping.addPropriedade(veiculo3);
        shopping.addPropriedade(veiculo4);
        shopping.addPropriedade(veiculo5);
        shopping.addPropriedade(veiculo6);
        shopping.addPropriedade(veiculo7);
        shopping.addPropriedade(veiculo8);
        shopping.addPropriedade(veiculo9);
        shopping.addPropriedade(veiculo10);
        shopping.addPropriedade(veiculo11);
        shopping.addPropriedade(veiculo12);
        shopping.addPropriedade(veiculo13);
        shopping.addPropriedade(veiculo14);
        shopping.addPropriedade(veiculo15);

        //adicionar NPC no array de npc pretendentes

        addNPC(npc1);
        addNPC(npc2);
        addNPC(npc3);
        addNPC(npc4);
        addNPC(npc5);
        addNPC(npc6);
        addNPC(npc7);
        addNPC(npc8);
        addNPC(npc9);
        addNPC(npc10);

        //adicionar NPC no array de npc bebes para adoção

        addNPCbebe(npcAdocao1);
        addNPCbebe(npcAdocao2);
        addNPCbebe(npcAdocao3);
        addNPCbebe(npcAdocao4);
        addNPCbebe(npcAdocao5);
        addNPCbebe(npcAdocao6);
        addNPCbebe(npcAdocao7);
        addNPCbebe(npcAdocao8);
        addNPCbebe(npcAdocao9);
        addNPCbebe(npcAdocao10);



        // 2 ciclos aninhados: um para o dia e outro para os momentos do dia(4 momentos do dia );
        //100 será o total de dias;
        for (int dia = 1; dia <= 100; dia++) {

            switch (dia){
                case 30:
                    rotinaUniversidade(jogador);
                    break;
                case 3:
                    casamento(jogador);
                    break;
                case 5:
                    ficarDoente(jogador);
                    break;
                case 10:
                    tempoChuvoso(jogador);
                    break;
                case 15:
                    competicaoCrossfit(jogador);
                    break;
                case 2:
                    eventoPublico(jogador);
                    break;

                default:
                    for (int momentoDia = 1; momentoDia <= 4; momentoDia++) {

                        switch (momentoDia) {
                            case 1: //pela manhã
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tÉ hora de começar mais um dia ... 🤗🤗🤗");
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🌤️🌤️🌤️🌤️🌤️🌤️  M A N H Ã  🌤️🌤️🌤️🌤️🌤️🌤️");
                                break;
                            case 2: //meio dia
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t☀️☀️☀️☀️☀️☀️  M E I O - D I A  ☀️☀️☀️☀️☀️☀️");
                                break;
                            case 3: // meio da tarde
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🌇🌇🌇🌇🌇🌇  T A R D E  🌇🌇🌇🌇🌇🌇");
                                break;
                            case 4: //noite
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🌛🌠🌛🌠🌛🌠  N O I T E  🌛🌠🌛🌠🌛🌠");
                                break;
                        }
                        momentoDia(jogador, shopping, centroDeEmprego);
                    }
                    atualizarNecessidades(jogador);
                    if (jogador.isCasado()){ //no final de cada dia o dinheiro do jogador aumenta em 30 dinheiros se ele for casado
                        jogador.setDinheiro(jogador.getDinheiro() + 30);
                        custoDespesaFamilia(jogador);
                        retirarFilhos(jogador);
                    }
            }
        } if (verificarVitoria(jogador)){
            System.out.println("Parabéns pela vitória!");
        } else {
            System.out.println();
            System.out.println("Deseja jogar o jogo novamente?  (y/n)   ");   //reiniciar o jogo se jogador perder;
            String escolha = input.next();

            if (escolha.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("Seu desejo é uma ordem! Iniciando novo jogo 🌟🌟🌟");
                reiniciarJogo();
                System.out.println();

            } else {
                System.out.println();
                System.out.println("Obrigada por jogar no SIMS DEV! Te espero na próxima  😉😉😉😉");
                System.out.println("BYE BYE 👋🏽👋🏽👋🏽👋🏽");
            }
        }
    }

    public void momentoDia(Jogador jogador, Shopping shopping, CentroDeEmprego centroDeEmprego) {   //precisei colocar Shopping para conseguir aceder ao que foi instanciado

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("\t\t\t\t\t\tBora movimentar esse jogo! 😜 Posso te dar umas opções para ocupares teu tempo agora: 👌");
        System.out.println();

        System.out.println("\t\t\t\t\t\t1. " + "🔸----- O que achas de começar agora um belo dia de trabalho? 👨🏼‍💻🤑 Não vai te custar nadinha 😊 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t2. " + "🔸----- Estás com sono? 😴😴😴 Que tal descansar e dormir um pouco? -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t3. " + "🔸----- Pensando melhor uma boa refeição não seria nada mal agora, hein ? 🍕🍔🍟 Queres comer? 🥞🥙🌮 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t4. " + "🔸----- Preferes sair da preguiça e ir treinar? 🏃🏼‍♂️💪🏼 A aula de CrossFit começa agora mesmo 🤸🏼‍♂️🏋🏼‍♂️🏋🏼‍♀️💪🏼 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t5. " + "🔸----- Torrar uma boa grana comprando no shopping não seria má ideia, vem comigo 💸💸💸💸 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t6. " + "🔸----- Estudar me parece uma excelente ideia, que tal uma nova formação ? 📚💻 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t7. " + "🔸----- Faz tempo que não visitas as tuas propriedades... vamos dar um passeio por elas ? 🚗🌅🏡 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t8. " + "🔸----- Estás aborrecido com teu trabalho atual e queres procurar um novo? 😭🥵🥺 Eu te entendo, vem que te ajudo nisso 😎😎😎 -----🔸");
        System.out.println();

        System.out.println("\t\t\t\t\t\t9. " + "🔸----- Um pouco curioso para saber teu status no jogo ? 🎮🪄 Posso te mostrar como estás no momento 😉😉😉 -----🔸");
        System.out.println();

        if (jogador.isCasado()){ //só vai passar para essa opção de adocação depois de casar
            System.out.println("\t\t\t\t\t\t10. " + "🔸----- 🍼🍼🍼 Agora que estás casado, seria uma boa altura para aumentar a família? Que tal adotar um bebê? 🍼🍼🍼👶🏽👶🏽👶🏽 -----🔸");
            System.out.println();
        }

        System.out.println("\t\t\t\t\t\t✨ Ótimo, agora me diz o que te apetece fazer agora? ");
        System.out.println();

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                primeiroEmprego(jogador);
                break;
            case 2:
                dormir(jogador);
                break;
            case 3:
                comer(jogador);
                break;
            case 4:
                treinar(jogador);
                break;
            case 5:
                fazerCompras(jogador,shopping );
                break;
            case 6:
                terFormacao(jogador);
                break;
            case 7:
                verPropriedades(jogador);
                break;
            case 8:
                procurarEmprego(jogador);
                break;
            case 9:
                jogador.exibirDetalhes();
                break;
            case 10:
                if (jogador.isCasado()) {
                    adotarCrianca(jogador); //opção do menu desbloqueada se jogador for casado, possibilidade de adotar criança;
                    break;
                }
            default:
                System.out.println("Tantas opções disponiveis e tu escolheu logo uma que não existe? 😤😤😤");
                System.out.println("Escolhe uma opção do menu, vai la. 😎🤪");
                break;
        }
    }

    /**
     * Método que permite ao jogador reiniciar o jogo se por acaso perder o jogo;
     * Será criado uma nova instância Sims;
     * Será invocado o método criarPessoa para criar novo jogador,
     * e a partir disso será criado uma instância de Jogador.
     */
    public static void reiniciarJogo(){

        Sims jogo = new Sims();
        Jogador novoJogador = criarPessoa(); //
        jogo.jogo(novoJogador); //chama o método jogo() na instância jogo

    }


    /**
     * Método que permite ao utilizador escolher a primeira profissão (array de profissões da classe CentroDeEmprego);
     * Ao escolher a profissão atualiza a profissão do jogador;
     * SE o jogador já tiver profissão, ele recebe o salário do dia mediante a profissão definida;
     * @param jogadorAtual
     */
    public void primeiroEmprego(Jogador jogadorAtual){
        Scanner input = new Scanner(System.in);

        if (jogadorAtual.getProfissao() == null) {
            System.out.println();
            System.out.println("Estas prestes a dar um grande passo na tua vida profissional:");
            System.out.println("Conseguir o teu primeiro emprego 🤩🤩🤩🤩🤩");
            System.out.println();
            System.out.println("🔘 Esses são os empregos disponíveis atualmente no Centro de Empregos: 🔘 ");
            System.out.println();

            CentroDeEmprego.imprimirListaProfissoes();

            System.out.println();
            System.out.println("Digite aqui o número do emprego que você quer: ");
            int escolha = input.nextInt();

            ArrayList<Profissao> listaDeProfissao = CentroDeEmprego.getListaDeProfissoes();

            if (escolha >= 1 && escolha <= listaDeProfissao.size()){
                Profissao profissaoEscolhida = listaDeProfissao.get(escolha - 1);

                jogadorAtual.setProfissao(profissaoEscolhida);
                jogadorAtual.setEstatuto(profissaoEscolhida.getEstatuto()); //atualizar estatuto do jogador com o estatuto da profissão

                System.out.println("PARABÉÉÉÉÉNS! 🎉🎉🎉🎉 Agora tens um emprego, já podes começar a ganhar dinheiro trabalhando !!!");
                System.out.println();
                System.out.println("Esses são os detalhes da tua nova profissão: ");
                jogadorAtual.getProfissao().exibirDetalhesProfissao();
            } else {
                System.out.println("Escolhe uma profissão válida, por favor ");
            }
        } else {
            Profissao profissaoAtual = jogadorAtual.getProfissao();
            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + profissaoAtual.getSalarioDia());

            System.out.println(" Você foi recompensado com " + profissaoAtual.getSalarioDia() + " dinheiros pelo seu dia de trabalho 💸😉");
            System.out.println("O teu saldo atual é de " + jogadorAtual.getDinheiro() +" dinheiros 🤑🤑. Continuas assim que vais terminar bem!!");
        }
    }


    /**
     * Método que repõe a necessidade de sono de volta a 100;
     *
     * @param jogadorAtual
     */
    public void dormir(Jogador jogadorAtual) {

        jogadorAtual.setNecessidadeSono(100);
        System.out.println("😴😴  Com esse cochilo você aumentou a necessidade de sono em " + jogadorAtual.getNecessidadeSono() + " pontos!");
    }

    /**
     * Método que repõe a necessidade de refeição de volta a 100 e diminui 5 dinheiros do Jogador;
     *
     * @param jogadorAtual
     */
    public void comer(Jogador jogadorAtual) {

        jogadorAtual.setNecessidadeRefeicao(100);
        jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() - 5);
        System.out.println("De barriga cheia tudo fica melhor, né ? 🥪☺️");
        System.out.println("A tua refeição custou 5 dinheiros! 🤑🤑 Teu saldo total é de : " + jogadorAtual.getDinheiro() + " dinheiros. 💸💸💸");

    }

    /**
     * Método que repõe a necessidade social de volta a 100 se o jogador escolher treinar;
     *
     * @param jogadorAtual
     */
    public void treinar(Jogador jogadorAtual) {

        //se o jogadorAtual tiver o objetivo de vida crossfitter, aumanta o condicionamento físico também
        if (jogadorAtual.getObjetivoVida().equals(Objetivo.CROSSFITEIRO)){
            jogadorAtual.setCondicionamentoFisico(jogadorAtual.getCondicionamentoFisico() + 250);
            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + 200);
            jogadorAtual.setNecessidadeSocial(jogadorAtual.getNecessidadeSocial() + 100);
            System.out.println();
            System.out.println("Pelos vistos o teu objetivo de vida é ser um eterno Crossfitter... 🤩🤩🤩");
            System.out.println("Sendo assim, ganhaste 200 dinheiros por ser atleta da modalidade 💪🏼💪🏼💪🏼");
            System.out.println("Ganhou também 50 pontos no teu social pela tua interação com outros atletas 👭👩🏻‍🤝‍👨🏻👩🏻‍🤝‍👨🏻 ");
            System.out.println();
            System.out.println("💪🏽💪🏽💪🏽 Teu condicionamento físico está aumentando e ficando incrível!! 😧 Já consigo ver teus gominhos daqui, PARABENS! 💪🏽💪🏽💪🏽 ");

            System.out.println();

        } else {  //se não tiver o objetivo de vida ser crossfitter
            System.out.println();
            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + 150);
            jogadorAtual.setNecessidadeSocial(jogadorAtual.getNecessidadeSocial() + 100);
            System.out.println("💪🏼💪🏼💪🏼 Você foi premiado pela sua excelente disposição em fazer um treino de CROSSFIT!! ");
            System.out.println("💸💸💸 Ganhou 150 dinheiros 💸💸💸");
            System.out.println("Ganhou também 50 pontos no teu social pela tua interação com outros atletas 👭👩🏻‍🤝‍👨🏻👩🏻‍🤝‍👨🏻 ");
            System.out.println();

        }
    }

    /**
     * Método que invoca o método vender da classe Shopping;
     * @param jogadorAtual
     */
    public void fazerCompras(Jogador jogadorAtual, Shopping shopping) {

        shopping.vender(jogadorAtual);
    }

    /**
     * Método que aumenta a educação do jogador em +30 e o estatuto em +5 se escolher essa opção no menu;
     * @param jogadorAtual
     */
    public void terFormacao(Jogador jogadorAtual) {
        jogadorAtual.setEducacao(jogadorAtual.getEducacao() + 30);
        jogadorAtual.setEstatuto(jogadorAtual.getEstatuto() + 5);
        System.out.println();
        System.out.println("Parabéns pelo teu esforço contínuo!! 🤩🤩🤩");
        System.out.println();
        System.out.println("Essa formação tem um custo de 30 dinheiros, tenho certeza que será um bom investimento 💻💻");
        System.out.println("Através do conhecimento vais longe! Continue assim 🥳🥳🥳");
        System.out.println("Com essa nova formação você aumentou a sua educação em 30 pontos e seu estatuto em 5 pontos😉");
        System.out.println();
    }

    /**
     * Método que imprime na consola as propriedades que o jogador tem;
     * @param jogadorAtual
     */
    public void verPropriedades(Jogador jogadorAtual) {

        System.out.println("🏘️🏙️🏚️🏕️    TUAS PROPRIEDADES    🏘️🏙️🏚️🏕️");

        boolean temImovel = false;
        for (Propriedade propriedadeAtual : jogadorAtual.getPropriedades()){

              if (propriedadeAtual instanceof Imovel){
                propriedadeAtual.exibirDetalhesPropriedade();
                temImovel = true;
            }
        }

        if (!temImovel){
            System.out.println("Ainda não tens nenhum imóvel registado em teu nome. 😥🤷🏽‍♀️");
            System.out.println("Podes ver o que tem disponível para compra na IMOBILIARIA SIMS DEV 🏙️🏙️🏙️🏙️");
        }
    }

    /**
     * Método para o jogador procurar emprego um novo emprego e fazer set da profissão atual;
     * Primeiro imprime todas as profissões disponiveis no Centro de Emprego,
     * depois verifica se o jogador tem os criterios suficientes para fazer a mudança para o emprego escolhido ou não;
     * @param jogadorAtual
     */
    public void procurarEmprego(Jogador jogadorAtual) {
        Scanner input = new Scanner(System.in);

        CentroDeEmprego.imprimirListaProfissoes(); //imprimir todas as profissões do array listaDeProfissoes;

        System.out.println();
        System.out.println("👨🏼‍🌾👩🏼‍🍳👨🏼‍✈️🧑🏼‍🚒 Escreva o nome da profissão: 👮🏼👨🏼‍🌾👷🏼‍♀️👨🏼‍⚕️");
        String nomeProfissao = input.nextLine(); //profissão de escolha do utilizador depois de ver a lista de empregos

        ArrayList<Profissao> listaDeProfissoes = CentroDeEmprego.getListaDeProfissoes();

       boolean profissaoEncontrada = false; //boolean para verificar se emprego foi achado ou não;
        Profissao profissaoEscolhida = null;

        for (Profissao profissaoAtual : listaDeProfissoes) {

            if (profissaoAtual.getNome().equalsIgnoreCase(nomeProfissao)) {
               profissaoEncontrada = true; //altera variavel para true
                profissaoEscolhida = profissaoAtual; //a profissão escolhida será a profissão atual

                if (profissaoEscolhida.isFormal()){ //verificar se a profissão é formal é true
                    if (jogadorAtual.possuiAcessorioFormal()){ //se o jogador tem pelo menos 1 acessorio formal
                        if (jogadorAtual.getEstatuto() >= profissaoEscolhida.getEstatuto() && jogadorAtual.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao()){
                            jogadorAtual.setProfissao(profissaoEscolhida);  //altera o cargo do jogador se atender aos criterios para a mudança
                            System.out.println("Parabens, você acabou de ser admitido para o cargo de " + profissaoEscolhida.getNome());
                            System.out.println("Vamos celebrar 🥂🥂🥂🥂🥂🥂");
                            System.out.println();
                        } else { //se o jogador tiver um acessorio formal mas não tiver o restante dos critérios
                            System.out.println("Sinto muito, você ainda não tem critérios para esse cargo 😣😣");
                            System.out.println();

                        }
                    }else{ //se o jogador escolher uma profissão formal e ainda não tiver um acessorio formal nas suas propriedades
                        System.out.println("Desculpe, para esse cargo você precisa de pelo menos 01 acessório formal");
                        System.out.println("Podes ir as compras no SHOPPING SIMS DEV 👔👗👜👞👠");
                        System.out.println();
                    }
                }else { //se a profissão escolhida não for formal
                    if (jogadorAtual.getEstatuto() >= profissaoEscolhida.getEstatuto() && jogadorAtual.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao()){
                        jogadorAtual.setProfissao(profissaoEscolhida); //set do emprego se atender aos criterios
                        System.out.println("Parabens, você acabou de ser admitido para o cargo de " + profissaoEscolhida.getNome());
                        System.out.println("Vamos celebrar 🥂🥂🥂🥂🥂🥂");
                    } else {
                        System.out.println("Poxa 😥😥 você ainda não atende aos critérios do cargo");
                        System.out.println("Continua a procura, nao desista!! ");
                    }
                }
            }

        } if (!profissaoEncontrada){ //se a profissão não for encontrada no array de profissões
            System.out.println("Essa profissão não existe, sorry ");
        }
    }

    /**
     * Método que atualiza as necessidades do jogador no final de cada ciclo da iteração, ou seja, no final de cada dia.
     * A necessidade sono diminui 25 pontos, a necessidade refeição diminui 20 pontos e a necessidade social diminui 15 pontos.
     *Alerta o usuario se necessidadeSono e necessidadeRefeição estiver abaixo de 25 pontos;
     * @param jogadorAtual
     */
    public void atualizarNecessidades(Jogador jogadorAtual) {
        int necessidadeSono = jogadorAtual.getNecessidadeSono() - 25;
        int necessidadeRefeicao = jogadorAtual.getNecessidadeRefeicao() - 20;
        int necessidadeSocial = jogadorAtual.getNecessidadeSocial() - 15;

        jogadorAtual.setNecessidadeSono(necessidadeSono);
        jogadorAtual.setNecessidadeRefeicao(necessidadeRefeicao);
        jogadorAtual.setNecessidadeSocial(necessidadeSocial);

        if (jogadorAtual.getNecessidadeSono() < 25 ){

            System.out.println();
            System.out.println();
            System.out.println("⛔⛔⛔ ATENÇÃO: ESTÁS A FICAR SEM RESERVA DE SONO... ⛔⛔⛔");
            System.out.println(" 😴😴😴 Aconselho ir dormir para aumentar tua disposição e renovar teus pontos 😴😴😴");
            System.out.println();
            System.out.println();

        } else if (jogadorAtual.getNecessidadeRefeicao() <25 ) {

            System.out.println();
            System.out.println();
            System.out.println("⛔⛔⛔ ATENÇÃO: ESTÁS A FICAR SEM RESERVA DE COMIDA... ⛔⛔⛔");
            System.out.println(" 🥗🥙🍜🍳🥞 Aconselho uma boa refeição para aumentar tua disposição e renovar teus pontos 🥗🥙🍜🍳🥞");
            System.out.println();
            System.out.println();
        }

    }

    /**
     * Método que reduz 10 dinheiros do jogador atual a cada integrante da família (array de família do jogador);
     * Esse método verifica também se o jogador tem valor inferior a -3500 dinheiros, se tiver filhos, serão retirados
     * @param jogadorAtual
     */
    public void custoDespesaFamilia(Jogador jogadorAtual){

        int custoPorPessoa = 10;

        for (NPC npcAtual : jogadorAtual.getFamilia()){
            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() - custoPorPessoa);
        }

    }

    public void retirarFilhos(Jogador jogadorAtual){

        if (jogadorAtual.getDinheiro() < 20000 && jogadorAtual.getFamilia().size() > 1){

            ArrayList<NPC> familia = jogadorAtual.getFamilia();
            ArrayList<NPC> copiaFamilia = new ArrayList<>(familia);

            for (NPC npcAtual : copiaFamilia) {
                if (npcAtual.getDinheiro() == 0 && npcAtual.getEstatutoMinimo() == 0){
                    familia.remove(npcAtual);
                }
            }
            System.out.println("Seu saldo atual é inferior a -3500 dinheiros 💸💸💸");
            System.out.println("Sinto informar mas com esse valor não há condições para cuidar dos seus bebês 💔💔💔");
            System.out.println();
            System.out.println("❤️‍🩹❤️‍🩹❤️‍🩹😭😭😭 A SEGURANÇA SOCIAL TIROU SEUS FILHOS DA SUA FAMÍLIA ❤️‍🩹❤️‍🩹❤️‍🩹😭😭😭");
            System.out.println();
        }
    }

    /**
     *Método que permite um evento aleatório no jogo que é a ida à universidade;
     * Se o jogador aceitar o convite, é reduzido o valor do custo do evento, e aumenta o valor da educação do jogador;
     * @param jogadorAtual
     */
    public void rotinaUniversidade(Jogador jogadorAtual) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hoje é um dia muito especial  🏫📚");
        System.out.println();
        System.out.println("⭐⭐⭐ Estás indo rumo a um futuro brilhante com as formações que tens feito ao longo desse tempo... ⭐⭐⭐");
        System.out.println();
        System.out.println("🏫📚🏫📚       Gostarias de dar um passo a frente e entrar na UNIVERSIDADE SIMS DEV ?   (y/n)    🏫📚🏫📚");
        String escolha = input.next();

                if (escolha.equalsIgnoreCase("y")) {
                    jogadorAtual.setEducacao(jogadorAtual.getEducacao() +  50); //aumenta educação em 50
                    jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() - 3000); //reduz 3000 do dinheiro total;
                    System.out.println();
                    System.out.println("PARABÉNS por essa conquista incrivel! 💻🤩💻🤩");
                    System.out.println("Tenho certeza que esse investimento vai valer muito a pena!");
                    System.out.println("Boa sorte na tua jornada 🥂🥂🥂🥂🥂🥂");

                } else {
                    System.out.println("Pelos vistos não tens a intenção de fazer universidade... 😣 ");
                    System.out.println("Desejo boa sorte no caminho que desejares trilhar 😉😉 ");

                }
    }


    /**
     * Criação de arrayList que armazena uma lista de pretendentes NPC para o futuro casamento;
     */
    public static ArrayList<NPC> pretendentes = new ArrayList<NPC>();

    /**
     * Método que permite adicionar um NPC no array da lista de pretendentes;
     * @param npc
     */
    public void addNPC(NPC npc){

        pretendentes.add(npc);
    }

    /**
     * Criação de arrayList que armazena uma lista de bebes NPC para uma futura adoção;
     */
    public static ArrayList<NPC> bebesAdocao = new ArrayList<NPC>();

    /**
     * Método que permite adicionar um NPC no array da lista de bebês para adoção;
     * @param npc
     */
    public void addNPCbebe(NPC npc){
        bebesAdocao.add(npc);
    }

    /**
     * Método que permite a impressão dos NPC disponíveis no array de pretendentes com dinheiro acima de 0;
     * Esses serão os NPC aptos para pretendentes do casamento;
     */
    public void imprimirListaNpc(){
        for (NPC npcAtual: pretendentes){
            if (npcAtual.getDinheiro() > 0){
                npcAtual.exibirDetalhes();
            }
        }
    }

    /**
     * Método que permite do jogador a opção de CASAMENTO (evento aleatório do jogo);
     * O jogador tem a possibilidade de aceitar ou recusar a proposta;
     * Se aceitar, é feito a verificação da escolha do NPC; será verificado também se atende aos criterios do casamento invocando os métodos necessários para a verificação;
     * @param jogadorAtual
     */
    public void casamento(Jogador jogadorAtual) {

        Scanner input = new Scanner(System.in);
        String escolha;

                 System.out.println();
                System.out.println();

                System.out.println("Vejo que estás caminhando bem nessa vida... ✨✨ ");
                System.out.println("O que achas de dar um próximo grande passo e CASARES? 🤵🏼‍♂️💒👰🏼");
                System.out.println("👩🏼‍❤️‍💋‍👨🏻👩🏼‍❤️‍💋‍👨🏻👩🏼‍❤️‍💋‍👨🏻👩🏼‍❤️‍💋‍👨🏻 Aceitas? 👩🏼‍❤️‍💋‍👨🏻👩🏼‍❤️‍💋‍👨🏻👩🏼‍❤️‍💋‍👨🏻👩🏼‍❤️‍💋‍👨🏻 (y/n)");
                escolha = input.next();

                switch (escolha) {
                    case "y":
                        System.out.println();
                        System.out.println("Chegamos na melhor parte!!!!!! ");
                        System.out.println("🥰🥰🥰🥰 A ESCOLHA DO PRETENDENTE: 🥰🥰🥰🥰");
                        System.out.println();
                        imprimirListaNpc();
                        System.out.println();

                        NPC npcEscolhido = escolherNPC(jogadorAtual); //invoca método de escolher o npc
                        System.out.println();

                        if (podeCasar(jogadorAtual, npcEscolhido)) {

                            System.out.println();
                            System.out.println("\t\t\t\t\t\t🎶🎶🎶 PANPANPANPAN 🎶🎶🎶 PANPANPANPAN 🎶🎶🎶 PANPANPANPAN 🎶🎶🎶 PANPANPANPAN 🎶🎶🎶");
                            System.out.println();
                            System.out.println(jogadorAtual.getNome() + ", você aceita " + npcEscolhido.getNome() + " como seu futuro/a esposo/a ?   (y/n)");
                            escolha = input.next();

                            if (escolha.equalsIgnoreCase("y")){

                                //se o casamento acontecer, aumenta ao dinheiro do jogador todo o dinheiro que o npc tem;
                                jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + npcEscolhido.getDinheiro());
                                npcEscolhido.setDinheiro(0); //atualiza o dinheiro do NPC para 0;

                                jogadorAtual.addNPC(npcEscolhido); //npn escolhido entra oficialmente para a familia 😎

                                jogadorAtual.setCasado(true); //atualiza estado do jogador

                                System.out.println("🎉🎉🎉🎉🥂🥂🥂 EU VOS DECLARO CASADOOOOOS 🎉🎉🎉🎉🥂🥂🥂 ");
                                System.out.println();
                            } else {
                                System.out.println("Casamento cancelado, partistes o coração do teu pretendente 😭");
                                System.out.println();

                            }
                        }
                        break;

                    case "n":
                        System.out.println();
                        System.out.println("🍾🍷🍸🍹🥂🍻🍺");
                        System.out.println("Eitaaaaa, queres continuar na vida de copos e amigos");
                        System.out.println("Eu compreendo, talvez ainda não tenhas encontrado um grande amor para tua vida...");
                        System.out.println("Partistes o coração de alguém... 💔❤️‍🩹💔❤️‍🩹");
                        System.out.println("Vida que segue !! 🍻🍺 ");
                        System.out.println();
                        break;
                    default:
                        System.out.println("Sei que posso ter te pegado de surpresa...");
                        System.out.println("Mas para essa pergunta só há 2 opções de resposta: ");
                        System.out.println("YYYYEEESSSSS OU NNNNOOOOOOO, me responde ai, vai ☺️😉😋 ");
                        break;
        }
    }

    /**
     * Método que identifica o NPC que o jogador quer casar;
     * Percorre o array de NPC do jogador e faz a correspondência com o NPC escolhido;
     * @param jogadorAtual
     * @return NPC que o jogador escolheu para casar;
     */
    public static NPC escolherNPC(Jogador jogadorAtual) {

        Scanner input = new Scanner(System.in);
        String escolha;

        System.out.println();
        System.out.println("Escreve o NOME do teu futuro noivo/noiva :");
        escolha = input.next();

        for (NPC npcAtual : pretendentes) { //percorre a lista de pretendentes
            if (npcAtual.getNome().equalsIgnoreCase(escolha) && npcAtual.getDinheiro() > 0) { //condição para escolher o npc
                System.out.println();
                System.out.println("Pretendente escolhido!! Agora vem a melhor parte: ");
                System.out.println("💒💒💍💍 A CERIMÔNIA DE CASAMENTO 💍💍💒💒");

                return npcAtual;
            }
        }
        System.out.println("Essa pessoa não faz parte da lista de pretendentes, desculpe 😪💔");
        return null;
    }

    /**
     * Método que verifica SE o jogador pode casar com o NPC escolhido mediante as exigencias do casamento:
     * O jogador ter uma propriedade que albergue 2 ou mais pessoas e ter o estatuto mínimo para casar com determinado NPC;
     * @param jogadorAtual
     * @param npcEscolhido
     * @return boolean TRUE: se tiver propriedade e estatudo minimo || FALSE: se faltar alguma exigêngia;
     */
    public static boolean podeCasar(Jogador jogadorAtual, NPC npcEscolhido) {
        //booleano para verificar se o jogador tem imovel para abrigar 2 pessoas
        boolean imovelAdequado = false;

        //percorre o array de propriedades para identificar as propriedades do jogador
        for (Propriedade propriedadeAtual : jogadorAtual.getPropriedades()) {
            if (propriedadeAtual instanceof Imovel) {  //verificar se é instancia de imovel;
                if (((Imovel) propriedadeAtual).getCapacidadePessoas() >= 2) { //se for, verificar se tem capacidade para mais de 2 pessoas
                    imovelAdequado = true; //se for retorna true
                    break;
                }
            }
        }
        //verificar se o jogador tem estatuto minimo suficiente para casar com p NPC
        boolean estatutoAdequado = jogadorAtual.getEstatuto() >= npcEscolhido.getEstatutoMinimo();

        if (!imovelAdequado || !estatutoAdequado) { //SE não houver imovel ou estatuto adequado retorna false;

           if (!imovelAdequado){
               System.out.println();
               System.out.println("OPS... apesar de teres escolhido o teu noivo/a o casamento não poderá acontecer... 😣😣😣");
               System.out.println("Você ainda não tem imóvel com capacidade suficiente para abrigar o casal 💔❤️‍🩹😭");
               System.out.println("Sugiro comprares um imóvel com capacidade para 2 pessoas 🏡🏡🏡");
               System.out.println();
           } else if (!estatutoAdequado) {
               System.out.println();
               System.out.println("OPS... apesar de teres escolhido o teu noivo/a o casamento não poderá acontecer... 😣😣😣");
               System.out.println("Você tem um estatuto mínimo inferior ao estatuto do seu pretendente  💔❤️‍🩹😭");
               System.out.println();
           }
            return false;
        }
        return true; //se as 2 condições for verdadeira
    }

    /**
     * Método que verifica o imovel de maior capacidade do jogador
     * @param jogadorAtual
     * @return retorna o número da capacidade atual do imovel do jogador
     */
    public static int capacidadeImovel(Jogador jogadorAtual){

        int capacidadeMaxima = 0;

        for (Propriedade propriedadeAtual : jogadorAtual.getPropriedades()){ //percorrer a lista de propriedades do jogador
            if (propriedadeAtual instanceof Imovel){ //verificar se é instancia de imovel
                Imovel imovelAtual = (Imovel) propriedadeAtual; //casting
                int capacidadeAtual = imovelAtual.getCapacidadePessoas();

                if (capacidadeAtual > capacidadeMaxima){
                    capacidadeMaxima = capacidadeAtual; //atualização da variavel se for maior
                }

            }
        }
        return capacidadeMaxima;
    }

    /**
     * Método que possibilita adição de um NPC aleatório ao array de familia do jogador atual;
     * Esse método só é invocado no menu após o casamento do jogador;
     * Se o jogador tiver imovel com capacidade suficiente, a adoção é realizada;
     * @param jogadorAtual
     */
    public static void adotarCrianca(Jogador jogadorAtual){

        Random random = new Random();

        int indiceBebe = random.nextInt(bebesAdocao.size()); //indice aleatorio tendo como referencia o tamanho do array de bebesAdocao
        NPC bebeAleatorio = bebesAdocao.get(indiceBebe); //seleciona o indiceBebe

        if (capacidadeImovel(jogadorAtual) > jogadorAtual.getFamilia().size()+1){ //condição para verificar se o imovel de maior capacidade do jogador é superior ao array de familia atual + jogador
            jogadorAtual.addNPC(bebeAleatorio); //se for , adiciona o bebe
            System.out.println();
            System.out.println("Parabens! Vocês acabaram de adotar uma criança! ");
            System.out.println("O nome do seu bebê é " + bebeAleatorio.getNome());
            System.out.println("👶🏽🍼🍭👶🏽🍼🍭👶🏽🍼🍭👶🏽🍼🍭👶🏽🍼🍭👶🏽");
            System.out.println();

        } else {
            System.out.println();
            System.out.println("😭😭😭😭😭😭");
            System.out.println("Desculpe, você e seu esposo/a ainda não tem uma casa com capacidade para abrigar toda a familia ");
            System.out.println("Minha sugestão é comprar um novo imóvel para conseguir abrigar a todos");
            System.out.println("Podes ir na imobiliaria SIMS DEV para ver os imóveis disponíveis para compra 🤩");
            System.out.println("🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡");
            System.out.println();
        }
    }

    /**
     * Método de um acontecimento aleatorio onde o jogador ficará doente no dia 15;
     * Dependendo dos sintomas pode precisar comprar remédio e gastar 1 dinheiro (tem redução do seu dinheiro total);
     * @param jogadorAtual
     */
    public static void ficarDoente(Jogador jogadorAtual) {

                Scanner input = new Scanner(System.in);

                System.out.println("ATCHIMMM 🤧🤧🤧💦💦💦 ATCHIMMM 🤧🤧🤧💦💦💦");
                System.out.println(" ohhhhh, vejo que tas começando a ficar constipado 🥴🥴🥴");
                System.out.println();
                System.out.println("Te aconselho descanso, chá de limão com mel e um benuron 1g ");
                System.out.println("🛌🏼🍵💊");
                System.out.println();
                System.out.println("Tens remédio em casa ? 💊🤧💊🤧  (y/n)");
                String opcao = input.next();

                switch (opcao){
                    case "y":
                        System.out.println("Ótimo, segue os cuidados e amanhã já estas novinho em folha");
                        System.out.println("❗❗❗📲🆘 Se houver alguma piora dos sintomas, liga para o SNS24 🆘📲❗❗❗");
                        break;
                    case "n":
                        System.out.println("Se não tens remédio em casa, o DELIVERY SOS já está a caminho para te ajudar");
                        System.out.println("O entregador vai te deixar o remédio em casa.");
                        System.out.println("O Benuron custa 1 dinheiro, teu contribuinte já está na fatura 😊💸");

                        jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() - 15); //valor do benuron;

                        break;

                    default:
                        System.out.println("Escolhe uma opção valida");
                        break;
                }
    }


    /**
     * Método de um acontecimento aleatorio onde o jogador poderá participar de uma competição de CROSSFIT no dia 35;
     * O jogador poderá escolher participar ou não, se ganhar a competição:
     * será premiado com um aumento no valor do dinheiro total e haverá redução da necessidade de sono e refeição devido ao esforço;
     * @param jogadorAtual
     */
    public static void competicaoCrossfit(Jogador jogadorAtual) {

        //colocar dias aleatorios entre 30 e 40 por exemplo
        //num aleatorio entre 0 e 1
        Scanner input = new Scanner(System.in);


                System.out.println("📢📢📢 BREAKING NEWS 📢📢📢");
                System.out.println();
                System.out.println("💥💥💥 Você foi convidado para participar do Campeonato CROSSGAMES de 2024 ️💥💥💥");
                System.out.println();
                System.out.println("Me parece uma boa oportunidade para interagir com outros atletas e ganhar um bom prêmio 🤑🤑🤑🤑");
                System.out.println("Aceitas o convite para participar ? 💪🏼💪🏼💪🏼 (y/n)");
                String escolha = input.next();

                switch (escolha){
                    case "y":
                        System.out.println("📢📢📢📢 WOD DA COMPETIÇÃO: 📢📢📢📢");
                        System.out.println();
                        System.out.println(" 3 rounds : ");
                        System.out.println(" (21 reps de cada exercício na primeira ronda, 15 reps na segunda, 9 reps na terceira) ");
                        System.out.println(" 🔘 thrusters  💪🏼💪🏼💪🏼");
                        System.out.println(" 🔘 pull-ups  💪🏼💪🏼💪🏼");
                        System.out.println(" 🔘 kettlebell swings  💪🏼💪🏼💪🏼");
                        System.out.println(" 🔘 burpees  💪🏼💪🏼💪🏼");
                        System.out.println();

                        System.out.println("Estás pronto? (y/n)");
                        escolha = input.next();

                        System.out.println();
                        if (escolha.equalsIgnoreCase("y")){

                            if (jogadorAtual.getCondicionamentoFisico() > 1000){
                                System.out.println("🏆🏆🏆🏆🏆 Parabens, você ganhou com muita raça essa competição! 🏆🏆🏆🏆🏆");
                                System.out.println("Teu prêmio foi: ");
                                System.out.println("🥇💶💰💵 1000 DINHEIROS 🥇💶💰💵");

                                jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + 2000);
                                jogadorAtual.setNecessidadeRefeicao(jogadorAtual.getNecessidadeRefeicao() - 20);
                                jogadorAtual.setNecessidadeSono(jogadorAtual.getNecessidadeSono()-20);
                            } else {
                                System.out.println("😣😣 Apesar da tua vontade em participar do campeonato de Cross, ainda não tens condicionamento físico para participar");
                                System.out.println("Treina mais e aos poucos vais conseguindo se superar e melhorar! Até a próxima e não desista 💪🏽💪🏽😉😉");
                            }


                        } else if (escolha.equalsIgnoreCase("n")) {
                            System.out.println("❌❌❌❌ Sem tempo para descanso, você foi desclassificado por não iniciar o WOD ❌❌❌❌");
                            System.out.println("Na próxima competição você vai conseguir, não desista ☺️☺️☺️");
                        } else {
                            System.out.println("Opção invalida. ");
                        }
                        break;
                    case "n":
                        System.out.println("Você decidiu não participar da competição... 😪");
                        System.out.println("Talvez na próxima 😀😀");
                        break;
                    default:
                        System.out.println("Escolha uma opção válida");
                        break;
        }
    }

    /**
     * Método de um evento aleatório onde o jogador terá um dia com condições climáticas ruins
     * Isso terá influencia nos treinos do dia, tendo redução dos pontos de necessidade de sono e necessidade social;
     * @param jogadorAtual
     */
    public static void tempoChuvoso(Jogador jogadorAtual){

        System.out.println(" ⛈️⛈️⛈️⛈️ ALERTA: FORTE TEMPORAL HOJE NO PORTO ⛈️⛈️⛈️⛈️");
        System.out.println();
        System.out.println("Infelizmente haverá consequencias no teu dia... 😭😭😭");
        System.out.println();
        System.out.println("Devido ao mau tempo o ginásio fechou e já não conseguiras treinar hoje ☔☔🌧️🌧️");
        System.out.println();

        System.out.println(" 🌧️🌧️🌧️ Podes ficar em casa, comer algo e dormir ...  ");
        System.out.println("Parece uma boa opção para um dia chuvoso, hein ?  ");
        System.out.println("🥞🥞🥪🥪📻💻📺");
        System.out.println("Aproveita e descansa um pouco 😴😴");

        jogadorAtual.setNecessidadeSono(jogadorAtual.getNecessidadeSono()-30);
        jogadorAtual.setNecessidadeRefeicao(jogadorAtual.getNecessidadeSocial()-50);

    }

    /**
     * Método de um evento aleatório onde o jogador será convidado a participar de um evento de tecnologia
     * Se por acaso aceitar os pontos são alterados devido a interação e networking;
     * Se recusar será retirado pontos
     * @param jogadorAtual
     */
    public void eventoPublico(Jogador jogadorAtual){
        Scanner input = new Scanner(System.in);

        System.out.println("Você foi convidado a participar de um evento de Tecnologia 🎮🕹️💻📺🎥");
        System.out.println("Me parece uma execelente oportunidade de interagir com outras pessoas e fazer um bom networking 🤩🤩🤩");
        System.out.println("Tens interesse em participar ?   (y/n)");
        String escolha = input.next();

        switch (escolha){
            case "y":
                System.out.println("Tens interesse em participar do COFFEE BREAK ?  (y/n)");
                String opcao =input.next();
                if (opcao.equalsIgnoreCase("y")) {
                    System.out.println("Estas a se divertir no evento e a conhecer novas pessoas! 🧒🏽👩🏽👩🏽‍🦱👩🏽‍🦳👱🏽‍♂️👳🏽‍♀️");
                    System.out.println("Ganhastes 100 pontos por interação com outras pessoas e 50 pontos no teu estatuto");
                    jogadorAtual.setNecessidadeSocial(jogadorAtual.getNecessidadeSocial() + 100);
                    jogadorAtual.setEstatuto(jogadorAtual.getEstatuto() + 50);
                } else {
                    System.out.println("Mesmo sem querer interagir no COFFEE BREAK, você foi premiado com 30 pontos no estatuto.");
                    jogadorAtual.setEstatuto(jogadorAtual.getEstatuto() + 30);
                }
                break;
            case "n":
                System.out.println(" Poxa, você perdeu uma excelente oportunidade de conhecer pessoas novas. ");
                System.out.println("A recusa do convite te fez perder 20 pontos na necessidade social. 😣😣");
                jogadorAtual.setNecessidadeSocial(jogadorAtual.getNecessidadeSocial() - 20);
                break;
            default:
                System.out.println("Escolhe uma opção válida");
                break;
        }

    }

    /**
     * Método que verifica no final do jogo se o jogador atingiu o ser objetivo de vida que foi definido no início do jogo;
     * @param jogadorAtual
     * @return TRUE = se atingiu as condições para ser vencedor || FALSE = se não atingir;
     */
    public boolean verificarVitoria(Jogador jogadorAtual){

        if (jogadorAtual.getDinheiro() < 0){ //se o jogador tiver dividas, perde sempre
            System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
            System.out.println();
            System.out.println("💸💸😥😥 Você não conseguiu atingir vencer o jogo pois tem dívidas acumuladas 💸💸😥😥");
            System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
            return false;
        }

        Objetivo objetivoVida = jogadorAtual.getObjetivoVida();

        switch (objetivoVida){
            case MILIONARIO:

                int valorTotalPropriedade = 0;
                for (Propriedade propriedadeAtual: jogadorAtual.getPropriedades()){
                    valorTotalPropriedade += propriedadeAtual.getCusto(); //somatorio do valor das propriedades
                }
                if ((jogadorAtual.getDinheiro() + valorTotalPropriedade) >= 1000000){
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t💸💸💸💸💸 VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO SENDO O MAIS NOVO MILIONÁRIO 💸💸💸💸💸 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar e tenho certeza que dinheiro não será mais problema 🤩🤩🤩 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰🥂🎇💰");

                    return true;
                }else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("💸💸😥😥 Você não conseguiu atingir o seu objetivo de vida de ser MILIONÁRIO 💸💸😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            case FAMILIA_COMPLETA:
                if (jogadorAtual.getFamilia().size() > 5){
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t👨‍👩‍👧‍👦👨‍👨‍👧‍👧👩‍👧👩‍👧‍👧👩‍👩‍👦‍👦👨‍👧‍👧 VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO DE TER UMA FAMÍLIA COMPLETA 👨‍👩‍👧‍👦👨‍👨‍👧‍👧👩‍👧👩‍👧‍👧👩‍👩‍👦‍👦👨‍👧‍👧 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar todos juntos !! 🤩🤩🤩 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇");
                    return true;
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("😥😥 Você não conseguiu atingir o seu objetivo de vida de ter uma FAMILIA COMPLETA 😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            case CELEBRIDADE:
                if (jogadorAtual.getEstatuto() > 1500) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 👗👠📲📸📺 VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO DE SER UMA CELEBRIDADE 👗👠📲📸📺 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar e postar tudo no Instagram! A fama será teu melhor amigo 🤩🤩🤩 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇");
                    return true;
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("😥😥 Você não conseguiu atingir o seu objetivo de vida de ser uma CELEBRIDADE 😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            case CROSSFITEIRO:
                if (jogadorAtual.getCondicionamentoFisico() > 20000 && jogadorAtual.getNecessidadeSocial() >= 2000){
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🤸🏽‍♀️🤸🏽‍♂️💪🏽💪🏽🏃🏽🏃🏽 VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO SENDO O MAIS NOVO CROSSFITTER 🤸🏽‍♀️‍🤸🏽‍♂️💪🏽💪🏽🏃🏽🏃🏽 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar e treinar muitoooo maissssss 😎😎😎😎😎 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇");
                    return true;
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("😥😥 Você não conseguiu atingir o seu objetivo de vida de ser um CROSSFITTER 😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            case PROGRAMADOR:
                if (jogadorAtual.getEducacao() > 10000 && jogadorAtual.getEstatuto() > 1000){
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t‍💻👩🏽‍💻💻👨🏽‍💻🖥️ VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO SENDO O MAIS NOVO NERD PROGRAMADOR 💻👩🏽‍💻💻👨🏽‍💻🖥️ ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar e programar muito maiissssss 😎😎😎😎😎 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇");
                    return true;
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("😥😥 Você não conseguiu atingir o seu objetivo de vida de ser um PROGRAMADOR 😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            case INFLUENCER_FITNESS:
                if (jogadorAtual.getNecessidadeSocial() > 10000 && jogadorAtual.getDinheiro() > 300000){
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t‍🥗📲📸🏊🏽‍♀️🤳🏽🚴🏽  VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO SENDO O MAIS NOVO INFLUENCER FITNESS 🥗📲📸🏊🏽‍♀️🤳🏽🚴🏽 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar e postar no Instagram para todos os seguidores 😎😎😎😎😎 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇");
                    return true;
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("😥😥 Você não conseguiu atingir o seu objetivo de vida de ser um INFLUENCER FITNESS 😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            case NOMADE_DIGITAL:
                if (jogadorAtual.getDinheiro() > 150000 && jogadorAtual.getEducacao() > 5000){
                    System.out.println();
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉 P A R A B E N S !!!!!!! 🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t 🌍🏞️🏕️🏖️🛤️🗺️️🤳🏽  VOCÊ CONSEGUIU ATINGIR O SEU OBJETIVO SENDO NôMADE DIGITAL 🌍🏞️🏕️🏖️🛤️🗺️️🤳🏽");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAgora vamos comemorar viajando e curtindo por ai 😎😎😎😎😎 ");
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇🥂🎇");
                    return true;
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭😣😭");
                    System.out.println();
                    System.out.println("😥😥 Você não conseguiu atingir o seu objetivo de vida de ser um NÔMADE DIGITAL 😥😥");
                    System.out.println("Mas não desista, da próxima vez quem sabe ... 🤷🏽‍♀️🤷🏽‍♀️🤷🏽‍♀️");
                }
                break;
            default:
                System.out.println("Não houve jogador vencedor!");
                break;
        }
        return false;
    }
}
