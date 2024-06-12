/* 


SNHU CS-320-11216-M01 Software Test, Automation QA 2024 C-3 (May - Jun)
							
							James Peace 
                    		
                    		6/12/2024

*/

package Contact;

import java.util.ArrayList;

// ContactService Class
public class ContactService {
	
	// Create local ArrayList for contacts storage
	private ArrayList<Contact> contacts;
		 
	// ContactService function
	public ContactService() {
		//Create new ArrayList entry
		contacts = new ArrayList<>();
	}
	
	// Add contact function
	public boolean addContact(Contact contact) {
		// define local variable contactAlready, and initiate to false
		boolean contactAlready = false;
		// Check for pre-existing contact in list
		for (Contact contactList:contacts) {
			if (contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		// Add Contact to list if not already in list
		if(!contactAlready) {
			contacts.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	
	// Remove Contact function
	public boolean removeContact(String ContactId) {
		for(Contact contactList:contacts) {
			//If Contact exists in list; Remove
			if(contactList.getContactId().equals(ContactId)) {
			contacts.remove(contactList);
			return true;
			}
		}
		return false;
	}
	
	// Update Contact function
	public boolean updateContact(String contactId, String firstName, String lastName, String phoneNumber, String contactAddress) {
		for(Contact contactList:contacts) {
			// If contact exists in list; verify contactId
			if(contactList.getContactId().equals(contactId)) {
				// Update firstName variable
				if(!firstName.equals("")) {
					contactList.setFirstName(firstName);
				}
				// Update lastName variable
				if(!lastName.equals("")) {
					contactList.setLastName(lastName);
				}
				// Update phoneNumber variable
				if(!phoneNumber.equals("")) {
					contactList.setPhoneNumber(phoneNumber);
				}
				// Update contactAddress variable
				if(!contactAddress.equals("")) {
					contactList.setContactAddress(contactAddress);
				}
				return true;
			}	
		}
		return false;
	}

}

