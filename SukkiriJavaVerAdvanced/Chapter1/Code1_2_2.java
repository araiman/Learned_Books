public class Code1_2_2 {
  public static void main(String[] args) {
    String s = "Java and JavaScript";

    // 文字sが最初に登場する位置を調べる
      int firstLocation = s.indexOf("Java");
      System.out.println("文字列が初めて登場するのは"+ firstLocation + "です");
    
    // 文字sが最初に登場する位置を調べる
      int lastLocation = s.indexOf("JavaScript");
      System.out.println("後ろから数えて文字列が初めて登場するのは"+ lastLocation + "です");
  }
}
