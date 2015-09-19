package model;

import java.util.ArrayList;
import java.util.List;

public class DataCell {

	List<Cell> data = new ArrayList<Cell>();

	public void addCell(Cell newPoint) {
		data.add(newPoint);
	}

	public List<Cell> returnCell() {
		return data;
	}
}
