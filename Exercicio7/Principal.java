package Exercicio7;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Modelo carro = new Modelo();

        System.out.println("--class carro--");

        System.out.print("Chassi: ");
        carro.setChassi(sc.nextLine());

        System.out.print("Cor: ");
        carro.setCor(sc.nextLine());

        System.out.print("Ano de Fabricação: ");
        carro.setAnoFabricacao(sc.nextInt());

        System.out.println("Ano do Modelo: ");

        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mês: ");
        int mes = sc.nextInt();
        System.out.print("Ano: ");
        int ano = sc.nextInt();

        carro.setDataEntrada(LocalDate.of(ano, mes, dia));

        System.out.println("---class modelo---");

        System.out.print("Código: ");
        carro.setCodigo(sc.nextInt());

        sc.nextLine();

        System.out.print("Marca: ");
        carro.setMarca(sc.nextLine());

        System.out.print("Nome: ");
        carro.setNome(sc.nextLine());

        System.out.print("Motor: ");
        carro.setMotor(sc.nextInt());

        System.out.print("Série: ");
        carro.setSerie(sc.nextInt());

        Item item = new Item();

        System.out.println("---class item---");

        System.out.print("Código: ");
        item.setCodigo(sc.nextInt());

        sc.nextLine();

        System.out.print("Nome: ");
        item.setNome(sc.nextLine());

        System.out.print("Descrição: ");
        item.setDescricao(sc.nextLine());

        sc.close();

    }
}
