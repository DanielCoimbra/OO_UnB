package control;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Jogo_controller {
	private ArrayList<String> lista_palavras_disponiveis;
	private ArrayList<String> mostrador_de_letras;
	private ArrayList<String> mostrador_de_letras_erradas;
	private String jogador_da_vez;
	private String palavra_da_vez;
	
	
    public static void main(String[] args) throws Exception{
        String [] palavras = {"ortodoxo","pedro","daniel","predu","katarina","darius"};
        int numerolinhas = palavras.length;
        Random aleatorio = new Random();
        Scanner in = new Scanner(System.in);
        int Linhasorteada = aleatorio.nextInt(numerolinhas);
        String sorteio = palavras[Linhasorteada];
        for
        (int i=0 ; i < sorteio.length(); i++){
            System.out.print(" _ ");
        }




    
}
}