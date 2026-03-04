import java.util.*;

public class Implement {
  static class Node{
    int value;
    Node left;
    Node right;

    Node(int data){
      value = data;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Root Node : ");
    int x = sc.nextInt();
    Node root = new Node(x);
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
      Node temp = q.poll();
      System.out.print("Enter The Left Child of " + temp.value + ":");
      int Left = sc.nextInt();
      if(Left != -1){
        temp.left = new Node(Left);
        q.add(temp.left);
      }

      System.out.print("Enter The Right Child of " + temp.value + ":");
      int Right = sc.nextInt();
      sc.close();
      if(Left != -1){
        temp.right = new Node(Right);
        q.add(temp.right);
      }

    }
  }
}
