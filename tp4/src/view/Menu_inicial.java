package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import control.*;

public class Menu_inicial extends Tela{
	public Menu_inicial() {
		botao_jogar();
		botao_creditos();
		botao_nova_palavra();
	}
	
	public void botao_jogar() {
		
		JButton b=new JButton("Jogar");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 300);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					clica_botao_jogar();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	public void botao_nova_palavra() {
		
		JButton b=new JButton("Adicionar Palavra");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 0);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {add_palavra();} catch (Exception e) {}
			}
		});
	}
	
	public void add_palavra() {
		Controller_jogo.add_palavra();
	}

	public void clica_botao_jogar() throws Exception {
		this.get_tela().setVisible(false);
		Controller_jogo.resetar_lista();
		Controller_jogo.navegar_tela(1);
	}
	
	public void botao_hdf() {
		
	}
	
	public void put_forca() {
		
	}
	
	public void botao_creditos() {
		
		JButton b=new JButton("Creditos");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(500, 0);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					clica_botao_creditos();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clica_botao_creditos() throws Exception {
		this.get_tela().setVisible(false);
		Controller_jogo.navegar_tela(3);
	}
}
