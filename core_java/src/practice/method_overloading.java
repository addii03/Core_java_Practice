package practice;

public class method_overloading {

	public void add(int a,int b)
	{
		int c=a+b;
		 System.out.println(c);
	}
	public void add(int a,int b,int k)
	{
		int c=a-b+ k;
		 System.out.println(c);
	}
	public void add(int a)
	{
		int c=a;
		 System.out.println(c);
	}
	public void add(float a)
	{
		float c=a;
		 System.out.println(c);
	}
	public void add(int a,int b,int k,int p)
	{
		int c=a+b-k-p;
		 System.out.println(c);
	}
	
	public static void main(String[] args) {
		method_overloading ref= new method_overloading();
		ref.add(2.5f);
		ref.add(4, 4);
		ref.add(2, 3, 5);
	}
}
