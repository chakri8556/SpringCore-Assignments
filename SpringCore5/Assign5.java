package assign5;

public class Adress {

	private String  street,city,state,zip,country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void getDetails()
	{
		System.out.println(getStreet());
		System.out.println(getState());
		System.out.println(getCity());
		System.out.println(getZip());
		System.out.println(getCountry());
	}
	
}