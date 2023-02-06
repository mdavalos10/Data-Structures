package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {

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
	}

}
