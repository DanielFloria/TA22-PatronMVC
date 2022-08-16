package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import MVC3.views.ViewAssignmentForm;
import MVC3.views.ViewProjectForm;
import MVC3.views.ViewScientificForm;
import models.ModelAsignadoA;
import models.ModelProyectos;

public class ControllerAsignadoA implements ActionListener{
	
	ModelAsignadoA modelAsignado = new ModelAsignadoA();
	ViewAssignmentForm asignadosForm = new ViewAssignmentForm();
	ViewScientificForm cientificosForm = new ViewScientificForm();
	ViewProjectForm proyectosForm = new ViewProjectForm();
	
	public ControllerAsignadoA(ModelAsignadoA modelAsignado, ViewAssignmentForm asignadosForm) {
		this.modelAsignado = modelAsignado;
		this.asignadosForm = asignadosForm;
		asignadosForm.setVisible(true);
		asignadosForm.btnSave.addActionListener(this);
		asignadosForm.btnCancel.addActionListener(this);
		asignadosForm.btnProyectos.addActionListener(this);
		asignadosForm.btnCientificos.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (asignadosForm.btnSave ==e.getSource()) {
			insertarRelacion();
			borrarCampos();
		}else if (asignadosForm.btnCancel == e.getSource()) {
			borrarCampos();
		}else if (asignadosForm.btnCientificos == e.getSource()) {
			asignadosForm.setVisible(false);
			cientificosForm.setVisible(true);
		}
	}
	
	public void insertarRelacion() {
		String id = asignadosForm.idField.getText();
		String dni = asignadosForm.dniField.getText();
		modelAsignado.createAsignadoA(modelAsignado.getDatabaseName(), dni, id);
	}
	
	public void actualizarRelacion() {
		
	}
	
	public void borrarRelacion() {
		String id = asignadosForm.idField.getText();
		String dni = asignadosForm.dniField.getText();
		modelAsignado.deleteAsignadoA(modelAsignado.getDatabaseName(), dni, id);
		
	}
	
	public void imprimirRelacions() throws SQLException {
		ResultSet asignados = modelAsignado.getAsignadoA(modelAsignado.getDatabaseName());
		String datos = null;
//		asignadosForm.textArea.setText(null);
		while (asignados.next()) {
			datos = datos + "ID: " + asignados.getString("proyecto") + "\n";
			datos = datos + "DNI: " + asignados.getString("cietifico") + "\n";
//			asignadosForm.textArea.setText(asignadosForm.textArea.getText() + "ID: " + asignados.getString("proyecto") + "\n");
//			asignadosForm.textArea.setText(asignadosForm.textArea.getText() + "DNI: " + asignados.getString("cietifico") + "\n");
		}
	}
	
	public void borrarCampos() {
		asignadosForm.idField.setText(null);
		asignadosForm.dniField.setText(null);
	}
	
	public void vistaProyectos () {
		asignadosForm.setVisible(false);
		ModelProyectos modelProyectos = new ModelProyectos();
		ViewProjectForm proyectosForm = new ViewProjectForm();
		ControllerProyectos controllerProyectos = new ControllerProyectos(modelProyectos,proyectosForm);
	}
	
	
}
