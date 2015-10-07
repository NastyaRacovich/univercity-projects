package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
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
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import controller.CellListener;
import model.ButtonData;
import model.CoordinateCell;
import model.MyButton;

public class GameWindows extends JPanel {

	public ButtonData buttonList;
	public JPanel playPanel;

	public GameWindows(ButtonData buttonList, JPanel playPanel) {
		this.buttonList = buttonList;
		this.playPanel = playPanel;
		setLayout(new GridLayout(8, 8));
		setMaximumSize(new Dimension(400, 400));
		Random rnd = new Random();
		int x = 1 + rnd.nextInt(8);
		int y = 1 + rnd.nextInt(8);

		for (int index = 1; index <= 64; index++) {
			MyButton button = new MyButton();
			button.setSize(50, 50);
			if ((x * 8 + y) - 8 == index) {
				ImageIcon icon = new ImageIcon("qq.jpg");
				button.setIcon(icon);
				button.type = 0;
			} else
				button.type = button.setRandomStartIcon();

			CoordinateCell sq = new CoordinateCell();
			sq.setX(((index - 1) % 8) + 1);
			sq.setY(((index - 1) / 8) + 1);

			button.coordinate = sq;
			add(button);

			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println(button.type);

					if (button.type == 2) {
						playPanel.removeAll();
						playPanel.repaint();

						JPanel imgPanel = new JPanel();
						MyButton button1 = new MyButton();
						ImageIcon icon1 = new ImageIcon("1.jpg");
						button1.setMyIcon(icon1);
						MyButton button2 = new MyButton();
						ImageIcon icon2 = new ImageIcon("2.jpg");
						button2.setMyIcon(icon2);
						MyButton button3 = new MyButton();
						ImageIcon icon3 = new ImageIcon("3.jpg");
						button3.setMyIcon(icon3);
						MyButton button4 = new MyButton();
						ImageIcon icon4 = new ImageIcon("4.jpg");
						button4.setMyIcon(icon4);
						MyButton button5 = new MyButton();
						ImageIcon icon5 = new ImageIcon("5.jpg");
						button5.setMyIcon(icon5);


						playPanel.setLayout(new FlowLayout());

						imgPanel.add(button1);
						
						imgPanel.add(button2);
						imgPanel.add(button3);
						imgPanel.add(button4);
						

						playPanel.add(imgPanel);
						//playPanel.repaint();
						playPanel.setBackground(new Color(255,218,185));
					}
					if (button.type == 1) {
						playPanel.removeAll();
						playPanel.repaint();
						playPanel.setLayout(new BorderLayout());
						JLabel varLabel = new JLabel(" -5 очков за разблокированную клетку");
						varLabel.setFont(new Font("Arial", Font.ITALIC, 20));
						
						playPanel.add(varLabel, BorderLayout.CENTER);
					
					//	playPanel.repaint();
						playPanel.setBackground(Color.RED);
					}

				}
			});

			buttonList.setNewMyButton(button);

		}
	}
}
