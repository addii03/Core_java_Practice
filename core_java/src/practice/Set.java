package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
public static void main(String[] args) {
	
	HashSet<Integer>h= new HashSet<>();
	h.add(12);
	h.add(32);
	h.add(43);
	h.add(9);
	h.add(72);
	
	System.out.println(h);
	
	LinkedHashSet<Integer> h2 = new LinkedHashSet<>();
	h2.add(12);
	h2.add(32);
	h2.add(43);
	h2.add(9);
	h2.add(72);
	System.out.println(h2);
	
	TreeSet<Integer> h3= new TreeSet<>();
	h3.add(12);
	h3.add(32);
	h3.add(43);
	h3.add(9);
	h3.add(72);
	System.out.println(h3);
}
}
