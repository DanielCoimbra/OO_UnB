package view;

import javax.swing.*;

public class Tela{
	
	private JFrame tela;
	
	public Tela() {
		bootstrap();
	}
	
	public void bootstrap() {
		this.tela = new JFrame();
		this.tela.setLocation(500,500);
		this.tela.setSize(600,400);
		this.tela.setLayout(null);
		this.tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.tela.setVisible(true);
		botao_menu(this.tela);

	}
	
	public JFrame get_tela() {
		return this.tela;
	}
	
	public void botao_sair() {
		
	}
	public void clica_botao_menu() {
		
	}
	
	public static void botao_menu(JFrame tela) {
		JButton b=new JButton("MENU");
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		b.setLocation(0, 0);
		tela.add(b);
	}
}
