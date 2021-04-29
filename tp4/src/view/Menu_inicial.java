package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import control.*;
/**
 * Tela de Menu inicial do Jogo
 * @author Daniel Coimbra
 * @versão 1.0 (Abril 2021)
 */
public class Menu_inicial extends Tela{
	public Menu_inicial() {
		botao_jogar();
		botao_creditos();
		botao_nova_palavra();
	}
	/**
	 * coloca o botao jogar na tela
	 */
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
	/**
	 * coloca o botao de adicionar palavra na tela
	 */
	public void botao_nova_palavra() {
		
		JButton b=new JButton("Add Palavra");//creating instance of JButton
		
		b.setBounds(30,100,140, 40);//x axis, y axis, width, height 
		b.setLocation(225, 0);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {add_palavra();} catch (Exception e) {}
			}
		});
	}
	/**
	 * chamada de add_palavra() do controller
	 */
	public void add_palavra() {
		Controller_jogo.add_palavra();
	}
	/**
	 * navega o jogador até a tela de jogo e inicia a rodada
	 * @throws Exception
	 */
	public void clica_botao_jogar() throws Exception {
		this.get_tela().setVisible(false);
		Controller_jogo.resetar_lista();
		Controller_jogo.navegar_tela(1);
	}
	
	/**
	 * coloca o botao creditos na tela
	 */
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
	
	/**
	 * navega o jogador até a tela de créditos
	 * @throws Exception
	 */
	public void clica_botao_creditos() throws Exception {
		this.get_tela().setVisible(false);
		Controller_jogo.navegar_tela(3);
	}
}
