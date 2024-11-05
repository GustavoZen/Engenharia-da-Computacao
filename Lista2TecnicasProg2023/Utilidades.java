package implementacaoDeMetodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
	Scanner input = new Scanner(System.in);

	public int menorTamanho(int vet1[], int vet2[]) {
		int lowestLength = 0;
		if (vet1.length >= vet2.length)
			lowestLength = vet2.length;
		else
			lowestLength = vet1.length;
		return lowestLength;
	}

	public void imprimirVetor(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int somatorio(int vet[]) {
		int soma = 0;
		if (vet.length > 4) {
			for (int i = 2; i < vet.length - 2; i++) {
				soma += vet[i];
			}
			return soma;
		} else
			return 0;
	}

	public void numerosPares(int inicial, int ultimo) {
		for (int i = inicial; i <= ultimo; i++) {
			if (i % 2 == 0)
				System.out.print(i + ",");
		}
	}

	public int somatorioNormal(int vet[]) {
		int soma = 0;
		if (vet.length > 4) {
			for (int i = 0; i < vet.length; i++) {
				soma += vet[i];
			}
			return soma;
		} else
			return 0;
	}

	public float media(int vet1[], int vet2[]) {
		int soma = somatorioNormal(vet1) + somatorioNormal(vet2);
		float media = (float) soma / (vet1.length + vet2.length);
		return media;
	}

	public float mediaPonderada(int vet1[], int vet2[]) {
		int lowestLength = menorTamanho(vet1, vet2);
		int soma = 0;
		for (int i = 0; i < lowestLength; i++) {
			soma += vet1[i] * vet2[i];
		}
		return soma / somatorioNormal(vet2);
	}

	public int contagemDeElementos(int vet[], int num) {
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == num)
				cont++;
		}
		return cont;
	}

	public int[] copiaDeVetor(int vet[]) {
		return vet;
	}

	public void ordenarVetorCrescente(int vet[]) {
		for (int i = 1; i < vet.length; i++) {
			if (vet[i - 1] > vet[i]) {
				int temp = vet[i - 1];
				vet[i - 1] = vet[i];
				vet[i] = temp;
				i = 0;
			}
		}
	}

	public boolean verificarOrdem(int vet[]) {
		for (int i = 1; i < vet.length; i++) {
			if (vet[i - 1] > vet[i]) {
				return false;
			}
		}
		return true;
	}

	public int kEsimoMaior(int vet[], int k) {
		int vetaux[] = vet;
		ordenarVetorCrescente(vetaux);
		return vetaux[vetaux.length - 1 - (k - 1)];
	}

	public int kEsimoMenor(int vet[], int k) {
		int vetaux[] = vet;
		ordenarVetorCrescente(vetaux);
		return vetaux[k - 1];
	}

	public boolean verificacaoDeIgualdade(int vet1[], int vet2[]) {
		if (vet1.length != vet2.length)
			return false;
		for (int i = 0; i < vet1.length; i++) {
			if (vet1[i] != vet2[i])
				return false;
		}
		return true;
	}

	public double potenciacao(double base, int expoente) {
		double potencia = 1;
		for (int i = 0; i < expoente; i++) {
			potencia = potencia * base;
		}
		return potencia;
	}

	public boolean primo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public int[] buscaPorOcorrencias(int vet1[], int vet2[]) {
		int vet3[] = new int[vet1.length + vet2.length];
		for (int i = 0; i < vet1.length; i++) {
			vet3[i] = vet1[i];
		}
		for (int i = 0; i < vet2.length; i++) {
			vet3[vet1.length + i] = vet2[i];
		}
		return vet3;
	}

	public int[] remocaodeElementoDoVetor(int vet[], int num) {
		int[] vetaux = new int[vet.length - contagemDeElementos(vet, num)];
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != num)
				vetaux[cont] = vet[i];
			cont++;
		}
		return vetaux;
	}

	public String inversaoDeString(String texto) {
		char[] caracteres = texto.toCharArray();
		char[] inversa = new char[caracteres.length];
		for (int i = caracteres.length - 1; i >= 0; i--) {
			inversa[caracteres.length - 1 - i] = caracteres[i];
		}
		String resultado = new String(inversa);
		return resultado;
	}

	public boolean verificacaoDePalindromo(String texto) {
		char[] frase = texto.toCharArray();
		char[] inverso = inversaoDeString(texto).toCharArray();
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] != inverso[i])
				return false;
		}
		return true;
	}

	public double jurosCompostos(float valorInicial, double taxa, int tempo) {
		double resultado = valorInicial * potenciacao((1 + taxa), tempo);
		return resultado;
	}

	public boolean numeroPerfeito(int num) {
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		int somaDosDivisores = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				divisores.add(i);
		}
		for (Integer div : divisores)
			somaDosDivisores += div;
		if (somaDosDivisores == num)
			return true;
		else
			return false;
	}

	public void imprimirElementosA() {
		System.out.println("Digite o número de linhas e colúnas desejadas: ");
		int r = input.nextInt();
		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void imprimirElementosB() {
		System.out.println("Digite o número de linhas e colúnas desejadas: ");
		int r = input.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (j % 2 == 0)
					System.out.print("@ ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void imprimirElementosC() {
		System.out.println("Digite o número de linhas e colúnas desejadas: ");
		int r = input.nextInt();
		if (r % 2 == 1) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < r; j++) {
					if (i == r / 2)
						System.out.print("@ ");
					else if (i % 2 == 0)
						if (j != r / 2)
							System.out.print(r - j - 1 + " ");
						else
							System.out.print("@");
					else if (j != r / 2)
						System.out.print(j + " ");
					else
						System.out.print("@");
				}
				System.out.println();

			}
		}
	}

	public void imprimirElementosD() {
		System.out.println("Digite o número de linhas e colúnas desejadas: ");
		int r = input.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (i == 0 || j == 0)
					System.out.print(j + i + " ");
				else if (j == r - 1)
					System.out.print(j - i + " ");
				else if (i == r - 1)
					System.out.print(i - j + " ");
				else
					System.out.print("* ");
			}
			System.out.println();

		}
	}

	public void imprimirElementosE() {
		System.out.println("Digite o número de linhas e colúnas desejadas: ");
		int r = input.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (j < r / 2 && i < r / 2)
					System.out.print("# ");
				else if (j > r / 2 && i < r / 2)
					System.out.print("! ");
				else if (j < r / 2 && i > r / 2)
					System.out.print("* ");
				else if (j > r / 2 && i > r / 2)
					System.out.print("% ");
				else if (j == r / 2)
					System.out.print("|| ");
				else
					System.out.print("= ");
			}
			System.out.println();
		}
	}

	public void imprimirElementosF() {
		System.out.println("Digite o número de linhas e colúnas desejadas: ");
		int r = input.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (i == j || i == r-j-1)
					System.out.print(j + " ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
