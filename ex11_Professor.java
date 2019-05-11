package Lista10;

public class Professor extends Pessoa {
	
	public String titulacao;
	
	public double getSalario() {
		if(titulacao == "A")
			return 4000;
		else if(titulacao == "B")
			return 5000;
		else if(titulacao == "C")
			return 6000;
		return 3000;
	}
}
