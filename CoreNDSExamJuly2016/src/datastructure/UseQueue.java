package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queueCd = new LinkedList<String>();
		queueCd.add("CD1");
		queueCd.add("CD2");
		queueCd.add("CD3");
		queueCd.add("CD4");
		queueCd.add("CD5");

		// add function
		queueCd.add("CD???");

		// peek function
		System.out.println(queueCd.peek());

		//remove function
		queueCd.remove();
		System.out.println(queueCd.peek());

		System.out.println(queueCd.peek());

		System.out.println("iterating with for each loop");
		for(Object item : queueCd) {
			System.out.println(item.toString());
		}

		System.out.println("iterating with while loop");
		Iterator iterator = queueCd.iterator();
		while(iterator.hasNext()){
			String element = (String)iterator.next();
			System.out.println(element);
		}
	}

}
