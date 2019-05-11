package ifsul.tsi.poo.lista5;

public class Funcionario extends Pessoa {
	String categoria;
	
	public double getSalario() {
		switch(categoria) {
		case "A": return 5000.00;
		case "B": return 6000.00;
		case "C": return 8000.00;
		}
		return 0;
	}
}
