package lista_04;

import java.lang.Math;
import java.util.Scanner;

public class Questao_10 {

	static Scanner entrada = new Scanner(System.in);

	public static boolean Numero_de_Armstrong(int x) {
		int verif = x;
		int z = 0;
		int casasDecimais = 0;
		for (;; casasDecimais++)
			if ((x / Math.pow(10, casasDecimais)) < 10)
				break;
		casasDecimais++;
		for (int aux = casasDecimais - 1; aux >= 0; aux--) {
			z += Math.pow((x / (int) Math.pow(10, aux)), casasDecimais);
			x -= (x / (int) Math.pow(10, aux) * (int) Math.pow(10, aux));
		}
		if (z == verif) {
			System.out.println(verif + " é um número de Armstrong.");
			return true;
		} else
			System.out.println(verif + " não é um número de Armstrong.");
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Digite o número que será verificado");
		Numero_de_Armstrong(entrada.nextInt());
	}
}
