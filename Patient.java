package Patient;

public class Patient
{
	private String firstName, middleName, lastName;
	private String streetAddress, city, state;
	private int zipCode;
	private String phoneNumber;
	private String emergencyName, emergencyNumber;
	
	public Patient()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = 0;
		phoneNumber = "";
		emergencyName = "";
		emergencyNumber = "";
	}
	public Patient(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		streetAddress = "";
		city = "";
		state = "";
		zipCode = 0;
		phoneNumber = "";
		emergencyName = "";
		emergencyNumber = "";
	}
	public Patient(String firstName, String middleName, String lastName,
			String streetAddress, String city, String state, int zipCode,
			String phoneNumber, String emergencyName, String emergencyNumber)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getEmergencyName()
	{
		return emergencyName;
	}
	public void setEmergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	public String getEmergencyNumber()
	{
		return emergencyNumber;
	}
	public void setEmergencyNumber(String emergencyNumber)
	{
		this.emergencyNumber = emergencyNumber;
	}
	
	public String buildFullName()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	public String buildAddress()
	{
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	public String buildEmergencyContact()
	{
		return emergencyName + " " + emergencyNumber;
	}
	
	public String toString()
	{
		return "Patient info:\nName: " + buildFullName() + "\nAddress: " + buildAddress() + "\nEmergency Contact: " + buildEmergencyContact() + "\n";
	}
}