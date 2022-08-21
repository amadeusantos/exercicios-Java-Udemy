package estruturaFor;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int dentro = 0, fora = 0;
        int n = teclado.nextInt();
        for (int i = 0; i < 5; i++) {
            x = teclado.nextInt();
            if (x >= 10 && x <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
        teclado.close();
    }
}
