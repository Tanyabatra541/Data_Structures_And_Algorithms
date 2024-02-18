package StacksQueues;

public class QueueMain {
  public static void main(String[] args) throws Exception {
    CircularQueue queue = new CircularQueue(5);
    queue.insert(3);
    queue.insert(10);
    queue.insert(13);
    queue.insert(20);
    queue.insert(25);

//    System.out.println(queue.front());

    queue.display();
    queue.remove();

//    System.out.println(queue.front());

    queue.display();
  }
}
