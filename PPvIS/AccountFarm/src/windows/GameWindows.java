package windows;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import controller.CellPressedMouse;
import controller.GeneratorRandomNumber;
import model.Cell;
import model.CoordinatesSquare;
import model.DataCell;

public class GameWindows extends JPanel {
	public void paint(Graphics g) {
		super.paintComponent(g);

		String num;

		DataCell list = new DataCell();

		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++) {
				GeneratorRandomNumber path = new GeneratorRandomNumber();
				num = path.firstGenerate();
				ImageIcon icon = new ImageIcon(num);
				Image img = icon.getImage();

				g.drawImage(img, 50 + 50 * j + 5 * j, 70 + 50 * i + 5 * i, 50, 50, this);

				CoordinatesSquare coordinate = new CoordinatesSquare();
				coordinate.setX(50 + (50 * j) + (5 * j));
				coordinate.setY(70 + (50 * i) + (5 * i));
				coordinate.setSide(50);

				Cell area = new Cell();

				area.setType(path.converselyGenerete(num));
				area.setSquare(coordinate);
				area.setNum(3 * i + j);
				list.addCell(area);
			}
		Random rnd = new Random();
		int x = 0 + rnd.nextInt(7);
		int y = 0 + rnd.nextInt(7);
		ImageIcon icon = new ImageIcon("5w.jpg");
		Image img = icon.getImage();

		g.drawImage(img, 50 + 50 * y + 5 * y, 70 + 50 * x + 5 * x, 50, 50, this);

		addMouseListener(new CellPressedMouse(list));
	}

}
