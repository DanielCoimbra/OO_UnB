package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Menu_inicial extends Tela{
	public Menu_inicial() {
		botao_jogar();
		botao_creditos();
	}
	
	public void botao_jogar() {
		
		JButton b=new JButton("Jogar");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(250, 300);
		
		this.get_tela().add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clica_botao_jogar();
			}
		});
	}
	
	public void clica_botao_jogar() {
		Forca t = new Forca();
		this.get_tela().setVisible(false);
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
				clica_botao_creditos();
			}
		});
	}
	
	public void clica_botao_creditos() {
		Creditos t = new Creditos();
		this.get_tela().setVisible(false);
	}
}
