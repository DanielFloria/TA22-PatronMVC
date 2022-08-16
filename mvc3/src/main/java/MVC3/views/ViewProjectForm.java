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
	public JTextField idField;
	public JTextField nombreField;
	public JTextField horasField;
	public JButton btnSave;
	public JButton btnUpdate;
	public JButton btnDelete;
	public JButton btnCancel;
	public JButton btnCientificos;
	public JButton btnAsignados;

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
		
		idField = new JTextField();
		idField.setEditable(false);
		idField.setBounds(111, 17, 96, 19);
		panel.add(idField);
		idField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PROJECT NAME");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(10, 54, 96, 13);
		panel.add(lblNewLabel_1);
		
		nombreField = new JTextField();
		nombreField.setBounds(111, 46, 96, 19);
		panel.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PROJECT HOURS");
		lblNewLabel_2.setBounds(10, 83, 96, 13);
		panel.add(lblNewLabel_2);
		
		horasField = new JTextField();
		horasField.setBounds(111, 75, 96, 19);
		panel.add(horasField);
		horasField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(342, 10, 132, 106);
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
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setBounds(654, 20, 116, 21);
		contentPane.add(btnCancel);
		
		btnCientificos = new JButton("Switch/Scientifics");
		btnCientificos.setForeground(Color.DARK_GRAY);
		btnCientificos.setBounds(518, 51, 116, 21);
		contentPane.add(btnCientificos);
		
		btnAsignados = new JButton("Assignments");
		btnAsignados.setForeground(Color.DARK_GRAY);
		btnAsignados.setBounds(518, 82, 116, 21);
		contentPane.add(btnAsignados);
	}

}
