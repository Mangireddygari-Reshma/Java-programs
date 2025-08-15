class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class dll {
    Node head;
    Node tail;
    public dll() {
        this.head = null;
        this.tail = null;  
    }
    public void insertbegin(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head; 
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertend(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfterElement(int data, int element) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp != null) {
            if(temp.data == element) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next = newNode;
                if(newNode.next != null) {
                    newNode.next.prev = newNode;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deletionBegin() {
        if(head == null) {
            return;
        }
        else if(head == tail) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
    }
    public void deletionEnd() {
        if(head == null) {
            return;
        }
        else if(head == tail) {
            head = null;
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }   

    }
    public void search(int data) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == data) {
                System.out.println("Element found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
    }
    public void deleteAtPosition(int position) {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        if(position == 1) {
            head = head.next;
            head.prev = null;
            return;
        }
        int count = 1;
        while(count < position - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    public void deleteElement(int data) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            if(temp.data == data) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
    }
    public void reverse() {
        if(head == null || head.next == null) {
            return;
        }
        Node temp = head;
        Node prev = null;
        Node next = null;
        while(temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
}

public class doubleLinkedList {
    public static void main(String[] args) {
        dll dll = new dll();
        dll.insertbegin(1); 
        dll.insertbegin(2);
        dll.insertbegin(3);
        dll.insertend(4);
        dll.insertend(5);
        dll.display();
        dll.deletionBegin();
        dll.display();
        dll.deletionEnd();
        dll.display();
        dll.search(3);
        dll.deleteAtPosition(2);
        dll.display();
        dll.deleteElement(5);
        dll.display();
        dll.reverse();
        dll.display();
    }
}
