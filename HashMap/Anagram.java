import java.util.HashMap;

public class Anagram {
  public static void main(String[] args) {
    String s = "listen";
    String t = "silent";
    System.out.println(isAnagram(s, t));
  }

  static boolean isAnagram1(String s, String t) {
    if (s.length() != t.length()) return false;

    HashMap<Character, Integer> mp1 = createHash(s);
    HashMap<Character, Integer> mp2 = createHash(t);
    return mp1.equals(mp2);
  }


  static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    HashMap<Character, Integer> mp = createHash(s);
    for (int i = 0; i < t.length(); i++) {
      Character ch = t.charAt(i);
      if(!mp.containsKey(ch)) return false;
      int currFreq = mp.get(ch);
      mp.put(ch, currFreq-1);
    }

    for (var i : mp.values()) {
      if(i!=0) return false;
    }

    return true;
  }

  static HashMap<Character, Integer> createHash(String a) {
    HashMap<Character, Integer> mp = new HashMap<>();
    for (int i = 0; i < a.length(); i++) {
      Character ch = a.charAt(i);
      if (!mp.containsKey(ch)) {
        mp.put(ch, 1);
      } else {
        mp.put(ch, mp.get(ch) + 1);
      }
    }
    return mp;
  }
}
