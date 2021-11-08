package byk.baran.solidprinciples.openclosed.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 13:02
 **/
public class Teacher extends Employee {

    protected Teacher(Rate rate) {
        super(rate);
    }

    @Override
    double calculateSalary() {
        return getRate().getRate() * 500;
    }


}
