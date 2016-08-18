package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		List<String> BMW = new ArrayList<String>();
		BMW.add("X5");
		BMW.add("328");
		BMW.add("M3");

		List<String> Honda = new ArrayList<String>();
		Honda.add("Pilot");
		Honda.add("Accord");
		Honda.add("Civic");

		List<String> Toyota = new ArrayList<String>();
		Toyota.add("Corola");
		Toyota.add("Camry");
		Toyota.add("Highlander");



		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("BmwModels", BMW);
		map.put("HondaModels", Honda);
		map.put("ToyotaModels", Toyota);

		//retrieve data with for eachloop
		for(Map.Entry<String, List<String>> entry:map.entrySet()){
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}

		System.out.println();
		//retrieve data with iterator
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry data = (Map.Entry) it.next();
			System.out.println(data.getKey() + " " + data.getValue());
		}
	}

}
