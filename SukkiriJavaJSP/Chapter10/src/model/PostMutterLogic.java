package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RyomaArai on 15/03/11.
 */
public class PostMutterLogic {
    public void execute(Mutter mutter, List<Mutter> mutterList) {
        mutterList.add(0, mutter);
    }
}
