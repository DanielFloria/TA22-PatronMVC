package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

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
		String title = viewForm.titulo.getText();
		String director = viewForm.director.getText();
		int cli_id = Integer.parseInt(viewForm.cliId.getText());
		model.createVideo(model.getDatabaseName(), title, director, cli_id);
	}
	
	public void actualizarVideos() {
		
	}
	
	public void borrarVideos() {
		int id = Integer.parseInt(viewForm.txtID.getText());
		model.deleteVideo(model.getDatabaseName(), id);
		viewForm.txtID.setText(null);
	}
	
	public void imprimirVideos() {
		ResultSet videos = model.getVideos(model.getDatabaseName());
		viewForm.textArea.setText(null);
		while (videos.next()) {
			viewForm.textArea.setText(viewForm.textArea.getText() + "ID: " + videos.getInt("id") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "Titulo: " + videos.getString("title") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "Director: " + videos.getString("director") + "\n");
			viewForm.textArea.setText(viewForm.textArea.getText() + "ID cliente: " + videos.getInt("cli_id") + "\n");
		}
	}
	
}
