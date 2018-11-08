package EntrpriseSSI.Entreprisessi.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Mission implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4781004669595349487L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	
	@OneToMany
	private List <Timesheet> timesheets;
	
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mission(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Timesheet> getTimesheets() {
		return timesheets;
	}
	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}
	
	

}
