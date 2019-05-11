package Lista10;

public class Main {
	public static String concatenaCaixa(Caixa<String>[] array) {
		String result="";
		for(Caixa<String> c: array) {
			result+=c.get();
		}
		return result;
	}
	public static Integer somaCaixas(Caixa<Integer>[] array) {
		Integer soma=0;
		for(Caixa<Integer> c: array) {
			soma+=c.get();
		}
		return soma;
	}
	public static void main(String[] args) {
		Caixa<Integer> caixa1 = new Caixa<Integer>();
		caixa1.set(25);
		
		Caixa<Integer> caixa2 = new Caixa<Integer>();
		caixa2.set(25);
		
		Caixa<Integer>[] array = new Caixa[2];
		array[0]=caixa1;
		array[1]=caixa2;
		
		Integer soma = Main.somaCaixas(array);
		
		System.out.println(soma);
	}
}
