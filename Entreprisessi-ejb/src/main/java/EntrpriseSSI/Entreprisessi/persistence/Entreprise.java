package EntrpriseSSI.Entreprisessi.persistence;

import java.io.Serializable;

public class Entreprise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6690243113484120393L;
	private int id;
	private String name;
	private String raisonSocial;
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(String name, String raisonSocial) {
		super();
		this.name = name;
		this.raisonSocial = raisonSocial;
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
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	
}
