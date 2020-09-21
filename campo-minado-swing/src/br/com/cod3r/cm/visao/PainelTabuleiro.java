package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			
			SwingUtilities.invokeLater( () -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou, coisa linda");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu! Explodiu tudo. N�o fique triste. Como dizia o Raul: tente outra vez!");
				}
				tabuleiro.reiniciar();
			});
			 
//		int total = tabuleiro.getLinhas() * tabuleiro.getColunas();
//		
//		for (int i = 0; i < total; i++) {
//			add(new JButton());	
//		}
			
		});
		}
 		
	}

