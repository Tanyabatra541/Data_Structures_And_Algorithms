package LinkedLists;

import org.w3c.dom.Node;

public class Main {
  public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(2);
    list.insertFirst(10);
    list.insertFirst(12);
    list.insertFirst(20);
    list.insertLast(1);
    list.insert(100,1);
//    list.display();
//    System.out.println(list.deleteFirst());
//    list.display();
//    System.out.println(list.deleteLast());
//    list.display();
//    System.out.println(list.delete(2));
//    list.display();
//    System.out.println(list.find(13));
//    list.insertRecursion(3, 100, head);
//    list.display();
    list.insertRecursion(200,3);
    list.display();


//    DLL list = new DLL();
//    list.insertFirst(2);
//    list.insertFirst(10);
//    list.insertFirst(12);
//    list.insertFirst(20);
//    list.insertLast(200);
//    list.insert(100, 2);
//    list.display();
//    System.out.println(list.deleteFirst());
//    list.display();
//    System.out.println(list.deleteLast());
//    list.display();
//    System.out.println(list.delete(1));
//    list.display();


//    CLL list = new CLL();
//    list.insertLast(4);
//    list.insertLast(14);
//    list.insertLast(16);
//    list.insertLast(20);
//    list.display();
//    list.delete(14);
//    list.display();
  }


}
