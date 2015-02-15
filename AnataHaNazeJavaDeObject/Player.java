public class Player
{

	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	//-----
	//プレイヤークラスの属性
	//-----
	
	/** プレイヤーの名前 */

	private String name_;

	/** プレイヤーの勝った回数　*/

	private int winCount_ = 0;

	/** 与えられた戦略 */

	private Tactics tactics_;

	//-----
	//プレイヤークラスの操作
	//-----
	
	// プレイヤーに戦略を渡す。
	void setTactics(Tactics tactics){
		tactics_ = tactics;
	}
	
	/**
	 * ジャンケンの手を出す
	 *
	 * @return ジャンケンの手
	 */

	public int showHand()
	{
		int hand = tactics_.readTactics();
		return hand;
	}


	/**
	 * 審判から勝敗を聞く
	 *
	 * @param result true:勝 false:負
	 */

	public void notifyResult(boolean result)
	{
		if(true == result)
		{
			winCount += 1;			
		}
	}

	/**
	 * 自分の勝った回数を答える
	 *
	 * @return 勝った回数
	 */

	public int getWinCount()
	{
		return winCount_;
	}
}
