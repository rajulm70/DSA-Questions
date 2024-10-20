package ApnaLibrary;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    // To add the element as first in the  LinkedList

    public void addFirst(int data){
        Node newNode = new Node(data);
        // Check if there is no node present in the linkedlist
        if(head == null){
            head = tail = newNode;
            return;
        }

        // initialize the next of newNode as head
        newNode.next = head;

        // initialize a new head as newNode
        head = newNode;

    }

    // To add the element as first in the  LinkedList

    public void addLast(int data){
        Node newNode = new Node(data);
        // Check if there is no node present in the linkedlist
        if(head == null){
            head = tail = newNode;
            return;
        }

        // initialize the newNode as tail
        tail.next = newNode;
        // initialize the tail as newNode
        tail = newNode;

    }

    // Add element in the middle of the linkedlist
    public void addMiddle(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // 
    }

    // To Print the LinkedList
    public void printLL(){
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addFirst(1);
        ll.addLast(3);
        
        ll.printLL();
    }
}
