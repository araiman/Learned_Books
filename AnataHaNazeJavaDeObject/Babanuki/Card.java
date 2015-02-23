import java.lang.String;
import java.lang.StringBuffer;

public class Card {
    public static final int JOKER = 0;
    public static final int CLUB = 1;
    public static final int DIAMOND = 2;
    public static final int HEART = 3;
    public static final int SPADE = 4;

    private int suit_;
    private int number_;

    /*
    コンストラクタ
    @param suit スート
    @param number 数字
    */

    public Card(int suit, int number) {
        this.suit_ = suit;
        this.number_ = number;

    }

    public int getNumber() {
        return this.number_;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        if (suit_ > 0) {
            // スートの表示
            switch (suit_) {
                case CLUB:
                    stringBuffer.append("C");
                    break;

                case DIAMOND:
                    stringBuffer.append("D");
                    break;

                case HEART:
                    stringBuffer.append("H");
                    break;

                case SPADE:
                    stringBuffer.append("S");
                    break;
            }

            // 数字の表示
            switch (number_) {
                case 1:
                    stringBuffer.append("A");
                    break;
                case 10:
                    stringBuffer.append("T");
                    break;
                case 11:
                    stringBuffer.append("J");
                    break;
                case 12:
                    stringBuffer.append("Q");
                    break;
                case 13:
                    stringBuffer.append("K");
                    break;
                default:
                    stringBuffer.append(number_);
                    break;
            }
        } else {
            //ジョーカーの表示
            stringBuffer.append("JK");
        }

        return stringBuffer.toString();
    }
}