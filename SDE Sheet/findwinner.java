
public class findwinner {
    
     static int findTheWinner(int n, int k) {
        Node head = new Node(1);
        Node temp = head;
        for(int i = 2; i <= n; i++){
            Node temp1 = new Node(i);
            temp.next = temp1;
            temp = temp1;
        }
        temp.next = head;
        temp = head;
        while(temp.next != temp){
           for(int i = 1; i <=k-2; i++){
            temp = temp.next;
        } 
        temp.next = temp.next.next;
        temp = temp.next;
    }
        
      return temp.value;
    }


    
	public static void main(String[] args) {
	  int ans = findTheWinner(5 , 2);
	  System.out.println(ans);
	}
}

