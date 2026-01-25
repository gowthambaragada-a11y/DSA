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
    static int length(ListNode head){
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public int[] nextLargerNodes(ListNode head) {
        int n=length(head);
        int []a=new int[n];
        Arrays.fill(a,0);
        ListNode cur=head;
        int i=0;
        while(cur.next!=null){
            a[i++]=con(cur);
            cur=cur.next;
        }
        return a;
    }
    static int con(ListNode head){
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
            if(cur.val>head.val)return cur.val;
        }
        return 0;
    }
}