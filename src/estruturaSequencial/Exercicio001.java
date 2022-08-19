package estruturaSequencial;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de SOMA");
        System.out.print("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;
        System.out.printf("A soma %d mais %d é %d.", n1, n2, soma);
        teclado.close();
    }
}
