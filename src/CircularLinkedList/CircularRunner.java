package CircularLinkedList;

public class CircularRunner {
  public static void main(String[] a){
    CircularLinkedListClass<Integer> list = new CircularLinkedListClass<Integer>();
    list.insertAtBeginning(10);
    list.insertAtBeginning(20);
    list.insertAtBeginning(30);
    list.insertAtEnd(40);
    list.display();
    System.out.println();

    list.deleteAtBeginning();
    list.display();

//    CircularLinkedListClass<String> stringList = new CircularLinkedListClass<String>();
//    stringList.insertAtBeginning("Anith");
//    stringList.insertAtEnd("kumar");
//    stringList.display();
  }
}
