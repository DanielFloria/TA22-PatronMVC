package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.ModelClients;
import views.ViewForm;

public class ControllerClients implements ActionListener{
	
	ModelClients model = new ModelClients();
	ViewForm viewForm = new ViewForm();
	
	public ControllerClients (ModelClients model,ViewForm viewForm) throws SQLException{
		this.model = model;
		this.viewForm = viewForm;
		viewForm.setVisible(true);
		viewForm.btnSave.addActionListener(this);
		viewForm.cancelButton.addActionListener(this);
		viewForm.btnDelete.addActionListener(this);
		viewForm.btnUpdate.addActionListener(this);
		imprimirClients();
	}
		
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (viewForm.btnSave == e.getSource()) {
			insertaClientes();
			borrarCampos();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (viewForm.cancelButton == e.getSource()) {
			borrarCampos();
		}else if (viewForm.btnDelete == e.getSource()) {
			borrarCliente();
			try {
				imprimirClients();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (viewForm.btnUpdate == e.getSource()) {
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
		viewForm.textArea.setText(null);
		while (clientes.next()) {
			viewForm.textArea.setText(viewForm.textArea.getText() + "ID: " + clientes.getInt("id") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "Nombre: " + clientes.getString("nombre") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "Apellido: " + clientes.getString("apellido") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "Direccion: " + clientes.getString("direccion") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "DNI: " + clientes.getInt("dni") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "Date: " + clientes.getDate("fecha") + "\n");
		}
	}
	
	public void insertaClientes() {
		String name = viewForm.nameField.getText();
		String surname = viewForm.surnameField.getText();
		String address = viewForm.addressField.getText();
		int dni = Integer.parseInt(viewForm.dniField.getText());
		model.createClient(model.getDatabaseName(), name, surname, address, dni);
	}
	
	public void actualizarCliente() {
		String name = viewForm.nameField.getText();
		String surname = viewForm.surnameField.getText();
		String address = viewForm.addressField.getText();
		int dni = Integer.parseInt(viewForm.dniField.getText());
		int id = Integer.parseInt(viewForm.txtID.getText());
		model.updateClient(model.getDatabaseName(), id, name, surname, address, dni);
		
	}
	
	public void borrarCliente() {
		int id = Integer.parseInt(viewForm.txtID.getText());
		model.deleteClient(model.getDatabaseName(), id);
		viewForm.txtID.setText(null);
	}
	
	public void borrarCampos() {
		viewForm.nameField.setText(null);
		viewForm.surnameField.setText(null);
		viewForm.addressField.setText(null);
		viewForm.dniField.setText(null);
		viewForm.txtID.setText(null);
	}
	
}
