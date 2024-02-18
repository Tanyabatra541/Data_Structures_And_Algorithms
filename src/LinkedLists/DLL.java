package LinkedLists;

public class DLL {
  private class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value){
      this.value = value;
    }
    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }

  private Node head;

  public void insertFirst(int value){
    Node node = new Node(value);
    node.next = head;
    node.prev = null;
    if(head!=null){
      head.prev = node;
    }
    head = node;
  }

  public void display() {
    Node last = null;
    Node node = head;
    while(node != null){
      System.out.print(node.value + " -> ");
      last = node;
      node = node.next;
    }
    System.out.println();
    while(last != null) {
      System.out.print(last.value + " -> ");
      last = last.prev;
    }
    System.out.println();
  }

  public void insertLast(int val) {
    Node node = new Node(val);
    Node last = head;
    if(head == null){
      node.prev = null;
      head = node;
      return;
    }
    while(last.next != null) {
      last = last.next;
    }
    last.next = node;
    node.prev = last;
    node.next = null;
  }

  public void insert(int value, int index) {
    Node newNode = new Node(value);
    Node temp = head;
    for(int i=1;i<index;i++){
      temp = temp.next;
    }
    if(temp == null) {
      System.out.println("Node does not exist.");
      return;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    newNode.prev = temp;
    if(newNode.next!=null){
      newNode.next.prev = newNode;
    }
  }

  public int deleteFirst() {
    int val = head.value;
    head = head.next;
    head.prev = null;
    return val;
  }

  public int deleteLast() {
    Node last = head;
    while(last.next!=null){
      last = last.next;
    }
    int val = last.value;
    last.prev.next = null;
    return val;
  }

  public int delete(int index) {
    Node toBeDeleted = head;
    for(int i=1;i<=index;i++){
      toBeDeleted = toBeDeleted.next;
    }
    int val = toBeDeleted.value;
    toBeDeleted.prev.next = toBeDeleted.next;
    toBeDeleted.next.prev = toBeDeleted.prev;
    return val;
  }

}
