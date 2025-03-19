package Exercicio6;

public class Ferramenta extends ItemDeLoja{

    // ATRIBUTOS
    private String categoria;
    private Integer serial;

    // CONSTRUTORES
    public Ferramenta() { }

    public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, String categoria, Integer serial) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.categoria = categoria;
        this.serial = serial;
    }

    // GETTER'S AND SETTER'S
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    // MÉTODOS ESPECIAS
    @Override
    public int getIndentificador(){
        return serial;
    }

    public void separar(){
        if (categoria.equals(" ")){
            System.out.println("Outros");
        }
        else{
            System.out.printf("Categoria: %s", categoria);
        }
    }


}
