package estruturaCondicional;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Testador de número positivo ou negativo");
        System.out.print("Digite um número inteiro: ");
        num = teclado.nextInt();
        if (num >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        teclado.close();
    }
}
