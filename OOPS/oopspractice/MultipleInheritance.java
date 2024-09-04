class A{
   void displayInfo(){
         System.out.println("calling class A");
    }
}
class B{
   void displayInfo(){
        System.out.println("clling class B");
    }
}
class C extends  A{
    
}

public class MultipleInheritance {
    C c1 = new C();
    c1.displayInfo();
    
}
