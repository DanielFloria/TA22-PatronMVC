package AppMain;

import java.awt.EventQueue;
import java.sql.SQLException;

import controllers.ControllerClients;
import models.ModelClients;
import views.ViewForm;

public class App {

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ViewForm vista = new ViewForm();
		ModelClients modelo = new ModelClients();
		ControllerClients controller = new ControllerClients(modelo, vista);
	}

}
