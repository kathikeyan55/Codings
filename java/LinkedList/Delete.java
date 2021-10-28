/**
 * Given a linked list consisting of N nodes and an integer K, your task is to delete the Kth node from the end of the linked list
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and K as parameter.

Constraints:
1 <=K<=N<= 1000
1 <=Node.data<= 1000
Output
Return the head of the modified linked list
Input 1:
5 3
1 2 3 4 5

Output 1:
1 2 4 5

Explanation:
After deleting 3rd node from the end of the linked list, 3 will be deleted and the list will be as 1, 2, 4, 5.

Input 2:-
5 5
8 1 8 3 6 

Output 2:-
1 8 3 6 
 */
/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteElement(Node head,int k) {
    //enter your code here
        Node temp = head ;
        int len = 1;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        // System.out.println("node length :"+ len);
        len =  len - k;
    //    System.out.println("node length :"+ len);
        Node tenp = head;
        if(  len == 1){
           
            return head.next;
        }
        
        Node current = head;
        for(int i=1;i<len-1;i++){
                current = current.next;
        }
        current.next = current.next.next;
        return head;
    
    }