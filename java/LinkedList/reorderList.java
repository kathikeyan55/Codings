/**
 * Given a singly linked list

    L: L0 → L1 → … → Ln-1 → Ln,
reorder it to:

    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
You must do this in-place without altering the nodes’ values.

For example,

Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
       
        ListNode slow =  getMid(A);
        ListNode l2 = reverIretive(slow.next);
        slow.next = null;
        ListNode l1 = A;
       
        ListNode newHead = new ListNode(l1.val);
        ListNode current = newHead;
        l1 = l1.next;
        boolean changePath = false;
        while (l1 != null && l2 !=null){
            ListNode temp = new ListNode(0);
            if(!changePath){
                temp.val = l2.val;
                temp.next =null;
                current.next=temp;
                l2 = l2.next;
                changePath = true;
            }else
            {
                temp.val = l1.val;
                temp.next =null;
                current.next=temp;
                l1 = l1.next;
                changePath = false;
            }
            current =current.next;
        }
        if(l1 != null){
            current.next =l1;
        }
        if(l2 != null){
            current.next =l2;
        }
    return newHead;


    }
     public  static  ListNode getMid(ListNode head){
        ListNode slow  = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
    public   static ListNode reverIretive (ListNode head){
        ListNode pre  = null;
        ListNode  cur = head;
        while ( cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur  = next;
        }
        return  pre;
    }
}

/*
1 2 3 4
1 4 2 3
_____________________________
odd 7
1 2 3 4 5 6 7
1 7 2 6 3 5 4
l1 = 1 2 3 4
l2 = 5 6 7 reverse it  7 6 5 
1 7 2 6 3 5 4
even 8
1 2 3 4 5 6 7 8 
1 8 2 7 3 6 4 5
l1 = 1 2 3 4
l2 = 5 6 7 8 ==> reverse 8 7 6 5
1 8 2 7 3 6 4 5

Algorithm
 ---> Frist find mid value
 ---> splid in two l1 = Frist half and l2 = second.
 ---> and reverse the second half
 ---> and merge to list in zigzag;

 git log time is 10 minutes
______________________________
*/
