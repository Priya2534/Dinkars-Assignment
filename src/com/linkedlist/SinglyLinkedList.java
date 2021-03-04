package com.linkedlist;

class SinglyLinkedList {
	Node head;
	Node current;

	public void createLinkedList(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			current = head;

		} else {
			current.next = newNode;
			current = newNode;

		}

	}

	public void displayLinkedList() {
		current = head;
		if (head != null) {

			while (current != null) {
				System.out.println(current.getData());
				current = current.next;
			}
		}

	}
}