package Exercicio7;

import java.time.LocalDate;


public class Item extends Modelo {

    // ATRIBUTOS
    private int codigo;
    private String nome;
    private String descricao;

    // CONSTRUTORES
    public Item() { }
    public Item(String chassi, String cor, int anoFabricacao, int anoModelo, LocalDate dataEntrada, int codigo, String marca, String nome, double motor, int serie, int codigo1, String nome1, String descricao) {
        super(chassi, cor, anoFabricacao, anoModelo, dataEntrada, codigo, marca, nome, motor, serie);
        this.codigo = codigo1;
        this.nome = nome1;
        this.descricao = descricao;
    }

    // GETTER'S AND SETTER'S
    @Override
    public int getCodigo() {
        System.out.println("Código Item: " + codigo);
        return 0;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        System.out.println("Nome do Item: " + nome);
        return "";
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        System.out.println("Descrição do Item: " + descricao);
        return "";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
