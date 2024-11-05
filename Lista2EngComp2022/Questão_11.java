package lista_02;

import java.util.Scanner;

public class Questão_11 {
	// para conseguir um resultado igual ao da questão, teste para teto dos pares
	// da direita e esquerda o valor 2.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o teto dos pares da esquerda: ");
		int num_esq = entrada.nextInt();
		System.out.println("Informe o teto dos pares da direita: ");
		int num_dir = entrada.nextInt();
		for (int i = 0; i <= num_esq + 1; i++) {
			for (int aux = 1; aux <= num_dir; aux++) {
				for (int j = 0; j <= num_dir; j++) {
					if (j == aux) {
						System.out.println(i + " - " + j);
						j = 0;
						break;
					} else
						System.out.println(i + " - " + j);
				}
			}
		}
		entrada.close();
	}

}
