package practice;

interface Car
{

	abstract void fourWheeler();
	
}
class maruti implements Car
{
	public void fourWheeler()
	{
		System.out.println("4- wheeler car");
	}
}
public interface Vehicle {

	public static void main(String[] args) {
	maruti maruti= new maruti();
	maruti.fourWheeler();
	}
}
