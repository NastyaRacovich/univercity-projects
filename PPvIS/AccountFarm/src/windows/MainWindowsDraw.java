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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

import controller.TimeControll;
import model.ButtonData;
import model.MyButton;

public class MainWindowsDraw {

	public MainWindowsDraw() {

	}

	public void drawMainWindow() {
		JFrame windowFrame = new JFrame();
		windowFrame.setSize(760, 400);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setLocationRelativeTo(null);
		windowFrame.setLayout(new GridLayout(1, 2));
	
		GridBagConstraints c = new GridBagConstraints(); 
		ButtonData buttonList = new ButtonData();
		
		JPanel playPanel = new JPanel();
		playPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		GameWindows game = new GameWindows(buttonList,playPanel);
		//MyButton b = new MyButton();
		game.setSize(400, 400);
		windowFrame.add(game);
		JLabel levelText = new JLabel("Выберите уровень: ");
		String[] boxString = {"Новичок"}; 
		JComboBox box = new JComboBox(boxString);
		JLabel timeText = new JLabel("Время: ");
		JLabel time = new JLabel("00:00");
		JLabel scoreText = new JLabel("Счет: ");
		JLabel score = new JLabel("20");
		JButton runPlayButton = new JButton("Начать игру");
		JButton stopPlayButton = new JButton("Стоп");
		
		
		JPanel panel = new JPanel();
		JPanel firstPanel = new JPanel();
		JPanel secondPanel = new JPanel();
	
		
		panel.setLayout(new GridLayout(3, 1));
		firstPanel.setLayout(new FlowLayout());
		secondPanel.setLayout(new GridLayout(4, 1));
		
		
		firstPanel.add(levelText);
		firstPanel.add(box);
		firstPanel.add(runPlayButton);
		firstPanel.add(stopPlayButton);
		
		secondPanel.add(timeText);
		secondPanel.add(time);
		secondPanel.add(scoreText);
		secondPanel.add(score);
		
		
	
		panel.add(firstPanel);
		panel.add(playPanel);
		panel.add(secondPanel);
		
		runPlayButton.setFont(new Font("Arial", Font.ITALIC, 15));
		stopPlayButton.setFont(new Font("Arial", Font.ITALIC, 15));
		Font firstFont = new Font("Arial", Font.BOLD, 25);
		Font secondFont = new Font("Arial", Font.ITALIC, 20);
		timeText.setFont(secondFont);
		scoreText.setFont(secondFont);
		time.setFont(firstFont);
		score.setFont(firstFont);
		levelText.setFont(secondFont);
		box.setFont(new Font("Arial", Font.PLAIN, 15));
		timeText.setHorizontalAlignment(0);;
		scoreText.setHorizontalAlignment(0);
		time.setHorizontalAlignment(0);
		score.setHorizontalAlignment(0);
		
		runPlayButton.addActionListener(new TimeControll(score,time,buttonList));
		
		windowFrame.add(panel);
		windowFrame.setVisible(true);

	}

}
