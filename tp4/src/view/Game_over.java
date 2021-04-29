package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import control.Controller_jogo;
import view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * classe da tela de game_over do jogo
 * @author sacode
 *
 */
public class Game_over extends Tela{
	
	
	
	public Game_over() {
		this.get_tela().setName("Game Over");
		botao_restart();
		death();
		mostrar_score();
	}
	
	/**
	 * coloca o botao restart na tela
	 */
	public void botao_restart() {
		
		JButton b=new JButton("restart");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 300);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					clica_botao_restart();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * reseta o jogo do zero
	 * @throws Exception
	 */
	public void clica_botao_restart() throws Exception {
		this.get_tela().setVisible(false);
		Controller_jogo.resetar_lista();
		Controller_jogo.navegar_tela(1);
		Controller_jogo.reset_score();
	}
	/**
	 * coloca a mensagem de game over na tela
	 */
	public void death() {
		JLabel lblTeste = new JLabel("WASTED bonequinho is dead");
		lblTeste.setBounds(189, 126, 232, 105);
		this.get_tela().add(lblTeste);
	}
	/**
	 * mostra o score do jogador ao fim da partida
	 */
	public void mostrar_score() {
		JLabel lblTeste = new JLabel("Você fez "+Integer.toString(Controller_jogo.get_score())+ " pontos");
		lblTeste.setBounds(189, 0, 232, 105);
		this.get_tela().add(lblTeste);;
	}
		
}
