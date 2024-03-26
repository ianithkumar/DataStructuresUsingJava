package TreeImplementation;

public class Runner {
  public static void main(String a[]){
    BinaryTree b = new BinaryTree();
    b.insert(35);
    b.insert(45);
    b.insert(34);
    b.insert(67);
    b.insert(78);
    b.insert(97);
    b.insert(37);
    b.insert(56);

    b.postOrder();

  }

}
