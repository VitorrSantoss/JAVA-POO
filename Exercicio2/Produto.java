package Exercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Produto {

    // ATRIBUTOS
    private Integer id;
    private String nome;
    private String descricao;
    private LocalDate validade;

    // CONSTRUTORES
    public Produto() { }

    public Produto(Integer id, String nome, String descricao, LocalDate validade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
    }

    // GETTER'S AND SETTER'S
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Integer calcularDiasRestantes(){
        LocalDate hoje = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(validade, hoje);
    }
}
