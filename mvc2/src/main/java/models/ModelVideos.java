package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelVideos {
	private int id;
	private String title;
	private String director;
	private int cli_id;
	private ResultSet videos;
	
	private Connection connection;
	private String localServer = Credentials.LOCAL_SERVER;
	private String localUser = Credentials.LOCAL_USER;
	private String localPassword = Credentials.LOCAL_PASSWORD;
	
	private String databaseName = Credentials.DATABASE_NAME;
	private String tableName;
	
	// Constructor
	public ModelVideos() {
		
	}

	// Métodos
	public void createVideo(String databaseName, String title, String director, int cli_id) {
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_insert = "insert into videos (title,director,cli_id) values ('" + title + "', '" + director + "', " + cli_id + ");";
			
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
	
	public ResultSet getVideos(String databaseName) {
		
		
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_use = "use " + databaseName + ";";
			Statement st_use_database = connection.createStatement();
			st_use_database.executeUpdate(query_use);
			
			String result = "select * from videos";
			Statement st_select = connection.createStatement();
			ResultSet rs_registers = st_select.executeQuery(result);
			return rs_registers;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("The data retrieve failed");
		}
		return null;
	}
	
	public void updateVideo(String databaseName, int id, String title, String director, int cli_id) {
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_update = "update videos set title='" + title + "', director='" + director + "', cli_id=" + cli_id + " where id=" + id + ";";
			
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
	
	public void deleteVideo(String databaseName, int id) {
		try {
			openDatabaseConnection(localServer, localUser, localPassword);
			String query_delete = "delete from videos where id=" + id + ";";
			
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
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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