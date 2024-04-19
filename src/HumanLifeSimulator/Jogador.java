package HumanLifeSimulator;

import java.util.ArrayList;

public class Jogador extends Pessoa{

    private String objetivoVida; //objetivo do jogo
    private String profissao; //profissão atual da pessoa
    private int necessidadeSono; //necessidade de dormir
    private int necessidadeRefeicao; //necessidade de comer/beber
    private int necessidadeSocial; //necessidade de interagir/divertir
    private int estatuto; // somatorio dos estatutos de todas as suas propriedades
    private int educacao; //nivel de formacao da pessoa
    private ArrayList<Propriedade> propriedades; //todas as propriedades
    private ArrayList<NPC> familia; //familia do jogador

    public Jogador(String nome, double dinheiro, String objetivoVida, String profissao, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
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
}
