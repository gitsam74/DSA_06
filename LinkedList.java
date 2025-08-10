package test;

import java.util.*;
class LinkedList {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void insert(int data) {
        Node show = new Node(data);

        if (head == null) {
            head = show; 
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = show; 
        }
    }
    public void traverse() {
        if (head == null) {
            System.out.println("The linked list is empty.");
        } else {
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.traverse();
    }
}
