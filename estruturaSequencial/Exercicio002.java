package estruturaSequencial;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ÁREA DO CÍRCULO");
        System.out.print("Raio do círculo: "); // Locale.setDefault(Locale.US) para utilização do "."
        double raio = teclado.nextDouble();
        double area = Math.pow(raio, 2) * 3.14159;
        System.out.printf("A área do circulo é %.4f u.a.", area);
        teclado.close();
    }
}
