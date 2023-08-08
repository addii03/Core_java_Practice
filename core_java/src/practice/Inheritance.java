package practice;

class atm2 
{
	int money = 100;

	public void withdraw() {
		System.out.println("money withdraww");
	}
}

class user extends atm2 
{

}

public class Inheritance {
	public static void main(String[] args) {

		user user = new user();
		System.out.println("main methodd :" + user.money);
		user.withdraw();
	}

}
