package byk.baran.solidprinciples.singleresponsibility.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:31
 **/
public class DefaultPager implements Pager {

    private int currentPage;

    public DefaultPager() {
        this.currentPage = 0;
    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public int nextPage() {
        currentPage = currentPage + 1;
        return currentPage;
    }

    @Override
    public int previousPage() {
        this.currentPage = currentPage - 1;
        return currentPage;
    }
}
