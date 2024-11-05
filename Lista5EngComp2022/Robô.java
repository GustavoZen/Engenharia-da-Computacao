package lista_05;

public class Robô {
	private int i = 5, j = 5;
	private int numeroDePassos = 0;

	public int N() {
		if (i < 9) {
			i++;
			numeroDePassos++;
			return 1;
		} else
			return 0;
	}

	public int S() {
		if (i > 0) {
			i--;
			numeroDePassos++;
			return 1;
		} else
			return 0;
	}

	public int L() {
		if (j < 9) {
			j++;
			numeroDePassos++;
			return 1;
		} else
			return 0;
	}

	public int O() {
		if (j > 0) {
			j--;
			numeroDePassos++;
			return 1;
		} else
			return 0;
	}

	public void NO() {
		if (this.N() + this.O() == 2)
			numeroDePassos--;
	}

	public void NL() {
		if (this.N() + this.L() == 2)
			numeroDePassos--;
	}

	public void SO() {
		if (this.S() + this.O() == 2)
			numeroDePassos--;
	}

	public void SL() {
		if (this.S() + this.L() == 2)
		numeroDePassos--;
	}

}
