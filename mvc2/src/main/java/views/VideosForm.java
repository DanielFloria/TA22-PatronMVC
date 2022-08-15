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

public class VideosForm extends JFrame {

	private JPanel contentPane;
	public JTextField idField;
	public JTextField titleField;
	public JTextField cli_idField;
	public JButton cancelButton;
	public JTextPane textArea;
	public JButton btnSave; 
	public JTextField txtID;
	public JButton btnDelete;
	public JButton btnUpdate;
	

	/**
	 * Create the frame.
	 */
	public VideosForm() {
		setTitle("video library manager >> VIDEO FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 386);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(22, 0, 217, 165);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 29, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TITLE");
		lblNewLabel_1.setBounds(10, 64, 45, 13);
		panel.add(lblNewLabel_1);
		
		idField = new JTextField();
		idField.setBounds(93, 26, 96, 19);
		panel.add(idField);
		idField.setColumns(10);
		
		titleField = new JTextField();
		titleField.setBounds(93, 58, 96, 19);
		panel.add(titleField);
		titleField.setColumns(10);
		
		cli_idField = new JTextField();
		cli_idField.setBounds(93, 86, 96, 19);
		panel.add(cli_idField);
		cli_idField.setColumns(10);
		
		txtID = new JTextField();
		txtID.setBounds(93, 115, 96, 20);
		panel.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DIRECTOR");
		lblNewLabel_2.setBounds(10, 92, 73, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CLI_ID");
		lblNewLabel_3.setBounds(10, 122, 45, 13);
		panel.add(lblNewLabel_3);
		
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
		
		JButton btnNewButton = new JButton("CLIENT");
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBounds(290, 301, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}
