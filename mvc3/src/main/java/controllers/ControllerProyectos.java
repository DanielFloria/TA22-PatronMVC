package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Action;
import javax.swing.JOptionPane;

import models.ModelAsignadoA;
import models.ModelCientificos;
import models.ModelProyectos;
import views.ViewAssignmentForm;
import views.ViewProjectForm;
import views.ViewScientificForm;

public class ControllerProyectos implements ActionListener{

	ModelProyectos modelProyectos = new ModelProyectos();
	ViewProjectForm proyectosForm = new ViewProjectForm();
	
	public ControllerProyectos(ModelProyectos modelProyectos, ViewProjectForm proyectosForm) {
		this.modelProyectos = modelProyectos;
		this.proyectosForm = proyectosForm;
		proyectosForm.setVisible(true);
		proyectosForm.btnSave.addActionListener(this);
		proyectosForm.btnCancel.addActionListener(this);
		proyectosForm.btnUpdate.addActionListener(this);
		proyectosForm.btnDelete.addActionListener(this);
		proyectosForm.btnCientificos.addActionListener(this);
		proyectosForm.btnAsignados.addActionListener(this);
		proyectosForm.btnDisplay.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (proyectosForm.btnSave == e.getSource()) {
			insertarProyecto();
			borrarCampos();
		}else if (proyectosForm.btnUpdate == e.getSource()) {
			actualizarProyecto();
			borrarCampos();
		}else if (proyectosForm.btnDelete == e.getSource()) {
			borrarProyecto();
			borrarCampos();
		}else if (proyectosForm.btnCancel == e.getSource()) {
			borrarCampos();
		}else if (proyectosForm.btnCientificos == e.getSource()) {
			vistaCientificos();
		}else if (proyectosForm.btnAsignados == e.getSource()) {
			try {
				vistaAsignados();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (proyectosForm.btnDisplay == e.getSource()) {
			try {
				imprimirProyectos();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void insertarProyecto() {
		String id = proyectosForm.idField.getText();
		String nombre = proyectosForm.idField.getText();
		int horas = Integer.parseInt(proyectosForm.idField.getText());
		modelProyectos.createProyecto(modelProyectos.getDatabaseName(),id, nombre, horas);
	}
	
	public void actualizarProyecto() {
		String id = proyectosForm.idField.getText();
		String nombre = proyectosForm.nombreField.getText();
		int horas = Integer.parseInt(proyectosForm.horasField.getText());
		modelProyectos.updateProyecto(modelProyectos.getDatabaseName(),id, nombre, horas);
	}
	
	public void borrarProyecto() {
		String id = proyectosForm.idField.getText();
		modelProyectos.deleteProyecto(modelProyectos.getDatabaseName(), id);
		proyectosForm.idField.setText(null);
	}
	
	public void imprimirProyectos() throws SQLException {
		ResultSet proyectos = modelProyectos.getProyectos(modelProyectos.getDatabaseName());
		String datos = "";
//		proyectosForm.textArea.setText(null);
		while (proyectos.next()) {
			datos = datos + "ID: " + proyectos.getString("id") + "\n";
			datos = datos + "Nombre: " + proyectos.getString("nombre") + "\n";
			datos = datos + "Horas: " + proyectos.getInt("horas") + "\n\n";
//			proyectosForm.textArea.setText(proyectosForm.textArea.getText() + "ID: " + proyectos.getString("id") + "\n");
//			proyectosForm.textArea.setText(proyectosForm.textArea.getText() + "Nombre: " + proyectos.getString("nombre") + "\n");
//			proyectosForm.textArea.setText(proyectosForm.textArea.getText() + "Horas: " + proyectos.getInt("horas") + "\n");
		}
		JOptionPane.showMessageDialog(null, datos);
	}
	
	public void borrarCampos() {
		proyectosForm.idField.setText(null);
		proyectosForm.nombreField.setText(null);
		proyectosForm.horasField.setText(null);
	}
	

	public void vistaAsignados() throws SQLException {
		proyectosForm.setVisible(false);
		ModelAsignadoA modelAsignado = new ModelAsignadoA();
		ViewAssignmentForm asignadosForm = new ViewAssignmentForm();
		ControllerAsignadoA controllerAsignados = new ControllerAsignadoA(modelAsignado,asignadosForm);
	}
	
	public void vistaCientificos() {
		proyectosForm.setVisible(false);
		ModelCientificos modelCientificos = new ModelCientificos();
		ViewScientificForm vistaCientificos = new ViewScientificForm();
		
		ControllerCientificos controllerCientificos = new ControllerCientificos(modelCientificos, vistaCientificos);
	}
}
