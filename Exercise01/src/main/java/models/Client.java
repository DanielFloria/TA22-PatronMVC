package models;

import java.util.Date;

public class Client {
	private int ID;
	private String DNI;
	private String Name;
	private String Address;
	private Date EntryDate;
	/**
	 * @param iD
	 * @param dNI
	 * @param name
	 * @param address
	 */
	public Client(int iD, String dNI, String name, String address) {
		ID = iD;
		DNI = dNI;
		Name = name;
		Address = address;
		EntryDate = new Date();
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getEntryDate() {
		return EntryDate;
	}
	public void setEntryDate(Date entryDate) {
		EntryDate = entryDate;
	}
	
	
	

	

}
