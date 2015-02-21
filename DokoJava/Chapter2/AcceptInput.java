public class AcceptInput{
  public static void main(String[]args){
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println(name);
  }
}
