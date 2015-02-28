package fantan.trump;

import java.lang.Math;
import java.lang.String;
import java.lang.StringBuffer;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand_ = new ArrayList<Card>();

    public void addCard(Card card) {
        hand_.add(card);
    }

    // TODO lookCardって、なんのためにあるの？
    public Card lookCard(int position) {
        Card lookingCard = null;

        if ((position >= 0) && (position < hand_.size())) {
            lookingCard = (Card) hand_.get(position);
        }

        return lookingCard;
    }

    public Card pickCard(int position) {
        Card pickedCard = null;

        if ((position >= 0) && (position < hand_.size())) {
            pickedCard = (Card) hand_.remove(position);
        }

        return pickedCard;
    }

    public void shuffleHand() {
        int numberOfCards = hand_.size();

        // 抜き出す位置
        int pos;

        for (int i = 0; i < numberOfCards * 2; i++) {
            pos = (int) (Math.random() * numberOfCards);
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