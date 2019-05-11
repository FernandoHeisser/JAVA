package Lista9;
import java.util.ArrayList;

public class Util {
	public ArrayList<Class> tiposFormaGeometrica(ArrayList<FormaGeomatrica> array) {
		ArrayList<Class> resultado = new ArrayList<Class>();
		for(Object o : array) {
			if(o instanceof Circulo && !resultado.contains(Circulo.class))
				resultado.add(Circulo.class);

			else if(o instanceof Retangulo && !resultado.contains(Retangulo.class))
				resultado.add(Retangulo.class);

			else if(o instanceof Triangulo && !resultado.contains(Triangulo.class))
				resultado.add(Triangulo.class);
		}
		return resultado;
	}
	
	public int[] contaFormaGeometrica(ArrayList<FormaGeomatrica> array) {
		int[] resultado = {0, 0, 0};
		for(Object o : array) {
			if(o instanceof Circulo)
				resultado[0]++;

			else if(o instanceof Retangulo)
				resultado[1]++;

			else if(o instanceof Triangulo)
				resultado[2]++;
		}
		return resultado;
	}
	
	public ArrayList<Triangulo> getTriangulos(ArrayList<FormaGeomatrica> array) {
		ArrayList<Triangulo> resultado = new ArrayList<Triangulo>();
		for(Object o : array) {
			if(o instanceof Triangulo)
				resultado.add((Triangulo) o);
		}
		return resultado;
	}
	
	public ArrayList<Retangulo> getRetangulos(ArrayList<FormaGeomatrica> array) {
		ArrayList<Retangulo> resultado = new ArrayList<Retangulo>();
		for(Object o : array) {
			if(o instanceof Retangulo)
				resultado.add((Retangulo) o);
		}
		return resultado;
	}
	
	public ArrayList<Circulo> getCirculos(ArrayList<FormaGeomatrica> array) {
		ArrayList<Circulo> resultado = new ArrayList<Circulo>();
		for(Object o : array) {
			if(o instanceof Circulo)
				resultado.add((Circulo) o);
		}
		return resultado;
	}
	
	
	
	
}
