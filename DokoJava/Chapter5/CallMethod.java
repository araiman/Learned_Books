/* サンプルコードのメソッド「hello」の「static」を外して、
 * プログラムが実行できるか試してみる。
*/

public class CallMethod{
  public static void main(String[]args){
        hello();
  }

  public void hello(){
    System.out.println("こんにてゃ");
  }
}
