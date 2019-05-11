package Lista9;

public class Triangulo implements FormaGeomatrica {
	
	public double[] lados = new double[3];
	
	public double perimetro() {
		return lados[0]+lados[1]+lados[2];
	}

	public double area() {
		return (lados[0]*lados[1])/2;
	}

}
