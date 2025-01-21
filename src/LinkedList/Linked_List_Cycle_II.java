package LinkedList;

public class Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(slow!=fast){
            return null;
        }
        ListNode ptr=head;
        while(ptr!=slow){
            ptr=ptr.next;
            slow=slow.next;
        }
        return ptr;
    }
}
