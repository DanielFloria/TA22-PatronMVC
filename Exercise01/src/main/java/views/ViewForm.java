package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import java.awt.Color;

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
		setTitle("CLIENT FORM MANAGER v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 203);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(22, 20, 217, 128);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(294, 96, 80, 11);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Client register:");
		lblNewLabel_4.setBounds(293, 82, 81, 17);
		contentPane.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(413, 20, 101, 97);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		sendButton = new JButton("NEW");
		sendButton.setBounds(10, 10, 85, 21);
		panel_1.add(sendButton);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBounds(10, 36, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setBounds(10, 63, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DISPLAY");
		btnNewButton_2.setBounds(284, 20, 85, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setForeground(Color.RED);
		
		JButton btnNewButton_3 = new JButton("SAVE");
		btnNewButton_3.setBounds(284, 51, 85, 21);
		contentPane.add(btnNewButton_3);
		
		cancelButton = new JButton("CANCEL");
		cancelButton.setBounds(423, 127, 85, 21);
		contentPane.add(cancelButton);
	}
}
