package employees;

import java.time.LocalDate;

public class Supervisor extends UpperEmployee {

	public Supervisor(String nit, String cep, String street, String number, String city, String state,
			String country, String name, String cpf, String email, String sector, double base_salary) {
		super(nit, cep, street, number, city, state, country, name, cpf, email, sector, base_salary);
		setBonification(this.getBase_salary() * 0.08);
	}

	public void demit(Employee employee) {
		if (employee instanceof Supervisor || employee instanceof Manager) {
			System.out.println("You cannot demit another manager or supervisor.");
		} else {
			employee.setDemission_date(LocalDate.now());
			System.out.println("Demitted employee " + employee.getName());
		}
	}
}
