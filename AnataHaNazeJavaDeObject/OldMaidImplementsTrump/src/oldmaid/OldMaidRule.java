package oldmaid;

import oldmaid.trump.Card;
import oldmaid.trump.Rule;
import oldmaid.trump.Hand;
import oldmaid.trump.Table;

/**
 * Created by RyomaArai on 15/02/28.
 */
public class OldMaidRule implements Rule {
    public Card[] findCandidate(Hand hand, Table table) {
        Card[] sameCards = null;
        int lastIndex = hand.getNumberOfCards() - 1;
        Card lastCard = hand.lookCard(lastIndex);
        int lastCardNumber = lastCard.getNumber();

        for (int number = 0; number < lastIndex; number++) {
            Card card = hand.lookCard(number);
            int num = card.getNumber();

            if (num == lastCardNumber) {
                sameCards = new Card[2];
                sameCards[0] = (Card) hand.pickCard(lastIndex);
                sameCards[1] = (Card) hand.pickCard(num);

                return sameCards;
            }
        }

        return null;
    }
}
