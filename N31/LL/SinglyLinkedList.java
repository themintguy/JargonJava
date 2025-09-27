package LL;

class Node {
    int val;
    Node next;

    public  Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;
    Node tail;

    public SinglyLinkedList(){
        head = new Node(-1);
        tail = head;
    }

    public void insertEnd(int val){
        tail.next = new Node(val);
        tail = tail.next;
    }

    public void removeNode(int index){
        int i = 0;

        Node curr = head;

        while(i < index && curr != null){
            i++;
            curr = curr.next;
        }
        if(curr != null){
            curr.next = curr.next.next;
        }
    }

    public  void  print(){
        Node curr = head.next;
        while (curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("end");
    }


}
