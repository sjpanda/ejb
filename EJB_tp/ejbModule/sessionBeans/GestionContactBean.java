package sessionBeans;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class GestionContactBean
 */
@Stateless(mappedName="ContactBean")
public class GestionContactBean implements GestionContactRemote {
	
	@Override
	public String coucouContact(String nomContact) {
		return "Coucou, " + nomContact;
	}

	@Override
	public void addContact(String fname, String lname, String email) {
		
	}

	@Override
	public String findContactNameById(long id) {
		return null;
	}

}
