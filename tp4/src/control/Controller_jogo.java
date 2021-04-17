package control;
import java.util.ArrayList;

import javax.swing.JLabel;

import model.*;
import view.*;

public class Controller_jogo {
	
	
	public static void resetar_lista() throws Exception {
		Model_jogo.reseta_lista_palavras();
	}
	
	public static void rodada(char letra) {
		int estado = 4;
//		int estado = Model_jogo.checa_estado();
//		if (estado == 0) {
			
//		}else if (estado == 1) {
			
//		}else if (estado == 2){
			
			Model_jogo.sortear_palavra();
			
//		}
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
}