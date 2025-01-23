package LinkedList;

public class Swapping_Nodes_in_a_Linked_List {

    /// Approach 1

    public ListNode swapNodes(ListNode head, int k) {
        int length=findLength(head);

        ListNode first=null;
        int temp=k;
        ListNode ptr=head;
        while(temp>1){
            ptr=ptr.next;
            temp--;
        }

        ListNode ptr2=head;
        int temp2=length-k+1;
        while(temp2>1){
            ptr2=ptr2.next;
            temp2--;
        }
        int t=ptr.val;
        ptr.val=ptr2.val;
        ptr2.val=t;
        return head;
    }
    public int findLength(ListNode head){
        int i=0;
        while(head!=null){
            i++;
            head=head.next;
        }
        return i;
    }

    //////  Approach 2


    public ListNode swapNodes2(ListNode head, int k) {
        ListNode p1=null;
        ListNode p2=null;

        ListNode temp=head;
        while(temp!=null){
            if(p2!=null){
                p2=p2.next;
            }
            k--;
            if(k==0){
                p1=temp;
                p2=head;
            }
            temp=temp.next;
        }
        int t=p1.val;
        p1.val=p2.val;
        p2.val=t;
        return head;
    }
}

