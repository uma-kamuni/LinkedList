package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome To Linked List Program");
		System.out.println("Nodes of simple linked list:");
		//LinkedList list = new LinkedList();
		// list.add(56);
		// list.add(70);
		// list.displayNode();
		// System.out.println("30 is Inserting between 56 and 70");
		// list.insert(list.head, 30);
		// list.displayNode();
		// list.pop();
		// list.displayNode();
		// list.searchNode(30);
		// list.displayNode();
		// System.out.println("40 is Inserting after 30 ");
		// list.insert(list.head.next, 40);
		// list.displayNode();
		// list.searchNode(40);
		// list.displayNode();
		// System.out.println("40 is Deleted ");
		// list.deleteNode(40);
		// list.displayNode();
		// list.size();
		// list.sortNode();
		// System.out.println("Node is sorted in Ascending order");
		// list.displayNode();
	
		OrderedList ascendingList = new OrderedList();
		ascendingList.adds(56);
		ascendingList.adds(30);
		ascendingList.adds(40);
		ascendingList.adds(70);
		ascendingList.display();
		ascendingList.sortNode();
		ascendingList.display();

		
	}

}
