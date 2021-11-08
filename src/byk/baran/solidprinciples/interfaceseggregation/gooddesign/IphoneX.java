package byk.baran.solidprinciples.interfaceseggregation.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:21
 **/
public class IphoneX implements Phone, HasConnectInternet, HasShot {

    @Override
    public void shot() {
        System.out.println("Shotting");
    }

    @Override
    public void connect() {
        System.out.println("Connected to internet");
    }


    @Override
    public void call() {

    }

    @Override
    public void send() {

    }
}
