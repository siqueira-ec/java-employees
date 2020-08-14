import employees.*;

public class Main {

	public static void main(String[] args) {
		IndividualEmployee individual_employee = new IndividualEmployee("123456-789", "66820-475",
				"rod. augusto montenegro km 12", "s/n", "belém", "pará", "brazil", "matheus siqueira",
				"026.490.662-45", "matheus.siqueira@itec.ufpa.br", "ti", 2500);
		
		CorporateEmployee corporate_employee = new CorporateEmployee("123456789-456", "66820-475",
				"pass. três de maio", "123", "belém", "pará", "brazil", "dennise nascimento",
				"nsdennise@gmail.com", "analytics", 3800);
		
		Manager manager1 = new Manager("123456-477", "66820-000", "rod. augusto montenegro",
				"123", "belém", "pará", "brazil", "roberto siqueira", "430.870.272-00",
				"siqueirar1972@gmail.com", "rh", 5200);
		
		
		Supervisor supervisor1 = new Supervisor("123456-477", "66820-000", "rod. augusto montenegro",
				"123", "belém", "pará", "brazil", "roberto siqueira", "430.870.272-00",
				"siqueirar1972@gmail.com", "rh", 4800);
	}
}