package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ViewForm extends JFrame {

	private JPanel contentPane;
	public JTextField dniField;
	public JTextField nameField;
	public JTextField surnameField;
	public JTextField addressField;
	public JButton cancelButton;
	public JTextPane textArea;
	public JButton btnSave; 
	public JTextField txtID;
	public JButton btnDelete;
	public JButton btnUpdate;
	

	/**
	 * Create the frame.
	 */
	public ViewForm() {
		setTitle("CLIENT FORM MANAGER v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 386);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(22, 20, 217, 144);
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
		lblNewLabel_3.setBounds(10, 89, 57, 13);
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
		
		JLabel lblNewLabel_5 = new JLabel("ID");
		lblNewLabel_5.setBounds(10, 119, 46, 14);
		panel.add(lblNewLabel_5);
		
		txtID = new JTextField();
		txtID.setBounds(93, 116, 96, 20);
		panel.add(txtID);
		txtID.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(274, 20, 101, 97);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(10, 36, 85, 21);
		panel_1.add(btnUpdate);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(10, 63, 85, 21);
		panel_1.add(btnDelete);
		
		btnSave = new JButton("SAVE");
		btnSave.setBounds(10, 11, 85, 21);
		panel_1.add(btnSave);
		
		cancelButton = new JButton("CANCEL");
		cancelButton.setBounds(284, 127, 85, 21);
		contentPane.add(cancelButton);
		
		textArea = new JTextPane();
		textArea.setBounds(22, 175, 217, 147);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(22, 175, 217, 147);
		contentPane.add(scrollPane);
		
	}
}
