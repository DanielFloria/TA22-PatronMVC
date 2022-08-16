package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.ModelAsignadoA;
import models.ModelCientificos;
import models.ModelProyectos;
import views.ViewAssignmentForm;
import views.ViewProjectForm;
import views.ViewScientificForm;

public class ControllerAsignadoA implements ActionListener{
	
	ModelAsignadoA modelAsignado = new ModelAsignadoA();
	ModelProyectos modelProyectos = new ModelProyectos();
	ModelCientificos modelCientificos = new ModelCientificos();
	ViewAssignmentForm asignadosForm = new ViewAssignmentForm();
	
	public ControllerAsignadoA(ModelAsignadoA modelAsignado, ViewAssignmentForm asignadosForm) throws SQLException {
		this.modelAsignado = modelAsignado;
		this.asignadosForm = asignadosForm;
		asignadosForm.setVisible(true);
		asignadosForm.btnSave.addActionListener(this);
		asignadosForm.btnProyectos.addActionListener(this);
		asignadosForm.btnCientificos.addActionListener(this);
		asignadosForm.btnDisplay.addActionListener(this);
		asignadosForm.btnDelete.addActionListener(this);
		comboBoxID();
		comboBoxDNI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (asignadosForm.btnSave ==e.getSource()) {
			insertarRelacion();
		}else if (asignadosForm.btnCientificos == e.getSource()) {
			vistaCientificos();
		}else if (asignadosForm.btnProyectos == e.getSource()) {
			vistaProyectos();
		}else if (asignadosForm.btnDisplay == e.getSource()) {
			try {
				imprimirRelacions();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (asignadosForm.btnDelete == e.getSource()) {
			borrarRelacion();
		}
	}
	
	public void insertarRelacion() {
		String id = (String) asignadosForm.comboBoxID.getSelectedItem();
		String dni = "" + asignadosForm.comboBoxDNI.getSelectedItem();
		modelAsignado.createAsignadoA(modelAsignado.getDatabaseName(), dni, id);
	}
	
	public void borrarRelacion() {
		String id = (String) asignadosForm.comboBoxID.getSelectedItem();
		String dni = "" + asignadosForm.comboBoxDNI.getSelectedItem();
		modelAsignado.deleteAsignadoA(modelAsignado.getDatabaseName(), dni, id);
		
	}
	
	public void imprimirRelacions() throws SQLException {
		ResultSet asignados = modelAsignado.getAsignadoA(modelAsignado.getDatabaseName());
		String datos = "";
//		asignadosForm.textArea.setText(null);
		while (asignados.next()) {
			datos = datos + "ID proyecto: " + asignados.getString("proyecto") + "\n";
			datos = datos + "DNI cientifico: " + asignados.getString("cientifico") + "\n\n";
//			asignadosForm.textArea.setText(asignadosForm.textArea.getText() + "ID: " + asignados.getString("proyecto") + "\n");
//			asignadosForm.textArea.setText(asignadosForm.textArea.getText() + "DNI: " + asignados.getString("cietifico") + "\n");
		}
		JOptionPane.showMessageDialog(null, datos);
	}
	
	public void vistaProyectos () {
		asignadosForm.setVisible(false);
		ModelProyectos modelProyectos = new ModelProyectos();
		ViewProjectForm proyectosForm = new ViewProjectForm();
		ControllerProyectos controllerProyectos = new ControllerProyectos(modelProyectos,proyectosForm);
	}
	
	public void vistaCientificos() {
		asignadosForm.setVisible(false);
		ModelCientificos modelCientificos = new ModelCientificos();
		ViewScientificForm vistaCientificos = new ViewScientificForm();
		
		ControllerCientificos controllerCientificos = new ControllerCientificos(modelCientificos, vistaCientificos);
	}
	
	public void comboBoxID() throws SQLException {
		ResultSet proyectos = modelProyectos.getProyectos(modelProyectos.getDatabaseName());
		
		while (proyectos.next()) {
			ModelProyectos proyecto = new ModelProyectos();
			proyecto.setId(proyectos.getString("id"));
			proyecto.setNombre(proyectos.getString("nombre"));
			proyecto.setHoras(proyectos.getInt("horas"));
			
			asignadosForm.comboBoxID.addItem(proyecto.getId());
		}
	}
	
	public void comboBoxDNI() throws NumberFormatException, SQLException {
		ResultSet cientificos = modelCientificos.getCientificos(modelCientificos.getDatabaseName());
		while (cientificos.next()) {
			ModelCientificos cientifico = new ModelCientificos();
			cientifico.setDni(Integer.parseInt(cientificos.getString("dni")));
			cientifico.setNomApels(cientificos.getString("nom_apels"));
			
			asignadosForm.comboBoxDNI.addItem(cientifico.getDni());
		}
	}
	
	
}
