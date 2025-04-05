package Exercicio12;

import java.util.Scanner;

public class Pincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double peso;

        // Criação dos animais (objetos)
        Dog cachorro = new Dog();
        Cat gato = new Cat();
        Lion leao = new Lion();
        Wolf lobo = new Wolf();
        Hippo hipopotamo = new Hippo();

        while (true){
            System.out.print("Informe o peso do animal e veja o resultado: ");
            peso = sc.nextDouble();

            if (peso == -1){
                break;
            }

            if (peso >= 3 && peso <= 5){
                System.out.println("=================================");
                System.out.println("GATO -> Veja suas ações básicas");
                gato.comer();
                gato.fazerBarulho();
                gato.dormir();
                gato.vaguear();
            }
            else if (peso >= 10 && peso <= 25){
                System.out.println("=================================");
                System.out.println("CACHORRO -> Veja suas ações básicas");
                cachorro.comer();
                cachorro.fazerBarulho();
                cachorro.dormir();
                cachorro.vaguear();
            }
            else if (peso >= 30 && peso <=50){
                System.out.println("=================================");
                System.out.println("LOBO -> suas ações básicas");
                lobo.comer();
                lobo.fazerBarulho();
                lobo.dormir();
                lobo.vaguear();
            }
            else if (peso >=120 && peso <=150){
                System.out.println("=================================");
                System.out.println("LEÃO -> suas ações básicas");
                leao.comer();
                leao.fazerBarulho();
                leao.dormir();
                leao.vaguear();
            }
            else if (peso >= 1300 && peso <=1800){
                System.out.println("=================================");
                System.out.println("HIPOPÓTAMO -> suas ações básicas");
                hipopotamo.comer();
                hipopotamo.fazerBarulho();
                hipopotamo.dormir();
                hipopotamo.vaguear();
            }
        }





    }
}
