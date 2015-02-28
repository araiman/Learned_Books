package fantan;

import fantan.trump.Card;
import fantan.trump.Table;

/**
 * Created by RyomaArai on 15/02/27.
 */
public class FantanTable implements Table {
    // カードを並べる2次元配列
    private Card[][] table_ = new Card[Card.SUIT_NUM][Card.CARD_NUM];

    public void putCard(Card[] card) {
        int number = card[0].getNumber();
        int suit = card[0].getSuit();

        // テーブルにカードを置く
        table_[suit - 1][number - 1] = card[0];
    }

    public Card[][] getCards() {
        Card[][] table = new Card[Card.SUIT_NUM][Card.CARD_NUM];
        for (int suitNum = 0; suitNum < Card.SUIT_NUM; suitNum++) {
            System.arraycopy(table_[suitNum], 0, table[suitNum], 0, Card.CARD_NUM);
        }

        return table;
    }

    public String toString() {
        StringBuffer tableString = new StringBuffer(200);
        for (int suit = 0; suit < Card.SUIT_NUM; suit++) {
            for (int number = 0; number < Card.CARD_NUM; number++) {
                if (table_[suit][number] != null) {
                    tableString.append(table_[suit][number]);
                } else {
                    tableString.append("..");
                }
                tableString.append(" ");
            }
        }

        return tableString.toString();
    }
}
