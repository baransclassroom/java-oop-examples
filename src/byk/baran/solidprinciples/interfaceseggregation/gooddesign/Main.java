package byk.baran.solidprinciples.interfaceseggregation.gooddesign;


/**
 * Username = baranbuyuk
 * Date = 30.07.2021 14:22
 **/
public class Main {

    public static void main(String[] args) {
        IphoneX iphone = new IphoneX();
        iphone.call();
        iphone.connect();
        iphone.send();
        iphone.shot();

        Phone nokia3310 = new Nokia3310();
        nokia3310.call();
        nokia3310.send();
    }
}
