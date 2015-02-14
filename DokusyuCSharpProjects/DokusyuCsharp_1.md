# 第1章 C#の基礎

## Ｃ＃の系統樹
- コンピュータ言語
	- 新しい言語が必ず、以前の言語の影響を受けている
  
- C言語
	- 構造化プログラミング言語の祖
		- 構造化プログラミングの構成要素
			- 順次
			- 反復
			- 分岐

- C++（C With Classes）
	- プログラムが、あまりに大きくなってしまっていた。
		- オブジェクト指向プログラミングが登場

- Java
	- Javaの革新性
		- プログラミング言語の進化というよりは、
		- 様々な種類のCPUやOSに対応したこと
			- なぜ、さまざまな環境に対応できたか
				- Javaは、「バイトコード」と呼ばれる、中間言語にプログラムを書き換えることができた。
					- バイトコードは、JVM（Java Virtual Machine）によって実行される。

- C#
	- Javaは革新的だったが、Windowsが提供する機能を、利用できるわけではなかった。
	- そこで、Microsoftが開発したのが、C#

- コマンドラインコンパイラの使い方
	- 「VisualStudioツール」フォルダ
		- 開発者コマンドプロント

	- csc Example.cs

## 1.6 最初のサンプルプログラム各行について
<code>
using System;  
class Example  
{  
	static void Main()  
	{  
		Console.WriteLine("Hello World");  
	}  
}  

</code>



- 名前空間の使用
	- using 名前空間名
		- <code>using System;</code>

- static　関数()
	- staticが付く、メソッドを含む、クラスのオブジェクトのインスタンスを作成しなくても、関数が実行できるようになる。


## 1.11 2つの制御文
- For文  
<code>
using System;  
class ForDemo{  
	static void Main() {  
		int count;  
		for(count = 0; count < 5; count++){  
			Console.WriteLine("Count:" + count);  
		}  
	}    
}  
</code>

- 注意点
	- for(初期化; 条件; インクリ)
		- 条件を書くとき、「,」ではなく、「;」


## 1.16 識別子
- C#で予約されたキーワード（forとか、breakとか）を、識別子にとして使う方法
	- 「@」を先頭に付ける
		- 例
			- @for


