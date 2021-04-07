package view;

import javax.swing.*;

public class Game_over extends Tela{
	
	
	
	public Game_over() {
		
		spawn_restart_button();
	}
	
	
	public void spawn_restart_button() {
		
		JButton b=new JButton("restart");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 300);
		
		this.get_tela().add(b);
	}
	
	public void death() {
		ImageIcon image = new ImageIcon("/images/forca_-1_vida.png");
		JLabel label= new JLabel();
		label.setIcon(image);
		label.setLocation(0, 45);
		this.get_tela().add(label);
	}
}
