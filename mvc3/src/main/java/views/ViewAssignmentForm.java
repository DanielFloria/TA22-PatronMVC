package views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAssignmentForm extends JFrame {

	private JPanel contentPane;
	public JButton btnSave;
	public JButton btnProyectos;
	public JButton btnCientificos;
	public JButton btnDisplay;
	public JComboBox comboBoxID;
	public JComboBox comboBoxDNI;
	public JButton btnDelete;

	/**
	 * Create the frame.
	 */
	public ViewAssignmentForm() {
		setTitle("ASSIGNMENT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 230);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 10, 639, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID/NAME");
		lblNewLabel.setBounds(10, 50, 65, 16);
		panel.add(lblNewLabel);
		
		comboBoxID = new JComboBox();
		comboBoxID.setBounds(67, 48, 188, 21);
		panel.add(comboBoxID);
		
		JLabel lblNewLabel_1 = new JLabel("Project candidate id");
		lblNewLabel_1.setBounds(68, 26, 153, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Scientific candidate id");
		lblNewLabel_2.setBounds(366, 26, 144, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID/NAME");
		lblNewLabel_3.setBounds(289, 52, 65, 13);
		panel.add(lblNewLabel_3);
		
		comboBoxDNI = new JComboBox();
		comboBoxDNI.setBounds(366, 48, 196, 21);
		panel.add(comboBoxDNI);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(659, 10, 205, 170);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnSave = new JButton("DO ASSIGNMENT");
		btnSave.setForeground(Color.DARK_GRAY);
		btnSave.setBounds(10, 41, 185, 21);
		panel_1.add(btnSave);
		
		btnCientificos = new JButton("Switch/Scientifics");
		btnCientificos.setBounds(10, 73, 185, 21);
		panel_1.add(btnCientificos);
		
		btnProyectos = new JButton("Switch/Projects");
		btnProyectos.setBounds(10, 103, 185, 21);
		panel_1.add(btnProyectos);
		
		btnDisplay = new JButton("Displayer");
		btnDisplay.setForeground(Color.RED);
		btnDisplay.setBounds(10, 11, 185, 23);
		panel_1.add(btnDisplay);
		
		btnDelete = new JButton("Eliminate");
		btnDelete.setBounds(10, 135, 185, 23);
		panel_1.add(btnDelete);
	}
}
