package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Forca extends Tela{
	public Forca() throws Exception {
		botoes_letras();
		
		Controller_jogo.resetar_lista();
	}
	
	
	public void labels(int tamanho_palavra) {
		int counter = 10, distancia = 15, altura = 90;
		int LIMITE = 560;
		
		for(int i = 0; i<tamanho_palavra; i++) {
		
			JLabel l = new JLabel("_");
			if(counter <= LIMITE) {
				l.setBounds(counter, 90, 27, 25);
			}else {
				
				l.setBounds(counter-550, altura+25, 27,25);
			}
			counter += distancia;
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
				Controller_jogo.rodada('A');
			}
		});
		btnNewButton.setBounds(94, 215, 55, 25);
		this.get_tela().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('B');
			}
		});
		btnNewButton_1.setBounds(149, 215, 55, 25);
		this.get_tela().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('C');
			}
		});
		btnNewButton_2.setBounds(204, 215, 55, 25);
		this.get_tela().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('D');
			}
		});
		btnNewButton_3.setBounds(259, 215, 55, 25);
		this.get_tela().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("E");
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('E');
			}
		});
		btnNewButton_4.setBounds(314, 215, 55, 25);
		this.get_tela().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("F");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('F');
			}
		});
		btnNewButton_5.setBounds(369, 215, 55, 25);
		this.get_tela().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("G");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('G');
			}
		});
		btnNewButton_6.setBounds(424, 215, 55, 25);
		this.get_tela().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("H");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('H');
			}
		});
		btnNewButton_7.setBounds(94, 252, 55, 25);
		this.get_tela().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("I");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('I');
			}
		});
		btnNewButton_1_1.setBounds(149, 252, 55, 25);
		this.get_tela().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("J");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('J');
			}
		});
		btnNewButton_2_1.setBounds(204, 252, 55, 25);
		this.get_tela().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("K");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('K');
			}
		});
		btnNewButton_3_1.setBounds(259, 252, 55, 25);
		this.get_tela().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("L");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('L');
			}
		});
		btnNewButton_4_1.setBounds(314, 252, 55, 25);
		this.get_tela().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("M");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('M');
			}
		});
		btnNewButton_5_1.setBounds(369, 252, 55, 25);
		this.get_tela().add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("N");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('N');
			}
		});
		btnNewButton_6_1.setBounds(424, 252, 55, 25);
		this.get_tela().add(btnNewButton_6_1);
		
		JButton btnNewButton_8 = new JButton("O");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('O');
			}
		});
		btnNewButton_8.setBounds(94, 289, 55, 25);
		this.get_tela().add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("P");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('P');
			}
		});
		btnNewButton_1_2.setBounds(149, 289, 55, 25);
		this.get_tela().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Q");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('Q');
			}
		});
		btnNewButton_2_2.setBounds(204, 289, 55, 25);
		this.get_tela().add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("R");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('R');
			}
		});
		btnNewButton_3_2.setBounds(259, 289, 55, 25);
		this.get_tela().add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("S");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('S');
			}
		});
		btnNewButton_4_2.setBounds(314, 289, 55, 25);
		this.get_tela().add(btnNewButton_4_2);
		
		JButton btnNewButton_5_2 = new JButton("T");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('T');
			}
		});
		btnNewButton_5_2.setBounds(369, 289, 55, 25);
		this.get_tela().add(btnNewButton_5_2);
		
		JButton btnNewButton_6_2 = new JButton("U");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('U');
			}
		});
		btnNewButton_6_2.setBounds(424, 289, 55, 25);
		this.get_tela().add(btnNewButton_6_2);
		
		JButton btnNewButton_9 = new JButton("V");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('V');
			}
		});
		btnNewButton_9.setBounds(116, 326, 54, 25);
		this.get_tela().add(btnNewButton_9);
		
		JButton btnNewButton_1_3 = new JButton("W");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('W');
			}
			
		});
		btnNewButton_1_3.setBounds(182, 326, 55, 25);
		this.get_tela().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("X");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('X');
			}
		});
		btnNewButton_2_3.setBounds(249, 326, 55, 25);
		this.get_tela().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_3_1 = new JButton("Y");
		btnNewButton_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('Y');
			}
		});
		btnNewButton_2_3_1.setBounds(314, 326, 55, 25);
		this.get_tela().add(btnNewButton_2_3_1);
		
		JButton btnNewButton_2_3_2 = new JButton("Z");
		btnNewButton_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller_jogo.rodada('Z');
			}
		});
		btnNewButton_2_3_2.setBounds(384, 281, 55, 25);
		this.get_tela().add(btnNewButton_2_3_2);
	}
	
}
