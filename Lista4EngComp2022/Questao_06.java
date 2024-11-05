package lista_04;

import java.util.Scanner;

public class Questao_06 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Obs: Só aceita massa com até 9 casas decimais.
		System.out.println("Informe a massa incial do material radioativo: ");
		int tempo = 0;
		double massa = entrada.nextInt();
		double massai = massa;
		for (;; tempo++) {
			if (massa > 0.5)
				massa = massa / 2;
			else
				break;
		}
		tempo = tempo * 50;
		System.out.println("Massa inicial: " + massai + "\nMassa final: " + massa + "\nTempo calculado: " + tempo / 3600
				+ "h " + (tempo % 3600) / 60 + "min" + ((tempo % 3600) % 60) + "seg");

	}
}
