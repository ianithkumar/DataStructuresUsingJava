package LinkedList;

public class Runner {
  public static void main(String a[]){
    LinkedList list = new LinkedList();
    list.insert(18);
    list.show();
    list.insert(45);
    list.show();
    list.insert(12);
    list.show();
    list.insertAtStart(55);
    list.show();
    list.insertAt(1,5);
    list.show();
    list.deleteAt(3);
    list.show();
    list.deleteAt(4);
    list.show();

  }
}
