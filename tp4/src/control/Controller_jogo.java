package control;
import model.*;
import view.*;

public class Controller_jogo {
	
	public static void resetar_lista() throws Exception {
		Model_jogo.reseta_lista_palavras();
	}
	
	public static void rodada(char letra) {
		int estado = 4;
//		int estado = Model_jogo.checa_estado();
//		if (estado == 0) {
			
//		}else if (estado == 1) {
			
//		}else if (estado == 2){
			try {
				Model_jogo.reseta_lista_palavras();
			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
			Model_jogo.sortear_palavra();
			Model_jogo.checar_letra(letra, Model_jogo.p_da_vez());
//		}
	}
	
	
	public static void mostrar_palavra() {
		
	}
	
	public static void navegar_tela(Tela t, int tela) throws Exception {
		t.get_tela().setVisible(false);
		switch(tela) {
		case 0:
			Menu_inicial menu = new Menu_inicial();
			break;
			
		case 1:
			Forca forca = new Forca();
			break;
			
		case 2:
			Creditos creditos = new Creditos();
			break;
			
		case 3:
			Game_over go = new Game_over();
			break;
		case 4:
			Hall_da_fama hdf = new Hall_da_fama();
			break;
		}
	
	}
	
	public static int tamanho_palavra() throws Exception {
		return Model_jogo.tamanho_lista_palavras();
	}
}