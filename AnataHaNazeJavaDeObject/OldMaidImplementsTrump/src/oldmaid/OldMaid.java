package oldmaid;

import oldmaid.trump.*;

/**
 * Created by RyomaArai on 15/02/28.
 */
public class OldMaid {
    public static void main(String[] args) {
        // 進行役の生成
        Master master = new Master();
        // テーブルの生成
        Table table = new OldMaidTable();
        // ルールの生成
        Rule rule = new OldMaidRule();
        // プレイヤーの生成
        Player murata = new OldMaidPlayer("Murata", master, table, rule);
        Player yamada = new OldMaidPlayer("Yamada", master, table, rule);
        Player saito = new OldMaidPlayer("Saito", master, table, rule);

        // ゲームに参加するプレイヤーを登録する
        master.registerPlayer(murata);
        master.registerPlayer(yamada);
        master.registerPlayer(saito);

        // トランプの生成
        Hand trump = createTrump();

        // ゲームの準備をする
        master.prepareGame(trump);

        // ゲームを開始する
        master.startGame();
    }

    private static Hand createTrump() {
        Hand trump = new Hand();

        for (int count = 1; count < 13; count++) {
            Card club = new Card(Card.CLUB, count);
            Card diamond = new Card(Card.DIAMOND, count);
            Card heart = new Card(Card.HEART, count);
            Card spade = new Card(Card.SPADE, count);

            trump.addCard(club);
            trump.addCard(diamond);
            trump.addCard(heart);
            trump.addCard(spade);
        }
        Joker joker = new Joker();
        trump.addCard(joker);

        return trump;
    }
}
