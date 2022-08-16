package MVC3.views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ViewProjectForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public ViewProjectForm() {
		setTitle("PROJECT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 176);
		contentPane = new JPanel();
		contentPane.setToolTipText("Scientific form");
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 10, 217, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROJECT ID");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 20, 91, 16);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(111, 17, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PROJECT NAME");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(10, 54, 96, 13);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 46, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PROJECT HOURS");
		lblNewLabel_2.setBounds(10, 83, 96, 13);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 75, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(342, 10, 132, 106);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("REGISTRATION");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(10, 10, 112, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(10, 41, 112, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminate");
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(10, 72, 112, 21);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("project data selector");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBounds(237, 10, 127, 13);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(303, 33, 29, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("Displayer");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBounds(518, 20, 116, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CANCEL");
		btnNewButton_4.setForeground(Color.DARK_GRAY);
		btnNewButton_4.setBounds(654, 20, 116, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Switch/Scientifics");
		btnNewButton_5.setForeground(Color.DARK_GRAY);
		btnNewButton_5.setBounds(518, 51, 116, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Assignments");
		btnNewButton_6.setForeground(Color.DARK_GRAY);
		btnNewButton_6.setBounds(518, 82, 116, 21);
		contentPane.add(btnNewButton_6);
	}

}
