package Exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Transporte carro = new Transporte();

        System.out.print("Id: ");
        carro.setId(sc.nextInt());

        System.out.print("Ano: ");
        carro.setAno(sc.nextInt());

        System.out.print("Modelo: ");
        carro.setModelo(sc.nextLine());

        sc.nextLine();

        System.out.print("Carga Máxima: ");
        carro.setCargaMaxima(sc.nextDouble());

        System.out.print("Potência: ");
        carro.setPotencia(sc.nextDouble());

        System.out.printf("Consumo: %s", carro.calcularConsumo());

    }
}
