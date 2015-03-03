package oldmaid;

import oldmaid.trump.Card;
import oldmaid.trump.Table;

import java.util.ArrayList;

/**
 * Created by RyomaArai on 15/02/28.
 */
public class OldMaidTable implements Table {
    private ArrayList<Card[]> disposecards_ = new ArrayList<Card[]>();

    public void putCard(Card[] card) {
        for (int index = 0; index < card.length; index++) {
            System.out.print(card[index] + " ");
        }
        System.out.println("を捨てました");

        disposecards_.add(card);
    }

    public Card[][] getCards() {
        return null;
    }
}
