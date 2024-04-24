package HumanLifeSimulator;

import java.util.ArrayList;

public class CentroDeEmprego {

    private ArrayList<Profissao> listaDeProfissoes;

    /**
     * Método construtor do centro de emprego
     */
    public CentroDeEmprego() {
        this.listaDeProfissoes = new ArrayList<Profissao>();
    }

    /**
     * Método para imprimir na consola a lista de nomes de profissões disponíveis no Centro de Emprego
     */
    public void imprimirListaProfissoes(){
        int contador = 1;
        for (Profissao profissaoAtual : listaDeProfissoes){

            System.out.println(contador + "- Nome da profissão:" + profissaoAtual.getNome());
            contador++;
        }
    }
}
