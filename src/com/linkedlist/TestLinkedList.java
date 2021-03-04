package com.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.createLinkedList(1);
		list.createLinkedList(2);
		list.createLinkedList(3);
		list.createLinkedList(4);
		list.createLinkedList(5);
		list.createLinkedList(6);

		System.out.println("Print linkedlist:");
		list.displayLinkedList();

	}

}
