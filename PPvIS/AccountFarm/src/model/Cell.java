package model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	public int type;
	public int num;
	public CoordinatesSquare square = new CoordinatesSquare();

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public CoordinatesSquare getSquare() {
		return square;
	}

	public void setSquare(CoordinatesSquare square) {
		this.square = square;
	}

}
