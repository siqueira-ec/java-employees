package employees;

public class UpperEmployee extends IndividualEmployee {
	private double bonification;
	
	public UpperEmployee(String nit, String cep, String street, String number, String city, String state,
			String country, String name, String cpf, String email, String sector, double base_salary) {
		super(nit, cep, street, number, city, state, country, name, cpf, email, sector, base_salary);
	}

	public double getBonification() {
		return bonification;
	}

	public void setBonification(double bonification) {
		this.bonification = bonification;
	}
}
