package view;

import java.awt.event.ActionEvent;
import model.*;
import java.awt.event.ActionListener;
import control.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Forca extends Tela{
	public static Jogador j = new Jogador();
	public Forca() throws Exception {
		botoes_letras();
		Controller_jogo.resetar_lista();
		Controller_jogo.sortear();
		labels(Controller_jogo.palavra_da_vez().length());

	}
	
	public void conta_vidas() {
		JLabel l;
		l = new JLabel(""+j.vida());
	}
	
	public void labels(int tamanho_palavra) {
		int counter = 10, distancia = 15, altura = 150;
		int LIMITE = 560;
		JLabel l;
		for(int i = 0; i<tamanho_palavra; i++) {
			l = new JLabel("_");
			
			if(counter <= LIMITE) {
				l.setBounds(counter, altura, 27, 25);
			}else {
				
				l.setBounds(counter-550, altura+25, 27,25);
			}
			counter += distancia;
			this.get_tela().add(l);
		}
		
	}
	
	public String botao_dica() {
		String dica = "";
		
		
		return dica;
	}
	
	public void botoes_letras() {
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('A');
			}
		});
		btnNewButton.setBounds(94, 215, 55, 25);
		this.get_tela().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('B');
			}
		});
		btnNewButton_1.setBounds(149, 215, 55, 25);
		this.get_tela().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('C');
			}
		});
		btnNewButton_2.setBounds(204, 215, 55, 25);
		this.get_tela().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('D');
			}
		});
		btnNewButton_3.setBounds(259, 215, 55, 25);
		this.get_tela().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("E");
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('E');
			}
		});
		btnNewButton_4.setBounds(314, 215, 55, 25);
		this.get_tela().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("F");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('F');
			}
		});
		btnNewButton_5.setBounds(369, 215, 55, 25);
		this.get_tela().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("G");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('G');
			}
		});
		btnNewButton_6.setBounds(424, 215, 55, 25);
		this.get_tela().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("H");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('H');
			}
		});
		btnNewButton_7.setBounds(94, 252, 55, 25);
		this.get_tela().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("I");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('I');
			}
		});
		btnNewButton_1_1.setBounds(149, 252, 55, 25);
		this.get_tela().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("J");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('J');
			}
		});
		btnNewButton_2_1.setBounds(204, 252, 55, 25);
		this.get_tela().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("K");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('K');
			}
		});
		btnNewButton_3_1.setBounds(259, 252, 55, 25);
		this.get_tela().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("L");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('L');
			}
		});
		btnNewButton_4_1.setBounds(314, 252, 55, 25);
		this.get_tela().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("M");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('M');
			}
		});
		btnNewButton_5_1.setBounds(369, 252, 55, 25);
		this.get_tela().add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("N");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('N');
			}
		});
		btnNewButton_6_1.setBounds(424, 252, 55, 25);
		this.get_tela().add(btnNewButton_6_1);
		
		JButton btnNewButton_8 = new JButton("O");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('O');
			}
		});
		btnNewButton_8.setBounds(94, 289, 55, 25);
		this.get_tela().add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("P");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('P');
			}
		});
		btnNewButton_1_2.setBounds(149, 289, 55, 25);
		this.get_tela().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Q");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('Q');
			}
		});
		btnNewButton_2_2.setBounds(204, 289, 55, 25);
		this.get_tela().add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("R");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('R');
			}
		});
		btnNewButton_3_2.setBounds(259, 289, 55, 25);
		this.get_tela().add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("S");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('S');
			}
		});
		btnNewButton_4_2.setBounds(314, 289, 55, 25);
		this.get_tela().add(btnNewButton_4_2);
		
		JButton btnNewButton_5_2 = new JButton("T");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('T');
			}
		});
		btnNewButton_5_2.setBounds(369, 289, 55, 25);
		this.get_tela().add(btnNewButton_5_2);
		
		JButton btnNewButton_6_2 = new JButton("U");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('U');
			}
		});
		btnNewButton_6_2.setBounds(424, 289, 55, 25);
		this.get_tela().add(btnNewButton_6_2);
		
		JButton btnNewButton_9 = new JButton("V");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('V');
			}
		});
		btnNewButton_9.setBounds(116, 326, 54, 25);
		this.get_tela().add(btnNewButton_9);
		
		JButton btnNewButton_1_3 = new JButton("W");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('W');
			}
			
		});
		btnNewButton_1_3.setBounds(182, 326, 55, 25);
		this.get_tela().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("X");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('X');
			}
		});
		btnNewButton_2_3.setBounds(249, 326, 55, 25);
		this.get_tela().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_3_1 = new JButton("Y");
		btnNewButton_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('Y');
			}
		});
		btnNewButton_2_3_1.setBounds(314, 326, 55, 25);
		this.get_tela().add(btnNewButton_2_3_1);
		
		JButton btnNewButton_2_3_2 = new JButton("Z");
		btnNewButton_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.checar_letra('Z');
			}
		});
		btnNewButton_2_3_2.setBounds(380, 326, 55, 25);
		this.get_tela().add(btnNewButton_2_3_2);
	}
	
}
