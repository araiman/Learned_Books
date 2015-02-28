package trump;

public abstract class Player {
    // 進行役
    protected String name_;
    protected Master master_;
    protected Hand myHand_ = new Hand();
    protected Table table_;
    protected Rule rule_;

    // コンストラクタ
    public Player(String name, Master master, Table table, Rule rule) {
        this.name_ = name;
        this.master_ = master;
        this.table_ = table;
        this.rule_ = rule;
    }

    // 名前のGetter
    public String getName() {
        return this.name_;
    }

    // 指名された際
    public abstract void play(Player nextPlayer);

    // カードを手札に加える
    public void receiveCard(Card card) {
        myHand_.addCard(card);
    }
}