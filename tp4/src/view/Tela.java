package view;

import java.awt.event.ActionEvent;
import control.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela{
	
	private JFrame tela;
	
	public Tela() {
		bootstrap();
	}
	
	public void bootstrap() {
		this.tela = new JFrame();
		this.tela.setLocation(500,300);
		this.tela.setSize(600,400);
		this.tela.setLayout(null);
		this.tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JPanel p = new JPanel();
//		this.tela.setContentPane(p);
		this.tela.setVisible(true);
		botao_menu();

	}
	
	public JFrame get_tela() {
		return this.tela;
	}
	
	public void botao_sair() {
		
	}
	public void clica_botao_menu() throws Exception {
		this.get_tela().setVisible(false);
		Controller_jogo.navegar_tela(0);
		
		this.get_tela().setVisible(false);
	}
	
	public void botao_menu() {
		JButton b=new JButton("MENU");
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height
		b.setLocation(0, 0);
		get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					clica_botao_menu();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}