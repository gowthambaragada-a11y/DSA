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
    public ListNode mergeNodes(ListNode head) {
        ListNode d=new ListNode(0),c=d;
        head=head.next;
        while(head!=null){
            int sum=0;
            while(head.val!=0){
                sum+=head.val;
                head=head.next;
            }
            c.next=new ListNode(sum);
            c=c.next;
            head=head.next;
        }
        return d.next;
    }
}