package Exercicio4;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario {

    // ATRIBUTOS
    private Integer matricula;
    private String nomeCompleto;
    private Date dataNascimento;
    private Integer sexo;
    private double salario;
    private int telefone;
    private ArrayList<Dependente> dependentes;

    // CONSTRUTORES
    public Funcionario() { }

    public Funcionario(Integer matricula, String nomeCompleto, Date dataNascimento, Integer sexo, double salario, int telefone, ArrayList<Dependente> dependentes) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
        this.dependentes = dependentes;
    }

    
}
