package view;
import javax.swing.*;
public class Creditos extends Tela{
	public Creditos() {
		mostrar_creditos();
	}
	
	public void mostrar_creditos(){		
		
		JLabel lblTeste = new JLabel("by Donão e Pedrão");
		lblTeste.setBounds(220, 170, 232, 29);
		this.get_tela().add(lblTeste);

	}
}
