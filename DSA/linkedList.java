class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class linkedList_class {
    Node head;
    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode; 
    }
    public void insertAtSpecificPosition(int data, int position){
        Node newNode = new Node(data);
        Node currNode = head;
        for(int i = 1; i < position - 1; i++){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void display(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
public class linkedList {
    public static void main(String[] args) {
        linkedList_class list = new linkedList_class();
        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
    }
}
