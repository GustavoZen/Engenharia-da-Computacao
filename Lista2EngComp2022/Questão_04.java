package lista_02;

public class Questão_04 {
	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i <= 100; i += 2) {
			if (i == 100) {
				System.out.print(i);
			} else
				System.out.print(i + " - ");
		}
	}
}
