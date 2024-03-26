package QueueImplementation;

public class Queue {
  int queue[] = new int[5];
  int size;
  int front;
  int rear;

  public void enQueue(int data){
    if (!isFull()){
      queue[rear] = data;
      rear = rear+1;
      size = size+1;
    } else {
      System.out.println("Queue is Full");
    }

  }
  public int deQueue(){
    int data = 0;
    if(!isEmpty()){
      data = queue[front];
      front = front+1;
      size = size - 1;
    } else{
      System.out.println("Queue is Empty");
    }
    return data;
  }
  public void show(){
    System.out.println("Elements : ");
    for(int i=0;i<size;i++){
      System.out.println((queue[i])+" ");
    }
  }

  public boolean isFull() {
    return getSize() == 5;
  }

  public int getSize() {
    return size;
  }
  public boolean isEmpty(){
    return getSize() == 0;
  }
}
