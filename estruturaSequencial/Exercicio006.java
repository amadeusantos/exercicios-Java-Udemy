package estruturaSequencial;

import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        double a, b, c, triagulo, circulo, trapezio, quadrado, retangulo;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        teclado.close();

        triagulo = a * c / 2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = (a + b) * c / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("Triângulo: %.3f\n", triagulo);
        System.out.printf("Círculo: %.3f\n", circulo);
        System.out.printf("Trapézio: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retângulo: %.3f\n", retangulo);
    }
}
