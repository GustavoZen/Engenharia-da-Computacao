package lista_04;

import java.util.Scanner;

public class Questao_12 {

	public static void bandeiraDoBrasil(int tamanho) {
		int coluna = tamanho + 1;
		for (int i = 0; i < coluna; i++) {
			for (int j = 0; j < tamanho; j++) {
				int aux2 = (j - tamanho / 2) + 1;
				int aux = j - 1;
				if (j > 0 && j <= tamanho / 2 && (i == (coluna / 2) - aux - 1 || i == (coluna / 2) + aux))
					System.out.print("% ");
				else if ((j > tamanho / 2 && j < tamanho - 1) && (i == aux2 || i == tamanho - aux2))
					System.out.print("% ");
				else if ((i > coluna / 3 && i < (coluna / 3) * 2) && (j >= tamanho / 3 && j < (tamanho / 3) * 2))
					System.out.print("& ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void bandeiraDaAlemanha(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (i < tamanho / 3)
					System.out.print("* ");
				else if (i < (tamanho / 3) * 2)
					System.out.print("% ");
				else
					System.out.print("& ");
			}
			System.out.println();
		}

	}

	public static void bandeiraDaArgentina(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (i == (tamanho / 2) && j == (tamanho / 2))
					System.out.print("* ");
				else if (j < (tamanho / 3) * 2 && j >= tamanho / 3 && i < (tamanho / 3) * 2 && i >= tamanho / 3)
					System.out.print("& ");
				else if (i < (tamanho / 3) * 2 && i >= tamanho / 3)
					System.out.print("% ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void bandeiraDaBelgica(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (j < tamanho / 3)
					System.out.print("* ");
				else if (j < (tamanho / 3) * 2)
					System.out.print("& ");
				else
					System.out.print("% ");
			}
			System.out.println();
		}

	}

	public static void bandeiraDaInglaterra(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (j < (tamanho / 3) * 2 && j >= tamanho / 3)
					System.out.print("& ");
				else if (i < (tamanho / 3) * 2 && i >= tamanho / 3)
					System.out.print("& ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void bandeiraDaCoreiaDoSul(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (((j >= ((tamanho / 3) * 2) && j < tamanho - 1) || (j > 0 && j < tamanho / 3))
						&& (i < (tamanho / 3) - 1 || i > ((tamanho / 3) * 2)))
					System.out.print("% ");
				else if ((j < (tamanho / 3) * 2 && j >= tamanho / 3) && i < (tamanho / 3) * 2 && i >= tamanho / 3)
					System.out.print("& ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void bandeiraDosEUA(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if ((i < (tamanho / 2)) && (j < tamanho / 3))
					System.out.print("* ");
				else if (i % 2 == 0)
					System.out.print("$ ");
				else
					System.out.print("& ");
			}
			System.out.println();
		}
	}

	public static void bandeiraDoCatar(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if ((i % 2 == 0 && j == (tamanho / 2) - 1) || (i % 2 == 1 && j == (tamanho / 2)))
					System.out.print("& ");
				else if (j <= tamanho / 3)
					System.out.print("* ");
				else
					System.out.print("% ");
			}
			System.out.println();
		}
	}

	public static void bandeiraDoJapao(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (j <= (tamanho / 3) * 2 && j >= (tamanho / 3) - 1 && i <= (tamanho / 3) * 2
						&& i >= (tamanho / 3) - 1)
					System.out.print("& ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		char R;
		System.out.println("Pode apresentar falhas com números pares.");
		do {
			System.out.println("Escolha o item que quer verificar: (letras de a-e minúsculas)");
			R = entrada.next().charAt(0);
		} while (R != 'a' && R != 'b' && R != 'c' && R != 'd' && R != 'e' && R != 'f' && R != 'g' && R != 'h'
				&& R != 'i');
		System.out.println("Informe o número de colunas e linhas: ");
		int colinha = entrada.nextInt();
		switch (R) {
		case 'a':
			bandeiraDoBrasil(colinha);
			break;
		case 'b':
			bandeiraDaAlemanha(colinha);
			break;
		case 'c':
			bandeiraDaArgentina(colinha);
			break;
		case 'd':
			bandeiraDaBelgica(colinha);
			break;
		case 'e':
			bandeiraDaInglaterra(colinha);
			break;
		case 'f':
			bandeiraDaCoreiaDoSul(colinha);
			break;
		case 'g':
			bandeiraDosEUA(colinha);
			break;
		case 'h':
			bandeiraDoCatar(colinha);
			break;
		case 'i':
			bandeiraDoJapao(colinha);
			break;
		}
	}
}
