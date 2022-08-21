package estruturaFor;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n", i, i * i, i * i * i);
        }
        teclado.close();
    }
}
