package Exercicio11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Insira os dados do Retângulo:");
        System.out.print("Lado 1: ");
        retangulo.setLado1(sc.nextDouble());
        System.out.print("Lado 2: ");
        retangulo.setLado2(sc.nextDouble());
        retangulo.area();

       Triangulo triangulo = new Triangulo();

        System.out.println("Insira os dados do Triângulo:");
        System.out.print("Base: ");
        triangulo.setBase(sc.nextDouble());
        System.out.print("Altura: ");
        triangulo.setAltura(sc.nextDouble());
        triangulo.area();

        Circulo circulo = new Circulo();

        System.out.println("Insira os dados do Circulo:");
        System.out.print("Raio: ");
        circulo.setRaio(sc.nextDouble());
        circulo.area();
        circulo.diamentro();

    }
}
