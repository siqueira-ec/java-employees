package employees;

import java.time.LocalDate; // import the LocalDate class

public class Manager extends UpperEmployee {

	public Manager(String nit, String cep, String street, String number, String city, String state,
			String country, String name, String cpf, String email, String sector, double base_salary) {
		super(nit, cep, street, number, city, state, country, name, cpf, email, sector, base_salary);
		setBonification(this.get_base_salary() * 0.12);
	}

	public void demit(Employee employee) {
		if (employee instanceof Manager) {
			System.out.println("You cannot demit another manager.");
		} else {
			employee.setDemission_date(LocalDate.now());
			System.out.println("Demitted employee " + employee.getName());
		}
	}
	
	public void raise_salary(Employee employee, double amount) {
		if (employee instanceof Manager) {
			System.out.println("You cannot change another manager salary.");
		} else {
			if ((employee.getBase_salary() + amount) < employee.getBase_salary()) {
				System.out.println("You cannot low a employee salary.");
			} else {
				employee.setBase_salary(employee.getBase_salary() + amount);
				System.out.println("You raised employee " + employee.getName() + " salary.");
			}
		}
	}
	
	public double get_base_salary() {
		return getBase_salary() + getBonification();
	}
}
