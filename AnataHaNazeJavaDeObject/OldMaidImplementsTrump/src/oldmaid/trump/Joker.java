package oldmaid.trump;

/**
 * Created by RyomaArai on 15/02/27.
 */
public class Joker extends Card {
    public Joker() {
        super(0, 0);
    }

    // 数を変更する
    public void setNum(int num) {
        this.number_ = num;
    }

    // SUITを変更する
    public void setSuit(int suit) {
        this.suit_ = suit;
    }

    // カードを文字列で表現する
    public String toString() {
        return "JK";
    }
}
