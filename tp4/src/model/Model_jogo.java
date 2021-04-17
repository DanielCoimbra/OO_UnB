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


public class Model_jogo {
	private static ArrayList<String> lista_palavras_chave;
	private static ArrayList<String> hall_da_fama;
	private static String palavra_da_vez;
	private static String DATABASE="Lista.txt";
	private static Random random = new Random();
	
	
	
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
	
	
	
//	public static String get_palavra_da_vez() {
//		
//	}
	
	public static void ler_database() {
		
	}
	
	public static int get_lista_palavras_size() throws Exception {
		LineNumberReader leitorLinhas = new LineNumberReader(new FileReader(DATABASE));
		leitorLinhas.skip(Long.MAX_VALUE);
		int quantPalavras = leitorLinhas.getLineNumber() + 1;
		System.out.println("Tente a sorte, temos " + quantPalavras + " palavras!!!\n");
		leitorLinhas.close();

		return quantPalavras;

	}
	
	public static void reseta_lista_palavras() throws Exception {
		BufferedReader leitorArquivo = new BufferedReader(new FileReader(DATABASE));
		String linhaLida = leitorArquivo.readLine();
		int linha = 0;
		lista_palavras_chave.clear();
		while (linhaLida != null) { 
			lista_palavras_chave.add(linhaLida);
			linha++;
		}
		leitorArquivo.close();
		
	}
	
	public static String get_palavra_sorteada() {
		
		int indiceSorteado = random.nextInt(lista_palavras_chave.size());
		
		String palavra_sorteada = lista_palavras_chave.get(indiceSorteado);
		lista_palavras_chave.remove(indiceSorteado);
		return palavra_sorteada;

	}
	
	public static void rodada(String letra, String palavra) {
		
	}
	
}
