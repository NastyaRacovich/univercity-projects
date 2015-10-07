package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import model.ButtonData;

public class TimeControll implements ActionListener{

	
	JLabel score;
	String scoreString = "20";
	Timer timer = null;
	ButtonData buttonList;
	JLabel time;
	int min;
	int sec;
	int timeindex = 0;
	public TimeControll(JLabel score, JLabel time, ButtonData buttonList) {
		// TODO Auto-generated constructor stub
		
		this.score = score;
		this.time = time;
		this.buttonList = buttonList;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		ActionListener work = new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				int scoreInt = Integer.valueOf(scoreString);
				scoreInt--;
				scoreString=String.valueOf(scoreInt);
				
				if (scoreInt==0) timer.stop();
				score.setText(scoreString);
				
				sec++;
				if (sec==60) {
					min++;
					sec=0;
					
				}
				String timeString = null;
				if (min<10) timeString = "0";
				timeString+=String.valueOf(min)+":";
				
				if (sec<10) timeString +="0";
				timeString+=String.valueOf(sec);
				
				time.setText(timeString);
				timeindex++;
				if (timeindex%4==0)
				for (int index =0;index<64; index++) 
					if (buttonList.getAllMyButton().get(index).type==0){
						buttonList.getAllMyButton().get(index).type=1;
						buttonList.getAllMyButton().get(index).setMyIcon(new ImageIcon("kr.jpg"));
						Random rnd = new Random();
						int x = 1 + rnd.nextInt(8);
						int y = 1 + rnd.nextInt(8);
						buttonList.getAllMyButton().get((x * 8 + y) - 8).type=0;
						buttonList.getAllMyButton().get((x * 8 + y) - 8).badCell();
					}
				
				
			}
		};
		timer = new Timer(1000, work);
		timer.start();

		
	}

}
