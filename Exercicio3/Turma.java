package Exercicio3;

import java.util.ArrayList;

public class Turma {

    // ATRIBUTOS
    private String cod;
    private Integer turno;
    private Integer sala;
    private ArrayList<Aluno> alunos;

    // CONSTRUTORES
    public Turma() { }
    public Turma(String cod, Integer turno, Integer sala, ArrayList<Aluno> alunos) {
        this.cod = cod;
        this.turno = turno;
        this.sala = sala;
        this.alunos = alunos;
    }
    // GETTER'S AND SETTER'S
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
