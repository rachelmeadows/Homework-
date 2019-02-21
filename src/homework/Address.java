
package homework;

public class Address {
	public String fullName(String forename, String middleName, String surname) {
		if (forename == "") {
			return "Invalid Name!";
		}
		else if (surname == "") {
			return "Invalid Name!";
		}
		else if (middleName == ""){
			return forename + " " + surname;
		} else {					
			return forename + " " + middleName + " " + surname;
		}
		
	}
}
