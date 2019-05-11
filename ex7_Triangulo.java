package Lista7.exercicio1;

public class Triangulo extends FormaGeometrica {
	
	public double lado1;
	public double lado2;
	public double lado3;
	
	Triangulo(double lado1, double lado2, double lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public double area() {
		return lado1*lado2/2;
	}
}
