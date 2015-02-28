package fantan;

import fantan.trump.Card;
import fantan.trump.Hand;
import fantan.trump.Rule;
import fantan.trump.Table;

/**
 * Created by RyomaArai on 15/02/27.
 */
public class FantanRule implements Rule {
    public Card[] findCandidate(Hand hand, Table table) {
        Card[] candidate = null;

        //手札にあるカードを1枚、1枚調べ、テーブルに置けるかを確認する
        int numberOfHand = hand.getNumberOfCards();
        for (int position = 0; position < numberOfHand; position++) {
            // 手札にあるカードを見る
            Card lookingCard = hand.lookCard(position);
            int number = lookingCard.getNumber();
            int suit = lookingCard.getSuit();

            // 今、注目しているカードの左か右にカードがあれば、カードを置ける
            int leftNumber = (number != 1) ? number - 1 : Card.CARD_NUM;
            int rightNumber = (number != Card.CARD_NUM) ? number + 1 : 1;

            if ((true == isThereCard(table, suit, leftNumber))
                    || (true == isThereCard(table, suit, rightNumber))) {
                candidate = new Card[1];
                candidate[0] = hand.pickCard(position);
                break;
            }
        }

        return candidate;
    }

    // テーブルにカードが置かれているか調べる
    private boolean isThereCard(Table table, int suit, int number) {
        // テーブルにあるカードを調べ、カードが置かれているか調べる
        Card[][] cards = table.getCards();
        if (cards[suit - 1][number - 1] != null) {
            return true;
        } else {
            return false;
        }
    }
}
