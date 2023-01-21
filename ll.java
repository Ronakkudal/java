public class ll {
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


    public void print(){
        if(head == null){
            System.out.println("ll is empty");
    return;
        }
        Node temp = head;
        while(temp !=null){
        System.out.println(temp.data+" ");
        temp = temp.next;

        }

    }
    public static void main(String args[]){
         ll r = new ll();
         r.print();
         r.addFirst(2);
         r.print();
         



    }
        
    }
    

