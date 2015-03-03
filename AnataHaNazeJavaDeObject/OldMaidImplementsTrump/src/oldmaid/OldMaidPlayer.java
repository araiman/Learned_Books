package oldmaid;

import oldmaid.trump.Card;
import oldmaid.trump.Hand;
import oldmaid.trump.Master;
import oldmaid.trump.Player;
import oldmaid.trump.Table;
import oldmaid.trump.Rule;

/**
 * Created by RyomaArai on 15/02/28.
 */
public class OldMaidPlayer extends Player {
    public OldMaidPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    public void play(Player nextPlayer) {
        // 手札を見る
        Hand nextHand = ((OldMaidPlayer) nextPlayer).showHand();

        // カードを1枚引く
        Card pickedCard = nextHand.pickCard(0);

        // 引いた結果を表示
        System.out.println(this.getName() + ":" + nextPlayer.getName() + "さんから" + pickedCard + "を引きました");

        // 手札にカードを加え、同じカードを探す。もし、同じカードがあれば、カードを捨てる
        myHand_.addCard(pickedCard);
        Card[] sameCards = rule_.findCandidate(myHand_, table_);

        if (sameCards != null) {
            System.out.print(this + ":");
            table_.putCard(sameCards);

            if (myHand_.getNumberOfCards() == 0) {
                this.master_.declareWin(this);
            }
        }

            System.out.println(this.getName() + ":残りの手札は" + myHand_ + "です");
    }

    public Hand showHand() {
        // もし、この時点で手札が残り1枚ならば上がりとなるので宣言する
        if (myHand_.getNumberOfCards() == 1) {
            master_.declareWin(this);
        }

        // 見せる前にシャッフルする
        myHand_.shuffleHand();

        return this.myHand_;
    }

    public void receiveCard(Card pickedCard) {
        // カードを加える
        super.receiveCard(pickedCard);

        // 同じ数のカードを探す
        Card[] sameCards = rule_.findCandidate(this.myHand_, table_);

        if (sameCards != null) {
            // カードを捨てる
            this.table_.putCard(sameCards);
        }
    }
}
