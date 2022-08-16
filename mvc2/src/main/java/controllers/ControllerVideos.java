package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.ModelVideos;
import views.ClientsForm;
import views.VideosForm;

public class ControllerVideos implements ActionListener{
	
	ModelVideos model = new ModelVideos();
	VideosForm videosForm = new VideosForm();
	ClientsForm clientsForm = new ClientsForm();
	
	public ControllerVideos(ModelVideos model, VideosForm videosForm, ClientsForm clientsForm) throws SQLException {
		this.model = model;
		this.videosForm = videosForm;
		this.clientsForm = clientsForm;
		videosForm.setVisible(true);
		videosForm.btnSave.addActionListener(this);
		videosForm.btnUpdate.addActionListener(this);
		videosForm.btnDelete.addActionListener(this);
		videosForm.btnClients.addActionListener(this);
		videosForm.cancelButton.addActionListener(this);
		imprimirVideos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (videosForm.btnSave == e.getSource()) {
			insertarVideos();
			borrarCampos();
			try {
				imprimirVideos();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (videosForm.cancelButton == e.getSource()) {
			borrarCampos();
		}else if (videosForm.btnDelete == e.getSource()) {
			borrarVideo();
			try {
				imprimirVideos();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (videosForm.btnUpdate == e.getSource()) {
			actualizarVideo();
			borrarCampos();
			try {
				imprimirVideos();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (videosForm.btnClients == e.getSource()) {
			clientsForm.setVisible(true);
			videosForm.setVisible(false);
			
		}
	}
	
	public void insertarVideos () {
		String title = videosForm.titleField.getText();
		String director = videosForm.directorField.getText();
		int cli_id = Integer.parseInt(videosForm.cliIdField.getText());
		model.createVideo(model.getDatabaseName(), title, director, cli_id);
	}
	
	public void actualizarVideo() {
		int id = Integer.parseInt(videosForm.idField.getText());
		String title = videosForm.titleField.getText();
		String director = videosForm.directorField.getText();
		int cli_id = Integer.parseInt(videosForm.cliIdField.getText());
		model.updateVideo(model.getDatabaseName(), id, title, director, cli_id);
	}
	
	public void borrarVideo() {
		int id = Integer.parseInt(videosForm.idField.getText());
		model.deleteVideo(model.getDatabaseName(), id);
		videosForm.idField.setText(null);
	}
	
	public void imprimirVideos() throws SQLException {
		ResultSet videos = model.getVideos(model.getDatabaseName());
		videosForm.textArea.setText(null);
		while (videos.next()) {
			videosForm.textArea.setText(videosForm.textArea.getText() + "ID: " + videos.getInt("id") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "Titulo: " + videos.getString("title") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "Director: " + videos.getString("director") + "\n");
			videosForm.textArea.setText(videosForm.textArea.getText() + "ID cliente: " + videos.getInt("cli_id") + "\n");
		}
	}
	
	public void borrarCampos() {
		videosForm.idField.setText(null);
		videosForm.titleField.setText(null);
		videosForm.directorField.setText(null);
		videosForm.cliIdField.setText(null);
	}
	
	
}
