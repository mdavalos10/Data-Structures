package stack;

public class StackTester {

	public static void main(String[] args) {
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
		s.display();
	}
}
