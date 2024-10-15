package CursinhoCoder.Desafios.Padroes.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObservador> observers = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObservador observador) {
		observers.add(observador);
	}
	
	public void monitorar() {
		Scanner scan = new Scanner(System.in);
		String valor = "";
		
		while (!"sair)".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou!!!");
			
			valor = scan.nextLine();
			
			if ("sim".equalsIgnoreCase(valor)) {
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				observers.stream()
					.forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}
		scan.close();
	}
	
}
