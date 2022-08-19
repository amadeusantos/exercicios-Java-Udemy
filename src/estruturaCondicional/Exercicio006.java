package estruturaCondicional;

import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        double num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = teclado.nextDouble();
        if (num < 0 || num > 100) {
            System.out.println("Fora de intervalo.");
        } else if (num >= 0 && num < 25) {
            System.out.println("Intervalo [0, 25]");
        } else if (num <= 50) {
            System.out.println("Intervalo (25, 50]");
        } else if (num <= 75) {
            System.out.println("Intervalo (50, 75]");
        } else if (num <= 100) {
            System.out.println("Intervalo (75, 100]");
        }
        teclado.close();
    }
}
