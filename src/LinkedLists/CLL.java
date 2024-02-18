package LinkedLists;

public class CLL {
  private Node head;
  private Node tail;

  public CLL() {
    this.head = null;
    this.tail = null;
  }

  private class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public void display() {
    Node node = head;
    if (head != null) {
      do {
        System.out.print(node.value + " -> ");
        node = node.next;
      } while (node != head);
    }
    System.out.println();
  }

  public void insertLast(int val) {
    Node node = new Node(val);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
  }

  public void deleteFirst() {
    tail.next = head.next;
    head = head.next;
  }

  public void delete(int val) {
    Node node = head;
    Node next = head.next;
    while(next.value != val){
      node = node.next;
      next = next.next;
    }
    node.next = next.next;
  }
}
