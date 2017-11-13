package main;

public class Run {

	public static void main(String[] args) {
		
		String welcomeText = "We are going to play a number guessing game!"; 
		
		CreateMessage welcome = new CreateMessage();
		welcome.msg(welcomeText);
		welcome.msgIN("Start game?");
		GuessNumber game = new GuessNumber();
		game.start();
	}

}
