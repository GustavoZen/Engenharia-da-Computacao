package lista_05;

public class Produto {
	public String nome;
	private float preco_c;
	private float preco_v;
	private float margemDeLucro;
	private float despesasDaEmpresa;
	
	public void CálculoDaMargemDeLucro() {
		margemDeLucro = (((preco_v - (preco_c + despesasDaEmpresa)) / preco_v)) * 100;
	}
	public float getMDL() {
		return this.margemDeLucro;
	}
	public Produto(float a,float b, String nome) {
		this.preco_c = a;
		this.preco_v = b;
		this.nome = nome;
		this.CálculoDaMargemDeLucro();
	}
}
