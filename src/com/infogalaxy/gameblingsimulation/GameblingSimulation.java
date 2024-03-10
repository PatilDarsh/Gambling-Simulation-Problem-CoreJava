package com.infogalaxy.gameblingsimulation;

import java.util.Random;

public class GameblingSimulation {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1 ;
	private static final int WIN = 1 ;
	private static final int LOOSE = 0 ;
	
	 
	
	public static void gameStatus() {
		System.out.println("Stack Available :"+STACK_PER_DAY);
		System.out.println("Bet Per Game : "+BET_PER_GAME);

	}
	
	public static void gamePlay() {
		Random random = new Random();
		for(int i=1 ; i <=20 ; i++) {
			System.out.println("Day:"+i);
			int winStack = 0 ;
			int looseStack = 0 ;
			while(true) {
				
				int playStatus = random.nextInt(9)%2 ;
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
			System.out.println("Winning Stack:"+winStack );
			System.out.println("Looseing Stack:"+looseStack);
			System.out.println("--------------------------------");
			
			
		}	
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling SImulation Problem developed by Darshan Patil .");
		
	
		gamePlay();
		
	}

}
