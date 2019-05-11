package ifsul.tsi.poo.lista5;

public class Professor extends Funcionario {
	String titulacao;
	
	@Override
	public double getSalario() {
		double bonus=0;
		
		switch(titulacao) {
		case "especialista": return 1000.00;
		case "mestre": return 2000.00;
		case "doutor": return 4000.00;
		}
		return super.getSalario()+bonus;
	}
}
