
class Employee {
   
    private String name;
    private int age;

  
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public String getName() {
        return name;  
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

   public class Encapsulation{
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25);
        System.out.println(emp.getName());  
        emp.setName("Bob");
        System.out.println(emp.getName());  
        System.out.println(emp.getAge());   
        emp.setAge(30);
        System.out.println(emp.getAge());   
    }
}
}