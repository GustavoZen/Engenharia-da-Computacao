package lista_05;

public class ControleRemoto {
	private int volume = 0;
	private int canal = 0;
	
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	public void consultarValores() {
		System.out.println("Canal autal: " + canal);
		System.out.println("Volume atual: "+ volume);
	}
}
