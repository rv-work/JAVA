import java.util.*;

public class Implement {

  static class Node {
   
    int value;
    Node left; 
    Node right;
    Node(int value){
      this.value = value;
    }
  }

  static Node BT(){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x == -1) return null;
    Node temp = new Node(x);
    System.out.print("Enter The Left Child Of " + x + ": ");
    temp.left = BT();
    System.out.print("Enter The Right Child Of " + x + ": ");
    temp.right = BT();
    return temp;
  }

 static void preOrder(Node root){
    if(root == null) return;
    
    System.out.print(root.value  + " ");
    preOrder(root.left);
    preOrder(root.right);
  }


  static void inOrder(Node root){
    if(root == null) return;
    

    preOrder(root.left);
    System.out.print(root.value  + " ");
    preOrder(root.right);
  }


  static void postOrder(Node root){
    if(root == null) return;
    
    preOrder(root.left);
    preOrder(root.right);
    System.out.print(root.value + " ");
  }

  public static void main(String[] args) {
    System.out.print("Enter The Root Node : ");
    Node root;
    root = BT();
    preOrder(root);
    System.out.println();
    inOrder(root);
    System.out.println();
    postOrder(root);
    
  }
}