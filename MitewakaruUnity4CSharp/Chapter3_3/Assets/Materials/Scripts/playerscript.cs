using UnityEngine;
using System.Collections;

public class playerscript : MonoBehaviour {
	float dgr = 0;
	float power = 0;

	// Use this for initialization
	void Start () {
	
	}
	
	// Update is called once per frame
	void Update () {
		Vector3 pos = transform.position;

		// スペースバーを押した時の処理
		if(Input.GetKeyDown(KeyCode.Space)){
			power = 0;
		}
		// スペースバーを押している時の処理
		if(Input.GetKey(KeyCode.Space)){
			power++;
		}
		// スペースバーを離した時の処理
		if(Input.GetKeyUp(KeyCode.Space)){
			Vector3 v = Camera.main.transform.position;
			v -= pos;
			v *= power * -1;
			v.y = 0;
			transform.rigidbody.AddForce(v);
		
		// 左矢印キーの処理。視点を回す。
		if(Input.GetKey(KeyCode.LeftArrow)){
			Camera.main.transform.RotateAround(pos, new Vector3(0, 10, 0), -0.1f);
			
		}
		// 右矢印キーの処理。視点を回す。
		if(Input.GetKey(KeyCode.RightArrow)){
			Camera.main.transform.RotateAround(pos, new Vector3(0, 10, 0), 0.1f);
			dgr -= 0.1f;
		}
		// カメラの新たな位置の計算
		float d = (2 * Mathf.PI) * (dgr / 360);
		float x = Mathf.Sin(d);
		float y = Mathf.Cos(d);
		x *= 10f;
		y *= 10f;
		pos.x += x;
		pos.y += 10f;
		pos.z -= y;
		Camera.main.transform.position = pos;
	}
}
