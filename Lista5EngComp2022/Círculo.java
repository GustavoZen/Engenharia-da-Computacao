package lista_05;
public class Círculo {
private float raio;
private float circunferência; 
private float area;
public void getArea() {
	this.area = (float) (3.14*this.raio*this.raio);
	System.out.println("Area: " + area);
}
public void aumentarCírculo(double percent) {
	raio = (float) (raio*((100+percent)/100));
}
public void getCircunferência() {
	this.circunferência = (float) (2*3.14*this.raio);
	System.out.println("Circunferência: " + circunferência);
}
public Círculo (int raio){
	this.raio = raio;
	this.getCircunferência();
	this.getArea();
	}
}
