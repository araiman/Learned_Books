package model;

import java.io.Serializable;

/**
 * Created by RyomaArai on 15/03/10.
 */
public class Mutter implements Serializable {
    private String userName;
    private String content;

    public Mutter() {
    }

    public Mutter(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    public String getName() {
        return this.userName;
    }

    public String getContent() {
        return this.content;
    }
}
