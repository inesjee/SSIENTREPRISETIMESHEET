package EntrpriseSSI.Entreprisessi.persistence;

public class MissionExterne extends Mission{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5848076808999896621L;
	private String emailFacturation;
	private float JournalierMoyen;
	
	public MissionExterne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public MissionExterne(String name, String description, String emailFacturation, float journalierMoyen) {
		super(name, description);
		this.emailFacturation = emailFacturation;
		JournalierMoyen = journalierMoyen;
	}



	public String getEmailFacturation() {
		return emailFacturation;
	}

	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}

	public float getJournalierMoyen() {
		return JournalierMoyen;
	}

	public void setJournalierMoyen(float journalierMoyen) {
		JournalierMoyen = journalierMoyen;
	}
	
	
}
