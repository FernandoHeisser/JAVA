package Lista10;
import java.util.ArrayList;

public class Pessoa {
	
	public String nome;
	public String sobrenome;
	public int matricula;
	public String cpf;
	
	public boolean acimaINSS(Pessoa p) {
		if(p instanceof Professor && ((Professor) p).getSalario() < 5531.31)
			return true;
		return false;
	}
	
	public ArrayList<Professor> contaProfessores(ArrayList<Pessoa> array){
		ArrayList<Professor> arrayProfessores = new ArrayList<Professor>();
		for(Pessoa p:array) {
			if(p instanceof Professor && ((Professor) p).getSalario() < 5531.31) {
				arrayProfessores.add((Professor)p);
			}
		}
		return arrayProfessores;
	}
}
