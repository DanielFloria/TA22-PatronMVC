package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelVideos;
import views.ViewForm;

public class ControllerVideos implements ActionListener{
	
	ModelVideos model = new ModelVideos();
	ViewForm viewForm = new ViewForm();
	
	public ControllerVideos(ModelVideos model, ViewForm viewForm) {
		this.model = model;
		this.viewForm = viewForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void insertarVideos () {
		
	}
	
	public void actualizarVideos() {
		
	}
	
	public void borrarVideos() {
		
	}
	
	public void imprimirVideos() {
		
	}
	
}
