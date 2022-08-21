package estruturaWhile;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alc = 0, gas = 0, die = 0;
        int cliente = teclado.nextInt();
        while (cliente != 4) {
            switch (cliente) {
                case 1 -> alc += 1;
                case 2 -> gas += 1;
                case 3 -> die += 1;
            }
            cliente = teclado.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
        teclado.close();
    }
}
