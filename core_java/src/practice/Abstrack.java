package practice;

abstract class animal
{

	abstract void typesAnimal();
	
}
class monkey extends animal
{

	void typesAnimal()
	{
		System.out.println("name: monkey");
	}
}
public class Abstrack {
public static void main(String[] args) {
	
	monkey m= new monkey();
	m.typesAnimal();
}
	
}
