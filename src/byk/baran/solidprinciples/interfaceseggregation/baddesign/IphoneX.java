package byk.baran.solidprinciples.interfaceseggregation.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:15
 **/
public class IphoneX implements Phone {

    @Override
    public void shot() {
        System.out.println("Shotting");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connected to internet");
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
