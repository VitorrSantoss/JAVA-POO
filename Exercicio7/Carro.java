package Exercicio7;

import java.time.LocalDate;

public abstract class Carro {

    // ATRIBUTOS
    private String chassi;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private LocalDate dataEntrada;

    // CONSTRUTORES
    public Carro() { }

    public Carro(String chassi, String cor, int anoFabricacao, int anoModelo, LocalDate dataEntrada) {
        this.chassi = chassi;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.dataEntrada = dataEntrada;
    }

    // GETTER'S AND SETTER'S
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
