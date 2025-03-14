package Exercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // CRIANDO UM FUNCIONÁRIO
        Funcionario func = new Funcionario();
        // INSTANCIANDO ATRIBUTOS DO func
        func.setNomeCompleto("Vitor Santos");
        func.setSexo(1);

        // CRIANDO O 1º DEPENDENTE
        Dependente dep1 = new Dependente();
        // INSTANCIANDO ATRIBUTOS DO dep
        dep1.setNomeCompleto("Hamilton");
        dep1.setParticiaPlano(true);

        // CRIANDO O 2º DEPENDENTE
        Dependente dep2 = new Dependente();
        dep2.setNomeCompleto("Leclerc");
        dep2.setParticiaPlano(true);

        // ASSOCIANDO func À dep1 e dep2
        func.setDependentes(dep1);
        func.setDependentes(dep2);

        // CRIANDO LISTA DE DEPENDENTES
        ArrayList<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dep1);
        dependentes.add(dep2);

        for(Dependente dep: dependentes){
            System.out.println(dep1.getNomeCompleto() + " e " + dep2.getNomeCompleto() + " são dependentes de " + func.getNomeCompleto());
        }
    }
}
