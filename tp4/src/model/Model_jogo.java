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

public class Model_jogo {
	private static ArrayList<String> lista_palavras_chave = new ArrayList<String>();
	public static ArrayList<Character> utilizadas = new ArrayList<Character>();
	private static ArrayList<String> hall_da_fama;
	private static String palavra_da_vez;
	private static String estado;
	private static String DATABASE="Lista.txt";
	private static Random random = new Random();
	public static Jogador j = new Jogador(); //PUBLICO **************************************************************************************
	private static ArrayList<Integer>index_list = new ArrayList<Integer>();
	private static ArrayList<JLabel>label_list = new ArrayList<JLabel>();
	private static JLabel label_vidas = new JLabel();
	public static int contador_acertos; //PUBLICO **************************************************************************************
	
	public static void reset_j_lives() {
		j.vidas = 5;
	}
	
	public static int j_lives() {
		return j.vidas;
	}

	
//	public ArrayList<Integer> checa_letra(String letra, String palavra){
//		ArrayList<Integer> lista;
//		
//		if (letra ==)
//		return lista;
//	}

	public static void acerto(int i) {
		contador_acertos++;
		index_list.add(i);
		if (contador_acertos==palavra_da_vez.length()) {
			ganhou();
		}
		
	}
	
	public static void erro(){
		j.vidas--;
		if (j.vidas < 0) {
			try {perdeu();} catch (Exception e) {}
		}else {
			}
//			System.out.println(j.vidas);
			Controller_jogo.muda_vidas();
		}
	
	public static void ganhou(){
		Controller_jogo.ganhou_rodada();
		estado="ganhou";

	}
	
	public static void zerou() {
		
	}
	
	public static void perdeu() throws Exception {
		Controller_jogo.perdeu();
	}

//	
//	public static int calcular_score() {
//		int x;
//		return 1;
//	}

	public static int tamanho_lista_palavras() throws Exception {
		LineNumberReader leitorLinhas = new LineNumberReader(new FileReader(DATABASE));
		leitorLinhas.skip(Long.MAX_VALUE);
		int quantPalavras = leitorLinhas.getLineNumber();
		leitorLinhas.close();

		return quantPalavras;

	}
	
	public static void reseta_lista_palavras() throws Exception {
		BufferedReader leitorArquivo = new BufferedReader(new FileReader(DATABASE));
		String linhaLida;
		
		lista_palavras_chave.clear();
		
		
		
		while ((linhaLida = leitorArquivo.readLine()) != null) { 
			lista_palavras_chave.add(linhaLida);

			
		}
		leitorArquivo.close();

		
	}
	
	public static void sortear_palavra() {
		
		int indiceSorteado = random.nextInt(lista_palavras_chave.size());
		
		String palavra_sorteada = lista_palavras_chave.get(indiceSorteado);
		lista_palavras_chave.remove(indiceSorteado);
		palavra_da_vez = palavra_sorteada;
		contador_acertos = 0;
		utilizadas.clear();

	}
	

	
	public static String p_da_vez() {
		return palavra_da_vez;
	}
	
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
	
	public static ArrayList<JLabel> get_lista_label(){
		return label_list;
	}
	
	public static JLabel get_label_vidas() {
		return label_vidas;
	}
	
	public static void add_palavra() throws IOException {
		 FileWriter fw = new FileWriter(DATABASE, true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.newLine();
		    
		    String algo=JOptionPane.showInputDialog(Forca.get_f(), "Enter value");
//		    Forca.get_f().
		    bw.write(algo.toUpperCase());
		    bw.close();
	}
	
	public static Boolean checa_utilizadas(char letra) {
		for(Character char_: Model_jogo.utilizadas){
			if (char_ == letra) {
				return true;
			}
		}
		return false;
	}
		
	
	
//	public static void checa_estado() {
//		 
//	}
	
}
