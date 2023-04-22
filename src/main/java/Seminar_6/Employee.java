package Seminar_6;

import java.util.Objects;

public class Employee {
    int age;
    String firstName;
    String lastName;
    double salary;
    int experience;
    String familyStatus;


    // Конструктор без заданной зарплаты
//    public Employee(int age, String firstName, String lastName, double salary,
//                    int experience, String familyStatus) {
//        this.age = age;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.experience = experience;
//        this.familyStatus = familyStatus;
//    }

    // Конструктор с заданной зарплатой
    public Employee(int age, String firstName, String lastName,
                    int experience, String familyStatus) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        salary = 50.0;
        this.experience = experience;
        this.familyStatus = familyStatus;
    }


    @Override
    public String toString() {
        String res = String.format("age:%d, name:%s, last name:%s, salary:%.2f, experience:%d, family status:%s",
                age, firstName, lastName, salary, experience, familyStatus);
        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, salary, experience, familyStatus);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee emp = (Employee) obj;
        return age == emp.age && firstName == emp.firstName && lastName == emp.lastName
                && salary == emp.salary && experience == emp.experience && familyStatus == emp.familyStatus;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean olderThan(Employee e) {
        if (age > e.age) {
            return true;
        } else {
            return false;
        }
    }
}
