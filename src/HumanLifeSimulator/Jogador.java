package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador extends Pessoa{

    private Objetivo objetivoVida; //objetivo do jogo
    private Profissao profissao; //profissão atual da pessoa
    private int necessidadeSono = 100; //necessidade de dormir
    private int necessidadeRefeicao = 100; //necessidade de comer/beber
    private int necessidadeSocial = 100; //necessidade de interagir/divertir
    private int estatuto = 0; // somatorio dos estatutos de todas as suas propriedades
    private int educacao = 0; //nivel de formacao da pessoa
    private ArrayList<Propriedade> propriedades; //todas as propriedades
    private ArrayList<NPC> familia; //familia do jogador

    public Jogador(String nome, double dinheiro, Objetivo objetivoVida, Profissao profissao, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nome, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissao = profissao;
        this.necessidadeSono = necessidadeSono;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = new ArrayList<Propriedade>();
        this.familia = new ArrayList<NPC>();
    }

    /**
     * Método que imprime na consola todos os detalhes da pessoa;
     */
    public void exibirDetalhes() {
        System.out.println("Informações do Jogador: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Dinheiro: " + this.getDinheiro());
        System.out.println("Profissão: " + this.profissao);
    }

    public static Jogador criarJogador(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o nome do jogador: ");
        String nome = input.nextLine();

        nome = input.nextLine(); //limpeza buffer;

        System.out.println("Qual o objetivo de vida do seu jogador ?");
        System.out.println("1 - MILIONÁRIO 🤑💰💸💵");
        System.out.println("2- TER UMA FAMÍLIA COMPLETA 👰🏼‍♀️🤵🏼‍♂️🤰🏼👩🏻‍❤️‍👨🏻👨‍👩‍👧‍👦");
        System.out.println("3- SER UMA CELEBRIDADE 📽️💁🏼‍♀️✈️📺📸");
        System.out.println("4- SER UM ATLETA DE CROSSFIT 🏋🏼‍♀️🤸🏼💪🏼🏋🏼‍♀️");
        System.out.println("5- SER UM PROGRAMADOR BACK-END 💻👩🏼‍💻🤘🏼");
        System.out.println("6- SER UM INFLUENCER FITNESS 👙📲📸💸🤳🏼🏋");
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

        return null;
    }
}
