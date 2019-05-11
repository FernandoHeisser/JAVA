package Lista7.exercicio2;

public abstract class Animal {
	public int x;
	public int y;
	
	public void andarParaFrente() {
		x++;
	}
	public void andarParaTras() {
		x--;
	}
	public void andarParaDireita() {
		y++;
	}
	public void andarParaEsquerda() {
		y--;
	}
	public abstract String falar();
}
