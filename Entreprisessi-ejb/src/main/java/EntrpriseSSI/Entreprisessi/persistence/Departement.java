package EntrpriseSSI.Entreprisessi.persistence;

import java.io.Serializable;

public class Departement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 971187750708604392L;
	
	
	private int id;
	private String name;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
