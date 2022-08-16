package MVC3.mvc3;

import java.awt.EventQueue;

import MVC3.views.ViewScientificForm;
import controllers.ControllerCientificos;
import models.ModelCientificos;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ModelCientificos modelCientificos = new ModelCientificos();
		ViewScientificForm vistaCientificos = new ViewScientificForm();
		
		ControllerCientificos controllerCientificos = new ControllerCientificos(modelCientificos, vistaCientificos);
	}
}
