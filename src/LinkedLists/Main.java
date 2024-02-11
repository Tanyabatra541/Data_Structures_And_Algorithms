package LinkedLists;

public class Main {
  public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(2);
    list.insertFirst(10);
    list.insertFirst(12);
    list.insertFirst(20);
    list.insertLast(1);
    list.insert(100,1);
    list.display();
//    System.out.println(list.deleteFirst());
//    list.display();
//    System.out.println(list.deleteLast());
//    list.display();
//    System.out.println(list.delete(2));
//    list.display();
    System.out.println(list.find(13));
    list.display();
  }
}
