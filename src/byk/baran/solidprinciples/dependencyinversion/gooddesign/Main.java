package byk.baran.solidprinciples.dependencyinversion.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:38
 **/
public class Main {

    public static void main(String[] args) {
        Switchable switchableBulb = new LightBulb();

        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);

        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
