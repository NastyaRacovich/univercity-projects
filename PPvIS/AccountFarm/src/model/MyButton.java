package model;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import controller.CellListener;
import controller.GeneratorRandomNumber;

public class MyButton extends JButton{
	public int type;
	public int number;
	public void setSize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		super.setSize(50, 50);
	}
	
	 public MyButton(){
		 setSize(50, 50);
	 }
	 
	 public void setMyIcon(Icon icon) {
		 setIcon(icon);
	 }
	 
	 public void badCell(){
		 ImageIcon icon = new ImageIcon("qq.jpg");
			setIcon(icon);
			type=0;
	 }
	 
	 public int setRandomStartIcon(){
		 GeneratorRandomNumber num = new GeneratorRandomNumber();
		 String path = num.firstGenerate();
		 ImageIcon icon = new ImageIcon(path);
		 setIcon(icon);
		 type = num.converselyGenerete(path);
		 return type;
	 }
	 

}
