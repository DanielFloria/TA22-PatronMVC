package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import models.Credentials;

public class ModelProyectos {
	private String id;
	private String nombre;
	private int horas;
	private ResultSet proyectos;
	
	private Connection connection;
	private String localServer = Credentials.LOCAL_SERVER;
	private String localUser = Credentials.LOCAL_USER;
	private String localPassword = Credentials.LOCAL_PASSWORD;
	
	private String databaseName = Credentials.DATABASE_NAME;
	private String tableName;
	
	// Constructor
	public ModelProyectos() {
		
	}

	// Métodos
	public void createProyecto(String databaseName, String id, String nombre, int horas) {
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_insert = "insert into proyectos values ('" + id + "', '" + nombre + "', " + horas + ");";
			
			String query_use = "use " + databaseName + ";";
			Statement st_use_database = connection.createStatement();
			st_use_database.executeUpdate(query_use);
			
			Statement st_insert = connection.createStatement();
			st_insert.executeUpdate(query_insert);
			System.out.println("Row inserted successfully");
			
		} catch (SQLException e) {
			System.out.println("Error ocurred when inserting values");
			System.out.println(e.getMessage());
		}
	}
	
	public ResultSet getProyectos(String databaseName) {
		
		
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_use = "use " + databaseName + ";";
			Statement st_use_database = connection.createStatement();
			st_use_database.executeUpdate(query_use);
			
			String result = "select * from proyectos";
			Statement st_select = connection.createStatement();
			ResultSet rs_registers = st_select.executeQuery(result);
			return rs_registers;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("The data retrieve failed");
		}
		return null;
	}
	
	public void updateProyecto(String databaseName, String id, String nombre, int horas) {
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_update = "update proyectos set nombre='" + nombre + "', horas=" + horas + " where id=" + id + ";";
			
			String query_use = "use " + databaseName + ";";
			Statement st_use_database = connection.createStatement();
			st_use_database.executeUpdate(query_use);
			
			Statement st_update = connection.createStatement();
			st_update.executeUpdate(query_update);
			System.out.println("Row updated successfully");
			
		} catch (SQLException e) {
			System.out.println("Error ocurred when updating values");
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteProyecto(String databaseName, String id) {
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_delete = "delete from proyectos where id=" + id + ";";
			
			String query_use = "use " + databaseName + ";";
			Statement st_use_database = connection.createStatement();
			st_use_database.executeUpdate(query_use);
			
			Statement st_delete = connection.createStatement();
			st_delete.executeUpdate(query_delete);
			System.out.println("Row deleted successfully");
			
		} catch (SQLException e) {
			System.out.println("Error ocurred when deleting values");
			System.out.println(e.getMessage());
		}
	}
	
	public void openDatabaseConnection(String local_server, String local_user, String local_password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			connection = DriverManager.getConnection(local_server, local_user, local_password);
			System.out.println("You have connected to the server");
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Can not connect to database");
			System.out.println(e);
		}
	}
	
	public void closeDatabaseConnection() {
		try {
			connection.close();
			System.out.println("\nConnection closed");
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	// Getters & setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public String getLocalServer() {
		return localServer;
	}
	
	public void setLocalServer(String localServer) {
		this.localServer = localServer;
	}
	
	public String getLocalUser() {
		return localUser;
	}
	
	public void setLocalUser(String localUser) {
		this.localUser = localUser;
	}
	
	public String getLocalPassword() {
		return localPassword;
	}
	
	public void setLocalPassword(String localPassword) {
		this.localPassword = localPassword;
	}
	
	public String getDatabaseName() {
		return databaseName;
	}
	
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
