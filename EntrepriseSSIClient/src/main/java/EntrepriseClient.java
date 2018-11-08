import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import EntrpriseSSI.Entreprisessi.persistence.Departement;
import EntrpriseSSI.Entreprisessi.persistence.Entreprise;
import EntrpriseSSI.Entreprisessi.services.EntrepriseServiceRemote;

public class EntrepriseClient {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		String jndiName = "Entreprisessi-ear/Entreprisessi-ejb/EntrepriseService!EntrpriseSSI.Entreprisessi.services.EntrepriseServiceRemote";
		Context context = new InitialContext();
		EntrepriseServiceRemote entrepriseServiceRemote = (EntrepriseServiceRemote)context.lookup(jndiName);

	
		Entreprise ssiconsulting = new Entreprise("consulting", "La Marsa");
		int ssiconsultingId = entrepriseServiceRemote.ajouterEntreprise(ssiconsulting);
		
		
		Departement depRH = new Departement("RH");
		Departement depTelecom = new Departement ("Telecom");

		int depTeleconId = entrepriseServiceRemote.ajouterDepartement(depTelecom);
		int depRhId = entrepriseServiceRemote.ajouterDepartement(depRH);
		
		entrepriseServiceRemote.affecterDepartementAEntreprise(depTeleconId,ssiconsultingId);
		entrepriseServiceRemote.affecterDepartementAEntreprise(depRhId, ssiconsultingId);
	}

}
