package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Random;
import java.util.Scanner;


public class forca_terminal {
	
	public void checa_letra() {
		
	}
	public static void main(String[] args) throws Exception {
		// SORTEADOR
		Random random = new Random();
		// ESCANEADOR
		Scanner in = new Scanner(System.in);
		
		String Database = "Lista.txt";
		LineNumberReader leitorLinhas = new LineNumberReader(new FileReader(Database));
		leitorLinhas.skip(Long.MAX_VALUE); 
		int quantPalavras = leitorLinhas.getLineNumber() + 1;
		System.out.println("Tente a sorte, temos " + quantPalavras + " palavras!!!\n");
		leitorLinhas.close();
		
		String[] palavras = new String[quantPalavras];
		
		BufferedReader leitorArquivo = new BufferedReader(new FileReader(Database));
		String linhaLida;
		int linha = 0;
		while ((linhaLida = leitorArquivo.readLine()) != null) { 
			palavras[linha] = linhaLida;
			linha++;
		}
		leitorArquivo.close();
		int indiceSorteado = random.nextInt(quantPalavras); 
		String sorteio = palavras[indiceSorteado]; 
		char[] acertos = new char[sorteio.length()];
		for (int i = 0; i < acertos.length; i++) { 
			acertos[i] = 0;
			
			if (sorteio.charAt(i) == '-')
				acertos[i] = 1;
		}		
		String letrasUtilizadas = "";
		char letra;		
		boolean ganhou = false;
		int vidas = 5;
		for (int i = 0; i < sorteio.length(); i++) {
			//System.out.println(sorteio);
			if (acertos[i] == 1) { 
				System.out.print("  ");
			} else {
				System.out.print(" _ ");
			}
		}
		
		System.out.println("\n");
		do { 

			System.out.print("\n"
				    + vidas + " vidas restantes"
					+ "\nLetras Utilizadas: " + letrasUtilizadas
					+ "\nDigite uma letra: ");
			
			String digitado = in.next().toUpperCase(); 
			if (digitado.length() > 1) {
				if (digitado.equals(sorteio)) {
					ganhou = true;
					break;
				} else {
					vidas = 0;
					break;
				}
			} else {
				letra = digitado.charAt(0);
				letrasUtilizadas += " " + letra; 
				
				boolean perdeVida = true; 
				for (int i = 0; i < sorteio.length(); i++) {
	
					if (letra == sorteio.charAt(i)) {
		
						acertos[i] = 1;
						perdeVida = false;
					} 
				}
				
				if (perdeVida) {
					vidas--; 
				}
			}
			System.out.println("\n");
			ganhou = true; 
			for (int i = 0; i < sorteio.length(); i++) {

				if (acertos[i] == 0) {
					System.out.print(" _ ");
					ganhou = false; 
				}
				else {
					System.out.print(" " + sorteio.charAt(i) + " ");
				}
			}
			
			System.out.println("\n");
			
		} while (!ganhou && vidas > 0); 
		
		if (vidas != 0) {
			System.out.println("\n\tParabêns você passou de fase!!");
		} else {
			System.out.println("\n\tVocê Morreu!!");
			System.out.println("\t O correto era: " + sorteio);
		}
	}
}
