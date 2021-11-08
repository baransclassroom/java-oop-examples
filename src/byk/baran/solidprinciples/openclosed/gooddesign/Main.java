package byk.baran.solidprinciples.openclosed.gooddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 13:06
 **/
public class Main {

    public static void main(String[] args) {
        Employee engineer = new Engineer(new YearlyRate());
        System.out.printf("Engineer salary %f\n", engineer.calculateSalary());

        Employee teacher = new Teacher(new DailyRate());
        System.out.printf("Teacher salary %f\n", teacher.calculateSalary());
    }
}
