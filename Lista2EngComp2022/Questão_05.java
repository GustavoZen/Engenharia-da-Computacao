package lista_02;

public class Questão_05 {
	public static void main(String[] args) {
		int i = 0;
		System.out.print("{");
		for (i = 0; i <= 99; i += 3) {
			if (i == 99) {
				System.out.print(i);
			} else
				System.out.print(i + ",");
		}
		System.out.print("}");

	}
}
