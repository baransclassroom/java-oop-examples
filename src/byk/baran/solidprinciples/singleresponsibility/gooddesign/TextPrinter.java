package byk.baran.solidprinciples.singleresponsibility.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:35
 **/
public class TextPrinter implements Printer {
    public TextPrinter() {
    }

    @Override
    public void print(String page) {
        System.out.println(page);
    }
}
