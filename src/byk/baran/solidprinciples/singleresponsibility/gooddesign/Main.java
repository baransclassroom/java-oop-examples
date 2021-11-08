package byk.baran.solidprinciples.singleresponsibility.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:35
 **/
public class Main {

    public static void main(String[] args) {
        Book godzilla = new Book(new HTMLPrinter(), new DefaultPager());
        System.out.println(godzilla.getPager().currentPage());
        System.out.println(godzilla.getPager().nextPage());
        System.out.println(godzilla.getPager().nextPage());
        System.out.println(godzilla.getPager().nextPage());
        System.out.println(godzilla.getPager().previousPage());
        godzilla.getPrinter().print("X-T");

    }
}
