package Exercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Id: ");
        produto.setId(sc.nextInt());

        sc.nextLine();

        System.out.print("Nome: ");
        produto.setNome(sc.nextLine());

        System.out.print("Descrição: ");
        produto.setDescricao(sc.nextLine());

        System.out.println("Validade: ");
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mês: ");
        int mes = sc.nextInt();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        produto.setValidade(LocalDate.of(ano, mes, dia));

        System.out.printf("Faltam %d dias para vencer", produto.calcularDiasRestantes());
























    }
}
