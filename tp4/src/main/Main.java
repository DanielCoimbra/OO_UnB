package main;

import model.*;
import control.*;
import view.*;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static final String DATABASE = "Lista.txt";
	public static void start() throws Exception {
//		Tela tela = new Game_over();
//		Tela tela = new Menu_inicial();
		
//		***************************************************************************************  
//		melhorar tamanho das labels 
//		((((((((((((((((((((((((((()))))))))))))))))))))))))))
//		ArrayList<String> l = new ArrayList<String>();
//		l.add("ola");
//		l.add("daniel");
//		l.add("pedro");
//		l.clear();
//		l.clear();
//		Random r = new Random();
//		r.nextInt(10);
		BufferedReader leitorArquivo = new BufferedReader(new FileReader(DATABASE));
		String linhaLida = leitorArquivo.readLine();
		
		Model_jogo.lista_palavras_chave.clear();
		int linha = 0;
		while (linha != null) { 
			Model_jogo.lista_palavras_chave.add(linha);
			
		}
		leitorArquivo.close();
		int size;
		try {
			size = Model_jogo.lista_palavras_chave.size();
		} catch (Exception e) {
			size = 10;
		}
		for(int i =0; i<size; i++) {
			System.out.println("."+Model_jogo.lista_palavras_chave.get(i)+"\n");
		}

	}
	public static void main(String[] args) throws Exception {
		start();
	}
}