/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode c=head,t=head.next;
        while(t!=null){
            ListNode gc=new ListNode(gcd(c.val,t.val));
            gc.next=t;
            c.next=gc;
            c=c.next;
            c=c.next;
            t=t.next;
        }
        return head;
    }
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}