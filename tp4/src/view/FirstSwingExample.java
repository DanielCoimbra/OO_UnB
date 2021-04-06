package view;

import javax.swing.*;
import java.lang.Thread;

public class FirstSwingExample {
	public static void main(String[] args) throws InterruptedException{
		
		JFrame f=new JFrame();//creating instance of JFrame  
		          
		
		
		f.setTitle("Game Over");
		f.setSize(600,400);//400 width and 500 height
		f.setLocation(500, 500);
		f.setLayout(null);//using no layout managers
		f.setVisible(true);//making the frame visible
		
		Thread.sleep(10000);
		
		f.setSize(1000,1000);
		
		JButton b=new JButton("Menu");//creating instance of JButton
		
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height 
		b.setLocation(0, 0);
		
		f.add(b);//adding button in JFrame
	
	}
}