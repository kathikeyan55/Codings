package LinkedList;

import java.util.Scanner;

public class UtillList {
    public static Node takeInput(){
        Node head = null;
        Node tail = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        while (data != -1){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next =newNode;
                tail = newNode;
            }
            data  = scanner.nextInt();
        }
        return head;
    }
    public  static  void print (Node head){
        Node cur = head;
        while ( cur != null){
            System.out.print(cur.data+ " ");
            cur =cur.next;
        }
    }
    public   static Node reverIretive (Node head){
        Node pre  = null;
        Node  cur = head;
        while ( cur != head){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur  = next;
        }
        return  pre;
    }

}
