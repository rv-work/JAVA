

public class builder {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello World");
    System.out.println(str);
    str.setCharAt(2, 'y');
    System.out.println(str);
    str.append("tumse");
    System.out.println(str);
    str.append(10);
    System.out.println(str);
    str.insert(2,'z');
    System.out.println(str);
    str.delete(0,1);
    System.out.println(str);
    str.deleteCharAt(2);
    System.out.println(str);
    str.reverse();
    System.out.println(str);

    // rest same indexOf charAt substring....but lower upper  concate startwith endwith not availble..........
  }
}
