package estruturaCondicional;

import java.util.Scanner;

public class exercicio002 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d é um número par.", num);
        } else {
            System.out.printf("%d é um número ímpar.", num);
        }
        teclado.close();
    }
}
