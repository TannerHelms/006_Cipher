package main;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	
	private int upperLimit;
	private int lowerLimit;
	private int guessAmt;
	private int userGuess;
	private String dots = ".";

	Random rand = new Random();
	Scanner gameAI = new Scanner(System.in);
	Scanner rangeFinder = new Scanner(System.in);
	
	CreateMessage gameMsg = new CreateMessage();
	
	public GuessNumber () {
		
	}
	
	public void start () {
		String gameOutput = gameSteps();
		gameMsg.msg(gameOutput);
	}
	
	public void getRange () {
		gameMsg.msg("Specify game options before we start:");
		gameMsg.msg("What's the minimum on the guessing range?");
		lowerLimit = rangeFinder.nextInt();
		gameMsg.msg("What's the maximum on the guessing range?");
		upperLimit = rangeFinder.nextInt();
		gameMsg.msg("How many times would you like to guess?");
		guessAmt = rangeFinder.nextInt();
		gameMsg.msg("Alright.");
	}
	public void createDots (int num) {
		for (int i = 0; i < (num - 1); i++) {
			dots = dots + ".";
		}
	}
	
	public String gameSteps () {
		getRange();
		int randomNum = rand.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit;
		createDots(randomNum);
		gameMsg.msg("For sake of testing, the number is: " + randomNum);
		gameMsg.msg("Take a guess" + dots);
		
		for (int i = guessAmt; i >= 1; i--) {
			userGuess = (int) gameAI.nextInt();
			
			if (userGuess > randomNum) {
				gameMsg.msg("Your guess is too high! Guess again!");
			} 
			else if (userGuess < randomNum) {
				gameMsg.msg("Your guess is too low! Guess again!");
			} 
			else {
				return "You got it! Game over.";
			}
		}
		return "You ran out of guesses! Game over.";
	}
}