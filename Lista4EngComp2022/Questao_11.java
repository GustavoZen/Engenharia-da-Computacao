package lista_04;

import java.util.Scanner;

public class Questao_11 {

	static Scanner entrada = new Scanner(System.in);

	public static void povoarmatriz3x2(int[][] vetor) {
		if (vetor.length == 0) {
			return;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Informe o [" + i + "] [" + j + "]  elemento da matriz.");
				vetor[i][j] = entrada.nextInt();
			}
		}
	}

	public static void mostrar_matriz3x2(int[][] vetor) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 1) {
					System.out.print(vetor[i][j] + "]");
				} else
					System.out.print("[" + vetor[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void mostrar_matriz3x2_alt(int[][] matriz) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0)
					System.out.print("[" + matriz[2 - j][i] + ",");
				else if (j == 2)
					System.out.print(matriz[2 - j][i] + "]");
				else
					System.out.print(matriz[2 - j][i] + ",");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matriz = new int[3][2];
		povoarmatriz3x2(matriz);
		mostrar_matriz3x2(matriz);
		mostrar_matriz3x2_alt(matriz);
	}
}
