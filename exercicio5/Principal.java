package exercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Terrestre carro = new Terrestre();

        System.out.print("Id: ");
        carro.setId(sc.nextInt());

        System.out.print("Ano: ");
        carro.setAno(sc.nextShort());

        System.out.print("Modelo: ");
        carro.setModelo(sc.nextLine());

        sc.nextLine();

        System.out.print("Carga Máxima: ");
        carro.setCarga_maxima(sc.nextInt());

        System.out.print("Quantidade de rodas: ");
        carro.setQtdRoda(sc.nextInt());

        System.out.print("Potência: ");
        carro.setPotencia(sc.nextDouble());

        sc.close();

        carro.consumo();
    }
}
