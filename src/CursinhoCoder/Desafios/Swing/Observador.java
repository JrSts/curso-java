package CursinhoCoder.Desafios.Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);
		
		JButton botao = new JButton("Clicar!");
		JButton botao2 = new JButton("Clicar 2!");
		
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Alguma coisa aconteceu");
			}
		});
		
		botao2.addActionListener(e-> System.out.println("Alguma coisa aconteceu"));
			
		janela.add(botao);
		janela.add(botao2);
		
		janela.setVisible(true);
	}
}
