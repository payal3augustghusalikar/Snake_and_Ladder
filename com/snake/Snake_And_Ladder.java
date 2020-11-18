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
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and ladder game");
		System.out.println("Start position is " + startPosition);
		System.out.println("Winning position is " + WinningPosition);
		newPosition = newPosition+throwDie();
		System.out.println("new position is : " +newPosition);
	}

}
