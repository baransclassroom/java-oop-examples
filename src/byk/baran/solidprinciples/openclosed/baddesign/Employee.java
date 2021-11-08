package byk.baran.solidprinciples.openclosed.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:10
 **/
public class Employee {


    private final String job;
    private final double rate;

    public Employee(String job, double rate) {
        this.job = job;
        this.rate = rate;
    }

    public double calculateSalary(String job) {
        return switch (job) {
            case "teacher" -> rate * 100;
            case "manager" -> rate * 10000;
            case "engineer" -> rate * 300;
            default ->
                    //no-op
                    0;
        };
    }

    public String getJob() {
        return job;
    }
}
