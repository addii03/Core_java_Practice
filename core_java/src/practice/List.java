package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add(121);
		a.add(42);
		a.add(22);
		a.add(94);

		System.out.println(a);

		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

		System.out.println(a.size());

		a.remove(2);
		System.out.println("removed :" + a);

		System.out.println("!!!! LinkedList !!!!");
		
		LinkedList<Object> l= new LinkedList<>();
		l.add("hello");
		l.add(90);
		l.add('q');
		l.add("world");
		l.add(45);
		System.out.println("linkedList : "+ l);
		
		l.set(1, "jaddu");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		System.out.println(l.size());
	}	
}
