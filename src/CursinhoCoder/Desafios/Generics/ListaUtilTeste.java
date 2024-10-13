package CursinhoCoder.Desafios.Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "PHYTHON", "JAVA", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListUtil.getUltimo1(langs);
		Integer ultimoNumero = (Integer) ListUtil.getUltimo1(nums);
		
		System.out.println(ultimaLinguagem + " " + ultimoNumero);
		
		
		String ultimaLinguagem2 = ListUtil.getUltimo2(langs);
		Integer ultimoNumero2 = ListUtil.getUltimo2(nums);
		System.out.println(ultimaLinguagem2 + " " + ultimoNumero2);
	}

}
