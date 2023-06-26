package collections_examoles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hash_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String ,String> h=new TreeMap<String ,String>();//derived from SortedMap
		h.put("apple", "fruit");
		h.put("jasmine", "flower");
		h.put("jan", "arijit");
		h.put("feb", "shreya");
		h.put("mar", "armaan");
		h.put("may", "arijit");
		h.put("apr", "armaan");
		h.put("abcd", "arijit");
		h.put("xyz","amrita");
		//h.put(null, "Nikita"); //TreeMap doen't all null value but others allow
		h.put("dec", "Bhargav");
		System.out.println("Size of map "+h.size());
		System.out.println("printing the contents");
		for(String key:h.keySet()){
			String name=h.get(key);
			System.out.println(key+ " "+name);
		}
			
			System.out.println("is the map contains 2 "+h.containsKey("jan"));
			System.out.println("is the map contains shreya "+h.containsValue("shreya"));
			
		

	}

}

