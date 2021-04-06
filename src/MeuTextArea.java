import javax.swing.JTextArea;

public class MeuTextArea extends JTextArea {

	private static final long serialVersionUID = 1L;
	
	private int rows = 10;
	private int columns = 30;
	
	public MeuTextArea() {
		super();
		init();
	}

	private void init() {
		this.setRows(rows);
		this.setColumns(columns);
		this.setBorder(BorderFactory.create());
		this.setLineWrap(true);
	}

}
