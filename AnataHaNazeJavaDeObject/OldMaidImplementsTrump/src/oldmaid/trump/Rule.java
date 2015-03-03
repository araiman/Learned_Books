package oldmaid.trump;

/**
 * Created by RyomaArai on 15/02/27.
 */
public interface Rule {
    /*
        手札とテーブルから、テーブルに出し得るカードの組み合わせを探す
     */

    public Card[] findCandidate(Hand hand, Table table);
}
