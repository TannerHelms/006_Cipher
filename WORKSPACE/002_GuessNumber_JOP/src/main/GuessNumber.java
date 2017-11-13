package main;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
		
		lowerLimit = Integer.parseInt((String) JOptionPane.showInputDialog("What's the minimum?"));
		upperLimit = Integer.parseInt((String) JOptionPane.showInputDialog("What's the maximum?"));
		guessAmt = Integer.parseInt((String) JOptionPane.showInputDialog("How many guesses?"));
		String stitchedOptionMessage = "Alright. You have " + guessAmt + " tries to guess the number between " + lowerLimit + " and " + upperLimit + ". Good Luck!";
		gameMsg.msg(stitchedOptionMessage);
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
		String tempMsg = "For sake of testing, the number is: " + randomNum;
		gameMsg.msg(tempMsg);
		userGuess = Integer.parseInt((String) JOptionPane.showInputDialog("Take a guess." + dots));
		
		for (int i = guessAmt; i > 1; i--) {
			
			if (userGuess > randomNum) {
				gameMsg.msg("Your guess is too high! Guess again!");
				userGuess = Integer.parseInt((String) JOptionPane.showInputDialog("Take a guess." + dots));
			} 
			else if (userGuess < randomNum) {
				gameMsg.msg("Your guess is too low! Guess again!");
				userGuess = Integer.parseInt((String) JOptionPane.showInputDialog("Take a guess." + dots));
			} 
			else {
				return "You got it! Game over.";
			}
		}
		return "You ran out of guesses! Game over.";
	}
}