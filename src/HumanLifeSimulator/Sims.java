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
     *
     * @return
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

        System.out.println("✨ Escolha o nome do jogador: ✨");
        nome = input.nextLine();

        System.out.println();
        System.out.println("Qual o objetivo de vida do seu jogador ?");
        System.out.println();
        System.out.println("1- MILIONÁRIO 🤑💰💸💵");
        System.out.println("2- TER UMA FAMÍLIA COMPLETA 👰🏼‍♀️🤵🏼‍♂️🤰🏼👩🏻‍❤️‍👨🏻👨‍👩‍👧‍👦");
        System.out.println("3- SER UMA CELEBRIDADE 📽️💁🏼‍♀️✈️📺📸");
        System.out.println("4- SER UM ATLETA DE CROSSFIT 🏋️🤸🏼💪🏼🏃🏼‍♂️");
        System.out.println("5- SER UM PROGRAMADOR BACK-END 💻👩🏼‍💻🤘🏼");
        System.out.println("6- SER UM INFLUENCER FITNESS 👙📲📸💸🤳🏼");
        System.out.println("7- SER UM NÔMADE DIGITAL 🌏🧭🏞️🏕️🏝️🏖️");

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

        Jogador jogador = new Jogador(nome, 0, objetivoDeVida, null, 100, 100, 100, 0, 0, 0);
       jogador.exibirDetalhes();
        return jogador;
    }

    /**
     * Método onde estão todas as instâncias de todos os objetos e onde está no fluxo da aplicação;
     */
    public void jogo(Jogador jogador) {

        //instancia dos AcessoriosModa
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
        Imovel imovel4 = new Imovel("Sobrado", 10000, 3, 3);
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

        NPC npc1 = new NPC("Luis", 200000, 2);
        NPC npc2 = new NPC("Caio", 150000, 4);
        NPC npc3 = new NPC("Sarinha", 100000, 5);
        NPC npc4 = new NPC("Anna", 80000, 3);
        NPC npc5 = new NPC("Manu", 50000, 2);
        NPC npc6 = new NPC("Marcelo", 90000, 4);
        NPC npc7 = new NPC("Bruna", 120000, 3);
        NPC npc8 = new NPC("Veronica", 140000, 5);
        NPC npc9 = new NPC("Paulo", 95000, 3);
        NPC npc10 = new NPC("Tiago", 50000, 2);

        //npc para adoção: NPC aleatório sem dinheiro ou estatutoMinimo ao Array da família

        NPC npcAdocao1 = new NPC("Bibi", 0, 0);
        NPC npcAdocao2 = new NPC("Lolo", 0, 0);
        NPC npcAdocao3 = new NPC("Nuno", 0, 0);
        NPC npcAdocao4 = new NPC("Mila", 0, 0);
        NPC npcAdocao5 = new NPC("Ruizinho", 0, 0);




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
        addNPC(npcAdocao1);
        addNPC(npcAdocao2);
        addNPC(npcAdocao3);
        addNPC(npcAdocao4);
        addNPC(npcAdocao5);




        // 2 ciclos aninhados: um para o dia e outro para os momentos do dia(4 momentos do dia );
        //50 será o total de dias;
        for (int dia = 1; dia <= 50; dia++) {

            switch (dia){
                case 6:
                    rotinaUniversidade(jogador);
                    break;
                case 3:
                    casamento(jogador);
                    break;
                case 8:
                    ficarDoente(jogador);
                    break;
                case 10:
                    tempoChuvoso(jogador);
                    break;
                case 12:
                    competicaoCrossfit(jogador);
                    break;
                case 14:
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
                    }
                    jogador.exibirDetalhes();
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

        if (jogador.isCasado()){ //só vai passar para essa opção de adocação depois de casar
            System.out.println("\t\t\t\t\t\t9. " + "🔸----- 🍼🍼🍼 Agora que estás casado, seria uma boa altura para aumentar a família? Que tal adotar um bebê? 🍼🍼🍼👶🏽👶🏽👶🏽 -----🔸");
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
                if (jogador.isCasado()) {
                    adotarCrianca(jogador);
                    break;
                }
            default:
                System.out.println("Tantas opções disponiveis e tu escolheu logo uma que não existe? 😤😤😤");
                System.out.println("Escolhe uma opção do menu, vai la. 😎🤪");
                break;
        }
    }

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
        jogadorAtual.exibirDetalhes();
    }

    /**
     * Método que invoca o método vender da classe Shopping;
     *
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
     *
     * @param jogadorAtual
     */
    public void verPropriedades(Jogador jogadorAtual) {

        System.out.println("🏘️🏙️🏚️🏕️    TUAS PROPRIEDADES    🏘️🏙️🏚️🏕️");
        for (Propriedade propriedadeAtual : jogadorAtual.getPropriedades()){
            if (propriedadeAtual instanceof Imovel){
                propriedadeAtual.exibirDetalhesPropriedade();
            }
        }

    }

    /**
     * Método para o jogador procurar emprego;
     * Primeiro imprime todas as profissões disponiveis no Centro de Emprego,
     * depois verifica se o jogador tem criterios suficientes para o emprego escolhido ou não;
     *
     * @param jogadorAtual
     */
    public void procurarEmprego(Jogador jogadorAtual) {
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

                if (profissaoEscolhida.isFormal()){ //verificar se a profissão é formal é true
                    if (jogadorAtual.possuiAcessorioFormal()){ //se o jogador tem pelo menos 1 acessorio formal
                        if (jogadorAtual.getEstatuto() >= profissaoEscolhida.getEstatuto() && jogadorAtual.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao()){
                            jogadorAtual.setProfissao(profissaoEscolhida);
                            System.out.println("Parabens, você acabou de ser admitido para o cargo de " + profissaoEscolhida.getNome());
                            System.out.println("Vamos celebrar 🥂🥂🥂🥂🥂🥂");
                            System.out.println();
                        } else {
                            System.out.println("Sinto muito, você ainda não tem critérios para esse cargo 😣😣");
                        }
                    }else{
                        System.out.println("Desculpe, para esse cargo você precisa de pelo menos 01 acessório formal");
                        System.out.println("Podes ir as compras no SHOPPING SIMS DEV 👔👗👜👞👠");
                        System.out.println();
                    }
                }else {
                    if (jogadorAtual.getEstatuto() >= profissaoEscolhida.getEstatuto() && jogadorAtual.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao()){
                        jogadorAtual.setProfissao(profissaoEscolhida);
                    } else {
                        System.out.println("Poxa 😥😥 você ainda não atende aos critérios do cargo");
                        System.out.println("Continua a procura, nao desista!! ");

                    }
                }
            }
        }

        //teste para ver se foi aplicado o novo cargo
       // System.out.println(jogadorAtual.getProfissao());
        jogadorAtual.exibirDetalhes();
    }

    //colocar função no final de cada ciclo;

    /**
     * Método que atualiza as necessidades do jogador no final de cada ciclo da iteração, ou seja, no final de cada dia.
     * A necessidade sono diminui 25 pontos, a necessidade refeição diminui 20 pontos e a necessidade social diminui 15 pontos.
     *
     * @param jogadorAtual
     */
    public void atualizarNecessidades(Jogador jogadorAtual) {
        int necessidadeSono = jogadorAtual.getNecessidadeSono() - 25; //necessidadeSono atual - 25 pontos no final de cada ciclo
        int necessidadeRefeicao = jogadorAtual.getNecessidadeRefeicao() - 20;
        int necessidadeSocial = jogadorAtual.getNecessidadeSocial() - 15;

        jogadorAtual.setNecessidadeSono(necessidadeSono);
        jogadorAtual.setNecessidadeRefeicao(necessidadeRefeicao);
        jogadorAtual.setNecessidadeSocial(necessidadeSocial);
    }

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

    //criando um arrayList de pretendentes para adicionar os NPC para o futuro casamento
    public static ArrayList<NPC> pretendentes = new ArrayList<NPC>();
    public void addNPC(NPC npc){

        pretendentes.add(npc);
    }

    public void imprimirListaNpc(){
        for (NPC npcAtual: pretendentes){
            if (npcAtual.getDinheiro() > 0){
                npcAtual.exibirDetalhes();
            }
        }
    }


    /**
     * Método que permite do jogador a opção de CASAMENTO no dia 22 do jogo;
     * O jogador tem a possibilidade de aceitar ou recusar e partir o coração de alguem;
     * Se aceitar, é feito a verificação da escolha do NPC; será verificado também se atende aos criterios do casamento;
     *
     * @param jogadorAtual
     */
    public void casamento(Jogador jogadorAtual) {

        Scanner input = new Scanner(System.in);
        String escolha;


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

                        NPC npcEscolhido = escolherNPC(jogadorAtual);
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
                                npcEscolhido.setDinheiro(0);

                                jogadorAtual.addNPC(npcEscolhido); //npn escolhido entra oficialmente para a familia 😎

                                jogadorAtual.setCasado(true);

                                System.out.println("🎉🎉🎉🎉🥂🥂🥂 EU VOS DECLARO CASADOOOOOS 🎉🎉🎉🎉🥂🥂🥂 ");
                            } else {
                                System.out.println("Casamento cancelado, partistes o coração do teu pretendente 😭");
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
     *
     * @param jogadorAtual
     * @return NPC que o jogador escolheu para casar;
     */
    public static NPC escolherNPC(Jogador jogadorAtual) {

        Scanner input = new Scanner(System.in);
        String escolha;

        System.out.println();
        System.out.println("Escreve o NOME do teu futuro noivo/noiva :");
        escolha = input.next();

        for (NPC npcAtual : pretendentes) {
            if (npcAtual.getNome().equalsIgnoreCase(escolha) && npcAtual.getDinheiro() > 0) {
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
     *
     * @param jogadorAtual
     * @param npcEscolhido
     * @return boolean TRUE: se tiver propriedade e estatudo minimo || FALSE: se faltar alguma exigêngia;
     */
    public static boolean podeCasar(Jogador jogadorAtual, NPC npcEscolhido) {
        //booleano para verificar se o jogador tem imovel para abrigar 2 pessoas
        boolean imovelAdequado = false;

        //ciclo percorrer o array de propriedades para identificar as propriedades do jogador
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
            return false;
        }
        return true; //se as 2 condições for verdadeira
    }

    public static int capacidadeImovel(Jogador jogadorAtual){

        int capacidadeMaxima = 0;

        for (Propriedade propriedadeAtual : jogadorAtual.getPropriedades()){
            if (propriedadeAtual instanceof Imovel){
                Imovel imovelAtual = (Imovel) propriedadeAtual;
                int capacidadeAtual = imovelAtual.getCapacidadePessoas();

                if (capacidadeAtual > capacidadeMaxima){
                    capacidadeMaxima = capacidadeAtual;
                }

            }
        }
        return capacidadeMaxima;
    }


    public static void adotarCrianca(Jogador jogadorAtual){

        Random random = new Random();
        ArrayList<NPC> bebesParaAdocao = new ArrayList<NPC>();

        for (NPC npcAtual : pretendentes){
            if (npcAtual.getDinheiro() == 0 && npcAtual.getEstatutoMinimo() == 0){
                bebesParaAdocao.add(npcAtual);
            }
        }

        int indiceBebe = random.nextInt(bebesParaAdocao.size());
        NPC bebeAleatorio = bebesParaAdocao.get(indiceBebe);

        if (capacidadeImovel(jogadorAtual) > jogadorAtual.getFamilia().size()+1){
            jogadorAtual.addNPC(bebeAleatorio);
            System.out.println();
            System.out.println("Parabens! Vocês acabaram de adotar uma criança! ");
            System.out.println("O nome do seu bebê é " + bebeAleatorio.getNome());
            System.out.println("👶🏽🍼🍭👶🏽🍼🍭👶🏽🍼🍭👶🏽🍼🍭👶🏽🍼🍭👶🏽");
            System.out.println();

        } else {
            System.out.println("😭😭😭😭😭😭");
            System.out.println("Desculpe, você e seu esposo/a ainda não tem uma casa com capacidade para abrigar toda a familia ");
            System.out.println("Minha sugestão é comprar um novo imóvel para conseguir abrigar a todos");
            System.out.println("Podes ir na imobiliaria SIMS DEV para ver os imóveis disponíveis para compra 🤩");
            System.out.println("🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡🏡");
        }
    }

    //Eventos aleatorios do jogo: 1) simular o jogador doente

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

    //Eventos aleatorios do jogo: 2) simular um campeonato de crossfit

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
                                System.out.println("🏆🏆🏆🏆🏆 Parabens, ganhaste com muita raça essa competição! 🏆🏆🏆🏆🏆");
                                System.out.println("Teu prêmio foi: ");
                                System.out.println("🥇💶💰💵 1000 DINHEIROS 🥇💶💰💵");

                                jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + 2000);
                                jogadorAtual.setNecessidadeRefeicao(jogadorAtual.getNecessidadeRefeicao() - 5);
                                jogadorAtual.setNecessidadeSono(jogadorAtual.getNecessidadeSono()-3);
                            } else {
                                System.out.println("😣😣 Apesar da tua vontade em participar do campeonato de Cross, ainda não tens condionamento físico para participar");
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

    //Eventos aleatorios do jogo: 3) simular um tempo ruim chuvoso

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
        jogadorAtual.setNecessidadeRefeicao(jogadorAtual.getNecessidadeRefeicao()+20);

    }

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
                    System.out.println("Estas a se divertir no evento e a conhecer novas pessoas!!");
                    System.out.println("Ganhastes 100 pontos por interação com outras pessoas e 50 pontos no teu estatuto");
                    jogadorAtual.setNecessidadeSocial(jogadorAtual.getNecessidadeSocial() + 100);
                    jogadorAtual.setEstatuto(jogadorAtual.getEstatuto() + 50);
                } else {
                    System.out.println("Mesmo sem querer interagir no COFFEE BREAK, você foi premiado com 30 pontos no estatuto.");
                    jogadorAtual.setEstatuto(jogadorAtual.getEstatuto() + 50);
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

    public boolean verificarVitoria(Jogador jogadorAtual){

        Objetivo objetivoVida = jogadorAtual.getObjetivoVida();

        switch (objetivoVida){
            case MILIONARIO:

                int valorTotalPropriedade = 0;
                for (Propriedade propriedadeAtual: jogadorAtual.getPropriedades()){
                    valorTotalPropriedade += propriedadeAtual.getCusto();
                }
                if ((jogadorAtual.getDinheiro() + valorTotalPropriedade) >= 1000000){
                    return true;
                }
                break;
            case FAMILIA_COMPLETA:
                if (jogadorAtual.getFamilia().size() > 4){
                    return true;
                }
                break;
            case CELEBRIDADE:
                if (jogadorAtual.getEstatuto() > 700) {
                    return true;
                }
                break;
            case CROSSFITEIRO:
                if (jogadorAtual.getCondicionamentoFisico() > 2000 && jogadorAtual.getNecessidadeSono() >= 100){
                    return true;
                }
                break;
            case PROGRAMADOR:
                if (jogadorAtual.getEducacao() > 1500 && jogadorAtual.getNecessidadeSono() > 100){
                    return true;
                }
                break;
            case INFLUENCER_FITNESS:
                if (jogadorAtual.getNecessidadeSocial() > 1500 && jogadorAtual.getDinheiro() > 100000){
                    return true;
                }
                break;
            case NOMADE_DIGITAL:
                if (jogadorAtual.getDinheiro() > 150000 && jogadorAtual.getEducacao() > 100){
                    return true;
                }
                break;
            default:
                System.out.println("Não houve jogador vencedor!");
                break;
        }
        return false;
    }

}
