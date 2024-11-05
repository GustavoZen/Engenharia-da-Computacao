package lista_02;

public class Questão_09 {
	public static void main(String[] args) {
		int i, j;
		for (i = 0; i <= 26; i += 2) {
			j = 33 + 3 * (i / 2);
			System.out.println(i + " - " + j + "\n");
		}
	}
}
