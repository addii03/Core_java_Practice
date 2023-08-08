package practice;

class k1
{
	public void demo()
	{
		int a=12;
		System.out.println(a);
	}
}
class k2 extends k1
{
	public void demo()
	{
		int a=20;
		System.out.println(a);

	}
}
public class method_overriding {

	public static void main(String[] args) {
		k1 ref1= new k1();
		// System.out.println(ref1);
	ref1.demo();
		k2 ref2 = new k2();
		ref2.demo();
	}
}
