import javax.smartcardio.Card;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuffer;
import java.util.ArrayList;

public class Hand {
    private ArrayList hand_ = new ArrayList();

    public void addCard(Card card) {
        hand_.add(card);
    }

    public Card pickCard() {
        Card pickedCard = hand_.remove(0);
        return pickedCard;
    }

    public Card[] findSameNumberCard() {
        int numberOfCards = hand_.size;
        Card[] sameCards = null;

        // TODO 何もない場合の判定っているのか？何もない場合って、上がりの時しか無いよな。
        // 手札に何もない場合、何もしない
        if (numberOfCards > 0) {
            // 最後に追加されたカードを取得する
            int lastIndex = numberOfCards - 1;
            Card lastAddedCard = (Card) hand_.get(lastIndex);

            // 最後に追加されたカードの数字を取得する
            int lastAddedCardNum = lastAddedCard.getNumber();

            for (int index = 0; index < lastIndex; index++) {
                Card card = hand_.get(index);
                if (card.getNumber() == lastAddedCardNum) {
                    sameCards = new Card[2];
                    sameCards[0] = (Card) hand_.remove(lastIndex);
                    sameCards[1] = (Card) hand_.remove(index);
                    break;
                }
            }

            return sameCards;
        }
    }

    public void shuffleHand() {
        int numberOfCards = hand_.size();

        // 抜き出す位置
        int pos;

        for (int i = 0; i < numberOfCards * 2; i++) {
            int pos = (int) hand_.get(Math.random() * numberOfCards);
            Card card = (Card) hand_.remove(pos);
            hand_.add(card);
        }
    }

    public int getNumberOfCards() {
        return hand_.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        int numberOfCards = hand_.size();
        if (numberOfCards > 0) {
            for (int index = 0; index < numberOfCards; index++) {
                Card card = (Card) hand_.get(index);
                stringBuffer.append(card);
                stringBuffer.append(" ");
            }
        }

        return stringBuffer.toString();
    }
}