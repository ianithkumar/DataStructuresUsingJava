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
      root = insertRec(root.left,data);
    }
    else if(data>root.data){
      root = insertRec(root.right,data);
    }
    return root;
  }
}
