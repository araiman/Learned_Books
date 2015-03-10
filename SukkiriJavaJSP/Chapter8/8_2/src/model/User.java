package model;

import java.io.Serializable;

/**
 * Created by RyomaArai on 15/03/10.
 */
public class User implements Serializable{
    private String id;
    private String password;
    private String name;

    public User() {
    }

    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

}
