package lista_04;

import java.util.Scanner;

public class Questao_07 {
	static Scanner entrada = new Scanner(System.in);

	public static void Inversao_de_palavra(String palavra) {
		String saida = "";
		for (int i = palavra.length() - 1; i >= 0; i--) {
			saida += palavra.charAt(i);
		}
		System.out.println(saida);
	}

	public static void main(String[] args) {
		System.out.println("Digite a palavra a ser invertida: ");
		String palavra = entrada.nextLine();
		Inversao_de_palavra(palavra);
	}
}
