package array_fun;

import java.util.Scanner;

public class Matrix {
	
	Scanner s = new Scanner(System.in);
	
	private char[][] game = {
		{'-','-','-'},
		{'-','-','-'},
		{'-','-','-'}
	};
	private char[][] newBoard = game;
	
	private boolean playerOne = true;
	private boolean gameOver = false;
	
	public void run () {
		printBoard();
		
		while (!gameOver) {
			turn();
			printBoard();
		}
		
	}
	private void turn () {
		
		int r,c;
		String answer;
		
		if (playerOne) {
			System.out.println("Player 1, place an X in row and column: ");
			answer = s.nextLine();
			r = Character.getNumericValue(answer.charAt(0));
			c = Character.getNumericValue(answer.charAt(1));
			game[r][c] = 'X';
			playerOne = false;
		}	
		else if (!playerOne) {
			System.out.println("Player 2, place an O in row and column: ");
			answer = s.nextLine();
			r = Character.getNumericValue(answer.charAt(0));
			c = Character.getNumericValue(answer.charAt(1));
			game[r][c] = 'O';
			playerOne = true;
		}
	}
	
	private void printBoard () {
		System.out.printf(" %C | %C | %C \n", game[0][0],game[0][1],game[0][2]);
		System.out.println("-----------");
		System.out.printf(" %C | %C | %C \n", game[1][0],game[1][1],game[1][2]);
		System.out.println("-----------");
		System.out.printf(" %C | %C | %C \n", game[2][0],game[2][1],game[2][2]);
		System.out.print("\n");
	}
}