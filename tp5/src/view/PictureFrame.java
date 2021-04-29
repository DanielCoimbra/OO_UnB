package view;

import java.awt.*;


import javax.swing.ImageIcon;

public class PictureFrame extends javax.swing.JFrame {
	ImageIcon image = new ImageIcon("images/forca_5_de_vida"); 
	
	public PictureFrame() {
		initComponents();
		this.setLocationRelativeTo(null);
		labelPic.setText("");
	}
}