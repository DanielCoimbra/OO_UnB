package model;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Random;
import java.util.Scanner;
import control.*;
import view.*;

public class Model_jogo {
	private static ArrayList<String> lista_palavras_chave = new ArrayList<String>(); 

	private static ArrayList<String> hall_da_fama;
	private static String palavra_da_vez;
	private static String DATABASE="Lista.txt";
	private static Random random = new Random();
	public static Jogador j = new Jogador();
	
	public static void reset_j_lives() {
		j.vidas = 5;
	}
	
	public static int j_lives() {
		return j.vidas;
	}
	
	
	
	public Model_jogo() {
		
	}
	
//	public ArrayList<Integer> checa_letra(String letra, String palavra){
//		ArrayList<Integer> lista;
//		
//		if (letra ==)
//		return lista;
//	}
	
	
	
	public static void acerto() {
		
	}
	
	public static void erro() {
		
	}
	
	public static void ganhou_rodada(){
		
	}
	
	public static void zerou() {
		
	}
	
	public static void add_palavra(String palavra) {
		
	}
//	
//	public static int calcular_score() {
//		int x;
//		
//		return x;
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
//			System.out.println(linhaLida+"\n");
			
		}
		leitorArquivo.close();

		
	}
	
	public static void sortear_palavra() {
		
		int indiceSorteado = random.nextInt(lista_palavras_chave.size());
		
		String palavra_sorteada = lista_palavras_chave.get(indiceSorteado);
		lista_palavras_chave.remove(indiceSorteado);
		palavra_da_vez = palavra_sorteada;
//		Controller_jogo.mostrar_palavra();
	}
	

	
	public static String p_da_vez() {
		return palavra_da_vez;
	}
	
	public static void checar_letra(char letra) {
		
		for(int i=0;i<p_da_vez().length(); i++) {
			if (p_da_vez().charAt(i)==letra) {
				Controller_jogo.mostrar_letra(letra, i);
			}
		}
	}
	
	public static void checa_estado() {
		
	}
	
}
