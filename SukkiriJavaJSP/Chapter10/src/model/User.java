package model;

import java.io.Serializable;

/**
 * Created by RyomaArai on 15/03/10.
 */
public class User implements Serializable {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }
}
