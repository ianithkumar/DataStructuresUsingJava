package StackIMplementationUsingDynamicArray;

import StackImplementationUsingAnArray.Stack;

public class Runner {
  public static void main(String a[]) {
    DStack num = new DStack();
    num.push(10);
    num.push(5);
    num.show();
    num.push(70);
    num.push(18);
    num.push(90);
    num.pop();
    num.push(800);

    num.show();

    System.out.println(num.peek());
    System.out.println(num.size());
    System.out.println(num.isEmpty());

  }
}
