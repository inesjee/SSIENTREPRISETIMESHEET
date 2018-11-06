package EntrpriseSSI.Entreprisessi.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Employe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5650947892880374674L;
	
	@Id
	@GeneratedValue
	private int id;
	private String prenom;
	private String nom;
	private String email;
	private boolean isActif;
	@Enumerated
	private Role role;
	
	@OneToMany
	private List <Timesheet> timesheets;
	
	public Employe() {
		super();
		
	}

	public Employe(String prenom, String nom, String email, boolean isActif, Role role) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	

}
