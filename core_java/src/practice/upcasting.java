package practice;

class p1 {
	int i = 1;
}

class p2 extends p1 {
	int i = 2;
}

public class upcasting

{
	public static void main(String[] args) {

		p2 ref1 = new p2();
		System.out.println(ref1.i);
		p1 ref2 = new p1();
		System.out.println(ref2.i);
		p1 ref3 = new p2();
		System.out.println(ref3.i);

	}
}
