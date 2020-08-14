package employees;

public class CorporateEmployee extends Employee {
	private String cnpj;
	
	public CorporateEmployee(String cnpj, String cep, String street, String number, String city, String state,
			String country, String name, String email, String sector, double base_salary) {
		super(cep, street, number, city, state, country, name, email, sector, base_salary);
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
