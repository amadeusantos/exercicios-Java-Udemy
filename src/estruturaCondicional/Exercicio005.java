package estruturaCondicional;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        int codigo, quant;
        double total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("CÓDIGO  ESPECIFICAÇÃO       PREÇO");
        System.out.println("1       Cachorro Quente     R$4,00");
        System.out.println("2       X-Salada            R$4,50");
        System.out.println("3       X-Bacon             R$5,00");
        System.out.println("4       Torrada simples     R$2,00");
        System.out.println("5       Refrigerante        R$1,50");

        System.out.print("Digite o código do produto e a quantidade: ");
        codigo = teclado.nextInt();
        quant = teclado.nextInt();
        if (codigo == 1) {
            total = 4.00 * quant;
        } else if (codigo == 2) {
            total = 4.5 * quant;
        } else if (codigo == 3) {
            total = 5.0 * quant;
        } else if (codigo == 4) {
            total = 2.0 * quant;
        } else if (codigo == 5) {
            total = 1.5 * quant;
        } else {
            total = 0;
            System.out.println("Código inválido!");
        }
        System.out.printf("O total é de R$%.2f", total);
        teclado.close();
    }
}
