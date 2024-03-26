package StackImplementationUsingAnArray;

public class Runner {
  public static void main(String a[]) {
    Stack num = new Stack();
    num.push(10);
    num.push(5);
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
