public class Agendamento {
	private int id;
	private int data;
	private Cliente cliente;
	private int hora;
	private int minuto;
	public Cabelereiro cabelereiro;

	public Agendamento(int id, Cliente clientex, int dia, int mes, int ano, int hora, int min,
			Cabelereiro cabelereiro) {
		System.out.println("\nOlá " + clientex.getNome());
		System.out.println("Seu horário está marcado para o dia: " + dia + ", do mês " + mes + " do ano de " + ano);
		System.out.println("Ás " + hora + " horas e " + min + " minutos");
		System.out.println("Seu cabelereiro será: " + cabelereiro.getNome());
	}
}
