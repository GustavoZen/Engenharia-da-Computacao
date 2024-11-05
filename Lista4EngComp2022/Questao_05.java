package lista_04;

import java.util.Scanner;

class Questao_05 {
	static Scanner entrada = new Scanner(System.in);

	public static int Somatorio(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	public static int Produto_do_vetor(int vetor[]) {
		int produto = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			produto = produto * vetor[i];
		}
		return produto;
	}

	public static int Media_do_vetor(int vetor[]) {
		return Somatorio(vetor) / vetor.length;
	}

	public static int[] povoarvetor(int num, int tam) {
		int[] vetor = new int[tam];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º elemento da array " + num + ".");
			vetor[i] = entrada.nextInt();
		}
		return vetor;
	}

	public static void separador() {

		System.out.println("********************************************");
	}

	public static void main(String[] args) {
		int[] vet1, vet2, vet3;
		int tam1, tam2, tam3;
		System.out.println("Informe o tamanho do vetor1: ");
		tam1 = entrada.nextInt();
		System.out.println("Informe o tamanho do vetor2: ");
		tam2 = entrada.nextInt();
		System.out.println("Informe o tamanho do vetor3: ");
		tam3 = entrada.nextInt();
		vet1 = povoarvetor(1, tam1);
		vet2 = povoarvetor(2, tam2);
		vet3 = povoarvetor(3, tam3);
		separador();
		System.out.println("Somatório vetor nº1: " + Somatorio(vet1));
		System.out.println("Produto vetor nº1: " + Produto_do_vetor(vet1));
		System.out.println("Média do vetor nº1: " + Media_do_vetor(vet1));
		separador();
		System.out.println("Somatório vetor nº2: " + Somatorio(vet2));
		System.out.println("Produto vetor nº2: " + Produto_do_vetor(vet2));
		System.out.println("Média do vetor nº2: " + Media_do_vetor(vet2));
		separador();
		System.out.println("Somatório vetor nº3: " + Somatorio(vet3));
		System.out.println("Produto vetor nº3: " + Produto_do_vetor(vet3));
		System.out.println("Média do vetor nº3: " + Media_do_vetor(vet3));
		separador();
		System.out.println("Somatório dos Somatórios: " + (Somatorio(vet1) + Somatorio(vet2) + Somatorio(vet3)));
		System.out.println(
				"Produto dos produtos: " + (Produto_do_vetor(vet1) * Produto_do_vetor(vet2) * Produto_do_vetor(vet3)));
		System.out.println(
				"Média das médias: " + ((Media_do_vetor(vet1) + Media_do_vetor(vet3) + Media_do_vetor(vet2)) / 3));
	}
}
