package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Game_over1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_over1 frame = new Game_over1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game_over1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMenu.setBounds(12, 12, 117, 41);
		contentPane.add(btnMenu);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(94, 215, 55, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(149, 215, 55, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(204, 215, 55, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(259, 215, 55, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("E");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setBounds(314, 215, 55, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("F");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(369, 215, 55, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("G");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6.setBounds(424, 215, 55, 25);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("H");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_7.setBounds(94, 252, 55, 25);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("I");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_1.setBounds(149, 252, 55, 25);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("J");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_1.setBounds(204, 252, 55, 25);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("K");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3_1.setBounds(259, 252, 55, 25);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("L");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4_1.setBounds(314, 252, 55, 25);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("M");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5_1.setBounds(369, 252, 55, 25);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("N");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6_1.setBounds(424, 252, 55, 25);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_8 = new JButton("O");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_8.setBounds(94, 289, 55, 25);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("P");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_2.setBounds(149, 289, 55, 25);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Q");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_2.setBounds(204, 289, 55, 25);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("R");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3_2.setBounds(259, 289, 55, 25);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("S");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4_2.setBounds(314, 289, 55, 25);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_5_2 = new JButton("T");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5_2.setBounds(369, 289, 55, 25);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_6_2 = new JButton("U");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6_2.setBounds(424, 289, 55, 25);
		contentPane.add(btnNewButton_6_2);
		
		JButton btnNewButton_9 = new JButton("V");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_9.setBounds(116, 326, 54, 25);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_1_3 = new JButton("W");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_3.setBounds(182, 326, 55, 25);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("X");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_3.setBounds(249, 326, 55, 25);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_3_1 = new JButton("Y");
		btnNewButton_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_3_1.setBounds(314, 326, 55, 25);
		contentPane.add(btnNewButton_2_3_1);
		
		JButton btnNewButton_2_3_2 = new JButton("Z");
		btnNewButton_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_3_2.setBounds(379, 326, 55, 25);
		contentPane.add(btnNewButton_2_3_2);
		
		JLabel label = new JLabel("A");
		label.setBounds(12, 144, 27, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("B");
		label_1.setBounds(27, 196, 27, 27);
		contentPane.add(label_1);
		
		JLabel label_1_1 = new JLabel("C");
		label_1_1.setBounds(21, 217, 27, 27);
		contentPane.add(label_1_1);
		
		JLabel label_2 = new JLabel("D");
		label_2.setBounds(52, 196, 27, 27);
		contentPane.add(label_2);
		
		JLabel label_1_2 = new JLabel("E");
		label_1_2.setBounds(521, 244, 55, 70);
		contentPane.add(label_1_2);
		
		JLabel label_1_1_1 = new JLabel("F");
		label_1_1_1.setBounds(486, 103, 102, 109);
		contentPane.add(label_1_1_1);
		
		JLabel label_2_1 = new JLabel("G");
		label_2_1.setBounds(54, 264, 27, 27);
		contentPane.add(label_2_1);
		
		JLabel label_3 = new JLabel("H");
		label_3.setBounds(21, 264, 27, 27);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("I");
		label_4.setBounds(12, 240, 27, 25);
		contentPane.add(label_4);
		
		JLabel label_2_2 = new JLabel("J");
		label_2_2.setBounds(12, 287, 27, 27);
		contentPane.add(label_2_2);
		
		JLabel label_1_3 = new JLabel("K");
		label_1_3.setBounds(46, 287, 27, 27);
		contentPane.add(label_1_3);
		
		JLabel label_1_1_2 = new JLabel("L");
		label_1_1_2.setBounds(11, 62, 138, 86);
		contentPane.add(label_1_1_2);
		
		JLabel label_3_1 = new JLabel("M");
		label_3_1.setBounds(12, 154, 111, 86);
		contentPane.add(label_3_1);
		
		JLabel label_5 = new JLabel("Q");
		label_5.setBounds(37, 154, 75, 86);
		contentPane.add(label_5);
		
		JLabel label_2_3 = new JLabel("R");
		label_2_3.setBounds(521, 314, 27, 25);
		contentPane.add(label_2_3);
		
		JLabel label_1_4 = new JLabel("S");
		label_1_4.setBounds(27, 145, 27, 25);
		contentPane.add(label_1_4);
		
		JLabel label_6 = new JLabel("Y");
		label_6.setBounds(22, 103, 69, 109);
		contentPane.add(label_6);
		
		JLabel label_2_4 = new JLabel("Z");
		label_2_4.setBounds(52, 144, 27, 27);
		contentPane.add(label_2_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(141, 0, 283, 134);
		contentPane.add(panel);
		
		
	}
}
