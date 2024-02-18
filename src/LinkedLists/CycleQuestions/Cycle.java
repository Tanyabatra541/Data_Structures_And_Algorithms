package LinkedLists.CycleQuestions;

import LinkedLists.LL;

public class Cycle {
  public boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if(fast==slow){
        return true;
      }
    }
    return false;
  }

  public int cycleLength(ListNode head) {
    int count =0;
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if(fast==slow){
        ListNode temp = slow;
        count++;
        temp = temp.next;
        while(fast != temp) {
          temp = temp.next;
          count++;
        }
        return count;
      }
    }
    return 0;
  }

  public ListNode detectCycle(ListNode head) {
    int length =0;
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if(fast==slow){
        length = cycleLength(slow);
        break;
      }
    }

    if(length == 0){
      return null;
    }

    //find the start node
    ListNode f = head;
    ListNode s = head;
    while(length>0){
      s=s.next;
      length--;
    }

    //keep moving both till they meet the start
    while(f!=s){
      f=f.next;
      s=s.next;
    }
    return s;
  }

}
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) {
    this.val = val;
  }
}
