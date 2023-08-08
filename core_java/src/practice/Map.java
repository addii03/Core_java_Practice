package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {

		HashMap h = new HashMap<>();
		h.put(1, "raghav");
		h.put(3, "punit");
		h.put('e', "yadav");
		h.put(87, "rameshh");
		h.put(90, "lokesh");
		h.put(5, "ajit");
		h.put('d', "sharad");
		h.put("hello", "raghav");
		System.out.println(h);

		System.out.println("linkedhashmap");

		LinkedHashMap h2 = new LinkedHashMap<>();
		h2.put(1, "raghav");
		h2.put(3, "punit");
		h2.put('e', "yadav");
		h2.put(87, "rameshh");
		h2.put(90, "lokesh");
		h2.put(5, "ajit");
		h2.put('d', "sharad");
		h2.put("hello", "raghav");
		System.out.println(h2);

		System.out.println("treemap");

		TreeMap h3 = new TreeMap<>();
		h3.put(1, "raghav");
		h3.put(3, "punit");
		h3.put(65, "yadav");
		h3.put(87, "rameshh");
		h3.put(90, "lokesh");
		h3.put(5, "ajit");
		h3.put(94, "sharad");
		h3.put(54, "raghav");
		System.out.println(h3);

		// h3.descendingMap();
		System.out.println(h3.descendingMap());

		// convert map into set

		 System.out.println("set : "+ h.entrySet());

		// search key or value
		// if it is available or not
		System.out.println("seacrh key :" + h.containsKey(1));
		System.out.println("search key :" + h.containsValue("yadave"));

		// when we want to access the map we have to convert into set
		// for each loop
		
		Set s = h.entrySet();
		for (Object obj : s) {
			System.out.println(obj);
		}

		// iterator
		
		System.out.println("!!! iterator !!!");
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}

	}
}
