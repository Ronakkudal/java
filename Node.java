import java.util.*;
public class Node{
    int data; 
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev =null;

    }
    

public static Node head;
public static Node tail;
public static int size;
public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head.prev=newNode;
    head = newNode;
}



public void print(){
    Node temp = head;
    System.out.println("null");
    while(temp != null){
        System.out.println(temp.data +"<-->");
    }
    System.out.println("null");
}
    public static void main (String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        
    }
    
}







