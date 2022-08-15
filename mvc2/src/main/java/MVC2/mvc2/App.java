package MVC2.mvc2;

import java.awt.EventQueue;
import java.sql.SQLException;

import controllers.ControllerClients;
import models.ModelClients;
import views.ClientsForm;

public class App {

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ClientsForm vistaClientes = new ClientsForm();
		ModelClients modelo = new ModelClients();
		ControllerClients controller = new ControllerClients(modelo, vistaClientes);
	}

}
