package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class MainWindowsDraw {

	public MainWindowsDraw() {

	}

	public void drawMainWindow() {
		JFrame windowFrame = new JFrame();
		windowFrame.setSize(680, 620);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setLocationRelativeTo(null);
		windowFrame.setLayout(new BorderLayout());

		/*
		 * JMenuBar menuBar = new JMenuBar(); JMenu menuFirst = new
		 * JMenu("Статистика"); JMenu menuInf = new JMenu("О программе");
		 * JMenuItem menuFirstItem1 = new JMenuItem("Существующей фермы");
		 * JMenuItem menuFirstItem2 = new JMenuItem("Новой фермы");
		 * 
		 * menuFirst.add(menuFirstItem1); menuFirst.add(menuFirstItem2);
		 * menuBar.add(menuFirst);
		 * 
		 * JLabel imageLabel = new JLabel(); imageLabel.setIcon(new
		 * javax.swing.ImageIcon(getClass().getResource("22.png")));
		 * 
		 * windowFrame.add(menuBar, BorderLayout.NORTH); //
		 * windowFrame.add(imageLabel, BorderLayout.CENTER);
		 * 
		 * JPanel panel = new JPanel(); JButton firstButton = new JButton(
		 * "Статистика существующей фермы"); JButton secondButton = new JButton(
		 * "Статистика новой фермы"); firstButton.setBackground(Color.WHITE);
		 * panel.add(firstButton);
		 * 
		 * ImageIcon icon = new ImageIcon("33.png"); Image img =
		 * icon.getImage(); Image newimg = img.getScaledInstance(43, 26,
		 * java.awt.Image.SCALE_SMOOTH); icon = new ImageIcon(newimg); JButton
		 * but= new JButton(icon); // but.setSize(43, 26); //
		 * but.setLocation(500, 400); but.setBounds(20, 20, 50, 50); //
		 * panel.add(secondButton); panel.add(but); windowFrame.add(panel,
		 * BorderLayout.SOUTH);
		 */
		GameWindows game = new GameWindows();
		//windowFrame.add(game, BorderLayout.CENTER);

		JPanel resultPanel = new JPanel();

		JLabel numberLabel = new JLabel("0");
		Font font = new Font("Arial", Font.ITALIC, 30);

		numberLabel.setFont(font);
		MyButton but = new MyButton();

		/*resultPanel.setLayout(new BorderLayout());
		resultPanel.add(but, BorderLayout.WEST);
		resultPanel.add(numberLabel, BorderLayout.WEST);*/

		JLabel lab1 = new JLabel();

		//resultPanel.add(but, BorderLayout.SOUTH);
		windowFrame.add(but, BorderLayout.CENTER);

		windowFrame.setVisible(true);

	}

}
