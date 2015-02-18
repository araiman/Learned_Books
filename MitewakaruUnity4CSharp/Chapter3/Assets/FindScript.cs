using UnityEngine;
using System.Collections;

public class FindScript : MonoBehaviour {

	// Use this for initialization
	void Start () {
	
	}
	
	// Update is called once per frame
	void Update () {
		if(Input.GetKey(KeyCode.UpArrow)){
			transform.rigidbody.AddForce(0, 0, 1);
		}
		if(Input.GetKey(KeyCode.DownArrow)){
			transform.rigidbody.AddForce(0, 0, -1);
		}
		if(Input.GetKey(KeyCode.RightArrow)){
			transform.rigidbody.AddForce(1, 0, 0);
		}
		if(Input.GetKey(KeyCode.LeftArrow)){
			transform.rigidbody.AddForce(-1, 0, 0);
		}

		Vector3 cameraPosition = transform.position;
		cameraPosition.y += 2.5f;
		cameraPosition.z -= 3f;
		GameObject camera = GameObject.Find("Main Camera");
		camera.transform.position = cameraPosition;
	}
}
