package controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import model.ButtonData;
import model.ScorePanel;

public class TimeControll implements ActionListener{

	String scoreString = "20";
	//Timer timer = null;
	ButtonData buttonList;
	int min;
	int sec;
	int timeindex = 0;
	int scoreInt;
	ScorePanel secondPanel;
	
	int idtf=0;
	public TimeControll(ButtonData buttonList, int scoreInt, ScorePanel secondPanel) {
		// TODO Auto-generated constructor stub
		
		this.buttonList = buttonList;
		this.scoreInt = scoreInt;		
		this.secondPanel = secondPanel;
	}
	
	public TimeControll(int scoreInt) {
		// TODO Auto-generated constructor stub
		this.scoreInt = scoreInt;		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	/*	timer = new Timer(1000, null);
		timer.addActionListener(new TimerAction(buttonList,scoreInt,secondPanel));
		timer.start();*/
		
			
			//System.out.println(type);
		

		
	}

}
