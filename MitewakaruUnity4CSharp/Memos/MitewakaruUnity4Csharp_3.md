#　重要事項

- Transformと、Vector3による位置の決定
- キー入力のチェック方法
	-　GetKeyUp/Downと、GetKeyの違い
	- キーコードの取り方
		- Alphabet
		- Number
		- 矢印
		- その他（Spaceキーとか）
- AddForceでオブジェクトを動かす
	- AddForce(X軸, Y軸, Z軸);

- その他
	- 動的に、GameObjectを見つけ出す方法

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


## キーボード入力と「GetKey」メソッド
- キーが押されているかをチェックする
	- bool 変数　= Input.GetKey(<KeyCode>)

- キーが、押されたことをチェックする
	- bool 変数　= Input.GetKeyDown(<KeyCode>)

- キーが、離されたことをチェックする
	- bool 変数　= Input.GetKeyUp(<KeyCode>)

- GetKeyと、GetKeyDownの違い
	- GetKey 
		- 押している間、ずっと動き続ける
	- GetKeyDown
		- 押した瞬間だけ動く

- KeyCode
	- Alphabet
		- KeyCode.A など
	- Number
		- KeyCode.Alpha0 など

	- 矢印キー
		- KeyCode.UpArrow（上） など

	- その他
		- Keycode.Space など

- Transformの位置を示すVector3プロパティ
	- Up
		- 上
	- forward
		- 前
	- Right
		- 右



## ボールを追跡表示するカメラ

- Scene上の、GameObjectを選ぶ
	- GameObject.Find(名前)


# 3-3 超簡易版ビリヤードに挑戦しよう

## スクリプトのポイントをチェック！

- カメラ位置からボールに向けて力を加える
	- カメラの位置（0, 0.5, -20）から、ボールの位置（0, 0.5, -15）のVector3を引けば、２つの地点のベクトル情報を得ることが出来る。
		- つまり、（0, 0.5, -5）


- カメラがゲームオブジェクトの周りを回転する
	- <Transform>.RotateAround(中心位置, 距離, 回転角度)
		- transform.RotateAround(pos, new Vector3(0, 10, 0), -0.1f)
	- 回転角度
		- 単位
			- 度

