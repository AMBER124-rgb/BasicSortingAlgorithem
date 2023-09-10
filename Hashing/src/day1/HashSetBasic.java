package day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<>();
		s.add("Welcome");
		s.add("to");
		s.add("Wakad");
		System.out.println(s);
		System.out.println(s.size());
		s.remove("to");
		System.out.println(s.contains("to"));
		s.clear();
		System.out.println(s.size());
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(s.isEmpty());
	}

}
