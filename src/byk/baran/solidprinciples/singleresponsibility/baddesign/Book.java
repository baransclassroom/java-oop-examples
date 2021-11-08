package byk.baran.solidprinciples.singleresponsibility.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:27
 **/
public class Book {

    private int currentPage = 0;

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getNextPage() {
        currentPage += 1;
        return currentPage;
    }

    public int getPreviousPage() {
        currentPage -= 1;
        return currentPage;
    }

    public void printPageAsText() {
        System.out.println("Printed Page");
    }

    public void printPageAsHtml() {
        System.out.println("<html> Printed Page</html>");
    }

    // this is not good for Single Responsibility principles

}
