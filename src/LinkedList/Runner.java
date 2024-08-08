package LinkedList;

import java.util.List;

public class Runner {
  public static void main(String a[]){
    LinkedList list = new LinkedList();
    list.insert(25);
    list.insert(67);
    list.insert(34);
    list.insert(87);
    list.insertAtStart(56);
    list.insertAt(3,90);
    list.show();

    list.reverse();
    list.show();
  }
}
