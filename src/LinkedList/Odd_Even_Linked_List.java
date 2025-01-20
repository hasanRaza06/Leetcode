package LinkedList;

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenstart=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=even.next;

            even.next=odd.next;
            even=odd.next;
        }
        odd.next=evenstart;
        return head;
    }
}
