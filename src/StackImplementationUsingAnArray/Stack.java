package StackImplementationUsingAnArray;

public class Stack {
  int stack[] = new int[5];
  int top = 0;

  public void push(int data) {
    if (size() == 5) {
      System.out.println("Stack Is Full");
    } else {
      stack[top] = data;
      top++;
    }
  }

  public int pop() {
    int data = 0;
    if (isEmpty()) {
      System.out.println("Stack Is Empty");
    } else {
      top--;
      data = stack[top];
      stack[top] = 0;
    }
    return data;
  }

  public int peek() {
    int data = 0;
    data = stack[top - 1];
    return data;
  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return size() <= 0;
  }

  public void show() {
    for (int n : stack) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
}
