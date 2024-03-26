package TreeImplementation;

public class BinaryTree {
  Node root;

  public void insert(int data){
    root = insertRec(root,data);
  }

  public Node insertRec(Node root, int data) {
    if(root == null){
      root = new Node(data);
    }
    else if(data<root.data){
      root.left = insertRec(root.left,data);
    }
    else if(data>root.data){
      root.right = insertRec(root.right,data);
    }
    return root;
  }

  public void postOrder(){
    preOrderRec(root);
  }

  public void preOrderRec(Node root) {
    if(root!=null){
      preOrderRec(root.left);
      preOrderRec(root.right);
      System.out.print(root.data+" ");
    }
  }
}
