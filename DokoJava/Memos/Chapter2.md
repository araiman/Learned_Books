# 2章 スッキリわかるJava

## 要点

## 疑問
- aliasとは何か
	- 長いコマンドなどを、短い名前に置き換えるためのコマンド

## 単語
- オペランドとは
	- 「a」、「5」などのこと。
	- 演算の対象となる値や、変数のこと。

- リテラルとは
	- ソースコードに記述されているオペランドのこと。

- 評価とは
	- 式に従って、計算処理をすること

- 演算子とは
	- 「+」、「=」などのこと。

- キャスト演算子とは
	- 強制的な型変換を指示する演算子

- 大きいほうの数字を代入する命令
	- Math.max(①,②)

- String型の数字を、Intに変換する命令
	- Integer.parseInt(hoge)

- 乱数（整数）を生み出す命令
	- java.util.Random.nextInt(hoge)
		- 0以上、hoge以下の乱数を生み出す。

- キーボードから、１行の入力を受け取る命令
	- java.util.Scanner.nextLine()

## 抜粋

### 2.5 型の変換
- 自動的に行われる型の変換
	- 小さな型から、大きな方への変換
		- 例外
			- int型のみ、byte型・short型に代入することができる。
	- 型が一致しないもの同士で、計算した場合

- 強制的な型変換
	- 大きな方から、小さな型への変換が可能に
		- <code>int age = (int)3.0;</code>
			- (int)キャスト演算子
	- 余程の理由がない限り使わない

	- 名前の入力を受け付けるプログラム
		- <code>public class AcceptInput{  
  public static void main(String[]args){  
    System.out.println("あなたの名前を入力してください");  
    String name = new   java.util.Scanner(System.in).nextLine();  
    System.out.println(name);  
  }
}
	      </code>
