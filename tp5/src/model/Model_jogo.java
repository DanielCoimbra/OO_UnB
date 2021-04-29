package model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import control.*;
import view.Forca;
/**
 * Classe responsável pelo tratamento dos dados do jogo.
 * @author Daniel Coimbra
 * @versão 1.0 (Abril 2021)
 */
public class Model_jogo {
	private static ArrayList<String> lista_palavras_chave = new ArrayList<String>();
	public static ArrayList<Character> utilizadas = new ArrayList<Character>();
	private static String palavra_da_vez;
	private static String estado;
	private static String DATABASE="Lista.txt";
	private static Random random = new Random();
	public static Jogador j = new Jogador(); //PUBLICO **************************************************************************************
	private static ArrayList<Integer>index_list = new ArrayList<Integer>();
	private static ArrayList<JLabel>label_list = new ArrayList<JLabel>();
	private static JLabel label_vidas = new JLabel();
	public static int contador_acertos; //PUBLICO **************************************************************************************
	
	/**
	 * Reseta vidas do jogador
	 * 
	 */
	
	public static void reset_j_lives() {
		j.vidas = 5;
	}
	
	/**
	 * Retorna o numero de vidas do jogador
	 * @return int com valor da vida do jogador
	 * 
	 */
	public static int j_lives() {
		return j.vidas;
	}

	/**
	 * insere o index de uma letra acertada para referência futura
	 * @return i 
	 * 
	 */
	public static void acerto(int i) {
		contador_acertos++;
		
		index_list.add(i);
		if (contador_acertos==palavra_da_vez.length()) {
			ganhou();
		}
	}
	/**
	 * diminui a vida dessa rodada
	 * 
	 */
	public static void erro(){
		j.vidas--;
		if (j.vidas < 0) {
			try {perdeu();} catch (Exception e) {}
		}else
			Controller_jogo.muda_vidas();
		}
	/**
	 * aumenta o score do jogador em 1
	 */
	public static void ganhou(){
		Controller_jogo.ganhou_rodada();
		j.score++;
		estado="ganhou";

	}
	/**
	 * navega o jogador à tela de game over
	 * @throws Exception
	 */
	public static void perdeu() throws Exception {
		Controller_jogo.perdeu();
	}
	/**
	 * retona o tamanho da lista de palavras disponiveis em tempo de execucao
	 * @return int quant_palavras
	 * @throws Exception
	 */
	public static int tamanho_lista_palavras() throws Exception {
		LineNumberReader leitorLinhas = new LineNumberReader(new FileReader(DATABASE));
		leitorLinhas.skip(Long.MAX_VALUE);
		int quantPalavras = leitorLinhas.getLineNumber();
		leitorLinhas.close();

		return quantPalavras;

	}
	/**
	 * reseta a lista das palavras disponíveis em jogo 
	 * @throws Exception
	 */
	public static void reseta_lista_palavras() throws Exception {
		BufferedReader leitorArquivo = new BufferedReader(new FileReader(DATABASE));
		String linhaLida;
		
		lista_palavras_chave.clear();
		
		while ((linhaLida = leitorArquivo.readLine()) != null) { 
			lista_palavras_chave.add(linhaLida);			
		}
		leitorArquivo.close();

	}
	/**
	 * sorteia a palavra para uma rodada
	 */
	public static void sortear_palavra() {
		
		int indiceSorteado = random.nextInt(lista_palavras_chave.size());
		
		String palavra_sorteada = lista_palavras_chave.get(indiceSorteado);
		lista_palavras_chave.remove(indiceSorteado);
		palavra_da_vez = palavra_sorteada;
		contador_acertos = 0;
		utilizadas.clear();

	}
	

	/**
	 * retorna a palavra sorteada nesse round
	 * @return palavra da vez
	 */
	public static String p_da_vez() {
		return palavra_da_vez;
	}
	/**
	 * checa se a letra clicada pertence à palavra e direciona o jogo a partir disso
	 * @param letra
	 */
	public static void checar_letra(char letra){
		
		index_list.clear();
		for(int i=0;i<p_da_vez().length(); i++) {
			if (p_da_vez().charAt(i)==letra) {
				acerto(i);
				if (estado == "ganhou"){//*******************
					estado="";
					return;

				}
			}
		}
		if (index_list.size()==0) {
			try {
				erro();
			} catch (Exception e) {}
		}else {
			Controller_jogo.mostrar_letra(letra, index_list);
		}
		utilizadas.add(letra);
		Controller_jogo.utilizadas(letra);
	}
	
	/**
	 * da acesso a lista de labels dos char da palavra
	 * auxilia os underlines virarem a letra correta durante o jogo
	 * @return lista de labels
	 */
	public static ArrayList<JLabel> get_lista_label(){
		return label_list;
	}
	/**
	 * da acesso ao JLabel da classe
	 * retorna JLabel
	 * @return 
	 */
	public static JLabel get_label_vidas() {
		return label_vidas;
	}
	/**
	 * adiciona palavra à database
	 * @throws IOException
	 * 
	 */
	public static void add_palavra() throws IOException {
		 FileWriter fw = new FileWriter(DATABASE, true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.newLine();
		    
		    String algo=JOptionPane.showInputDialog(Forca.get_f(), "Enter value");
		    bw.write(algo.toUpperCase());
		    bw.close();
	}

	/**
	 * retorna score do jogador
	 * @return score do jogador
	 */
	public static int get_score() {
		return j.score;
	}
	/**
	 * reseta o score do jogador
	 */
	public static void reset_score() {
		j.score = 0;
	}
		
}
