package training.mini_prj.monopoly.cell;

import java.awt.Color;

public class Place extends Cell {
	
	private Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Place";
	}
	
	

}
