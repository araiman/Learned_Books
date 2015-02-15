public class RandomTactics implements Tactics{
	public int readTactics(){
		int hand = 0;
		double randomNum = Math.random() * 3;

		if(randomNum < 1.0){
			hand = Player.STONE;
		}
		else if(randomNum >= 1.0 && randomNum < 2.0){
			hand = Player.SCISSORS;
		}
		else if(randomNum >= 3.0){
			hand = Player.PAPER;
		}
		return hand;
	}
}
