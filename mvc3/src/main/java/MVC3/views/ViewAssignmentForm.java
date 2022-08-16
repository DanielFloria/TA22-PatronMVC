package MVC3.views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ViewAssignmentForm extends JFrame {

	private JPanel contentPane;
	public JTextField idField;
	public JTextField dniField;
	public JButton btnSave;
	public JButton btnProyectos;
	public JButton btnCientificos;
	public JButton btnCancel;

	/**
	 * Create the frame.
	 */
	public ViewAssignmentForm() {
		setTitle("ASSIGNMENT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 212);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 10, 639, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID/NAME");
		lblNewLabel.setBounds(10, 29, 65, 16);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(226, 48, 29, 21);
		panel.add(comboBox);
		
		idField = new JTextField();
		idField.setBounds(67, 28, 188, 19);
		panel.add(idField);
		idField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Project candidate id");
		lblNewLabel_1.setBounds(67, 10, 153, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Scientific candidate id");
		lblNewLabel_2.setBounds(366, 10, 144, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID/NAME");
		lblNewLabel_3.setBounds(287, 31, 65, 13);
		panel.add(lblNewLabel_3);
		
		dniField = new JTextField();
		dniField.setBounds(365, 28, 197, 19);
		panel.add(dniField);
		dniField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(533, 48, 29, 21);
		panel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("ACCEPT");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(67, 124, 188, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ACCEPT");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(366, 124, 197, 21);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(659, 10, 205, 155);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnSave = new JButton("DO ASSIGNMENT");
		btnSave.setForeground(Color.DARK_GRAY);
		btnSave.setBounds(10, 30, 185, 21);
		panel_1.add(btnSave);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setBounds(10, 124, 185, 21);
		panel_1.add(btnCancel);
		
		btnCientificos = new JButton("Switch/Scientifics");
		btnCientificos.setBounds(10, 61, 185, 21);
		panel_1.add(btnCientificos);
		
		btnProyectos = new JButton("Switch/Projects");
		btnProyectos.setBounds(10, 93, 185, 21);
		panel_1.add(btnProyectos);
	}

}
