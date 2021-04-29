package control;

/**
 * Classe responsável pelos dados de um jogador
 * @author Daniel Coimbra
 * @versão 1.0 (Abril 2021)
 */
public class Jogador {
	private String player_name;
	public int score;
	public int vidas=5;
	
	public Jogador() {
		
	}
	/**
	 * 
	 * @return nome do jogador
	 */
	public String get_name() {
		return player_name;
	}
	/**
	 * registra o nome do jogador
	 * @param name
	 */
	public void set_name(String name) {
		player_name= name;
	}
	/**
	 * 
	 * @return player score
	 */
	public int get_score() {
		return this.score;
	}
	/**
	 * diminui um de vida do jogador
	 */
	public void perder_1_de_vida(){
		this.vidas -= 1;
	}
	/**
	 * 
	 * @return vidas do jogador em tempo de execucao
	 */
	public int vida() {
		return this.vidas;
	}

}
