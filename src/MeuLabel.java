import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {

	private static final long serialVersionUID = 1L;
	
	private int fontSize = 26;
	private Color color = new Color(0xFF0000);
	
	MeuLabel(String title) {
		super(title);
		init();
	}

	MeuLabel(String title, int fontSize, Color color) {
		super(title);
		this.fontSize = fontSize;
		this.color = color;
		init();
	}

	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(color);
		this.setFont(new Font(null, Font.ITALIC + Font.BOLD, fontSize));
	}

}
