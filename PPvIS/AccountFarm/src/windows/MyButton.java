package windows;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyButton extends JButton{
	@Override
	public void setSize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		super.setSize(50, 50);
	}
	
	ImageIcon icon = new ImageIcon("1q.png");
	@Override
	public void setIcon(Icon icon) {
		// TODO Auto-generated method stub
		super.setIcon(icon);
	}
	public void setDisabledIcon(Icon icon) {
		// TODO Auto-generated method stub
		super.setDisabledIcon(icon);
	}
	

}
