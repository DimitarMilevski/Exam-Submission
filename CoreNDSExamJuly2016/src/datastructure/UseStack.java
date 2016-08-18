package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Stack lifo = new Stack();
		//iterating with forr loop
		// adding to the stack with push method
		for (int i = 1; i <= 10; i++)
		{
			lifo.push ( new Integer(i) );
		}

		//peek method
		System.out.println(lifo.peek());

		// iterating with while loop
		//pop function
		while ( !lifo.empty() )
		{
			System.out.print ( lifo.pop() );
			System.out.print ( ',' );
		}





	}

}
