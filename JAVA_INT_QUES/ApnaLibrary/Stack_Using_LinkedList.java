package ApnaLibrary;

public class Stack_Using_LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head;
        // ISEMPTY()
        public boolean isEmpty(){
            return head == null;
        }

        // PUSH()
        public void push(int data){
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }


        // POP()
        public int pop(){
            
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // PEEK()
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
