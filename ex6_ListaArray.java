package lista6;

import java.util.ArrayList;
import java.util.Collections;

public class ListaArray {
	
	public static ArrayList<String> criaListaDeCores() {
		ArrayList<String> array = new ArrayList<String>(6);
		array.add("Vermelho");
		array.add("Verde");
		array.add("Azul");
		array.add("Amarelo");
		array.add("Branco");
		array.add("Preto");
		return array;
	}
	public static void imprimeArray(ArrayList<String> array) {
		int i=1;
		for (String item : array) {
		    System.out.println(i+" - ["+item+"]");
		    i++;
		}
	}
	public static ArrayList<String> juntaCores (ArrayList<String> array){
		ArrayList<String> vetor = new ArrayList<String>();
		for(int i=0;i<array.size()-1;i++) {
			vetor.add(array.get(i)+array.get(i+1));
		}
		return vetor;
	}
	public static ArrayList<String> novaPrimeiraCor (ArrayList<String> array, String cor){
		array.add(0, cor);
		return array;
	}
	public static ArrayList<String> removeCorPorInicial (ArrayList<String> array, char letra){
		int j=0;
		while(j < array.size()) {
			for(int i=0;i<array.size();i++) {
				String item = array.get(i);
				if(item.charAt(0) == letra) {
					array.remove(item);
				}
			}
			j++;
		}
		return array;
	}
	public static ArrayList<String> ordenaListas (ArrayList<String> array1, ArrayList<String> array2){
		array1.addAll(array2);
		Collections.sort(array1);
		return array1;
	}
	public static ArrayList<String> interpolaListas (ArrayList<String> array1, ArrayList<String> array2){
		int j=0;
		for(int i=0;i<array1.size();i+=2) {
			array1.add(i,array2.get(j));
			j++;
		}
		return array1;
	}
	public static boolean listasIguais(ArrayList<String> array1, ArrayList<String> array2) {
		return array1.equals(array2);
	}
	public static ArrayList<String> trocaImpares(ArrayList<String> array1, ArrayList<String> array2) {
		for(int i=0;i<array1.size();i++) {
			if(i%2==0) {
				array1.set(i, array2.get(i));
			}
		}
		return array1;
	}
	public static int qtdElementosUnicos(ArrayList<String> array1, ArrayList<String> array2) {
		int qtd=0;
		for(int i=0;i<array1.size();i++) {
			if(array2.contains(array1.get(i))) {
				continue;
			}
			else {
				qtd++;
			}
		}
		return qtd;
	}
	public static ArrayList<Integer> removePares(ArrayList<Integer> array){
		for(int i=0;i<array.size();i++) {
			if(array.get(i)%2==0) {
				array.remove(i);
			}
		}
		return array;
	}
	public static boolean contemLista(ArrayList<String> array1, ArrayList<String> array2) {
		boolean teste = true;
		for(int i=0;i<array1.size();i++) {
			if(array1.contains(array2.get(i))) {
				continue;
			}
			else {
				teste = false;
			}
		}
		return teste;
	}
}
