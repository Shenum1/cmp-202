package Encapsulation;

public class Main{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Shenume");
        person1.displayName();
        Person student = new Person("Shenum", "12345", "Bingham university", "BHU/22/04/09/0085");
        Person staff = new Person("Bingham university", "J$$67", "54321", "056");
        System.out.println();
        System.out.println(student);
        System.out.println(staff);

        physics velocity = new physics();
        System.out .println(velocity.calVelocity(150.0f, 2));
        physics velocity1 = new physics();
        System.out.println(velocity1.calVelocity(5.00f, 6.00f,8));

    }
}
