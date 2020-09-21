package br.com.rudolf.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.rudolf.calc.modelo.Memoria;
import br.com.rudolf.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	private JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(Color.GRAY);;
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("times", Font.ITALIC, 40));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 30));
		//setLayout(new FlowLayout(FlowLayout.));
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
