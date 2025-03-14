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
    private Dependente dependentes;

    // CONSTRUTORES
    public Funcionario() { }

    public Funcionario(Integer matricula, String nomeCompleto, Date dataNascimento, Integer sexo, double salario, int telefone, Dependente dependentes) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
        this.dependentes = dependentes;
    }

    // GETTER'S AND SETTER'S
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Dependente getDependentes() {
        return dependentes;
    }

    public void setDependentes(Dependente dependentes) {
        this.dependentes = dependentes;
    }
}
