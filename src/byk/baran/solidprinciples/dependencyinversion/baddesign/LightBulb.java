package byk.baran.solidprinciples.dependencyinversion.baddesign;

public class LightBulb {
    public void turnOn() {

        System.out.println("LightBulb: Bulb turned on...");
    }

    public void turnOff() {

        System.out.println("LightBulb: Bulb turned off...");
    }
}