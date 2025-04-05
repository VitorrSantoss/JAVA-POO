package Exercicio12;

public class Animal {

    // ATRIBUTOS
    private Double peso;

    // CONSTRUTOR
    public Animal() { }
    public Animal(Double peso) {
        this.peso = peso;
    }

    // GETTER'S AND SETTER'S
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // MÉTODOS ADICIONAIS
    public  void fazerBarulho(){}
    public void comer(){}
    public void dormir(){}
    public void vaguear(){}
}
