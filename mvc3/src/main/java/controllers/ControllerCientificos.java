/**
 * 
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import MVC3.views.ViewAssignmentForm;
import MVC3.views.ViewProjectForm;
import MVC3.views.ViewScientificForm;
import models.ModelAsignadoA;
import models.ModelCientificos;
import models.ModelProyectos;

public class ControllerCientificos implements ActionListener{
	
	ModelCientificos model = new ModelCientificos();
	ViewScientificForm cientificosForm = new ViewScientificForm();
	
	
	public ControllerCientificos(ModelCientificos model, ViewScientificForm cientificosForm) {
		this.model = model;
		this.cientificosForm = cientificosForm;
		cientificosForm.setVisible(true);
		cientificosForm.btnSave.addActionListener(this);
		cientificosForm.btnCancel.addActionListener(this);
		cientificosForm.btnUpdate.addActionListener(this);
		cientificosForm.btnDelete.addActionListener(this);
		cientificosForm.btnProjects.addActionListener(this);
		cientificosForm.btnAsignados.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (cientificosForm.btnSave == e.getSource()) {
			insertarCientifico();
			borrarCampos();
		}else if (cientificosForm.btnUpdate == e.getSource()) {
			actualizarCientifico();
			borrarCampos();
		}else if (cientificosForm.btnDelete == e.getSource()) {
			borrarCientifico();
			borrarCampos();
		}else if (cientificosForm.btnCancel == e.getSource()) {
			borrarCampos();
		}else if (cientificosForm.btnProjects == e.getSource()) {
			vistaProyectos();
		}else if (cientificosForm.btnAsignados == e.getSource()) {
			vistaAsignados();
		}
	}
	
	public void insertarCientifico() {
		String dni = cientificosForm.dniField.getText();
		String nombre = cientificosForm.nombreField.getText();
		model.createCientifico(model.getDatabaseName(), dni, nombre);
	}
	
	public void actualizarCientifico() {
		String dni = cientificosForm.dniField.getText();
		String nombre = cientificosForm.nombreField.getText();
		model.updateCientifico(model.getDatabaseName(), dni, nombre);
	}
	
	public void borrarCientifico() {
		String dni = cientificosForm.dniField.getText();
		model.deleteCientifico(model.getDatabaseName(), dni);
		cientificosForm.dniField.setText(null);
	}
	
	public void imprimirCientificos() throws SQLException {
		ResultSet cientificos = model.getCientificos(model.getDatabaseName());
		String datos = null;
//		cientificosForm.textArea.setText(null);
		while (cientificos.next()) {
			datos = datos + "DNI: " + cientificos.getString("dni") + "\n";
			datos = datos + "Nombre: " + cientificos.getString("nom_apels") + "\n";
//			cientificosForm.textArea.setText(cientificosForm.textArea.getText() + "DNI: " + cientificos.getString("dni") + "\n");
//			cientificosForm.textArea.setText(cientificosForm.textArea.getText() + "Nombre: " + cientificos.getString("nom_apels") + "\n");
		}
	}
	
	public void borrarCampos() {
		cientificosForm.dniField.setText(null);
		cientificosForm.nombreField.setText(null);
	}
	
	public void vistaProyectos () {
		cientificosForm.setVisible(false);
		ModelProyectos modelProyectos = new ModelProyectos();
		ViewProjectForm proyectosForm = new ViewProjectForm();
		ControllerProyectos controllerProyectos = new ControllerProyectos(modelProyectos,proyectosForm);
	}
	
	public void vistaAsignados() {
		cientificosForm.setVisible(false);
		ModelAsignadoA modelAsignado = new ModelAsignadoA();
		ViewAssignmentForm asignadosForm = new ViewAssignmentForm();
		ControllerAsignadoA controllerAsignados = new ControllerAsignadoA(modelAsignado,asignadosForm);
	}

	
}
