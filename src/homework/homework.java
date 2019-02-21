package homework;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import homework.Address;

class AddressTest {

	public final Address address = new Address();
	
	@Test
	void basicNameTest() {
		assertEquals("Rachel May Meadows", address.fullName("Rachel", "May", "Meadows"));
		assertEquals("James Stanley Kemp", address.fullName("James", "Stanley", "Kemp"));
		assertEquals("Ellie Joanne Harle", address.fullName("Ellie", "Joanne", "Harle"));


		}
	
	@Test
	void noForename() {
		assertEquals("Invalid Name!", address.fullName("", "May", "Meadows"));
	}
	@Test
	void noMiddleName() {
		assertEquals("Rachel Meadows", address.fullName("Rachel", "", "Meadows"));
	}
	@Test
	void noLastName() {
		assertEquals("Invalid Name!", address.fullName("Rachel", "May", ""));
	}
}
