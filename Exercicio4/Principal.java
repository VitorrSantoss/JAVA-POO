package Exercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // CRIANDO UM FUNCIONÁRIO
        Funcionario func = new Funcionario();
        // INSTANCIANDO ATRIBUTOS DO func
        func.setNomeCompleto("Vitor Santos");
        
        // CRIANDO O 1º DEPENDENTE
        Dependente dep1 = new Dependente();
        // INSTANCIANDO ATRIBUTOS DO dep
        dep1.setNomeCompleto("Hamilton");
        
        // CRIANDO O 2º DEPENDENTE
        Dependente dep2 = new Dependente();
        dep2.setNomeCompleto("Leclerc");
        
        // CRIANDO UMA LISTA DE DEPENDENTES
        ArrayList<Dependente> deps = new ArrayList<>();
        deps.add(dep1);
        deps.add(dep2);

        // ASSOCIANDO func AOS dep1 E dep2
        func.setDependentes(deps);

        // EXIBIÇÃO DE INFORMAÇÕES
        System.out.println("O funcionário " + func.getNomeCompleto() + " possui " + dep1.getNomeCompleto() + " e " + dep2.getNomeCompleto() + " como dependentes");
        System.out.println(func.getNomeCompleto() + " possui " + deps.size() + " dependentes");
    }
}
