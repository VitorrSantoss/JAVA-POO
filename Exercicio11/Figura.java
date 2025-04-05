package Exercicio11;

public abstract class Figura {

    // ATRIBUTOS
    private String cor;

    // CONSTRUTOR
    public Figura() { }
    public Figura(String cor) {
        this.cor = cor;
    }

    // GETTER AND SETTER
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

}
