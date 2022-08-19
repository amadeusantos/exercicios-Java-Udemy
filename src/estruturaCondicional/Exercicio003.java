package estruturaCondicional;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite 2 números inteiros: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.printf("Os números %d e %d são múltiplos", n1, n2);
        } else {
            System.out.printf("Os números %d e %d não são múltiplos", n1, n2);
        }
        teclado.close();
    }
}
