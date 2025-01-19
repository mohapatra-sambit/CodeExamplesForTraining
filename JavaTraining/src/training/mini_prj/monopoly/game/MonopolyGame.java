package training.mini_prj.monopoly.game;

import java.util.ArrayList;
import java.util.List;

import training.mini_prj.monopoly.cell.Cell;
import training.mini_prj.monopoly.player.Player;

public class MonopolyGame {
	
	private List<Player> players;
	
	private List<Cell> cells;
	
	private int nextPlayerIndex = 0;
	
	public MonopolyGame() {
		players = new ArrayList<Player>();
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

	public void start() {
		while(true) {
			// 1. get next player from the list
			// 2. Invoke player's play method
			// 3. Once all players have play 2 complete round of the game
			// 		Then, ask whether to continue or end the game?
			// 		If continue, then increment nextPlayerIndex (if index > list.size then index = 0)
			//		If end the game, then break from the infinite loop
		}
		// Iterate through all the player
		// Calculate how much amount is owned by the player
		// Player who has maximum amount is the winner
		// Declare the winner.
	}

}
