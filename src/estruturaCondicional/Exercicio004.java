package estruturaCondicional;

import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        int inicio, fim, duracao;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a hora inicial e final do jogo: ");
        inicio = teclado.nextInt();
        fim = teclado.nextInt();
        if (inicio == fim) {
            duracao = 24;
        } else if (fim < inicio) {
            duracao = 24 - inicio + fim;
        } else {
            duracao = fim - inicio;
        }
        System.out.printf("O jogo durou %d horas(s).", duracao);
        teclado.close();
    }
}
