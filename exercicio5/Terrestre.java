package exercicio5;

public class Terrestre extends MeioDeTransporte{

    // ATRIBUTOS
    private int qtdRoda;
    private double potencia;

    // CONSTRUTORES
    public Terrestre() { }

    public Terrestre(int id, short ano, String modelo, double carga_maxima, int qtdRoda, double potencia) {
        super(id, ano, modelo, carga_maxima);
        this.qtdRoda = qtdRoda;
        this.potencia = potencia;
    }

    // GETTER'S AND SETTER'S
    public int getQtdRoda() {
        return qtdRoda;
    }

    public void setQtdRoda(int qtdRoda) {
        this.qtdRoda = qtdRoda;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public void consumo(){
        System.out.printf("Consumo: %s", potencia * getCarga_maxima() * 100);
    }
}
