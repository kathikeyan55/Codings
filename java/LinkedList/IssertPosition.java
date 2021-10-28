/*
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function addElement() that takes head node, M(position of element to be inserted) and K(the element to be inserted) as parameter.

Constraints:
1 <= M <=N <= 1000
1 <=K, Node.data<= 1000
Output
Return the head of the modified linked list
Sample Input:-
5 3 2
1 3 2 4 5 

Sample Output:-
1 3 2 2 4 5

Explanation:-
here M is 3 and K is 2
so we insert 2 at the 3rd position, resulting list will be 1 3 2 2 4 5

Sample Input 2:-
5 2 6
1 2 3 4 5

Sample Output 2:-
1 6 2 3 4 5

**/
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

public static Node addElement(Node head, int k ,int pos ) {
    //enter your code here
       
       Node newNode = new Node(k);
       Node currenNode=head;
       if(pos == 1){
           newNode.next = head;
           head =newNode;
           return head;
       }
       for(int i=1;i<pos-1;i++){
           currenNode = currenNode.next;
       }
       newNode.next = currenNode.next;
       currenNode.next  = newNode;
       return head;
    }