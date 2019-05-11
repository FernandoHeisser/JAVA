package lista8;
import java.lang.Comparable;

public class Professor implements Funcionario, Comparable<Professor> {
	
	public int anoDeEntrada;
	public String categoria;


	public double getSalario() {
		if(categoria=="A")
			return 4500;
		else if(categoria=="B")
			return 5500;
		else if(categoria=="C")
			return 6500;
		else
			return -1;
	}

	public double getDesconto() {
		return getSalario()*11/100;
	}

	public int getAnosDeServico(int ano) {
		return ano-anoDeEntrada;
	}

	public int compareTo(Professor p) {
		if(this.anoDeEntrada>p.anoDeEntrada)
			return 1;
		if(this.anoDeEntrada<p.anoDeEntrada)
			return -1;
		return 0;
	}

}
