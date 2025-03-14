package Exercicio4;

import java.util.Date;

public class Dependente {

    // ATRIBUTOS
    private int sequencial;
    private String nomeCompleto;
    private Date dataNascimento;
    private Integer sexo;
    private boolean particiaPlano;
    private Funcionario funcionario;

    // CONSTRUTORES
    public Dependente() { }

    public Dependente(int sequencial, String nomeCompleto, Date dataNascimento, Integer sexo, boolean particiaPlano, Funcionario funcionario) {
        this.sequencial = sequencial;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.particiaPlano = particiaPlano;
        this.funcionario = funcionario;
    }

    // GETTER'S AND SETTER'S
    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
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

    public boolean isParticiaPlano() {
        return particiaPlano;
    }

    public void setParticiaPlano(boolean particiaPlano) {
        this.particiaPlano = particiaPlano;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
