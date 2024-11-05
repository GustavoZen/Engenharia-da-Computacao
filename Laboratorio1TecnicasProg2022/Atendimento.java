public class Atendimento {
	public Atendimento(Cliente cliente, int hora, int dia, int mes, int ano, int min, Cabelereiro cabelereiro) {
		System.out.println("\nChamando: "+cliente.getNome());
		System.out.println("Cabelereiro: "+cabelereiro.getNome());
	}
}
