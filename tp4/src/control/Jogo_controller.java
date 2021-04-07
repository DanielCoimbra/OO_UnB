package control;

import java.util.Random;
import java.util.Scanner;


public class Jogo_controller {
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