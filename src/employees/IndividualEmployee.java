package employees;

public class IndividualEmployee extends Employee {
	private String nit;
	private String cpf;

	public IndividualEmployee(String nit, String cep, String street, String number, String city,
			String state, String country, String name, String cpf, String email, String sector,
			double base_salary) {
		super(cep, street, number, city, state, country, name, email, sector, base_salary);
		this.nit = nit;
		this.cpf = cpf;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
