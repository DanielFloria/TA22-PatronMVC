package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewClientList extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ViewClientList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 414);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}

}
