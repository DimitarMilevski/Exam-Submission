package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		ArrayList<String> list = new ArrayList<String>();
		//add elements to arrayList list
		list.add("Java ");
		list.add("is ");
		list.add("a lot ");
		list.add("of ");
		list.add("fun.");

		// retrieve data with for each loop
		for(Object words:list) {
            System.out.print(words);
        }
        System.out.println();

		// add at specified index
		list.add(2,"not ");
        //retrieve data with iterator
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());

        }
        System.out.println();
        //remove at index
        list.remove(2);
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());

        }



	}

}
