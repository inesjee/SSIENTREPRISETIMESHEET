package EntrpriseSSI.Entreprisessi.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import EntrpriseSSI.Entreprisessi.persistence.Entreprise;

@Stateless
public class EntrepriseService implements EntrepriseServiceRemote{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public int ajouterEntreprise(Entreprise entreprise) {
		em.persist(entreprise);
		return entreprise.getId();
	}

	
}
