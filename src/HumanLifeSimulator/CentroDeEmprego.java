package HumanLifeSimulator;

import java.util.ArrayList;

public class CentroDeEmprego {

    private static ArrayList<Profissao> listaDeProfissoes;

    /**
     * Método construtor do centro de emprego
     */
    public CentroDeEmprego() {
        this.listaDeProfissoes = new ArrayList<Profissao>();
    }

    /**
     * Metodo get para obter a lista de profissões disponíveis
     * @return array da lista de profissões disponiveis no centro de emprego
     */
    public static ArrayList<Profissao> getListaDeProfissoes() {
        return listaDeProfissoes;
    }

    /**
     * Método para adicionar uma nova profissão ao array de profissões;
     * @param profissaoAtual
     */
    public void addProfissao(Profissao profissaoAtual){
        listaDeProfissoes.add(profissaoAtual);
    }

    /**
     * Método para imprimir na consola a lista de nomes de profissões disponíveis no Centro de Emprego
     */
    public static void imprimirListaProfissoes(){
        int contador = 1; //inicializar variavel contador
        for (Profissao profissaoAtual : listaDeProfissoes){

            System.out.println(contador + "- 💠 Nome da profissão: " + profissaoAtual.getNome());
            contador++;
        }
    }
}
