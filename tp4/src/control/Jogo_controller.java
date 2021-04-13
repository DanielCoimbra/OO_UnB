package control;

import java.util.Random;
import java.util.Scanner;


public class Jogo_controller {
    public static void main(String[] args) throws Exception{

        
        // LISTA de palavras
        String [] palavras = {"ortodoxo","pedro","daniell","preduu","katarina","dariusso"};
        //Sortear palavras
        Random aleatorio = new Random();
        //Escanear
        Scanner in = new Scanner(System.in);
        // Leitor
        int numerolinhas = palavras.length;
        int Linhasorteada = aleatorio.nextInt(numerolinhas);//Posição
        String sorteio = palavras[Linhasorteada];// linha sorteada
        String letrausadas= "";
        char[] acertos =new char[sorteio.length()];
        char letra;
        for 
        (int i=0; i<acertos.length;i++){
            acertos[i]=0;
        }
        System.out.println(sorteio);
        System.out.println("Digite uma letra");
        letra = in.next().charAt(0);
        for
        (int i=0 ; i < sorteio.length(); i++){
            if(letra== sorteio.charAt(i)){
                System.out.println("Acertou uma letra na posicao " + i);
                acertos[i] = 1;

            }

        }
            for
            (int i=0 ; i < sorteio.length(); i++){
                if (acertos[i]==0)
                    System.out.print(" _ ");
                else 
                    System.out.print(" "+sorteio.charAt(i)+" ");
        }





    
    }
}