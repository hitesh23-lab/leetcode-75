public class Merge_Strings_Alternately {
  public String mergeAlternately(String word1, String word2) {
    StringBuilder sb = new StringBuilder();
    int w1 = word1.length();
    int w2 = word2.length();
    int length = Math.min(w1, w2);
    for (int i = 0; i < length; i++) {
      sb.append(word1.charAt(i));
      sb.append(word2.charAt(i));
    }
    if (w1 > w2) {
      sb.append(word1.substring(w2));
    } else if (w2 > w1) {
      sb.append(word2.substring(w1));
    }
    return sb.toString();
  }

  void main() {
    System.out.println(mergeAlternately("abc", "pqr"));
  }
}
