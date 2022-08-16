package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.ModelClients;
import models.ModelVideos;
import views.ClientsForm;
import views.VideosForm;

public class ControllerClients implements ActionListener{
	
	ModelClients model = new ModelClients();
	ClientsForm clientsForm = new ClientsForm();
	VideosForm videosForm = new VideosForm();
	
	public ControllerClients (ModelClients model,ClientsForm clientsForm, VideosForm videosForm) throws SQLException{
		this.model = model;
		this.clientsForm = clientsForm;
		this.videosForm = videosForm;
		clientsForm.setVisible(true);
		clientsForm.btnSave.addActionListener(this);
		clientsForm.cancelButton.addActionListener(this);
		clientsForm.btnDelete.addActionListener(this);
		clientsForm.btnUpdate.addActionListener(this);
		clientsForm.btnVideos.addActionListener(this);
		imprimirClients();
	}
		
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (clientsForm.btnSave == e.getSource()) {
			insertaClientes();
			borrarCampos();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (clientsForm.cancelButton == e.getSource()) {
			borrarCampos();
		}else if (clientsForm.btnDelete == e.getSource()) {
			borrarCliente();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (clientsForm.btnUpdate == e.getSource()) {
			actualizarCliente();
			borrarCampos();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (clientsForm.btnVideos == e.getSource()) {
			try {
				cambiarVista();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		}
	}
	
	public void imprimirClients() throws SQLException {
		ResultSet clientes = model.getClients(model.getDatabaseName());
		clientsForm.textArea.setText(null);
		while (clientes.next()) {
			clientsForm.textArea.setText(clientsForm.textArea.getText() + "ID: " + clientes.getInt("id") + "\n");
			clientsForm.textArea.setText(clientsForm.textArea.getText() + "Nombre: " + clientes.getString("nombre") + "\n");
			clientsForm.textArea.setText(clientsForm.textArea.getText() + "Apellido: " + clientes.getString("apellido") + "\n");
			clientsForm.textArea.setText(clientsForm.textArea.getText() + "Direccion: " + clientes.getString("direccion") + "\n");
			clientsForm.textArea.setText(clientsForm.textArea.getText() + "DNI: " + clientes.getInt("dni") + "\n");
			clientsForm.textArea.setText(clientsForm.textArea.getText() + "Date: " + clientes.getDate("fecha") + "\n");
		}
	}
	
	public void insertaClientes() {
		String name = clientsForm.nameField.getText();
		String surname = clientsForm.surnameField.getText();
		String address = clientsForm.addressField.getText();
		int dni = Integer.parseInt(clientsForm.dniField.getText());
		model.createClient(model.getDatabaseName(), name, surname, address, dni);
	}
	
	public void actualizarCliente() {
		String name = clientsForm.nameField.getText();
		String surname = clientsForm.surnameField.getText();
		String address = clientsForm.addressField.getText();
		int dni = Integer.parseInt(clientsForm.dniField.getText());
		int id = Integer.parseInt(clientsForm.txtID.getText());
		model.updateClient(model.getDatabaseName(), id, name, surname, address, dni);
		
	}
	
	public void borrarCliente() {
		int id = Integer.parseInt(clientsForm.txtID.getText());
		model.deleteClient(model.getDatabaseName(), id);
		clientsForm.txtID.setText(null);
	}
	
	public void borrarCampos() {
		clientsForm.nameField.setText(null);
		clientsForm.surnameField.setText(null);
		clientsForm.addressField.setText(null);
		clientsForm.dniField.setText(null);
		clientsForm.txtID.setText(null);
	}
	

	public void cambiarVista() throws SQLException {
		clientsForm.setVisible(false);
		ModelVideos modeloVideos = new ModelVideos();
		ControllerVideos controllerVideos = new ControllerVideos(modeloVideos, videosForm, clientsForm);
	}
	
}
