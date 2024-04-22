package HumanLifeSimulator;

import java.util.ArrayList;

public class CentroDeEmprego {

    private ArrayList<Profissao> listaDeProfissoes;

    public CentroDeEmprego() {
        this.listaDeProfissoes = new ArrayList<Profissao>();
    }

    public void imprimirLista(){
        for (Profissao profissaoAtual : listaDeProfissoes){
            System.out.println("Nome:" + profissaoAtual.getNome());
        }
    }
}
