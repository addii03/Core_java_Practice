package practice;

class atm
{
	int money=100;
	public void withdraw()
	{
		System.out.println("all money withdraw");
	}
}
public class Encapsulation {
public static void main(String[] args) {

	atm ref= new atm();
	ref.withdraw();
	System.out.println("money in the atm:  "+ ref.money);
	
}
}
