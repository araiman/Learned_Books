package fantan.trump;

import java.lang.String;
import java.lang.StringBuffer;

public class Card {
    public static final int CLUB = 1;
    public static final int DIAMOND = 2;
    public static final int HEART = 3;
    public static final int SPADE = 4;

    // TODO スートの数・数字の数のフィールドは、なんのために使った？
    public static final int SUIT_NUM = 4;
    public static final int CARD_NUM = 13;

    protected int suit_;
    protected int number_;

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

    public int getSuit() {
        return this.suit_;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

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

        return stringBuffer.toString();
    }
}