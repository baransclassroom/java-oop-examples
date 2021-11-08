package byk.baran.inheritance.single;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:09
 **/
public class Student extends Human {

    // IS-A relation
    private final String name;
    private final int age;


    public Student(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public void showInfo() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }

}
