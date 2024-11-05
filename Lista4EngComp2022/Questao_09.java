package lista_04;

import java.util.Scanner;

public class Questao_09 {

	static Scanner entrada = new Scanner(System.in);

	public static void criar_Triangulo(int altura) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Indique a altura do triângulo: ");
		criar_Triangulo(entrada.nextInt());
	}
}
