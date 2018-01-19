/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1, p2=l2;
        ListNode head = new ListNode(-1);
        ListNode current=head;
        int sum=0, carry=0;
        while(p1!=null || p2!=null)
        {
            if(p1!=null)
            {
                sum+=p1.val;
                p1=p1.next;
            }
            if(p2!=null)
            {
                sum+=p2.val;
                p2=p2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode temp=new ListNode(sum%10);
            sum=0;
            current.next=temp;
            current=current.next;

        
    }
        if(carry>0)
        current.next= new ListNode(carry);
     
        
        return head.next;
}
}