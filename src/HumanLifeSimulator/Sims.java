package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;
import HumanLifeSimulator.PersonagensJogo.Jogador;
import HumanLifeSimulator.PersonagensJogo.NPC;
import HumanLifeSimulator.PropriedadeJogador.AcessorioModa;
import HumanLifeSimulator.PropriedadeJogador.Imovel;
import HumanLifeSimulator.PropriedadeJogador.Propriedade;
import HumanLifeSimulator.PropriedadeJogador.Veiculo;

import java.util.ArrayList;
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

        Jogador jogador = new Jogador(nome, 0, objetivoDeVida, null, 100, 100, 100, 0, 0);
       // jogador.exibirDetalhes();
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
        AcessorioModa acessorioModa15 = new AcessorioModa("Top de seda plissado ", 950, 4, "Versace", false);
        AcessorioModa acessorioModa16 = new AcessorioModa("T-shirt", 5, 3, "Nike", true);


        //instancia dos imoveis

        Imovel imovel1 = new Imovel("Casa de praia", 150000, 4, 6);
        Imovel imovel2 = new Imovel("Loft", 170000, 2, 2);
        Imovel imovel3 = new Imovel("Casa geminada", 300000, 4, 5);
        Imovel imovel4 = new Imovel("Sobrado", 15000, 3, 3);
        Imovel imovel5 = new Imovel("Apartamento R/C", 190000, 4, 3);
        Imovel imovel6 = new Imovel("Studio", 170000, 3, 2);
        Imovel imovel7 = new Imovel("Flat", 155000, 2, 2);
        Imovel imovel8 = new Imovel("Bangalô", 200000, 4, 3);
        Imovel imovel9 = new Imovel("Duplex", 250000, 5, 5);
        Imovel imovel10 = new Imovel("Triplex", 300000, 5, 6);
        Imovel imovel11 = new Imovel("Apartamento Rooftop", 250000, 4, 4);
        Imovel imovel12 = new Imovel("Barraca de Camping", 30000, 1, 2);
        Imovel imovel13 = new Imovel("Quinta ", 320000, 5, 10);
        Imovel imovel14 = new Imovel("Casa de campo", 270000, 5, 6);
        Imovel imovel15 = new Imovel("Palácio", 500000, 5, 12);

        //instancia dos veículos

        Veiculo veiculo1 = new Veiculo("Carro elétrico", 50000, 4, "Tesla", "ZZZ");
        Veiculo veiculo2 = new Veiculo("Mota ", 25000, 3, "Yamaha", "MT-125");
        Veiculo veiculo3 = new Veiculo("Scotter", 5000, 2, "Vespa", "Zard");
        Veiculo veiculo4 = new Veiculo("Super carro de corrida", 300000, 5, "Lamborghini ", "Urus ");
        Veiculo veiculo5 = new Veiculo("Lancha ", 70000, 4, "Focker ", "MasterCraft");
        Veiculo veiculo6 = new Veiculo("Barquinho pescador", 25000, 3, "Hodgon", "Rei dos Mares");
        Veiculo veiculo7 = new Veiculo("Camião", 70000, 3, "Volkswagem", "Tomba Tudo");
        Veiculo veiculo8 = new Veiculo("Bike para criança", 100, 1, "AllBike", "Miudinhos");
        Veiculo veiculo9 = new Veiculo("Bike de aventura/montanha", 3000, 3, "AllBike", "Aventureiros");
        Veiculo veiculo10 = new Veiculo("Trotinete", 350, 2, "Segway", "NineBot");
        Veiculo veiculo11 = new Veiculo("Iate", 150000, 4, "Yachts", "Ferretti");
        Veiculo veiculo12 = new Veiculo("Carro de mão", 25, 4, "Tesla", "ZZZ");
        Veiculo veiculo13 = new Veiculo("Helicoptero", 100000, 5, "Pantera do Céu", "BlackPanther");
        Veiculo veiculo14 = new Veiculo("Jetski ", 7000, 2, "Hayley Sea", "HS-55");
        Veiculo veiculo15 = new Veiculo("Velocipe", 70, 1, "Kids Toys", "Reizinho dos Passeios");

        //instancias dos NPC (familia do jogador)

        NPC npc1 = new NPC("Luis", 200000, 5);
        NPC npc2 = new NPC("Caio", 150000, 4);
        NPC npc3 = new NPC("Sarinha", 100000, 5);
        NPC npc4 = new NPC("Anna Karla", 80000, 3);
        NPC npc5 = new NPC("Fiama", 50000, 2);
        NPC npc6 = new NPC("Marcela", 90000, 4);
        NPC npc7 = new NPC("Bruna", 120000, 3);
        NPC npc8 = new NPC("Veronica", 140000, 5);
        NPC npc9 = new NPC("Paulo", 95000, 3);
        NPC npc10 = new NPC("Tiago", 50000, 2);

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

        //adicionar propriedades no Shopping
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



        // 2 ciclos aninhados: um para o dia e outro para os momentos do dia(4 momentos do dia );
        //50 será o total de dias;
        for (int dia = 1; dia <= 50; dia++) {

            for (int momentoDia = 1; momentoDia <= 4; momentoDia++) {

                switch (momentoDia) {
                    case 1: //pela manhã
                        System.out.println("É hora de começar mais um dia ... 🤗🤗🤗");
                        System.out.println();
                        System.out.println("\t\t\t\t\t\t🌤️🌤️🌤️🌤️🌤️🌤️  M A N H Ã  🌤️🌤️🌤️🌤️🌤️🌤️");
                        break;
                    case 2: //meio dia
                        System.out.println("\t\t\t\t\t\t☀️☀️☀️☀️☀️☀️  M E I O - D I A  ☀️☀️☀️☀️☀️☀️");
                        break;
                    case 3: // meio da tarde
                        System.out.println("\t\t\t\t\t\t🌇🌇🌇🌇🌇🌇  T A R D E  🌇🌇🌇🌇🌇🌇");
                        break;
                    case 4: //noite
                        System.out.println("\t\t\t\t\t\t🌛🌠🌛🌠🌛🌠  N O I T E  🌛🌠🌛🌠🌛🌠");
                        break;
                }
                momentoDia(jogador, shopping, centroDeEmprego);
            }
            atualizarNecessidades(jogador);
            jogador.setDinheiro(jogador.getDinheiro() + 30); //no final de cada dia o dinheiro do jogador aumenta em 30 dinheiros
            jogador.exibirDetalhes();
        }
    }

    public void momentoDia(Jogador jogador, Shopping shopping, CentroDeEmprego centroDeEmprego) {   //precisei colocar Shopping para conseguir aceder ao que foi instanciado

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Bora movimentar esse jogo! 😜 Posso te dar umas opções para ocupares teu tempo agora: 👌");
        System.out.println();

        System.out.println("1. " + "🔸----- O que achas de começar agora um belo dia de trabalho? 👨🏼‍💻🤑 Não vai te custar nadinha 😊 -----🔸");
        System.out.println();

        System.out.println("2. " + "🔸----- Estás com sono? 😴😴😴 Que tal descansar e dormir um pouco? -----🔸");
        System.out.println();

        System.out.println("3. " + "🔸----- Pensando melhor uma boa refeição não seria nada mal agora, hein ? 🍕🍔🍟 Queres comer? 🥞🥙🌮 -----🔸");
        System.out.println();

        System.out.println("4. " + "🔸----- Preferes sair da preguiça e ir treinar? 🏃🏼‍♂️💪🏼 A aula de CrossFit começa agora mesmo 🤸🏼‍♂️🏋🏼‍♂️🏋🏼‍♀️💪🏼 -----🔸");
        System.out.println();

        System.out.println("5. " + "🔸----- Torrar uma boa grana comprando no shopping não seria má ideia, vem comigo 💸💸💸💸 -----🔸");
        System.out.println();

        System.out.println("6. " + "🔸----- Estudar um pouco me parece uma excelente ideia, que tal uma formação em POO ? 📚💻 -----🔸");
        System.out.println();

        System.out.println("7. " + "🔸----- Faz tempo que não visitas as tuas propriedades... vamos dar um passeio por elas ? 🚗🌅🏡 -----🔸");
        System.out.println();

        System.out.println("8. " + "🔸----- Estás aborrecido com teu trabalho atual e queres procurar um novo? 😭🥵🥺 Eu te entendo, vem que te ajudo nisso 😎😎😎 -----🔸");
        System.out.println();

        System.out.println("✨ Ótimo, agora me diz o que te apetece fazer agora? ");
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
                fazerCompras(jogador,shopping ); //para conseguir aceder à lista de propriedades tive que colocar como parametro da função
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
            default:
                System.out.println("Tantas opções disponiveis e tu escolheu logo uma que não existe? 😤😤😤");
                System.out.println("Escolhe uma opção do menu, vai la. 😎🤪");
                break;
        }
    }

    public void primeiroEmprego(Jogador jogadorAtual){
        Scanner input = new Scanner(System.in);

        if (jogadorAtual.getProfissao() == null) {
            System.out.println("Estas prestes a dar um grande passo na tua vida profissional:");
            System.out.println("Conseguir o teu primeiro emprego 🤩🤩🤩🤩🤩");
            System.out.println("Esses são os empregos disponíveis atualmente: ");

            CentroDeEmprego.imprimirListaProfissoes();

            System.out.println();
            System.out.println("Digite aqui o número do emprego que você quer: ");
            int escolha = input.nextInt();

            ArrayList<Profissao> listaDeProfissao = CentroDeEmprego.getListaDeProfissoes();

            if (escolha >= 1 && escolha <= listaDeProfissao.size()){
                Profissao profissaoEscolhida = listaDeProfissao.get(escolha - 1);

                jogadorAtual.setProfissao(profissaoEscolhida);

                System.out.println("PARABÉÉÉÉÉNS! Agora tens um emprego!!!");
                System.out.println("Agora já podes começar a ganhar dinheiro trabalhando no teu novo cargo de " + jogadorAtual.getProfissao().getNome());
            } else {
                System.out.println("Escolhe uma profissão válida, por favor ");
            }
        } else {
            Profissao profissaoAtual = jogadorAtual.getProfissao();
            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + profissaoAtual.getSalarioDia());

            System.out.println(" Você foi recompensado com " + profissaoAtual.getSalarioDia() + " dinheiros pelo seu dia de trabalho 💸😉");
        }




    }

    /**
     * Método que aumenta o dinheiro do jogador com base no salário por dia da sua profissão;
     * Se por acaso o jogador ainda não tiver emprego, será redirecionado para procurar um emprego;
     *
     * @param jogadorAtual
     */
    public void trabalhar(Jogador jogadorAtual) {

        Profissao profissao = jogadorAtual.getProfissao();

        if (profissao == null) {
            System.out.println("Pelos vistos ainda não tens um emprego 😪");
            System.out.println("Tudo bem, consigo te ajudar 🙌🏼");
            System.out.println("Aqui está a lista de empregos disponíveis no Centro de Empregos: ");
            System.out.println();

            //redireciona para procurar emprego e fazer alteração do emprego do jogador
            procurarEmprego(jogadorAtual);

        } else {
            double salarioDia = profissao.getSalarioDia();
            //aumentar dinheiro
            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + salarioDia);
        }
    }

    /**
     * Método que repõe a necessidade de sono de volta a 100;
     *
     * @param jogadorAtual
     */
    public void dormir(Jogador jogadorAtual) {

        jogadorAtual.setNecessidadeSono(100);
        System.out.println("😴😴  Com esse cochilo tu aumentou a necessidade de sono em " + jogadorAtual.getNecessidadeSono());
        jogadorAtual.exibirDetalhes();
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
        System.out.println("A tua refeição custou " + jogadorAtual.getDinheiro() + " dinheiros. 💸💸💸");

    }

    /**
     * Método que repõe a necessidade social de volta a 100 se o jogador escolher treinar;
     *
     * @param jogadorAtual
     */
    public void treinar(Jogador jogadorAtual) {
        jogadorAtual.setNecessidadeSocial(100);
        jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + 150);
        System.out.println("💪🏼💪🏼💪🏼 Você foi premiado pela sua excelente disposição em fazer um treino de CROSSFIT!! ");
        System.out.println("Ganhou 150 dinheiros 💸💸💸");
        jogadorAtual.exibirDetalhes();

    }

    /**
     * Método que invoca o método vender da classe Shopping;
     *
     * @param jogadorAtual
     */
    public void fazerCompras(Jogador jogadorAtual, Shopping shopping) {
        // coloquei shopping como parametro da função. Shopping shopping = new Shopping();

        shopping.vender(jogadorAtual);
    }

    /**
     * Método que aumenta a educação do jogador em +2 se escolher essa opção no menu;
     *
     * @param jogadorAtual
     */
    public void terFormacao(Jogador jogadorAtual) {
        jogadorAtual.setEducacao(jogadorAtual.getEducacao() + 2);
    }

    /**
     * Método que imprime na consola as propriedades que o jogador tem;
     *
     * @param jogadorAtual
     */
    public void verPropriedades(Jogador jogadorAtual) {
        if (jogadorAtual instanceof Jogador) {
            jogadorAtual.listarPropriedades();
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
        System.out.println("👨🏼‍🌾👩🏼‍🍳👨🏼‍✈️🧑🏼‍🚒 Escolha uma profissão: 👮🏼👨🏼‍🌾👷🏼‍♀️👨🏼‍⚕️");
        String nomeProfissao = input.nextLine(); //profissão de escolha do utilizador depois de ver a lista de empregos

        ArrayList<Profissao> listaDeProfissoes = CentroDeEmprego.getListaDeProfissoes();

        boolean profissaoEncontrada = false;
        Profissao profissaoEscolhida = null;
        for (Profissao profissaoAtual : listaDeProfissoes) {

            if (profissaoAtual.getNome().equalsIgnoreCase(nomeProfissao)) {
                profissaoEncontrada = true;
                profissaoEscolhida = profissaoAtual;
                break;
            }
        }

        //se a profissão for encontrada, verificar se tem criterios para conseguir aquele emprego escolhido ou não;
        if (profissaoEncontrada) {
            boolean temAcessorioFormal = jogadorAtual.possuiAcessorioFormal(); //método para verificar se o jogador tem um acessorio de moda formal na lista de propriedade;

            if (jogadorAtual.getEstatuto() >= profissaoEscolhida.getEstatuto() && jogadorAtual.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao() && temAcessorioFormal) {
                jogadorAtual.setProfissao(profissaoEscolhida);
            } else {
                System.out.println("😥 Sinto muito, você ainda não atende aos critérios para esse cargo 😪");
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

    //inserir no menu
    //teste para essa questão: Dia 5 deve escolher se quer ir para a universidade, caso sim, a educação aumenta 50, mas contrai uma divida de 3.000 dinheiros.
    public void rotinaUniversidade(Jogador jogadorAtual) {
        Scanner input = new Scanner(System.in);

        for (int dia = 1; dia <= 50; dia++) {
            if (dia == 5) {
                System.out.println("Hoje é dia 05, queres ir a universidade ? (y/n) 🏫📚");
                String escolha = input.next();

                if (escolha.equalsIgnoreCase("y")) {
                    jogadorAtual.setEducacao(50); //aumenta educação em 50 dinheiros
                    jogadorAtual.setDinheiro(3000); //reduz 3000 do dinheiro total;
                }
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

        for (int dia = 1; dia <= 50; dia++) {
            if (dia == 22) {
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
                        jogadorAtual.listarFamilia();
                        System.out.println();

                        NPC npcEscolhido = escolherNPC(jogadorAtual);
                        System.out.println();

                        if (podeCasar(jogadorAtual, npcEscolhido)) {
                            //se o casamento acontecer, aumenta ao dinheiro do jogador todo o dinheiro que o npc tem;
                            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + npcEscolhido.getDinheiro());
                        }

                        break;
                    case "n":
                        System.out.println("🍾🍷🍸🍹🥂🍻🍺");
                        System.out.println("Eitaaaaa, queres continuar na vida de copos e amigos");
                        System.out.println("Eu compreendo, talvez ainda não tenhas encontrado um grande amor para tua vida...");
                        System.out.println("Partites o coração de alguém... 💔❤️‍🩹💔❤️‍🩹");
                        System.out.println("Vida que segue !! 🍻🍺 ");
                        break;
                    default:
                        System.out.println("Sei posso ter te pegado de surpresa...");
                        System.out.println("Mas para essa pergunta só há 2 opções de resposta: ");
                        System.out.println("YYYYEEESSSSS OU NNNNOOOOOOO ");
                        break;
                }
            }
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
        System.out.println("Escreve o nome do teu futuro noivo/noiva :");
        escolha = input.next();

        for (NPC npcAtual : jogadorAtual.getFamilia()) {
            if (npcAtual.getNome().equalsIgnoreCase(escolha)) {
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

    //Eventos aleatorios do jogo: 1) simular o jogador doente

    /**
     * Método de um acontecimento aleatorio onde o jogador ficará doente no dia 15;
     * Dependendo dos sintomas pode precisar comprar remédio e gastar 1 dinheiro (tem redução do seu dinheiro total);
     * @param jogadorAtual
     */
    public static void ficarDoente(Jogador jogadorAtual) {

        for (int dia = 1; dia <= 50; dia++) {
            if (dia == 15) {
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

                        jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() - 1); //valor do benuron;

                        break;

                    default:
                        System.out.println("Escolhe uma opção valida");
                        break;
                }
            }
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
        Scanner input = new Scanner(System.in);

        for (int dia = 1; dia <= 50; dia++) {
            if (dia == 35) {

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
                            System.out.println("🏆🏆🏆🏆🏆 Parabens, ganhaste com muita raça essa competição! 🏆🏆🏆🏆🏆");
                            System.out.println("Teu prêmio foi: ");
                            System.out.println("🥇💶💰💵 1000 DINHEIROS 🥇💶💰💵");

                            jogadorAtual.setDinheiro(jogadorAtual.getDinheiro() + 2000);
                            jogadorAtual.setNecessidadeRefeicao(jogadorAtual.getNecessidadeRefeicao() - 5);
                            jogadorAtual.setNecessidadeSono(jogadorAtual.getNecessidadeSono()-3);

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

        }

        return false;
    }

}
