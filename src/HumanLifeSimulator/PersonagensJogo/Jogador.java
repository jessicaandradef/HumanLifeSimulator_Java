package HumanLifeSimulator.PersonagensJogo;

import HumanLifeSimulator.Enum.Objetivo;
import HumanLifeSimulator.Profissao;
import HumanLifeSimulator.PropriedadeJogador.Propriedade;

import java.util.ArrayList;

public class Jogador extends Pessoa{

    private Objetivo objetivoVida;
    private Profissao profissao;
    private int necessidadeSono;
    private int necessidadeRefeicao;
    private int necessidadeSocial;
    private int estatuto;
    private int educacao;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<NPC> familia;

    /**
     * Método construtor da subclasse Jogador
     * @param nome
     * @param dinheiro
     * @param objetivoVida objetivo do jogo (opções no Enum de Objetivo)
     * @param profissao  profissão atual da pessoa
     * @param necessidadeSono   necessidade de dormir do jogador
     * @param necessidadeRefeicao necessidade de comer/beber
     * @param necessidadeSocial necessidade de interagir/divertir
     * @param estatuto somatorio dos estatutos de todas as suas propriedades
     * @param educacao nivel de formacao da pessoa
     */
    public Jogador(String nome, double dinheiro, Objetivo objetivoVida, Profissao profissao, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nome, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissao = profissao;
        this.necessidadeSono = necessidadeSono;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = new ArrayList<Propriedade>(); //todas as propriedades
        this.familia = new ArrayList<NPC>(); //familia do jogador
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public int getNecessidadeSono() {
        return necessidadeSono;
    }

    public int getNecessidadeRefeicao() {
        return necessidadeRefeicao;
    }

    public int getNecessidadeSocial() {
        return necessidadeSocial;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getEducacao() {
        return educacao;
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    public void setEducacao(int educacao) {
        this.educacao = educacao;
    }

    public void setNecessidadeSono(int necessidadeSono) {
        this.necessidadeSono = necessidadeSono;
    }

    public void setNecessidadeRefeicao(int necessidadeRefeicao) {
        this.necessidadeRefeicao = necessidadeRefeicao;
    }

    public void setNecessidadeSocial(int necessidadeSocial) {
        this.necessidadeSocial = necessidadeSocial;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    /**
     * Método que adiciona uma nova propriedade do jogador no array de propriedades do Jogador
     * @param novaPropriedade
     */
    public boolean addPropriedade(Propriedade novaPropriedade){
        if (this.dinheiro >= novaPropriedade.getCusto()){
            propriedades.add(novaPropriedade);

            System.out.println("Estás de parabéns! Conseguiste uma nova propriedade 🎉🏘️🎉");
            System.out.println("Nova aquisição: " + novaPropriedade.getNome());
            this.dinheiro -= novaPropriedade.getCusto();
            return true;
        } else {
            System.out.println("💔😫 Desculpa, ainda não tens dinheiro suficiente para comprar ");
            return false;
        }
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
        for (NPC npcAtual : this.familia){
            npcAtual.exibirDetalhes();
        }
    }

    /**
     * Método que imprime na consola todos os detalhes da pessoa;
     */
    public void exibirDetalhes() {
        System.out.println("Informações do Jogador: 🕹🎮🎰 ");
        System.out.println();
        super.exibirDetalhes();
        System.out.println("🙏🏼 Objetivo de vida: " + this.objetivoVida);
        System.out.println("👨‍🍳 Profissão: " + this.profissao.getNome());
        System.out.println("😴 Necessidade de Sono: " + this.necessidadeSono);
        System.out.println("🥗 Necessidade de Refeição: " + this.necessidadeRefeicao);
        System.out.println("👫 Necessidade Social: " + this.necessidadeSocial);
        System.out.println("📚 Educação: " + this.educacao);
        System.out.println("🎋 Estatuto: " + this.estatuto);
        System.out.println();
        System.out.println("🏘️🚗 Lista das propriedades: 🏘️🚗");

        listarPropriedades();

        System.out.println();
        System.out.println("👨‍👩‍👧 Integrantes da família: 👨‍👩‍👧 ");
        listarFamilia();
    }
}
