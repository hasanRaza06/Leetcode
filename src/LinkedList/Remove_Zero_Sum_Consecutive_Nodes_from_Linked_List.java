package LinkedList;
import java.util.*;

public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum=0;
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        map.put(prefixSum,dummy);

        while(head!=null){
            prefixSum+=head.val;
            if(map.containsKey(prefixSum)){
                ListNode start=map.get(prefixSum);
                ListNode temp=start;
                int pSum=prefixSum;
                while(temp!=head){
                    temp=temp.next;
                    pSum+=temp.val;
                    if(temp!=head)map.remove(pSum);
                }
                start.next=head.next;
            }else{
                map.put(prefixSum,head);
            }
            head=head.next;
        }
        return dummy.next;
    }
}
