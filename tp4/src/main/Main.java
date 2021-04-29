package main;


import control.*;



/**
 * classe main pra iniciar o jogo
 * @author Daniel Coimbra
 *
 */
public class Main {
	private static final String DATABASE = "Lista.txt";
	/**
	 * inicia o jogo
	 * @throws Exception
	 */
	public static void start() throws Exception {
		Controller_jogo.start();
		

	}
	/**
	 * função
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		start();
	}
}