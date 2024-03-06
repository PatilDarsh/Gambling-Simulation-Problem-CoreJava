package com.infogalaxy.gameblingsimulation;

import java.util.Random;

public class GameblingSimulation {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1 ;
	private static final int WIN = 1 ;
	private static final int LOOSE = 0 ;
	
	static int winStack = 0 ;
	static int looseStack = 0 ;
	
	
	public static void gameStatus() {
		System.out.println("Stack Available :"+STACK_PER_DAY);
		System.out.println("Bet Per Game : "+BET_PER_GAME);
		System.out.println("Winning Stack :"+winStack);
		System.out.println("Looseing Stack :"+looseStack);
		System.out.println("------------------------------");
		
	}
	
	public static void gamePlay() {
		while(true) {
			gameStatus();
			
			Random random = new Random();
			int playStatus = random.nextInt(9)%2 ;
			System.out.println("Play Status :"+playStatus);
			if(playStatus == LOOSE) {
				looseStack += 1;
			
			}
			else {
				winStack += 1 ;
			}
			if(winStack == STACK_PER_DAY/2) {
				break;
			}
			if(looseStack == STACK_PER_DAY/2) {
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling SImulation Problem developed by Darshan Patil .");
		
	
		gamePlay();
		
	}

}
