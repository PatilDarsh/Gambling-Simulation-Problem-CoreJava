package com.infogalaxy.gameblingsimulation;

import java.util.Random;
import java.util.Scanner;

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
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			int[] winAmount = new int[20];
			int[] looseAmount = new int[20];
			int[] maxLost = new int[20];
			int[] maxWon = new int[20];
			
			
			int wonDays = 0;
			int lostDays = 0;
			int maxL = 0 ;
			int maxW = 0 ;
			int indexL = 0 ;
			int indexW = 0 ;
			char choice = 'y';
			
			do {
				for(int i = 0; i < 20; i++) {
					
					int winStack = 0;
					int looseStack = 0;
					
					System.out.println("Day: " +(i+1));
					
					while(true) {
						int playStatus = random.nextInt(9) % 2;
						
						if(playStatus == LOOSE) {
							looseStack += 1;
						} else {
							winStack += 1;			
						}
						
						if(looseStack == STAKE_PER_DAY / 2) {
							lostDays++;
							if(looseStack > winStack) {
								maxLost[i] = looseStack - winStack ;
								
							if (maxL<maxLost[i]) {
									maxL = maxLost[i];
									indexL = i+1;
								}
							}
							break;
						}
						if(winStack == STAKE_PER_DAY / 2) {
							wonDays++;
							if(looseStack < winStack) {
								maxWon[i]= winStack - looseStack ;
								if(maxW < maxWon[i]) {
									indexW = i+1;
									
								}
							}
							break;
						}
						
					}
					looseAmount[i] = looseStack;
					winAmount[i] = winStack;
					System.out.println("Loose Amount: " +looseAmount[i]);
					System.out.println("Win Amount: " +winAmount[i]);
					System.out.println("------------------------");	
				}
			
			
				System.out.println(indexL+" is the Unluckiest Day , Lost Rs : "+maxL);
				System.out.println(indexW+" is the Luckiest Day , Won Rs : "+indexW);
				System.out.println("Total Days Lost: " +lostDays);
				System.out.println("Total Days Won: " +wonDays);
				System.out.println("DO YOU WANT TO PLAY CONTINUE PLAYING ?(Yes/No)");
				choice = scanner.next().charAt(0);
			}
				while(choice == 'y');
					
		}
		
		
		public static void main(String[] args) {
			System.out.println("Welcome to Gambling Simulation Problem developed by Darshan Patil");
			gamePlay();
		}

	}
