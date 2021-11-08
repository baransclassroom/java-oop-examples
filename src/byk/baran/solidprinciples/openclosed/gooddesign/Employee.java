package byk.baran.solidprinciples.openclosed.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 13:01
 **/
public abstract class Employee implements Salary {

    private final Rate rate;

    protected Employee(Rate rate) {
        this.rate = rate;
    }

    @Override
    public Rate getRate() {
        return rate;
    }

    abstract double calculateSalary();
}
