package estruturaFor;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        float n1, n2;
        for (int i = 0; i < n; i++) {
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();
            System.out.println((n2 == 0)? "divisão impossível": n1 / n2);
        }
        teclado.close();
    }
}
