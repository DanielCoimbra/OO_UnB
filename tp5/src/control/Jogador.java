package control;

public class Jogador {
	private String player_name;
	private int player_score;
	public int vidas=5;
	
	public Jogador() {
		
	}
	
	public void get_name() {
		
	}
	
	public void hall_da_fama() {
		
	}
	
	public void perder_1_de_vida(){
		this.vidas -= 1;
	}
	public int vida() {
		return this.vidas;
	}
}
