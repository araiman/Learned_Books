package fantan;

import fantan.trump.Player;
import fantan.trump.Table;
import fantan.trump.Master;
import fantan.trump.Rule;
import fantan.trump.Card;

/**
 * Created by RyomaArai on 15/02/27.
 */
public class FantanPlayer extends Player {
    private int pass_;

    public FantanPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    public void receiveCard(Card card) {
        if (card.getNumber() == 7) {
            // カードが7の場合は、テーブルにカードを置く
            System.out.println(name_ + "は" + card + "を置きました");

            /*
            自分の回答
                Card[] sevenCard = new Card[1];
                sevenCard[0] = card;
             */

            table_.putCard(new Card[] { card });
        } else {
            /*
            自分の回答
            myHand_.addCard(card);
             */

            super.receiveCard(card);
        }
    }

    public void play(Player nextPlayer) {
        // 現在の手札を表示する
        System.out.println(" " + myHand_);
        Card[] candidate = rule_.findCandidate(myHand_, table_);
        if (candidate != null) {
            System.out.println(" "+ candidate[0] + "を置きました。 ");
            table_.putCard(candidate);

            if (myHand_.getNumberOfCards() == 0) {
                master_.declareWin(this);
            }
        } else {
            this.pass_++;
            ((FantanMaster)master_).pass(this);

            // パス回数が4回以上となった場合は、テーブルに全てのカードを置く
            if (pass_ > FantanMaster.PASS_LIMIT) {
                int numberOfHand = myHand_.getNumberOfCards();
                    for (int count = 0; count < numberOfHand; count++) {
                        table_.putCard(new Card[] { myHand_.pickCard(0)});
                    }
            }
        }

    }

    public int getPass() {
        return this.pass_;
    }
}
