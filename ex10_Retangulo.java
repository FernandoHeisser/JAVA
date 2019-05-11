package Lista9;

public class Retangulo implements FormaGeomatrica {
	
	public double[] lados = new double[2]; 
	
	public double perimetro() {
		return lados[0]*2+lados[1]*2;
	}

	public double area() {
		return lados[0]*lados[1];
	}

}
