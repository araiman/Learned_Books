package fantan;


import fantan.trump.Hand;
import fantan.trump.Card;

/**
 * Created by RyomaArai on 15/02/28.
 */
public class Fantan {
    public static void main(String[] args) {
        FantanMaster master = new FantanMaster();
        FantanTable table = new FantanTable();
        FantanRule rule = new FantanRule();
        FantanPlayer murata = new FantanPlayer("murata", master, table, rule);
        FantanPlayer yamada = new FantanPlayer("yamada", master, table, rule);
        FantanPlayer saito = new FantanPlayer("saito", master, table, rule);

        master.registerPlayer(murata);
        master.registerPlayer(yamada);
        master.registerPlayer(saito);

        Hand trump = createTrump();

        master.prepareGame(trump);
        master.startGame();
    }

    // 53枚のトランプの生成
    private static Hand createTrump() {
        Hand trump = new Hand();

        // 各スート53枚のカードを生成する
        for (int number = 1; number <= Card.CARD_NUM; number++) {
            trump.addCard(new Card(Card.CLUB, number));
            trump.addCard(new Card(Card.DIAMOND, number));
            trump.addCard(new Card(Card.HEART, number));
            trump.addCard(new Card(Card.SPADE, number));
        }

        return trump;
    }
}
