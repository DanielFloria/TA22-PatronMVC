package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelClients;
import views.ViewClientList;
import views.ViewForm;

public class ControllerClients implements ActionListener{
	
	ModelClients model = new ModelClients();
	ViewForm viewForm = new ViewForm();
	ViewClientList listClient = new ViewClientList();
	
	public ControllerClients (ModelClients model,ViewForm viewForm, ViewClientList listClient){
		this.model = model;
		this.viewForm = viewForm;
		this.listClient = listClient;
		viewForm.sendButton.addActionListener(this);
		viewForm.cancelButton.addActionListener(this);
	}
	
	public void iniciarVista() {
		viewForm.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (viewForm.sendButton == e.getSource()) {
			String name = viewForm.nameField.getText();
			String surname = viewForm.surnameField.getText();
			String address = viewForm.addressField.getText();
			int dni = Integer.parseInt(viewForm.dniField.getText());
			model.createClient(model.database, dni, name, surname, address);
		}else if (viewForm.cancelButton == e.getSource()) {
			viewForm.nameField.setText(null);
			viewForm.surnameField.setText(null);
			viewForm.addressField.setText(null);
			viewForm.dniField.setText(null);
		}
	}
	
}
