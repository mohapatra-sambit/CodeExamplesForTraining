package training.mini_prj.monopoly.player;

import java.util.ArrayList;
import java.util.List;

import training.mini_prj.monopoly.cell.Cell;

public class Player {

	private String name;

	private Integer currentAmount;

	private Integer currentPosition;

	private List<Cell> ownedProperties;

	public Player() {
		currentAmount = 1500;
		currentPosition = -1;
		ownedProperties = new ArrayList<Cell>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(Integer currentAmount) {
		this.currentAmount = currentAmount;
	}

	public Integer getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Integer currentPosition) {
		this.currentPosition = currentPosition;
	}

	public List<Cell> getOwnedProperties() {
		return ownedProperties;
	}

	public void buyProperty(Cell property) {
		this.ownedProperties.add(property);
	}
	
	public void play() {
		// 1. Invoke Dice class's roll method
		// 2. Add the dice value to the current position of the player.
		//     That sets the new current position of the player.
		// 3. If the new position is a place,
		//     a. Use the CellOwner, for the following logic. 
		//	   b. If it is already owned by someone else, determine the owner and the rent amount.
		//	   		i. Subtract the rent amount from the current player
		//	   		ii. Add the rent amount to the player who owns this place.
		//	   c. If the place is available to buy,
		//	   		i. If current player has sufficient money to buy the place
		//				* Subtract the place amount from the current player's account.
		//				* Invoke the current player's buyProperty method
		//				* Update CellOwner class, about this new ownership.
		//			ii. If not, current player has to pay $25 as fine.
		// 4. Same logic will apply for Railway and Utility.
		// 5. If Tax, then simply reduce the tax amount from the current's player.
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", currentAmount=" + currentAmount + ", currentPosition=" + currentPosition
				+ ", ownedProperties=" + ownedProperties + "]";
	}

}
