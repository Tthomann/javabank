
public class Banker extends Persons
{
	int security;
	int salary;
	int ssn;
	String id;
	String hire_date;
	String first_name;
	String last_name;
	String dob;
	

		public Banker(String bankerId, String bankerHire_date, int bankerSecurity, int bankerSalary)
		{
			id = bankerId;
			hire_date = bankerHire_date;
			security = bankerSecurity;
			salary = bankerSalary;
		}
}