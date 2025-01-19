package training.mini_prj.monopoly.mgr.enm;

public enum CellCategory {
	
	PLACE("place"), TAX("tax"), RAIL("railway"), START("start"), UTILITY("utility");

	private String name;
	
	private CellCategory(String name) {
		this.name = name;
	}
	
	public static CellCategory getCellCategoryByName(String name) {
		CellCategory[] all = CellCategory.values();
		for (CellCategory category : all) {
			if (category.name.equalsIgnoreCase(name)) {
				return category;
			}
		}
		return null;
	}
}
