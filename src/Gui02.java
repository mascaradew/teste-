import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui02 extends JFrame {
	/**
     *
     */
    private static final long serialVersionUID = 1L;
    JLabel labelUser, labelPass;
	JTextField textUser, textPass;
	JButton buttonLogin;
	
	public Gui02() {
		super("SIS IFPR");
		setLayout(new FlowLayout());
		labelUser = new JLabel("Usuário");
		textUser = new JTextField(20);
		labelPass = new JLabel("Senha");
		textPass = new JTextField(20);
		buttonLogin = new JButton("Entrar");
		// Adiciona componentes ao JFrame
		this.add(labelUser);
		this.add(textUser);
		this.add(labelPass);
		this.add(textPass);
		this.add(buttonLogin);
		// Trata eventos da interface
		TrataEventos ev = new TrataEventos();
		buttonLogin.addActionListener(ev);
		textPass.addActionListener(ev);
		setSize(300, 300);
		setVisible(true);		
	}
	
	private class TrataEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if ( textUser.getText().equals("admin") && 
			     textPass.getText().equals("123") ) 
				JOptionPane.showMessageDialog(null, "Usuário autenticado");
			else
				JOptionPane.showMessageDialog(null, "Usuário não autenticado");
		}
	}
	
	public static void main(String args[]) {
		new Gui02();
	}