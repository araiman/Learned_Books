package model;

/**
 * Created by RyomaArai on 15/03/10.
 */
public class LoginLogic {
    public boolean execute(User user) {
        if (user.getPassword().equals("1234")) {
            return true;
        }
        return false;
    }
}
