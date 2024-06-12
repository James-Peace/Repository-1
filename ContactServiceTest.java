/* 


SNHU CS-320-11216-M01 Software Test, Automation QA 2024 C-3 (May - Jun)
							
							James Peace 
                    		
                    		6/12/2024

*/

package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {

	@Test
	public void testAddContact() {
		ContactService testList = new ContactService();
		
		Contact test1 = new Contact("1", "J", "P", "1234567890", "Test Address");
		Contact test2 = new Contact("2", "F", "P", "0000000000", "Address Ready");
		Contact test3 = new Contact("3", "B", "P", "1111111111", "Address Test");
		
		assertEquals(true, testList.addContact(test1));
		assertEquals(true, testList.addContact(test2));
		assertEquals(true, testList.addContact(test3));
		
		assertEquals(false, testList.addContact(test2));


	}
	 
	@Test
	public void testDeleteContact() {
		ContactService testList = new ContactService();

		Contact test1 = new Contact("1", "J", "P", "1234567890", "Test Address");
		Contact test2 = new Contact("2", "F", "P", "0000000000", "Address Ready");
		Contact test3 = new Contact("3", "B", "P", "1111111111", "Address Test");
		
		
		assertEquals(true, testList.addContact(test1));
		assertEquals(true, testList.addContact(test2));
		assertEquals(true, testList.addContact(test3));
		
		assertEquals(true, testList.removeContact("1"));
		
		assertEquals(false, testList.removeContact("5"));
	
		}
	
	@Test
	public void testUpdateContact() {
		ContactService testList = new ContactService();
		
		Contact test1 = new Contact("1", "J", "P", "1234567890", "Test Address");
		Contact test2 = new Contact("2", "F", "P", "0000000000", "Address Ready");
		Contact test3 = new Contact("3", "B", "P", "1111111111", "Address Test");
		
		
		assertEquals(true, testList.addContact(test1));
		assertEquals(true, testList.addContact(test2));
		assertEquals(true, testList.addContact(test3));
		
		assertEquals(true, testList.updateContact("1", "P", "J", "2222222222", "Address Deleted"));
		
		assertEquals(false, testList.updateContact("4", "H", "K", "5555555555", "No Address"));
	}
}
