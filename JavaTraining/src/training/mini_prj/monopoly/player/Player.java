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
		/////////
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", currentAmount=" + currentAmount + ", currentPosition=" + currentPosition
				+ ", ownedProperties=" + ownedProperties + "]";
	}

}
