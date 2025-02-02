package com.sagar.DSA_LinkedList;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
       private int data;
       private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        if(head == null){
            System.out.print(head.data + "-->");
        }
        while(current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }

    private int length() {
        if(head == null){
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    private void inserFirst(int i) {
        ListNode newNode = new ListNode(i);
        newNode.next = head;
        head = newNode;
        display();
    }

    private void insertLast(int value){
        ListNode newNode = new ListNode(value);

        ListNode current = head;
        while(current != null){
            if(current.next == null){
                current.next = newNode;
                newNode.next = null;
            }
            current = current.next;
        }
    }

    private void insertPosition(int value, int position){
        ListNode newNode = new ListNode(value);

        if(position == 1){
            newNode.next = head;
            head = newNode;
        }else{
            int count = 1;
            ListNode previous = head;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;

        }
    }

    public static void main(String[] args) {

        //create a singlyLinkedList
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        s1.head.next = second;
        second.next = third;
        third.next = fourth;

        //display method to print
        s1.display();
        System.out.println("----------------------------------");

        //length of the linkedlist
        int listLength = s1.length();
        System.out.println("Length of the List --> " + listLength);

        System.out.println("----------------------------------");

        System.out.println("Insert in the beginning");
        //insert node at the beginning
        s1.inserFirst(5);

        System.out.println("----------------------------------");

        System.out.println("Insert in the end");
        //insert at the end
        s1.insertLast(50);
        s1.display();

        System.out.println("----------------------------------");

        System.out.println("Insert at a given position");
        //insert at a given position
        s1.insertPosition(35,4);
        s1.display();

    }
}
