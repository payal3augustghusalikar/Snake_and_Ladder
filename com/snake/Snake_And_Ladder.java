package com.snake;

import java.util.Random;

public class Snake_And_Ladder {
	public static final int startPosition=0;
	public static final int WinningPosition=100;
	public static int newPosition=0;
	
	public static int throwDie() {
		Random random=new Random();
        int value = random.nextInt(6)+1;
		return value;
	}
	
	public static int optionForPlay() {
		Random random=new Random();
        int value1 = random.nextInt(3);
		return  value1 ;
	}
	
	public static void main(String[] args) {
		
		System.out.println("*-------Welcome to Snake and ladder game----*");
		System.out.println("Start position is " + startPosition);
		System.out.println("Winning position is " + WinningPosition);
		System.out.println("----------------------------------------------");
		
		while(newPosition<WinningPosition) {
			int playValue=optionForPlay();
		
			if(playValue==0) {
				System.out.println("No play");
				newPosition = newPosition;
			}
			else if(playValue==1) {
				System.out.println("got ladder");
				newPosition = newPosition + throwDie();
				if(newPosition>100) {
					newPosition=100;
					System.out.println("congratulations player reached to winning position");
				}
			}
			else if(playValue==2) {
				System.out.println("snake attack");
				newPosition = newPosition - throwDie();	
				if(newPosition<0) {
					newPosition=0;
				}
			}
		
			System.out.println("new position is : " +newPosition);
		}

	}	
}
