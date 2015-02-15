# 3-1 ゲームオブジェクトの位置と大きさ

## 位置・向き・大きさを管理するTransform（P115）
- Transformクラスとは
	- GameObjectの表示に関する情報をまとめて管理するクラス。
		- 位置
		- 向き
		- 大きさ

## なぜ繰り返し処理がないのか
- Updateクラスの働き
	- １秒間に、何十回も書き換える働きがある。


## rotationプロパティとRotationメソッド
- オブジェクトの向きを変える
	- Transform.Rotate(Vector3);
		- 例
			- transform.Rotate(1, 1, 1);

## 大きさとlocalScaleプロパティ
- 大きさに関するプロパティ
	- <code>
	Debug.Log(transform.localScale);
	</code>	
	- -> (1.0, 1.0, 1.0)
		- Vector3型の、値が返ってきた。


-