
class Person {
    void displayRole() {
        System.out.println("Person has a role.");
    }
}


class Employee extends Person {
    @Override
    void displayRole() {
        System.out.println("Employee works in a company.");
    }
}

class Student extends Person {
    @Override
    void displayRole() {
        System.out.println("Student studies in a school or university.");
    }
}


class Teacher extends Person {
    @Override
    void displayRole() {
        System.out.println("Teacher teaches students.");
    }
}


public class Overriding {
    public static void main(String[] args) {
       
        Person[] people = new Person[4];

        people[0] = new Person();
        people[1] = new Employee();
        people[2] = new Student();
        people[3] = new Teacher();


        for (Person person : people) {
            person.displayRole();
        }
    }
}
