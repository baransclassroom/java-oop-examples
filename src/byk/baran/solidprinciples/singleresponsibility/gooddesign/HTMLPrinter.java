package byk.baran.solidprinciples.singleresponsibility.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:34
 **/
public class HTMLPrinter implements Printer {

    public HTMLPrinter() {
    }

    @Override
    public void print(String page) {
        System.out.printf("<html> %s </html>",page);
    }
}
