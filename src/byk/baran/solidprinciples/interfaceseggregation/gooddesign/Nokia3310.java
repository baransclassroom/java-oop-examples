package byk.baran.solidprinciples.interfaceseggregation.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:22
 **/
public class Nokia3310 implements Phone {
    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void send() {
        System.out.println("Sending sms");
    }
}
