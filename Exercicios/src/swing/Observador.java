package swing;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	static String a = "João";

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(1000, 600);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);

		JButton uee = new JButton("olá");
		janela.add(uee);
		JButton missi = new JButton("miau");
		janela.add(missi);

		uee.addActionListener(e -> {
			System.out.println("olá!");
		});
		uee.setText("Olá, " + a + "!!");

		missi.addActionListener(e -> {
			System.out.println("miau! miau!");
		});

		janela.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {}
			public void focusGained(FocusEvent e) {}
		});

		janela.setVisible(true);
	}

}
