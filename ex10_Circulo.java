package Lista9;
import java.lang.Math;

public class Circulo implements FormaGeomatrica {
	
	public double raio;
	
	public double perimetro() {
		return (raio+raio)*Math.PI;
	}

	public double area() {
		return raio*raio*Math.PI;
	}

}
