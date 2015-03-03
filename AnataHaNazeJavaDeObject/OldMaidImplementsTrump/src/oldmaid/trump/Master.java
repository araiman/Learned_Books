package oldmaid.trump;

import java.lang.System;
import java.util.ArrayList;

public class Master {
    private ArrayList<Player> players_ = new ArrayList<Player>();

    // ゲームの準備をする
    public void prepareGame(Hand cards) {
        cards.shuffleHand();
        int numberOfCards = cards.getNumberOfCards();

        int numberOfPlayers = players_.size();

        for (int index = 0; index < numberOfCards; index++) {
            Card card = cards.pickCard(0);

            // 各プレイヤーに順番にカードを配る
            Player player = (Player) players_.get(index % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    // ゲームの開始をする
    public void startGame() {
        // ゲームの開始を宣言する
        System.out.println("【ゲームを開始します】");

        // 指名するプレイヤーの取得
        for (int count = 0; players_.size() > 1; count++) {
            int playerIndex = count % players_.size();
            int nextPlyaerIndex = (count + 1) % players_.size();

            Player player = (Player) players_.get(playerIndex);
            // 次のプレイヤーの取得
            Player nextPlayer = (Player) players_.get(nextPlyaerIndex);

            // プレイヤーを指名する
            player.play(nextPlayer);
        }

        // プレイヤーが上がって、残り1名となったとき、ゲームの終了を宣言する
        System.out.println("[ゲームを終了しました]");
    }

    // 上がり宣言を受けた場合
    public void declareWin(Player player) {
        System.out.println(player.getName() + "さんが上がりました。");
        this.players_.remove(player);

        if (this.players_.size() == 1) {
            Player looser = (Player) players_.get(0);
            System.out.println(looser.getName() + "さんの負けです");
        }
    }

    // ゲームに参加するプレイヤーを登録する
    public void registerPlayer(Player player) {
        this.players_.add(player);
    }

    // ゲームに参加するプレイヤーの登録を削除する
    public void deregisterPlayer(Player player) {
        // リストからプレイヤーを削除する
        players_.remove(players_.indexOf(player));

        // 残りプレイヤーが1人になったら、敗者を表示する
        if (players_.size() == 1) {
            Player looser = (Player) players_.get(0);
            System.out.println(" " + looser.getName() + "さんの負けです");
        }
    }
}