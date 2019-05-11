package Lista7.exercicio1;
import java.lang.Math;

public class Circulo extends FormaGeometrica {
	
	public double raio;
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI*2*raio;
	}
	
	public double diametro() {
		return 2*raio;
	}
}
