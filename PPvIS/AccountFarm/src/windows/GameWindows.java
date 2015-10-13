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
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import controller.CellListener;
import controller.TimeControll;
import controller.TimerAction;
import model.ButtonData;
import model.CoordinateCell;
import model.DisplayPanel;
import model.MyButton;
import model.ScorePanel;
import model.ScoreStore;

public class GameWindows extends JPanel implements ActionListener {

	public ButtonData buttonList;
	public DisplayPanel playPanel;
	public List <Integer> activity;
	public ScorePanel secondPanel;
	public Timer timer;
	public ScoreStore currentValueScore;

	public GameWindows(ButtonData buttonList, DisplayPanel playPanel, ScorePanel secondPanel, Timer timer,
			ScoreStore currentValueScore, List<Integer> activity) {
		this.buttonList = buttonList;
		this.playPanel = playPanel;
		this.secondPanel = secondPanel;
		this.timer = timer;
		this.currentValueScore = currentValueScore;
		this.activity=activity;
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
			button.number = index;
			add(button);
			button.addActionListener(new CellListener(currentValueScore,button,playPanel,activity));
			
			
			buttonList.setNewMyButton(button);

		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		timer.start();
	}
}
