package day19;

/**
 * Author: Sweetie77
 * Created: 2019/6/10
 */
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead,int x){
        if(pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;
        ListNode Shead = new ListNode(0);
        ListNode Bhead = new ListNode(0);
        ListNode Stmp = Shead;
        ListNode Btmp = Bhead;
        while(cur != null){
            if(cur.val < x){
                Stmp.next = new ListNode(cur.val);
                Stmp = Stmp.next;
            }else{
                Btmp.next = new ListNode(cur.val);
                Btmp = Btmp.next;
            }
            cur = cur.next;
        }
        cur = Shead;
        while(cur.next != null && cur.next.val != 0){
            cur = cur.next;
        }
        cur.next = Bhead.next;
        return Shead.next;
    }
}
