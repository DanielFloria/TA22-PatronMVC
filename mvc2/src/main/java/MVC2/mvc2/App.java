package MVC2.mvc2;

import java.awt.EventQueue;
import java.sql.SQLException;

import controllers.ControllerClients;
import controllers.ControllerVideos;
import models.ModelClients;
import models.ModelVideos;
import views.ClientsForm;
import views.VideosForm;

public class App {

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ClientsForm vistaClientes = new ClientsForm();
		ModelClients modelo = new ModelClients();
		VideosForm vistaVideos = new VideosForm();
		
		
		ControllerClients controllerClients = new ControllerClients(modelo, vistaClientes, vistaVideos);
		
		
	}

}
