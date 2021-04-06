package view;

import javax.swing.*;

public class Tela{
	public Tela() {
		bootstrap();
		
	}
	
	public static JFrame bootstrap() {
		JFrame tela = new JFrame();
		tela.setLocation(500,500);
		tela.setSize(600,400);
		tela.setLayout(null);
		tela.setVisible(true);
		botao_menu(tela);
		return tela;
		
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
