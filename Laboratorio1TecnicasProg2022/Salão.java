import java.util.Calendar;

public class Salão {
	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();

		Cliente cliente1 = new Cliente(1000);
		cliente1.setId(1);
		cliente1.setNome("Cliente_n1");

		Cliente cliente2 = new Cliente(2000);
		cliente2.setId(2);
		cliente2.setNome("Cliente_n2");

		Cliente cliente3 = new Cliente(3000);
		cliente3.setId(3);
		cliente3.setNome("Cliente_n3");
		
///////////////////////////////////////////////////////////////////////////////
		
		Cabelereiro cabelereiro1 = new Cabelereiro(9878, "Cabelereiro_n1");
		cabelereiro1.setId(5);

		Cabelereiro cabelereiro2 = new Cabelereiro(5648, "Cabelereiro_n2");
		cabelereiro1.setId(6);

		Cabelereiro cabelereiro3 = new Cabelereiro(6489, "Cabelereiro_n3");
		cabelereiro1.setId(7);
		
///////////////////////////////////////////////////////////////////////////////
		
		data.set(Calendar.YEAR, 2022);
		data.set(Calendar.MONTH, 9);
		data.set(Calendar.DAY_OF_MONTH, 27);
		data.set(Calendar.HOUR_OF_DAY, 10);
		data.set(Calendar.MINUTE, 00);
		Agendamento agendamento1 = new Agendamento(14, cliente1, data.get(Calendar.DAY_OF_MONTH),
				data.get(Calendar.MONTH), data.get(Calendar.YEAR), data.get(Calendar.HOUR_OF_DAY),
				data.get(Calendar.MINUTE), cabelereiro2);

		data.set(Calendar.YEAR, 2022);
		data.set(Calendar.MONTH, 10);
		data.set(Calendar.DAY_OF_MONTH, 27);
		data.set(Calendar.HOUR_OF_DAY, 11);
		data.set(Calendar.MINUTE, 00);
		Agendamento agendamento2 = new Agendamento(15, cliente2, data.get(Calendar.DAY_OF_MONTH),
				data.get(Calendar.MONTH), data.get(Calendar.YEAR), data.get(Calendar.HOUR_OF_DAY),
				data.get(Calendar.MINUTE), cabelereiro3);

		data.set(Calendar.YEAR, 2022);
		data.set(Calendar.MONTH, 10);
		data.set(Calendar.DAY_OF_MONTH, 27);
		data.set(Calendar.HOUR_OF_DAY, 12);
		data.set(Calendar.MINUTE, 00);
		Agendamento agendamento3 = new Agendamento(16, cliente3, data.get(Calendar.DAY_OF_MONTH),
				data.get(Calendar.MONTH), data.get(Calendar.YEAR), data.get(Calendar.HOUR_OF_DAY),
				data.get(Calendar.MINUTE), cabelereiro1);
		
//////////////////////////////////////////////////////////////////////////////////
		
		Serviço servico1 = new Serviço(10, "Barba", 20);
		servico1.setDescricao("Aparar e definir barba.");

		Serviço servico2 = new Serviço(11, "Nevou", 15);
		servico2.setDescricao("Platinar cabelo");

		Serviço servico3 = new Serviço(12, "Degradê", 25);
		servico3.setDescricao("Aparar e fazer degradê no cabelo.");
		
////////////////////////////////////////////////////////////////////////////////////
		
		Atendimento atendimento1 = new Atendimento(cliente1, data.HOUR_OF_DAY, data.DAY_OF_MONTH, data.MONTH, data.YEAR,
				data.MINUTE, cabelereiro2);
		Atendimento atendimento2 = new Atendimento(cliente2, data.HOUR_OF_DAY, data.DAY_OF_MONTH, data.MONTH, data.YEAR,
				data.MINUTE, cabelereiro3);
		Atendimento atendimento3 = new Atendimento(cliente3, data.HOUR_OF_DAY, data.DAY_OF_MONTH, data.MONTH, data.YEAR,
				data.MINUTE, cabelereiro1);
	}
}
