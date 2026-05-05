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
    static int size(ListNode head){
        ListNode c=head;
        int count=0;
        while(c!=null){
            count++;
            c=c.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;
        int s=size(head);
        k=k%s;
        if(k==0)return head;
        ListNode r,m=head;
        for(int i=0;i<s-k-1;i++)m=m.next;
        r=m.next;
        m.next=null;
        ListNode l=r;
        while(l.next!=null)l=l.next;
        l.next=head;
        return r;
    }
}