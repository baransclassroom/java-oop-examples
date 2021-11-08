package byk.baran.solidprinciples.singleresponsibility.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:50
 **/
public class Main {

    public static void main(String[] args) {
        Book book = new Book("Bad Godzilla");
        System.out.println(book.getCurrentPage());
        System.out.println(book.getNextPage());
        System.out.println(book.getPreviousPage());
        book.printPageAsHtml();
        book.printPageAsText();
    }
}
