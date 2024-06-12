/* 


SNHU CS-320-11216-M01 Software Test, Automation QA 2024 C-3 (May - Jun)
							
							James Peace 
                    		
                    		6/12/2024

*/

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345", "James", "Peace", "0000000000", "Address Unknown");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("James"));
		assertTrue(contact.getLastName().equals("Peace"));
		assertTrue(contact.getPhoneNumber().equals("0000000000"));
		assertTrue(contact.getContactAddress().equals("Address Unknown"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789--", "James", "Peace", "0000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("23456", "James Peace", "Peace", "0000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("34567", "James", "James Peace", "0000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("45678", "James", "Peace", "00000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("56789", "James", "Peace", "000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("67890", "James", "Peace", "0000000000", "Address Unknown Albuquerque, NM 87111");
		});
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "James", "Peace", "0000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("78901", null, "Peace", "0000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("89012", "James", null, "0000000000", "Address Unknown");
		});
	}
	
	@Test
	void testContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("90123", "James", "Peace", null, "Address Unknown");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234", "James Peace", "Peace", "0000000000", null);
		});
	}

}