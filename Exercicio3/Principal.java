package Exercicio3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // CRIANDO O 1º ALUNO
        Aluno aluno1 = new Aluno();
        // INSTANCIANDO ATRIBUTOS DO aluno1
        aluno1.setNome("Vitor Santos");
        aluno1.setCidade("Recife");

        // CRIANDO O 2º ALUNO
        Aluno aluno2 = new Aluno();
        // INSTACIANDO ATRIBUTOS DO aluno2
        aluno2.setNome("Luiza Cordeiro");
        aluno2.setCidade("Olinda");

        // CRIANDO UMA TURMA
        Turma turma = new Turma();
        // INSTANCIANDO ATRIBUTOS DA turma
        turma.setCod("Formação FullStack");
        turma.setTurno(3);
        turma.setSala(1401);

        // ASSOCIANDO aluno1 e aluno2 À turma
        aluno1.setTurma(turma);
        aluno2.setTurma(turma);

        // CRIANDO UMA LISTA PARA ALUNOS
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        for(Aluno aluno: listaAlunos){
            System.out.println("O aluno " + aluno.getNome() + " está na turma " + turma.getCod() );
        }

    }
}
