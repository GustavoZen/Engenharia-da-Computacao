package lista_04;

import java.util.Scanner;

public class Questao_08 {

	static Scanner entrada = new Scanner(System.in);

	public static char Codigo(char a) {
		if (a == '+')
			return '0';
		if (a == '#')
			return '1';
		if (a == 'A' || a == 'B' || a == 'C')
			return '2';
		if (a == 'D' || a == 'E' || a == 'F')
			return '3';
		if (a == 'G' || a == 'H' || a == 'I')
			return '4';
		if (a == 'J' || a == 'K' || a == 'L')
			return '5';
		if (a == 'M' || a == 'N' || a == 'O')
			return '6';
		if (a == 'P' || a == 'Q' || a == 'R' || a == 'S')
			return '7';
		if (a == 'T' || a == 'U' || a == 'V')
			return '8';
		if (a == 'X' || a == 'Y' || a == 'Z')
			return '9';
		return a;
	}

	public static String Decodificar(String numerocod) {
		String saida = "(";
		if (numerocod.length() != 12) {
			System.out.println("Digite um número de telefone com letras,números ou simbolos com 12 dígitos");
			return "Erro";
		}
		for (int i = 0; i < 3; i++) {
			saida += Codigo(numerocod.charAt(i));
		}
		saida += ")";
		for (int i = 3; i < 12; i++) {
			saida += Codigo(numerocod.charAt(i));
		}
		return saida;
	}

	public static void main(String[] args) {
		System.out.println(
				"Informe um número de telefone com letras, números e símbolos(Obs: Letras devem ser inseridas como maiúsculas e o número deve possuir 12 caracteres)");
		String numerocod = entrada.nextLine();
		System.out.println(Decodificar(numerocod));
	}
}
