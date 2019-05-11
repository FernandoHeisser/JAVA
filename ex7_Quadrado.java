package Lista7.exercicio1;

public class Quadrado extends FormaGeometrica {
	
	public double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;
	}
}
