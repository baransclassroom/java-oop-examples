package byk.baran.solidprinciples.openclosed.baddesign;

/**
 * Username = baranbuyuk
 * Date = 30.07.2021 12:14
 **/
public class Main {

    public static void main(String[] args) {
        Employee engineer = new Employee("engineer", 30);
        System.out.printf("Engineer Salary is %f\n", engineer.calculateSalary(engineer.getJob()));


        Employee manager = new Employee("manager", 1);
        System.out.printf("Manager Salary is %f\n", manager.calculateSalary(manager.getJob()));

        Employee teacher = new Employee("teacher", 365);
        System.out.printf("Teacher Salary is %f\n", teacher.calculateSalary(teacher.getJob()));

        //as you can see above examples, there are 3 different employee like engineer, manager and teacher.
        //Employee has a calculate salary. With this method we can get monthly salary each engineer.
        // If we have a new employee type, we have to write new if-else block and calculate salary.
        // with this approach we are changing the existing code. Solid says dont change existing code, if you need to add new feature, add new code.


    }
}
