package main;

import main.beans.Game;

public class Tester {
	public static void main(String[] args)
	{
		Game game = new Game("scissors");
		System.out.println(game.getWinner());
	}

}
