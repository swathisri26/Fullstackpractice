class Employee{
    private String name;
    private int salary;
    Employee(String n,int s){
        name = n;
        salary = s;
    }
    Employee(){
        name=" ";
        salary=0;
    }

  String getName(){
    return name;
  }
  void setName(String n){
    name = n;
  }
  int getSalary(){
    return salary;
  }
  void setSalary(int s){
   salary=s;
  }
  void raiseSalary(int percentage){
    salary += salary*percentage/100;
  }

}
class Manager extends Employee{
    int bonus;
    Manager(String n,int s,int b){
        super(n,s);
        bonus = b;
    }
    public void setBonus(int b){
        bonus=b;
    }
    @Override
    public int getSalary(){
        return super.getSalary()+bonus;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("swathi",30000);
        e1.raiseSalary(10);

        System.out.println(e1.getSalary());
        Manager m1 = new Manager("sri",70000, 0);
        m1.setBonus(20000);
        System.out.println(m1.getSalary());
        
    }
    
}
