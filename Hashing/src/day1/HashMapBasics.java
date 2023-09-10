package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m =new HashMap<String, Integer>();
		m.put("Pristine",12);
		m.put("Prolife",04);
		m.put("Avenue", 103);
		System.out.println(m);
		System.out.println(m.size());
		for(Entry<String, Integer> e : m.entrySet())
			System.out.println(e.getKey()+"----" + e.getValue());
		
		if(m.containsKey("Avenue"))
			System.out.println("yes it contain");
		else
			System.out.println("No its nt present");
		
		System.out.println(m.remove("Avenue"));
		System.out.println(m.size());
	}

}
