package control;
import model.*;

public class Controller_jogo {
	
	public static void checa_letra(String letra) {
		Model_jogo.rodada(letra, Jogo_model.get_palavra_sorteada());
	}
}