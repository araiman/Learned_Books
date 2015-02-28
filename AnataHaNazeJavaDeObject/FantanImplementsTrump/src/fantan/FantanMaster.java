package fantan;

import fantan.trump.Master;

/**
 * Created by RyomaArai on 15/02/27.
 */
public class FantanMaster extends Master {
    public static final int PASS_LIMIT = 3;

    public void pass(FantanPlayer player) {
        // パスカウントを表示
        System.out.println(" " + player.getName() + "さんは" + player.getPass() + "回目のパスをしました");

        // パスカウントが、3回目に達していないかを確認する
        if (player.getPass() > PASS_LIMIT) {
            System.out.println(" " + player.getName() + "さんは負けです");
            deregisterPlayer(player);
        }
    }
}