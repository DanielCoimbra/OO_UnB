package control;

public class Jogador {
	private String player_name;
	private int player_score;
	public int vidas=5;
	
	public Jogador() {
		player_score = 0;
	}
	
	public String get_name() {
		return player_name;
	}
	
	public void set_name(String name) {
		player_name= name;
	}
	
	public void hall_da_fama() {
		
	}
	public void reset_lives() {
		
	}
	
	public int get_score() {
		return this.player_score;
	}
	
	public void perder_1_de_vida(){
		this.vidas -= 1;
	}
	public int vida() {
		return this.vidas;
	}
}
