package estruturaSequencial;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        int a, b, c, d, diferencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cálculo A * B - C * D");
        System.out.print("A: ");
        a = teclado.nextInt();
        System.out.print("B: ");
        b = teclado.nextInt();
        System.out.print("C: ");
        c = teclado.nextInt();
        System.out.print("D: ");
        d = teclado.nextInt();
        diferencia = a * b - c * d;
        System.out.printf("%d * %d - %d * %d = %d", a, b, c, d, diferencia);
        teclado.close();
    }
}
