package model;

/**
 * Created by RyomaArai on 15/03/10.
 */
public class HealthCheckLogic {
    public void execute(Health health) {
        double bmi = health.getWeight() / ((health.getHeight() / 100) * (health.getHeight() / 100));
        health.setBmi(bmi);

        String bodyType;
        if (bmi < 18.5) {
            bodyType = "痩せ型";
        } else if (bmi >= 25) {
            bodyType = "肥満";
        } else {
            bodyType = "普通";
        }
        health.setBodyType(bodyType);
    }
}
