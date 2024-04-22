package HumanLifeSimulator;

import HumanLifeSimulator.Enum.Objetivo;

import java.util.ArrayList;

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

    //ate 1 de maio POO
    //1 de maio ate dia 17 DP
    //QA - até dia 03/junho

    /**
     * Método que adiciona uma nova propriedade do jogador no array de propriedades
     * @param novaPropriedade
     */
    public void addPropriedades(Propriedade novaPropriedade){
        propriedades.add(novaPropriedade);
    }

    /**
     * Método que imprime na consola a lista todas as propriedades que o jogador possui
     */
    public void listarPropriedades(){
        for (Propriedade propriedadeAtual: propriedades){
            System.out.println(" 🔹 Nome da propriedade: " + propriedadeAtual.getNome());
            System.out.println(" 🔹 Custo da propriedade: " + propriedadeAtual.getCusto());
            System.out.println(" 🔹 Estatuto: " + propriedadeAtual.getEstatuto());
            System.out.println("---------------------------------------");
        }
    }

    /**
     * Método que adiciona no array de família do jogador um novo NPC para integrar a familia
     * @param novoNPC
     */
    public void addNPC(NPC novoNPC){
        familia.add(novoNPC);
    }

    /**
     * Método que imprime na consola a lista de integrantes da familia de NPC do jogador;
     */
    public void listarFamilia(){
        for (NPC npcAtual : familia){
            npcAtual.exibirDetalhes();
        }
    }

    /**
     * Método que imprime na consola todos os detalhes da pessoa;
     */
    public void exibirDetalhes() {
        System.out.println("Informações do Jogador: 🕹🎮🎰 ");
        System.out.println("✨ Nome: " + this.getNome());
        System.out.println("💰 Dinheiro: " + this.getDinheiro());
        System.out.println("👨‍🍳 Profissão: " + profissao.getNome());
        System.out.println("😴 Necessidade de Sono: " + this.necessidadeSono);
        System.out.println("🥗 Necessidade de Refeição: " + this.necessidadeRefeicao);
        System.out.println("👫 Necessidade Social: " + this.necessidadeSocial);
        System.out.println("📚 Educação: " + this.educacao);
        System.out.println("Lista das propriedades: ");

        listarPropriedades();
        System.out.println("〰 Integrantes da família: 〰 ");
        listarFamilia();

    }
}
