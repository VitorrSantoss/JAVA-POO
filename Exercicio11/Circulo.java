package Exercicio11;

public class Circulo extends Figura{

    private double raio;

    public Circulo() { }
    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area(){
        System.out.printf("Área do Circulo %.2f\n", Math.PI * raio * raio);
        return 0;
    }

    public double diamentro(){
        System.out.println("Diamentro do Circulo: " + raio*2);
        return 0;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
