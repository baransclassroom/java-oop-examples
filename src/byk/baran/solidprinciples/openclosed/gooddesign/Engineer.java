package byk.baran.solidprinciples.openclosed.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 13:02
 **/
public class Engineer extends Employee {


    public Engineer(Rate rate) {
        super(rate);
    }

    @Override
    double calculateSalary() {
        return getRate().getRate() * 30000;
    }

}
