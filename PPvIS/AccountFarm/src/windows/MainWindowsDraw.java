package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

import controller.TimeControll;
import controller.TimerAction;
import model.ButtonData;
import model.DisplayPanel;
import model.MyButton;
import model.ScorePanel;
import model.ScoreStore;

public class MainWindowsDraw {

	public ScoreStore currentValueScore = new ScoreStore(20);
	public List<Integer> activity = new ArrayList<Integer>();
	public MainWindowsDraw() {

	}

	public void drawMainWindow() {
		JFrame windowFrame = new JFrame();
		windowFrame.setSize(760, 400);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setLocationRelativeTo(null);
		windowFrame.setLayout(new GridLayout(1, 2));

		ButtonData buttonList = new ButtonData();
		
		JLabel levelText = new JLabel("Выберите уровень: ");
		String[] boxString = {"Новичок"}; 
		JComboBox box = new JComboBox(boxString);
		
		JButton runPlayButton = new JButton("Начать игру");
		JButton stopPlayButton = new JButton("Стоп");
		JPanel panel = new JPanel();
		JPanel firstPanel = new JPanel();
		ScorePanel secondPanel = new ScorePanel();
		secondPanel.drawPanel();
		
		DisplayPanel playPanel = new DisplayPanel();
		playPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		Timer timer=null;
		timer = new Timer(1000, null);
		timer.addActionListener(new TimerAction(buttonList,secondPanel, currentValueScore,timer));
			
		GameWindows game = new GameWindows(buttonList,playPanel,secondPanel, timer, currentValueScore,activity);
		
		game.setSize(400, 400);
		windowFrame.add(game);
			
		panel.setLayout(new GridLayout(3, 1));
		firstPanel.setLayout(new FlowLayout());
				
		firstPanel.add(levelText);
		firstPanel.add(box);
		firstPanel.add(runPlayButton);
		firstPanel.add(stopPlayButton);
		
		panel.add(firstPanel);
		panel.add(playPanel);
		panel.add(secondPanel);
		
		runPlayButton.setFont(new Font("Arial", Font.ITALIC, 15));
		stopPlayButton.setFont(new Font("Arial", Font.ITALIC, 15));
		Font firstFont = new Font("Arial", Font.BOLD, 25);
		Font secondFont = new Font("Arial", Font.ITALIC, 20);
		
		levelText.setFont(secondFont);
		box.setFont(new Font("Arial", Font.PLAIN, 15));
		
		
		runPlayButton.addActionListener(new GameWindows(buttonList,playPanel,secondPanel, timer, currentValueScore, activity));
		
		windowFrame.add(panel);
		windowFrame.setVisible(true);

	}

}
