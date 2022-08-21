package estruturaSequencial;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        int numero, horas;
        double porHora, salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("SÁLARIO DO FUNCIONARIO");
        System.out.print("Número do funcionário: ");
        numero = teclado.nextInt();
        System.out.print("Horas trabalhadas: ");
        horas = teclado.nextInt();
        System.out.print("Valor por hora trabalhada: ");
        porHora = teclado.nextDouble();
        salario = horas * porHora;
        System.out.printf("Funcionário número %d\n", numero);
        System.out.printf("Salário R$%.2f\n", salario);
        teclado.close();
    }
}
