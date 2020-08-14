package employees;

// imports
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Employee {
	//	contact and identifying data
	private EmployeeAddress address;
	private String name;
	private String email;
	private String sector;
	private double base_salary;
	
	//	dates
	private LocalDate admission_date = LocalDate.now();
	private LocalDate demission_date;
	private LocalDate start_vacation_date;
	private LocalDate end_vacation_date = LocalDate.now();
	private LocalDate last_raise_ask_date = LocalDate.now();
	
	public Employee(String cep, String street, String number, String city, String state, String country,
			String name, String email, String sector, double base_salary) {
		this.setAddress(new EmployeeAddress(cep, street, number, city, state, country));
		this.setName(name);
		this.setEmail(email);
		this.setSector(sector);
		this.base_salary = base_salary;
	}
		
	public void request_vacation() {
		LocalDate today = LocalDate.now();
		Period diff_admission = Period.between(admission_date, today);
		Period diff_vacation = Period.between(end_vacation_date, today);
		
		if (diff_vacation.toTotalMonths() < 4) {
			System.out.println("You cannot take vacation with less than 4 months of your last vacation.");
        } else {
    		start_vacation_date = today;
    		end_vacation_date = start_vacation_date.plusDays(30);
        }
		
		if (diff_admission.toTotalMonths() < 11) {
    		System.out.println("You cannot take vacation with less than 11 months of contract.");
        } else if (diff_vacation.toTotalMonths() < 4) {
			System.out.println("You cannot take vacation with less than 4 months of your last vacation.");
		} else {
    		start_vacation_date = today;
    		end_vacation_date = start_vacation_date.plusDays(30);
    		System.out.println("Enjoy your vacation!");
        }
	}
	
	public void work() {
		LocalDate today = LocalDate.now();
		Period diff_vacation = Period.between(end_vacation_date, today);
		
		if (diff_vacation.getDays() < 0) {
			System.out.println(diff_vacation.getDays());
			System.out.println("Employee playing hard.");
		} else {
			System.out.println("Employee working hard.");
		}
	}
	
	public void ask_salary_raise(double amount) {
		Random generator = new Random();
		
		System.out.println("Asking for salary raise.");
		LocalDate today = LocalDate.now();
		Period diff_ask_salary = Period.between(last_raise_ask_date, today);
		
		if (diff_ask_salary.toTotalMonths() < 3) {
			System.out.println("You asked for salary raise in prior 3 months, wait for " + 
					(3-diff_ask_salary.toTotalMonths()) + " months to ask again.");
		} else if (generator.nextBoolean()) {
			base_salary += amount;
			last_raise_ask_date = LocalDate.now();
			System.out.println("Gotcha! Your new salary: " + base_salary);
		} else {
			last_raise_ask_date = LocalDate.now();
			System.out.println("Oops, not this time. Try again later.");
		}
		
	}
	
	public void quit_job() {
		setDemission_date(LocalDate.now());
		System.out.println("Quit job.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public LocalDate getDemission_date() {
		return demission_date;
	}

	public void setDemission_date(LocalDate demission_date) {
		this.demission_date = demission_date;
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		if (base_salary < this.base_salary) {
			System.out.println("You cannot set a employee salary below current base salary.");
		} else {
			this.base_salary = base_salary;
		}
	}

	public LocalDate getAdmission_date() {
		return admission_date;
	}

	public void setAdmission_date(LocalDate admission_date) {
		this.admission_date = admission_date;
	}

	public LocalDate getStart_vacation_date() {
		return start_vacation_date;
	}

	public void setStart_vacation_date(LocalDate start_vacation_date) {
		this.start_vacation_date = start_vacation_date;
	}

	public LocalDate getEnd_vacation_date() {
		return end_vacation_date;
	}

	public void setEnd_vacation_date(LocalDate end_vacation_date) {
		this.end_vacation_date = end_vacation_date;
	}

	public LocalDate getLast_raise_ask_date() {
		return last_raise_ask_date;
	}

	public void setLast_raise_ask_date(LocalDate last_raise_ask_date) {
		this.last_raise_ask_date = last_raise_ask_date;
	}
}
