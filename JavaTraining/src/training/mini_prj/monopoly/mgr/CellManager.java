package training.mini_prj.monopoly.mgr;

import java.awt.Color;

import training.mini_prj.monopoly.cell.Cell;
import training.mini_prj.monopoly.cell.Place;
import training.mini_prj.monopoly.cell.Railway;
import training.mini_prj.monopoly.cell.Start;
import training.mini_prj.monopoly.cell.Tax;
import training.mini_prj.monopoly.cell.Utility;
import training.mini_prj.monopoly.mgr.enm.CellCategory;

public class CellManager {
	
	private static int count = 0;

	public static Cell getCellObject(CellCategory catg, String[] parts) {
		switch (catg) {
		case PLACE: {
			Place place = new Place();
			place.setColor(Color.getColor(parts[1]));
			place.setName(parts[2]);
			place.setPosition(++count);
			place.setAmount(Double.valueOf(parts[3]));
			place.setRent(Double.valueOf(parts[4]));
			return place;
		}
		case TAX: {
			Tax tax = new Tax();
			tax.setName(parts[1]);
			tax.setPosition(++count);
			tax.setAmount(Double.valueOf(parts[2]));
			tax.setRent(Double.valueOf(parts[3]));
			return tax;
		}
		case RAIL: {
			Railway railway = new Railway();
			return railway;
		}
		case UTILITY: {
			Utility utility = new Utility();
			return utility;
		}
		case START: {
			return new Start();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + catg);
		}
	}

}
