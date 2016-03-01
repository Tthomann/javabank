import package.Persons;
public class GoBank
{
	public static void main(String[] args){

	Banker banker1 = new Banker("Rose.23","1/7/1990",1, 46000);

	Customer customer1 = new Customer(82750,10000,500,"4/8/2000");
		customer1.setBalance(20);
		customer1.setCredit(10);

	Teller teller1 = new Teller("Lilly.24","1/23/1998",2,13);
		teller1.payRaise(2);

	List<Persons> bank = new ArrayList<Persons>();
		bank.add(banker1);
		bank.add(customer1);
		bank.add(teller1);

		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
	}	
}
