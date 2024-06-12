/* 


SNHU CS-320-11216-M01 Software Test, Automation QA 2024 C-3 (May - Jun)
							
							James Peace 
                    		
                    		6/12/2024

*/

package Contact;

// Contact Class
public class Contact {
	
	// Define Local variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress;
	
	// Create Contact function
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String contactAddress) {
		// if/else statements
		// Set contactId exception criteria
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		else {
			this.contactId = contactId;
		}
		
		// Set firstName exception criteria
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		else {
			this.firstName = firstName;
		}
		
		// Set lastName exception criteria
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		else {
			this.lastName = lastName;
		}
		
		// Set phoneNumber exception criteria
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
		
		// Set contactAddress exception criteria
		if (contactAddress == null || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Adderess");
		}
		else {
			this.contactAddress = contactAddress;
		}

	}
	
	// Getters/Setters for all variables
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getContactAddress() {
		return contactAddress;
	}
	
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

}


