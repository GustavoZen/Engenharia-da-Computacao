package lista_04;

public class Questao_03 {

	public static void mostrar_vetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {
				if (i == (vetor.length - 1)) {
					System.out.print(vetor[i]);
				} else
					System.out.print(vetor[i] + " ; ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] vetp = new int[100], vetpos3 = new int[100], vetneg3 = new int[100], vetpos = new int[100],
				vetneg = new int[100];
		int contpos3 = 0, contneg3 = 0, contpos = 0, contneg = 0;
		for (int i = 0; i < vetp.length; i++) {
			vetp[i] = (int) (Math.round(Math.random() * -200) + 100);
		}
		for (int i = 0; i < vetp.length; i++) {
			if (vetp[i] >= 0) {
				if (vetp[i] % 3 == 0) {
					vetpos3[contpos3] = vetp[i];
					contpos3++;
				} else {
					vetpos[contpos] = vetp[i];
					contpos++;
				}

			} else if (vetp[i] % 3 == 0) {
				vetneg3[contneg3] = vetp[i];
				contneg3++;
			} else {
				vetneg[contneg] = vetp[i];
				contneg++;
			}

		}
		System.out.print("Vetor principal: ");
		mostrar_vetor(vetp);
		System.out.print("Vetor positivo não múltiplos de 3: ");
		mostrar_vetor(vetpos);
		System.out.print("Vetor negativo não múltiplos de 3: ");
		mostrar_vetor(vetneg);
		System.out.print("Vetor positivo múltiplos de 3: ");
		mostrar_vetor(vetpos3);
		System.out.print("Vetor negativo múltiplos de 3: ");
		mostrar_vetor(vetneg3);
	}
}
