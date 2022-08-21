package estruturaCondicional;

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        double renda, imposto;
        Scanner teclado = new Scanner(System.in);
        renda = teclado.nextDouble();
        if (renda <= 2000) {
            System.out.println("Isento");
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else if (renda <= 4500) {
            imposto = (renda - 3000) * 0.18 + 80;
            System.out.printf("R$ %.2f", imposto);
        } else {
            imposto = (renda - 4500) * 0.28 + 350;
            System.out.printf("R$ %.2f", imposto);
        }
    }
}
