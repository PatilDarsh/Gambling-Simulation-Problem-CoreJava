package com.infogalaxy.gameblingsimulation;

import java.util.Random;

public class GameblingSimulation {
	
		private static final int STAKE_PER_DAY = 100;
		private static final int BET_PER_GAME = 1;
		private static final int WIN = 1;
		private static final int LOOSE = 0;
		
		public static void gameStatus() {
//			System.out.println("Stack Available: " +STAKE_PER_DAY);
//			System.out.println("Bet per game: " +BET_PER_GAME);	
		}
		
		public static void gamePlay() {
			Random random = new Random();
			int[] winAmount = new int[20];
			int[] looseAmount = new int[20];	
		
			int wonDays = 0;
			int lostDays = 0;
			for(int i = 0; i < 20; i++) {
				System.out.println("Day: " +(i+1));
				int winStack = 0;
				int looseStack = 0;
				while(true) {
					int playStatus = random.nextInt(9) % 2;
					
					if(playStatus == LOOSE) {
						looseStack += 1;
					} else {
						winStack += 1;			
					}
					
					if(looseStack == STAKE_PER_DAY / 2) {
						lostDays++;
						break;
					}
					if(winStack == STAKE_PER_DAY / 2) {
						wonDays++;
						break;
					}
					
				}
				looseAmount[i] = looseStack;
				winAmount[i] = winStack;
				System.out.println("Loose Amount: " +looseAmount[i]);
				System.out.println("Win Amount: " +winAmount[i]);
				System.out.println("------------------------");	
			}
			System.out.println("Total Days Lost: " +lostDays);
			System.out.println("Total Days Won: " +wonDays);
		}
		
		
		public static void main(String[] args) {
			System.out.println("Welcome to Gambling Simulation Problem developed by Darshan Patil");
			gamePlay();
		}

	}
