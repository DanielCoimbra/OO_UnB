package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_over extends Tela{
	
	
	
	public Game_over() {
		this.get_tela().setName("Game Over");
		botao_restart();
		death();
		
	}
	
	
	public void botao_restart() {
		
		JButton b=new JButton("restart");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 300);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clica_botao_restart();
			}
		});
	}
	
	public void clica_botao_restart() {
		Forca t = new Forca();
		this.get_tela().setVisible(false);
	}
	
	public void death() {
//		ImageIcon image = new ImageIcon("/images/forca_-1_vida.png");
//		JLabel label= new JLabel();
//		label.setIcon(image);
//		label.setLocation(0, 45);
//		this.get_tela().add(label);
//		JPanel contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(null);
//		this.get_tela().setContentPane(contentPane);
//		JPanel p = new JPanel();
//		p.setBackground(Color.CYAN);
//		p.setPreferredSize(new Dimension(300,400));
//		JLabel label = new JLabel();
//		label.setText("Game over\nbonequinho is dead");
//		p.add(label);
//		this.get_tela().getContentPane().add(p);
		
		
		
	}
}
