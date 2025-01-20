package LinkedList;

public class Delete_the_Middle_Node_of_a_Linked_List {
    // Brute Force
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count/2;
        temp=head;
        while(count-1>0){
            count--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    // Better
    public ListNode deletMiddle(ListNode head) {
        if(head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next !=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
