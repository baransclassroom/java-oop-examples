package byk.baran.solidprinciples.singleresponsibility.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:30
 **/
public class Book {

    private final Printer printer;
    private final Pager pager;

    public Book(Printer printer, Pager pager) {
        this.printer = printer;
        this.pager = pager;
    }

    public String getName() {
        return "Godzilla";
    }

    public Printer getPrinter() {
        return printer;
    }

    public Pager getPager() {
        return pager;
    }


}
