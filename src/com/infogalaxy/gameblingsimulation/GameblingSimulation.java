package com.infogalaxy.gameblingsimulation;

public class GameblingSimulation {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1 ;
	
	public static void gameStatus() {
		System.out.println("Stack Available :"+STACK_PER_DAY);
		System.out.println("Bet Per Game : "+BET_PER_GAME);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling SImulation Problem developed by Darshan Patil .");
		
		gameStatus();
	}

}
