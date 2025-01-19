package training.mini_prj.monopoly.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import training.mini_prj.monopoly.cell.Cell;
import training.mini_prj.monopoly.mgr.CellManager;
import training.mini_prj.monopoly.mgr.enm.CellCategory;

public class MonopolyConfig {

	private List<Cell> cellsList;

	public List<Cell> getCellsList() {
		return cellsList;
	}

	public MonopolyConfig() throws MonopolyException {
		List<String> allDefinitions = readDefnFile();
		if (allDefinitions.isEmpty()) {
			throw new MonopolyException("No cell definitions found");
		}
		cellsList = new ArrayList<Cell>();
		for (String defn : allDefinitions) {
			cellsList.add(createCell(defn));
		}
		System.out.println(cellsList);
	}

	private Cell createCell(String defn) {
		String[] parts = defn.split(",");
		String cellCategoryName = parts[0];
		CellCategory cellCategory = CellCategory.getCellCategoryByName(cellCategoryName);
		return CellManager.getCellObject(cellCategory, parts);
	}

	private List<String> readDefnFile() throws MonopolyException {
		File defnFile = new File("cell-defn.txt");
		List<String> allLines = new LinkedList<String>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(defnFile));
			String line = "";
			while ((line = in.readLine()) != null) {
				allLines.add(line);
			}
		} catch (FileNotFoundException e) {
			throw new MonopolyException("File [" + defnFile + "] not found.");
		} catch (IOException e) {
			throw new MonopolyException("Unable to read file [" + defnFile + "].");
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					throw new MonopolyException("Unable to read file [" + defnFile + "].");
				}
			}
		}
		return allLines;
	}

}
