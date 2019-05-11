package ifsul.tsi.poo.lista4;

public class Autor extends Usuario{
	String pseudonimo;
	Materia materias[];
	
	public Materia criaMateria(String texto) {
		Materia materia = new Materia();
		materia.texto = texto;
		return materia;
	}
	public void removeMateria(Materia mat) {
		for(int i=0;i<materias.length;i++){
			if(materias[i].equals(mat))
				materias[i]=null;
		}
	}
}