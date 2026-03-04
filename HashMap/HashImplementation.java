import java.util.*;

public class HashImplementation {
  
static class MyHashMap<K, V> {
  public static final int DEFAULT_CAPACITY = 4;
  public static final float DEFAULT_LOAD_FACTOR = 0.75f;

  private class Node {
   K key;
   V value;

   Node (K key , V value){
    this.key = key;
    this.value = value;
   }
  
  }
  
  private int n;

  private LinkedList<Node> [] Buckets;
  

  
  private int searchInBuckets(LinkedList<Node> ll, K key) {
    for (int i = 0; i < ll.size(); i++) {
      if(ll.get(i).key == key){
        return i;
      }
      
    }
    return -1;
  }
 
  public MyHashMap(){
    inItBuckets(DEFAULT_CAPACITY);
  }

  private void inItBuckets(int N) {
    Buckets = new LinkedList[N];
    for (int i = 0; i < Buckets.length; i++) {
        Buckets[i] = new LinkedList<>();
    }
  }

  private int HashFunc(K num){
  return (Math.abs(num.hashCode()) ) % Buckets.length;
  }

  void put(K key , V value){
   int bi = HashFunc(key);
   LinkedList<Node> currentBucket = Buckets[bi];
   int el = searchInBuckets(currentBucket ,key);
   if(el == -1){
    Node node = new Node(key, value);
    currentBucket.add(node);
    n++;
   } else {
    Node currNode = currentBucket.get(el);
    currNode.value = value;
   }

   if(n >= DEFAULT_CAPACITY*DEFAULT_LOAD_FACTOR){
     reHash();
   }
  }

 


  private void reHash() {
    LinkedList<Node>[] oldBuckets = Buckets;
    inItBuckets(oldBuckets.length*2);
    n=0;
    for (var bucket : oldBuckets) {
      for (var node : bucket) {
        put(node.key, node.value);
      }
    }
  }

  int size(){
    return n;
  }

  V get(K key){
    int bi =  HashFunc(key);
    LinkedList<Node> currBucket = Buckets[bi];
    int el = searchInBuckets(currBucket, key) ;
    if(el!=-1){
       Node currNode = currBucket.get(el);
        return currNode.value;
    }

    return null;
  }

  V remove(K key){
    int bi =  HashFunc(key);
    LinkedList<Node> currBucket = Buckets[bi];
    int el = searchInBuckets(currBucket, key) ;
    if(el!=-1){
       Node currNode = currBucket.get(el);
       V val = currNode.value;
      currBucket.remove(el);
      n--;
      return val;
    }

    return null;
  }
}

 public static void main(String[] args) {
   MyHashMap<String, Integer>  mp = new MyHashMap<>();
   mp.put("a", 1);
   mp.put("b", 2);
   mp.put("c", 3);
   System.out.println(mp.size());
   System.out.println(mp.get("b"));
   System.out.println(mp.get("d"));
   mp.put("c" , 5);
   System.out.println("c");
   System.out.println(mp.remove("f"));
   System.out.println(mp.size());
   System.out.println(mp.remove("b"));
   System.out.println(mp.size());
   


 }
}
