class node{
    int data;
    node next,prev;
    node(int data){
        this.data=data;
        next=prev=null;
    }
}
class circular{
    node head;
    void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            head.next=head;
            head.prev=head;
            return;
        }
        node last=head.prev;
        newnode.next=head;
        head.prev=newnode;
        newnode.prev=last;
        last.next=newnode;
    }
    int length(){
        int count=1;
        if(head==null)return 0;
        node cur=head.next;
        while(cur!=head){
            count++;
            cur=cur.next;
        }
        return count;
    }
    int logic(int r){
        while(length()!=1){
            for(int i=0;i<r-1;i++){
                head=head.next;
            }
            head.next.prev=head.prev;
            head.prev.next=head.next;
            head=head.next;
        }
        return head.data;
    }
}
class Solution {
    public int findTheWinner(int n, int k) {
        circular ll=new circular();
        for(int i=1;i<=n;i++)ll.insert(i);
        return ll.logic(k);
    }
}