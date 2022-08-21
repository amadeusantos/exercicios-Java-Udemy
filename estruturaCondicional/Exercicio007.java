package estruturaCondicional;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        double x, y;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextDouble();
        y = teclado.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        teclado.close();
    }
}
