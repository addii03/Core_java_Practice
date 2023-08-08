package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		num.add(14);
		num.add(44);
		num.add(16);
		num.add(54);
		num.add(76);
		num.add(4);
		num.add(9);

		System.out.println(num);
// get index
		System.out.println("!!! get index  !!!");
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
//for each loop
		System.out.println("!!! for each loop  !!!");
		for (Integer n : num) {
			System.out.println(n);
		}
// iterator
		System.out.println("!!! iterator  !!!");
		Iterator<Integer> i = num.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
// list iterator
		System.out.println("!!! list iterator  !!!");
		ListIterator<Integer> listIterator = num.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
	
		ArrayList a= new ArrayList<>();
		a.add(23);
		a.add(53);
		a.add(54);
		a.add(34);
		a.add(23);
		a.add(null);
		a.add(null);
		System.out.println("list : "+a);
//converting list into set
		HashSet h=new HashSet<>(a);
		System.out.println("set:" + h); // set do not allow duplicate // in set only one null value
	}
}
