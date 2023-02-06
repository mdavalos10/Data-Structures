package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue q = new QueueImpl();
		q.enQueue("Mateo");
		q.enQueue("Tarry");
		q.enQueue("James");
		q.enQueue("Harry");
		q.enQueue("Jerry");
		q.enQueue("Tom");


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



	}

}
