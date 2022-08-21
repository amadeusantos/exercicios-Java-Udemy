package estruturaFor;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        float v1, v2, v3, media;
        for (int i = 0; i < n; i++) {
            v1 = teclado.nextFloat();
            v2 = teclado.nextFloat();
            v3 = teclado.nextFloat();
            media = (2 * v1 + 3 * v2 + 5 * v3) / 10;
            System.out.printf("%.1f\n", media);
        }
        teclado.close();
    }
}
