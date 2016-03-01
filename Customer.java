public class Customer extends Persons
	{
		int bank_number;
		int account_balance;
		int credit_score;
		int ssn;
		String creation_date;
		String first_name;
		String last_name;
		String dob;
	
			
			public Customer(int customerBank_number, int customerAccount_balance, int customerCredit_score, String customerCreation_date)
			{
				bank_number = customerBank_number;
				account_balance = customerAccount_balance;
				credit_score = customerCredit_score;
				creation_date = customerCreation_date;
			}

			public int setBalance(int new_Balance)
			{
				//account_balance + (20) = new_Balance;
				new_Balance = account_balance + (20);
				return new_Balance;
			}

			public int setCredit(int new_Credit)
			{
				new_Credit = credit_score + (10);
				return new_Credit;
			}
	}