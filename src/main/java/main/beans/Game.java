
package main.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Game 
{
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1)
	{
		super();
		this.player1 = player1;
		this.computerPlayer = this.setComputerPlayerToRandom();
		this.winner = this.determineWinner();
	}

	private String determineWinner() 
	{
		String player = this.player1;
		String computer = this.computerPlayer;
		String scissors= "scissors";
		String rock = "rock";
		String spock = "spock";
		String lizard = "lizard";
		String paper = "paper";
		String winner = "this is the winner";
		
		if (player == scissors)
		{
			if(computer == lizard || computer == paper)
			{
				winner = "Player";
			}
			else if (computer == scissors)
			{
				winner = "Tie";
			}
			else 
			{
				winner = "Computer";
			}
		}
		if(player == rock)
		{
			if(computer == scissors || computer == lizard)
			{
				winner = "Player";
			}
			else if (computer == rock)
			{
				winner = "Tie";
			}
			else
			{
				winner = "Computer";
			}
		}
		if (player == spock)
		{
			if(computer == rock || computer == scissors)
			{
				winner ="Player";
			}
			else if (computer == spock)
			{
				winner = "Tie";
			}
			else 
			{
				winner = "Computer";
			}
		}
		if (player == lizard)
		{
			if(computer == paper || computer == spock)
			{
				winner = "Player";
			}
			else if (computer == lizard)
			{
				winner = "Tie";
			}
			else 
			{
				winner = "Computer";
			}
		}
		if (player == paper)
		{
			if(computer == rock || computer == spock)
			{
				winner = "Player";
			}
			else if(computer == paper)
			{
				winner = "Tie";
			}
			else
			{
				winner = "Computer";
			}
		}
			
		return winner;
	}

	private String setComputerPlayerToRandom() 
	{
		String options[] = new String[] {"scissors", "paper", "lizard", "spock", "rock"};
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randInt = rand.nextInt(5);
		String option = options[randInt];
		return option;
	}
}