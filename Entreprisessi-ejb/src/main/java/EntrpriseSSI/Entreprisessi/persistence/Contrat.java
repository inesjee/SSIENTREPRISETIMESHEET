package EntrpriseSSI.Entreprisessi.persistence;

import java.io.Serializable;
import java.util.Date;

public class Contrat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6290331384709187957L;
	private int reference;
	private Date dateDebut;
	private String typeContrat;
	private float salaire;
	
	public Contrat() {
		super();
		
	}
	public Contrat(Date dateDebut, String typeContrat, float salaire) {
		super();
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
	
	
}
