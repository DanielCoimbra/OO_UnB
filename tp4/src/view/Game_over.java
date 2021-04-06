package view;

import javax.swing.*;

public class Game_over extends Tela{
	
	
	
	public Game_over() {
		this.tela = super.bootstrap();
		spawn_restart_button();
	}
	
	private JFrame tela;
	
	
	
	public void spawn_restart_button() {
		JButton b=new JButton("restart");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 180);
		
		this.tela.add(b);
	}
}
