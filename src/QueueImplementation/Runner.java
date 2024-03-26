package QueueImplementation;



public class Runner {
  public static void main(String a[]){
    Queue q = new Queue();
    q.enQueue(15);
    q.enQueue(35);
    q.enQueue(45);
    q.enQueue(55);
    q.show();

    System.out.println(q.deQueue());
    q.show();




  }
}
