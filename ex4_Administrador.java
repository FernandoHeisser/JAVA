package ifsul.tsi.poo.lista4;

public class Administrador extends Autor{
	public Editor cadastraEditor() {
		Editor ed = new Editor();
		return ed;
	}
	public Autor cadastraAutor() {
		Autor au = new Autor();
		return au;
	}
	public void removeEditor(Editor[] array, Editor ed) {
		for(int i=0;i<array.length;i++){
			if(array[i].equals(ed))
				array[i]=null;
		}
	}
	public void removeAutor(Autor[] array, Autor au) {
		for(int i=0;i<array.length;i++){
			if(array[i].equals(au))
				array[i]=null;
		}
	}
}
