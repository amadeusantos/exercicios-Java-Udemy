package estruturaFor;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ent = teclado.nextInt();
        for (int i = 1; i <= ent; i+=2) {
            System.out.println(i);
        }
        teclado.close();
    }
}
