package lista8;

public class Tecnico implements Funcionario, Comparable<Tecnico> {

	public int anoDeEntrada;
	public String categoria;

	public double getSalario() {
		if(categoria=="A")
			return 4500;
		else if(categoria=="B")
			return 5000;
		else if(categoria=="C")
			return 5000;
		else
			return 3000;
	}

	public double getDesconto() {
		return getSalario()*8/100;
	}

	public int getAnosDeServico(int ano) {
		return ano-anoDeEntrada;
	}

	public int compareTo(Tecnico t) {
		if(this.getSalario()>t.getSalario())
			return 1;
		if(this.getSalario()<t.getSalario())
			return -1;
		return 0;
	}

}
