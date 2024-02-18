package LinkedLists;

public class LL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
    size = 0;
  }

  private static class Node {
    private final int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }
    size++;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void insertLast(int value) {
    Node node = new Node(value);
    if (tail == null) {
      insertFirst(value);
      return;
    }
    tail.next = node;
    tail = node;
    size++;
  }

  public void insert(int value, int index) {
    if (index == 0) {
      insertFirst(value);
      return;
    }
    if (index == size) {
      insertLast(value);
      return;
    }
    Node temp = get(index - 1);
    Node node = new Node(value);
    node.next = temp.next;
    temp.next = node;
    size++;
  }

  public int deleteFirst() {
    int val = head.value;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return val;
  }

  public int deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }
    int val = tail.value;
    Node temp = get(size - 2);
    tail = temp;
    temp.next = null;
    size--;
    return val;
  }

  public int delete(int index) {
    if (index == 0) {
      return deleteFirst();
    }
    if (index == size - 1) {
      return deleteLast();
    }
    Node temp = get(index - 1);
    Node toBeDeleted = get(index);
    temp.next = toBeDeleted.next;
    size--;
    return toBeDeleted.value;
  }

//  public void insertRecursion(int index, int value, Node curr) {
//    index--;
//    Node node = new Node(value);
//    if(index == 0) {
//      node.next = curr.next;
//      curr.next = node;
//      return;
//    } else {
//      curr = curr.next;
//    }
//    insertRecursion(index, value, curr);
//  }

  public void insertRecursion(int value, int index) {
    insertRecursionHelper(index, value, head);
  }

  public void insertRecursionHelper(int index, int value, Node curr) {
    Node node = new Node(value);
    index--;
    if (index == 0) {
      node.next = curr.next;
      curr.next = node;
      return;
    } else {
      curr = curr.next;
    }
    insertRecursionHelper(index, value, curr);
  }

  public static LL merge(LL first, LL second) {
    Node head1 = first.head;
    Node head2 = second.head;
    LL ans = new LL();
    while (head1 != null && head2 != null) {
      if (head1.value <= head2.value) {
        ans.insertLast(head1.value);
        head1 = head1.next;
      } else {
        ans.insertLast(head2.value);
        head2 = head2.next;
      }
    }
    while (head2 != null) {
      ans.insertLast(head2.value);
      head2 = head2.next;
    }
    while (head1 != null) {
      ans.insertLast(head1.value);
      head1 = head1.next;
    }

    return ans;
  }

  public static int cycleLength(LL list) {
    int count = 0;
    Node fast = list.head;
    Node slow = list.head;
    while(fast!=null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow) {
        Node temp = slow;
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

  public static void main(String[] args) {
    LL first = new LL();
    first.insertLast(1);
    first.insertLast(2);
    first.insertLast(4);
    int ans = cycleLength(first);
    System.out.println(ans);
  }

}
