package MVC3.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ViewScientificForm extends JFrame {

	private JPanel contentPane;
	public JTextField dniField;
	public JTextField nombreField;
	public JButton btnSave;
	public JButton btnUpdate;
	public JButton btnDelete;
	public JButton btnCancel;
	public JButton btnProjects;
	public JButton btnAsignados;

	/**
	 * Create the frame.
	 */
	public ViewScientificForm() {
		setTitle("SCIENTIFIC FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 176);
		contentPane = new JPanel();
		contentPane.setToolTipText("Scientific form");
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 10, 177, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 20, 45, 13);
		panel.add(lblNewLabel);
		
		dniField = new JTextField();
		dniField.setBounds(36, 17, 96, 19);
		panel.add(dniField);
		dniField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME/SURNAME");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(10, 54, 96, 13);
		panel.add(lblNewLabel_1);
		
		nombreField = new JTextField();
		nombreField.setBounds(36, 77, 96, 19);
		panel.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Scientific data");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setBounds(36, 0, 96, 13);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(307, 10, 132, 106);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnSave = new JButton("REGISTRATION");
		btnSave.setForeground(Color.BLUE);
		btnSave.setBounds(10, 10, 112, 21);
		panel_1.add(btnSave);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setForeground(Color.DARK_GRAY);
		btnUpdate.setBounds(10, 41, 112, 21);
		panel_1.add(btnUpdate);
		
		btnDelete = new JButton("Eliminate");
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setBounds(10, 72, 112, 21);
		panel_1.add(btnDelete);
		
		JLabel lblNewLabel_3 = new JLabel("scientific data selector");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBounds(197, 10, 127, 13);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(267, 33, 29, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("Displayer");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBounds(518, 20, 116, 21);
		contentPane.add(btnNewButton_3);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setBounds(677, 20, 116, 21);
		contentPane.add(btnCancel);
		
		btnProjects = new JButton("Switch/Projects");
		btnProjects.setForeground(Color.DARK_GRAY);
		btnProjects.setBounds(518, 51, 116, 21);
		contentPane.add(btnProjects);
		
		btnAsignados = new JButton("Assignments");
		btnAsignados.setForeground(Color.DARK_GRAY);
		btnAsignados.setBounds(518, 82, 116, 21);
		contentPane.add(btnAsignados);
	}
}
