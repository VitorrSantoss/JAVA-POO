package Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ferramenta ferramenta = new Ferramenta();

        System.out.println("---Objeto Ferramenta---");

        System.out.print("Código do Item: ");
        ferramenta.setCodigoDoItem(sc.nextInt());

        sc.nextLine();

        System.out.print("Nome do Item: ");
        ferramenta.setNomeDoItem(sc.nextLine());

        System.out.print("Descrição do Item: ");
        ferramenta.setDescricaoDoItem(sc.nextLine());

        System.out.print("Valor do Item: ");
        ferramenta.setValorDoItem(sc.nextDouble());

        System.out.print("Serial: ");
        ferramenta.setSerial(sc.nextInt());

        sc.nextLine();

        System.out.print("Categoria: ");
        ferramenta.setCategoria(sc.nextLine());

        // Deve retornar CATEGORIA -> Funcionando
        ferramenta.separar();

        System.out.println();

        // Deve retornar SERIAL -> Funcionando
        ferramenta.getIndentificador();

        System.out.println("\n-=-=-=-=--=-=-=-=-=-=-=-");

        Alimento comida = new Alimento();

        System.out.println("---Objeto Comida---");

        System.out.print("Código do Item: ");
        comida.setCodigoDoItem(sc.nextInt());

        sc.nextLine();

        System.out.print("Nome do Item: ");
        comida.setNomeDoItem(sc.nextLine());

        System.out.print("Descrição do Item: ");
        comida.setDescricaoDoItem(sc.nextLine());

        System.out.print("Valor do Item: ");
        comida.setValorDoItem(sc.nextDouble());

        System.out.print("Selo: ");
        comida.setSelo(sc.nextInt());

        // Deve retornar SELO -> Funcionando
        comida.getIndentificador();




    }
}
