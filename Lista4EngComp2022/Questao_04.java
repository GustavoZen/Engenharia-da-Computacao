package lista_04;

import java.util.Scanner;

public class Questao_04 {

	static Scanner entrada = new Scanner(System.in);

	public static void Organizar_VogalxConsoante(String nome) {
		for (int j = 0; j < nome.length(); j++) {
			if (Vogal_ou_Consoante(nome.charAt(j)))
				System.out.println(nome.charAt(j) + " é uma vogal.");
			else
				System.out.println(nome.charAt(j) + " é uma consoante.");
		}
	}

	public static boolean Vogal_ou_Consoante(char a) {
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
				|| a == 'U')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Quantidade de palavras a ser digitada: ");
		// Obs: não funciona com vogais com acento.
		int qtd = entrada.nextInt();
		String[] palavras = new String[qtd];
		entrada.nextLine();
		for (int i = 0; i < qtd; i++) {
			System.out.println((i + 1) + "ª Palavra: ");
			palavras[i] = entrada.nextLine();
		}
		for (int i = 0; i < palavras.length; i++) {
			Organizar_VogalxConsoante(palavras[i]);
		}
	}
}
