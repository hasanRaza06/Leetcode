package LinkedList;

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0)return null;
        return partition(0,n-1,lists);
    }
    public ListNode partition(int s,int e, ListNode[] lists){
        if(s==e)return lists[s];
        int mid=s+(e-s)/2;
        ListNode left=partition(s,mid,lists);
        ListNode right=partition(mid+1,e,lists);
        return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
}
