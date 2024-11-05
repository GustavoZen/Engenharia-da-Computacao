package lista_02;

import java.util.Scanner;

public class Questão_10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o teto dos pares da esquerda: ");
		int num_esq = entrada.nextInt();
		System.out.println("Informe o teto dos pares da direita: ");
		int num_dir = entrada.nextInt();
		for (int i = 0; i <= num_dir + 1; i++) {
			for (int j = 0; j <= num_esq; j++) {
				System.out.println(i + " - " + j);
			}
		}
		entrada.close();
	}
}
