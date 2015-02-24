import java.util.ArrayList;
import java.util.logging.Logger;

public class OldMaid {
    public static void main(String[]args) {
        // 進行役の生成
        Master master = new Master();
        // テーブルの生成
        Table table = new Table();
        // プレイヤーの生成
        Player murata = new Player("Murata", master, table);
        Player yamada = new Player("Yamada", master, table);
        Player saito = new Player("Saito", master, table);

        // loggerを消す
        final Logger logger = Logger.getLogger("get master");
        logger.info(""+master);

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

    private static Hand createTrump () {
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
        Card joker = new Card(0, Card.JOKER);
        trump.addCard(joker);

        return trump;
    }
}