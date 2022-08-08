package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class ViewForm extends JFrame {

	private JPanel contentPane;
	public JTextField dniField;
	public JTextField nameField;
	public JTextField surnameField;
	public JTextField addressField;
	public JButton sendButton;
	public JButton cancelButton;

	/**
	 * Create the frame.
	 */
	public ViewForm() {
		setTitle("CLIENT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 247);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(34, 32, 217, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(10, 20, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(10, 43, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SURNAME");
		lblNewLabel_2.setBounds(10, 66, 73, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS");
		lblNewLabel_3.setBounds(10, 89, 45, 13);
		panel.add(lblNewLabel_3);
		
		dniField = new JTextField();
		dniField.setBounds(93, 17, 96, 19);
		panel.add(dniField);
		dniField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(93, 40, 96, 19);
		panel.add(nameField);
		nameField.setColumns(10);
		
		surnameField = new JTextField();
		surnameField.setBounds(93, 63, 96, 19);
		panel.add(surnameField);
		surnameField.setColumns(10);
		
		addressField = new JTextField();
		addressField.setBounds(93, 86, 96, 19);
		panel.add(addressField);
		addressField.setColumns(10);
		
		sendButton = new JButton("SEND");
		sendButton.setBounds(34, 170, 85, 21);
		contentPane.add(sendButton);
		
		cancelButton = new JButton("CANCEL");
		cancelButton.setBounds(166, 170, 85, 21);
		contentPane.add(cancelButton);
	}
}
