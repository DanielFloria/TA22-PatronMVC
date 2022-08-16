package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.ModelClients;
import views.VideosForm;

public class ControllerClients implements ActionListener{
	
	ModelClients model = new ModelClients();
	VideosForm videosForm = new VideosForm();
	
	public ControllerClients (ModelClients model,VideosForm videosForm) throws SQLException{
		this.model = model;
		this.videosForm = videosForm;
		videosForm.setVisible(true);
		videosForm.btnSave.addActionListener(this);
		videosForm.cancelButton.addActionListener(this);
		videosForm.btnDelete.addActionListener(this);
		videosForm.btnUpdate.addActionListener(this);
		imprimirClients();
	}
		
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (videosForm.btnSave == e.getSource()) {
			insertaClientes();
			borrarCampos();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (videosForm.cancelButton == e.getSource()) {
			borrarCampos();
		}else if (videosForm.btnDelete == e.getSource()) {
			borrarCliente();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (videosForm.btnUpdate == e.getSource()) {
			actualizarCliente();
			borrarCampos();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void imprimirClients() throws SQLException {
		ResultSet clientes = model.getClients(model.getDatabaseName());
		videosForm.textArea.setText(null);
		while (clientes.next()) {
			videosForm.textArea.setText(videosForm.textArea.getText() + "ID: " + clientes.getInt("id") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "Nombre: " + clientes.getString("nombre") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "Apellido: " + clientes.getString("apellido") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "Direccion: " + clientes.getString("direccion") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "DNI: " + clientes.getInt("dni") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "Date: " + clientes.getDate("fecha") + "\n");
		}
	}
	
	public void insertaClientes() {
		String name = videosForm.nameField.getText();
		String surname = videosForm.surnameField.getText();
		String address = videosForm.addressField.getText();
		int dni = Integer.parseInt(videosForm.dniField.getText());
		model.createClient(model.getDatabaseName(), name, surname, address, dni);
	}
	
	public void actualizarCliente() {
		String name = videosForm.nameField.getText();
		String surname = videosForm.surnameField.getText();
		String address = videosForm.addressField.getText();
		int dni = Integer.parseInt(videosForm.dniField.getText());
		int id = Integer.parseInt(videosForm.txtID.getText());
		model.updateClient(model.getDatabaseName(), id, name, surname, address, dni);
		
	}
	
	public void borrarCliente() {
		int id = Integer.parseInt(videosForm.txtID.getText());
		model.deleteClient(model.getDatabaseName(), id);
		videosForm.txtID.setText(null);
	}
	
	public void borrarCampos() {
		videosForm.nameField.setText(null);
		videosForm.surnameField.setText(null);
		videosForm.addressField.setText(null);
		videosForm.dniField.setText(null);
		videosForm.txtID.setText(null);
	}
	
}
