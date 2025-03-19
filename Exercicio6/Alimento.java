package Exercicio6;

public class Alimento extends ItemDeLoja{

    //ATRIBUTOS
    private Integer selo;

    // CONSTRUTOR
    public Alimento() { }

    public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.selo = selo;
    }

    // GETTER'S AND SETTER'S
    public Integer getSelo() {
        return selo;
    }

    public void setSelo(Integer selo) {
        this.selo = selo;
    }

    @Override
    public int getIndentificador(){
        return selo;
    }
}

