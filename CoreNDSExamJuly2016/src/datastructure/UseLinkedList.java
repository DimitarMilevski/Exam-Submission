package datastructure;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		LinkedList<String> list = new LinkedList<>();
		list.add("Java ");
		list.add("is ");
		list.add("a lot ");
		list.add("of ");
		list.add("fun.");
		//display linked list
		System.out.print(list);

		System.out.println();
		//add last element to lilnked list
		list.addLast("somtimes");
		System.out.print(list);

		list.removeLast();
		System.out.print(list);


	}

}
