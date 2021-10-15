import javax.swing.JFrame;

public class Gui01 extends JFrame {
	/**
     *
     */
    private static final long serialVersionUID = 1L;

    public Gui01() {
		super("SIS IFPR");
		setSize(400, 300);
		setVisible(true);		
	}
	
	public static void main(String args[]) {
		new Gui01();
	}
}