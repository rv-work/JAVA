class BST {
  public class Node {
   private int value;
   private Node left;
   private Node right;
   private int height;

   public Node(int value){
    this.value = value;
   }
 
   public int getValue(){
    return value;
   }
  }

  private Node root;

  public BST(){

  }

  public int height(Node node){
    if(node == null){
      return -1;
    }

    return node.height;
  }

  public boolean isEmpty(){
    return root ==null;
  }

  public void insert(int value ){
    root = insert(root, value);
  }

  private Node insert(Node node , int value){
    if(node == null){
      node = new Node(value);
      return node;
    }

    if(value > node.value){
      node.left = insert(node.left, value);
    }

    if(value < node.value){
      node.right = insert(node.right, value);
    }

    node.height = Math.max(height(node.left), height(node.left)) +1;

    return node;
  }

  public boolean balanced(){
    return balanced(root);
  }

  private boolean balanced(Node node){
    if(node == null){
      return true;
    }

    return (Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right));
  }

  public void display(){
    display(this.root , "Root Node : ");
  }

  private void display(Node node  , String details){
    if(node == null){
      return ;
    }

    System.out.println(details + node.value);
    display(node.left ,  "Left Child Of" + node.value + " : ");
    display(node.right ,  "Right Child Of" + node.value + " : ");
  }

  public void populate(int[] nums){
    for (int i = 0; i < nums.length; i++) {
        this.insert(nums[i]);
    }
  }
  
  public void populateSorted(int[] nums){
    populateSorted(nums , 0 , nums.length) ;
  }

  private void populateSorted(int[] nums , int start , int end ){
    if(start >= end){
      return ;
    }

    int mid = start + (end-start)/2;

    this.insert(nums[mid]);
    populateSorted(nums, start, mid);
    populateSorted(nums, mid+1, end);
  }

  // for all

  public void preOrder(){
    preOrder(root);
  }
  private void preOrder(Node node){
    if(node == null){
      return ;
    }
    System.out.println(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder(){
    inOrder(root);
  }
  private void inOrder(Node node){
    if(node == null){
      return ;
    }
    inOrder(node.left);
    System.out.println(node.value + " ");
    inOrder(node.right);
  }

  public void postOrder(){
    postOrder(root);
  }
  private void postOrder(Node node){
    if(node == null){
      return ;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value + " ");
  }
  
}
