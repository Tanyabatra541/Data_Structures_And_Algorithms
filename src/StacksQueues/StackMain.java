package StacksQueues;

public class StackMain {
  public static void main(String[] args) throws Exception {
    CustomStack stack = new CustomStack();
    stack.push(2);
    stack.push(20);
    stack.push(12);
    stack.push(5);
    stack.push(10);
    stack.push(25);

    System.out.println(stack.peek());

    System.out.println(stack.pop());

    System.out.println(stack.peek());

  }
}
