package byk.baran.solidprinciples.openclosed.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 13:09
 **/
public class YearlyRate implements Rate {
    @Override
    public double getRate() {
        return 365;
    }
}
