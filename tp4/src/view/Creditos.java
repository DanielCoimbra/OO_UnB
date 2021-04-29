package view;
import javax.swing.*;

/**
	 * Tela de Créditos do Jogo
	 * @author Daniel Coimbra
	 * @versão 1.0 (Abril 2021)
	 */
public class Creditos extends Tela{
	public Creditos() {
		mostrar_creditos();
	}
	/**
	 * coloca a label de creditos do jogo
	 */
	public void mostrar_creditos(){		
		
		JLabel lblTeste = new JLabel("by Donão e Pedrão");
		lblTeste.setBounds(220, 170, 232, 29);
		this.get_tela().add(lblTeste);

	}
}
