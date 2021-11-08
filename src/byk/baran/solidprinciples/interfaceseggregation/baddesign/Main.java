package byk.baran.solidprinciples.interfaceseggregation.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:16
 **/
public class Main {

    public static void main(String[] args) {
        Phone iphone = new IphoneX();
        iphone.call();
        iphone.connectToInternet();
        iphone.sendSMS();
        iphone.shot();

        Phone nokia3310 = new Nokia3310();
        nokia3310.call();
        nokia3310.connectToInternet();
        nokia3310.sendSMS();
        nokia3310.shot();


        //as you see, Nokia3310 should not have shot() and connectToInternet() behaviours.
        //The bad design because we've created one interface and aggregated all behaviour in same interface.
    }
}
