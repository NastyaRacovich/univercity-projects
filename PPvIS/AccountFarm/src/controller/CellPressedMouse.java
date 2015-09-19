package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.DataCell;

public class CellPressedMouse implements MouseListener {
	DataCell list;

	public CellPressedMouse(DataCell list) {
		this.list = list;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		// System.out.print(e.getX() + " " + e.getY());

		for (int index = 0; index < 64; index++) {
			if (list.returnCell().get(index).getType() == 3
					&& (list.returnCell().get(index).getSquare().getX() <= e.getX()
							&& list.returnCell().get(index).getSquare().getY() <= e.getY())
					&& (list.returnCell().get(index).getSquare().getX() + 50 >= e.getX()
							&& list.returnCell().get(index).getSquare().getY() + 50 >= e.getY()))
				System.out.println("Коричневый");
			if (list.returnCell().get(index).getType() == 1
					&& (list.returnCell().get(index).getSquare().getX() <= e.getX()
							&& list.returnCell().get(index).getSquare().getY() <= e.getY())
					&& (list.returnCell().get(index).getSquare().getX() + 50 >= e.getX()
							&& list.returnCell().get(index).getSquare().getY() + 50 >= e.getY()))
				System.out.println("Зеленый");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
