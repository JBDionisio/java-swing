import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Meu App");
		janela.setLayout(new FlowLayout());
		
		// Painel
		JPanel panel = new JPanel(new GridLayout(2, 2));
		panel.add(new MeuLabel("Welcome", 26, Color.BLACK));
		panel.add(new MeuTextField());
		panel.add(new MeuTextArea());
		
		// items
		janela.add(panel, BorderLayout.CENTER);
		janela.add(new MeuCheckBox("Exemplo de checkbox"), BorderLayout.SOUTH);
		
		// Frame config
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(600, 400);
		janela.setVisible(true);
	}

}
