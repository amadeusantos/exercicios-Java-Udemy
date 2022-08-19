package estruturaSequencial;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        int peca1, peca2, nPeca1, nPeca2;
        double valorPeca1, valorPeca2, total;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o codigo, número de peças e o valor unitário da peça 1: ");
        peca1 = teclado.nextInt();
        nPeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();
        System.out.print("Informe o codigo, número de peças e o valor unitário da peça 2: ");
        peca2 = teclado.nextInt();
        nPeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();
        total = nPeca1 * valorPeca1 + nPeca2 * valorPeca2;
        System.out.printf("Valor a pagar: R$%.2f", total);
        teclado.close();
    }
}
