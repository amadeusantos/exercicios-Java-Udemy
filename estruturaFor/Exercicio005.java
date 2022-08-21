package estruturaFor;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int fat = 1;
        for (int i = n; i > 0; i--) {
            fat *= i;
        }
        System.out.println(fat);
        teclado.close();
    }
}
