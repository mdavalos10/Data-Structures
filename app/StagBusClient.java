package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("----------------L I S T  T E S T-----------------");
		LinkedList l = new LinkedListImpl();
		l.addItem("Downtown Fairfield");
		l.addItem("Trumbull Mall");
		l.addItem("New York City");
		l.addItem("Westport");
		System.out.println("List of the Stations: ");
		l.listItems();
		System.out.println("------------");
		System.out.println(l.isItemInList("Downtown Fairfield"));
		System.out.println(l.isItemInList("My house"));

		System.out.println("------------");
		l.deleteItem("Westport");
		System.out.println("Station Deleted is: Westport");
		System.out.println("------------");
		System.out.println("List of the Stations: ");
		l.listItems();
		l.insertBefore("New Jersey", "Trumbull Mall");
		System.out.println("------------");
		System.out.println("New Station: New Jersey   Before: Trumbull Mall");



		System.out.println("------------");
		System.out.println("List of the Stations: ");
		l.listItems();
		l.deleteItem("Train Station");
		l.insertAfter("New Haven", "Trumbull Mall");
		System.out.println("------------");
		System.out.println("New Station: New Haven   After: Trumbull Mall");
		System.out.println("------------");
		System.out.println("List of the Stations: ");
		l.listItems();



		//Stack Stuff
		System.out.println("-----------------S T A C K  T E S T------------------");
		Stack s = new StackImpl();
		//6 riders by name
		s.push("James");
		s.push("Jimmy");
		s.push("Jay");
		s.push("Sarah");
		s.push("Jane");
		s.push("Karen");

		System.out.println("People in line:");
		s.display();
		System.out.println("------------");
		//Peak
		System.out.println("Peaked: " + s.peek());
		//Remove
		System.out.println("Popped: " + s.pop());
		System.out.println("------------");
		//Peak
		System.out.println("People In Line:");
		s.display();


		System.out.println("------------");
		System.out.println("Added People in the Line:");
		//Add two more riders
		s.push("Isabela");
		s.push("Patty");
		s.display();
		System.out.println("------------");
		//Peak
		System.out.println("Peaked: " + s.peek());
		System.out.println("People in Line: ");
		s.display();
		System.out.println("------------");
		System.out.println("Popped person " + s.pop());
		System.out.println("------------");
		s.display();
		System.out.println("------------");
		//Remove all riders from Stack
		s.popAll();
		//StackRunTestMethod...
	 
		System.out.println("---------------Q U E U E  T E S T--------------------");

		Queue q = new QueueImpl();
		q.enQueue("Mateo");
		q.enQueue("Tarry");
		q.enQueue("James");
		q.enQueue("Harry");
		q.enQueue("Jerry");
		q.enQueue("Messi");

		System.out.println("People in line:");
		q.display();
		System.out.println("------------");
		System.out.println("First in Line: " + q.peek());

		q.deQueue();
		System.out.println("------------");
		System.out.println("New Line Order:");
		q.display();

		// Added people
		q.enQueue("Leo");
		q.enQueue("Cristian");


		System.out.println("------------");
		System.out.println("Added People in the Line:");
		q.display();
		System.out.println("------------");
		System.out.println("First in Line: " + q.peek());
		q.deQueue();
		System.out.println("------------");
		System.out.println("New Line Order:");
		q.display();
		//QueueRunTestMethod...
		
	 	}

}
