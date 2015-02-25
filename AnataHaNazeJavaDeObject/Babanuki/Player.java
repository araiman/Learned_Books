import java.util.logging.Logger;

public class Player {
    // 進行役
    private Master master_;
    private Table table_;
    private Hand myHand_ = new Hand();
    private String name_;

    // コンストラクタ
    public Player(String name, Master master, Table table) {
        this.name_ = name;
        this.master_ = master;
        this.table_ = table;
    }

    // 名前のGetter
    public String getName() {
        return this.name_;
    }

    // 指名された際

    public void play(Player nextPlayer) {
        // 手札を見る
        Hand nextHand = nextPlayer.showHand();

        // カードを1枚引く
        Card pickedCard = nextHand.pickCard();

        // 引いた結果を表示
        System.out.println(this.getName() + ":" + nextPlayer.getName() + "さんから" + pickedCard + "を引きました");

        // 手札にカードを加え、同じカードを探す。もし、同じカードがあれば、カードを捨てる
        dealCard(pickedCard);

        // カードの枚数がゼロだったら、進行役に上がりを宣言する
        if (myHand_.getNumberOfCards() == 0) {
            this.master_.declareWin(this);
        } else {
            System.out.println(this.getName() + ":残りの手札は" + myHand_ + "です");
        }
    }


    // 手札を見せる
    public Hand showHand() {
        // もし、この時点で手札が残り1枚ならば上がりとなるので宣言する
        if (myHand_.getNumberOfCards() == 1) {
            master_.declareWin(this);
        }

        // 見せる前にシャッフルする
        myHand_.shuffleHand();

        return this.myHand_;
    }

    // カードを手札に加える
    public void receiveCard(Card card) {
        dealCard(card);
    }

    public void dealCard(Card pickedCard) {
        // カードを加える
        myHand_.addCard(pickedCard);

        // 同じ数のカードを探す
        Card[] sameCards = myHand_.findSameNumberCard();

        if (sameCards != null) {
            // カードを捨てる
            this.table_.disposeCard(sameCards);
        }
    }

}