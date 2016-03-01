public class Teller extends Persons
{
	String id;
	String hire_date;
	String first_name;
	String last_name;
	String dob;
	String ssn;
	int security;
	int hourly_wage;
	

		public Teller(String tellerId, String tellerHire_date, int tellerSecurity, int tellerHourly_wage)
		{
			id = tellerId;
			hire_date = tellerHire_date;
			security = tellerSecurity;
			hourly_wage = tellerHourly_wage;
		}

		public int PayRaise(int new_Wage)
		{
			new_Wage = hourly_wage + (2);
			return new_Wage;
		}
}