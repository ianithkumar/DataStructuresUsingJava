package CircularLinkedList;

public class CircularLinkedListClass<T> {
  Node last = null;

  class Node {
    T data;
    Node next;

    Node(T data) {
      this.data = data;
      next = null;
    }
  }
  CircularLinkedListClass(){
    last = null;
  }

  public void insertAtBeginning(T data) {
    Node newNode = new Node(data);
    if (last == null) {
      newNode.next = newNode;
      last = newNode;
    } else{
      newNode.next = last.next;
      last.next = newNode;
    }
  }
  public void insertAtEnd(T data) {
    Node newNode = new Node(data);
    if (last == null) {
      newNode.next = newNode;
      last = newNode;
    } else{
      newNode.next = last.next;
      last.next = newNode;
      last = newNode;
    }
  }

  public void display(){
    Node temp = last.next;
    do{
      System.out.print(temp.data+" ");
      temp = temp.next;
    }while(temp!=last.next);
  }

  public void deleteAtBeginning(){
    if(last==null){
      throw new NullPointerException("Attempt to delete in a empty list");
    }
    if(last.next==last){
      last.next = null;
    } else{
      last.next = last.next.next;
      last.next.next = null;
    }
  }
}
