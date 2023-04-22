package Seminar_6;

public class EmployeeMain {
    public static void main(String[] args) {
//        Employee emp1 = new Employee(25, "Ivan", "Ivanov", 100, 8, "bachelor");
//        Employee emp2 = new Employee(25, "Ivan", "Ivanovich", 100, 8, "bachelor");
        Employee emp3 = new Employee(25, "Den", "Kot", 10, "married");
        Employee emp4 = new Employee(20, "Den", "Kot", 10, "married");

        System.out.println(emp3.toString());
        System.out.println(emp4.olderThan(emp3));

//        System.out.println(emp1.toString());
//        System.out.println(emp2.toString());
//        System.out.println(emp1.equals(emp2));
//        System.out.println(emp1.hashCode());
//        System.out.println(emp2.hashCode());
//        System.out.println(emp1.getFullName());
    }
}
