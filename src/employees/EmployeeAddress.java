package employees;

public class EmployeeAddress {
	private String cep;
	private String street;
	private String number;
	private String city;
	private String state;
	private String country; 

	public EmployeeAddress(String cep, String street, String number, String city, String state, String country) {
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
