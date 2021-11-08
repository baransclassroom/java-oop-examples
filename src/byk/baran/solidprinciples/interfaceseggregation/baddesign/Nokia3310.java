package byk.baran.solidprinciples.interfaceseggregation.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:16
 **/
public class Nokia3310 implements Phone {
    @Override
    public void shot() {
        //no-op
    }

    @Override
    public void connectToInternet() {
        //no-op
    }

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void sendSMS() {
        System.out.println("Sending sms");
    }
}
