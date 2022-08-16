package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelVideos;
import views.VideosForm;

public class ControllerVideos implements ActionListener{
	
	ModelVideos model = new ModelVideos();
	VideosForm videosForm = new VideosForm();
	
	public ControllerVideos(ModelVideos model, VideosForm videosForm) {
		this.model = model;
		this.videosForm = videosForm;
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
