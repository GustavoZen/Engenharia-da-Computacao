package lista_05;

public class Pessoa {
 private int idade;
 private int dia;
 private int mes;
 private int ano;
 private String nome;
 
 public Pessoa(int dia, int mes, int ano, String nome) {
	 this.dia = dia;
	 this.mes = mes;
	 this.ano = ano;
	 this.nome = nome;
	 this.calculaIdade(dia, mes, ano);
	 this.idade = this.calculaIdade(8,10,2022);
 }
 
 public int calculaIdade(int day, int month, int year) {
	 int idade = 0;
	 idade = year - ano;
	 if(mes >= month){
		 if(dia > day) {
			 idade--;
		 }
	 }
	 return idade;
 }
 public int getIdade() {
	 return this.idade;
 }
 public String informaNome() {
	 return this.nome;
 }
 public void ajudaDataDeNascimento(int dia, int mes, int ano) {
	 this.dia = dia;
	 this.mes = mes;
	 this.ano = ano;
	 this.calculaIdade(dia, mes, ano);
 }
}
