package model;

import java.io.Serializable;

/**
 * Created by RyomaArai on 15/03/10.
 */
public class Health implements Serializable {
    private double height;
    private double weight;
    private double bmi;
    private String bodyType;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getBmi() {
        return this.bmi;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return this.bodyType;
    }

}
