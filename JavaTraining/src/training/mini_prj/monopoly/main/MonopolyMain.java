package training.mini_prj.monopoly.main;

import training.mini_prj.monopoly.config.MonopolyConfig;
import training.mini_prj.monopoly.config.MonopolyException;
import training.mini_prj.monopoly.game.MonopolyGame;
import training.mini_prj.monopoly.player.Player;

public class MonopolyMain {

	public static void main(String[] args) throws MonopolyException {
		if (args.length > 1) {
			MonopolyConfig config = new MonopolyConfig();
			MonopolyGame game = new MonopolyGame();
			for (String arg : args) {
				Player player = new Player();
				player.setName(arg);
				game.addPlayer(player);
			}
			game.setCells(config.getCellsList());
			game.start();
		} else {
			//TODO: Display error message and exit.
			System.out.println("Error");
		}
	}

}
