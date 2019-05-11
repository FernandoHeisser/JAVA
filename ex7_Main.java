package Lista7.exercicio1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<FormaGeometrica> array = new ArrayList<FormaGeometrica>(3);
		FormaGeometrica q = new Quadrado(5);
		FormaGeometrica c = new Circulo(5);
		FormaGeometrica t = new Triangulo(5, 5, 5);
		
		array.add(q);
		array.add(c);
		array.add(t);
	}

}
