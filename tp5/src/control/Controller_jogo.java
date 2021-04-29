package control;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.text.BadLocationException;

import model.*;
import view.*;
/** Clase responsável pela comunição da classe Model e as classes pertencentes a view.
 * @author Daniel Coimbra e Pedro José
 * @version 1.0(Abril 2021)
 */
public class Controller_jogo {
	/**
	 * Começa o jogo criando uma tela menu inicial
	 * @return Leva o usuário para a tela menu inicial
	 * 
	 */


	
	public static void start() {
		Tela tela = new Menu_inicial();
	}
	/**
	 * @return Retorna o metodo resetar lista de model
	 */
	
	public static void resetar_lista() throws Exception {
		Model_jogo.reseta_lista_palavras();
	}
	/** @return Retorna o método proxima_rodada de model.
	 */
	public static void ganhou_rodada() {
		Forca.proxima_rodada();
	}
	/** 
	 * @return Retorna o metodo checar_letra de model.
	 */
	public static void checar_letra(char letra) {
		Model_jogo.checar_letra(letra);
	}
	/** 
	 * @return Retorna o metodo sortear_palavra de model
	 */
	public static void sortear() {
		Model_jogo.sortear_palavra();
	}
	
	/** Troca o underline para a letra correta
	 * 
	 * @param letra O char a ser checado.
	 * @param list A lista das palavras da forca.
	 * @return a letra no lugar do '_'.
	 */
	public static void mostrar_letra(char letra, ArrayList<Integer> list) {
		for(int i = 0 ; i < list.size(); i++) {
			get_lista_label().get(list.get(i)).setText(Character.toString(letra));
		}
	}
	/** Possibilita o jogador poder navegar entre as telas.
	 * 
	 * @param tela Um inteiro que possibilita o jogador navegar entre as telas de acordo com o número determinado das telas existentes.
	 * @return Uma tela de acordo com o botão que foi chamado.
	 */
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
	/**
	 * @return Retorna o método tamanho_lista_palavras de model.
	 */
	public static int tamanho_lista_palavra() throws Exception {
		return Model_jogo.tamanho_lista_palavras();
	}
	/**
	 * @return Retorna o método p_da_vez de model.
	 */
	public static String palavra_da_vez() {
		return Model_jogo.p_da_vez();
	}
	/**
	 * @return Retorna o método get_lista_label de model.
	 */
	public static ArrayList<JLabel> get_lista_label() {
		return Model_jogo.get_lista_label();
	}
		/**
	 * @return Retorna o método reset_j_lives de model.
	 */
	public static void reseta_vida() {
		Model_jogo.reset_j_lives();
	}
	/**
	 * @return Retorna o método j_lives de model.
	 */
	public static int get_vidas() {
		return Model_jogo.j_lives();
	}
	/**
	 * @return Retorna o método get_label_vidas de model.
	 */
	public static JLabel get_label_vidas() {
		return Model_jogo.get_label_vidas();
	}
	/**Chama o mostra vidas presente em forca.
	 * 
	 */
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
	/** Chama o perdeu de forca.
	 */
	public static void perdeu() {
		
		try {Forca.perdeu();} catch (Exception e) {}
	}
	/** Chama o add_palavra de model.
	 */
	public static void add_palavra() {
		try {Model_jogo.add_palavra();} catch (IOException e) {}
	}
	/**
	 * 
	 * @return Retorna get_f.utilizadas de model.
	 */
	public static void utilizadas(char letra) {
		Forca.get_f().utilizadas(letra);
		
	}
	/**
	 * 
	 * @return get_score de model.
	 */
	public static int get_score() {
		return Model_jogo.get_score();
	}
	/**
	 * @return reset_score de model.
	 */
	public static void reset_score() {
		Model_jogo.reset_score();
	}
		
	/**
	 * @return Retorna o método utilizadas de model.
	 */
	public static ArrayList<Character> utilizadas(){
		return Model_jogo.utilizadas;
	}
}