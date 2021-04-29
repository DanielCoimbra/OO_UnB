package control;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.text.BadLocationException;

import model.*;
import view.*;

public class Controller_jogo {
	
	public static void start() {
		Tela tela = new Menu_inicial();
	}
	
	
	public static void resetar_lista() throws Exception {
		Model_jogo.reseta_lista_palavras();
	}

	
	
	public static void ganhou_rodada() {
		Forca.proxima_rodada();
	}
	
	public static void checar_letra(char letra) {
		Model_jogo.checar_letra(letra);
	}
	
	public static void sortear() {
		Model_jogo.sortear_palavra();
	}
	
	
	public static void mostrar_letra(char letra, ArrayList<Integer> list) {
		for(int i = 0 ; i < list.size(); i++) {
			get_lista_label().get(list.get(i)).setText(Character.toString(letra));
		}
	}
	
	public static void navegar_tela(int tela) throws Exception {
		
		switch(tela) {
		case 0:
			Menu_inicial menu = new Menu_inicial();
			break;
			
		case 1:
			Forca forca = new Forca();
			break;
			
		case 2:
			Game_over go = new Game_over();
			break;
			
		case 3:
			Creditos creditos = new Creditos();
			
			break;
		case 4:
			Hall_da_fama hdf = new Hall_da_fama();
			break;
		}
	
	}
	
	public static int tamanho_lista_palavra() throws Exception {
		return Model_jogo.tamanho_lista_palavras();
	}
	public static String palavra_da_vez() {
		return Model_jogo.p_da_vez();
	}
	
	public static ArrayList<JLabel> get_lista_label() {
		return Model_jogo.get_lista_label();
	}
	
	public static void reseta_vida() {
		Model_jogo.reset_j_lives();
	}
	
	public static int get_vidas() {
		return Model_jogo.j_lives();
	}
	
	public static JLabel get_label_vidas() {
		return Model_jogo.get_label_vidas();
	}
	
	public static void muda_vidas() {
//		System.out.println("errrou");
		
//		get_label_vidas().setText("qualquer");
//		get_lista_label().get(list.get(i)).setText(Character.toString(letra));
		try {
			Forca.get_f().mostra_vida(get_vidas());
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void perdeu() {
		
		try {Forca.perdeu();} catch (Exception e) {}
	}
	
	public static void add_palavra() {
		try {Model_jogo.add_palavra();} catch (IOException e) {}
	}
	
	public static void utilizadas(char letra) {
		Forca.get_f().utilizadas(letra);
		
	}
	
	public static int get_score() {
		return Model_jogo.get_score();
	}
	public static void reset_score() {
		Model_jogo.reset_score();
	}
	
	public static ArrayList<Character> utilizadas(){
		return Model_jogo.utilizadas;
	}
}