abstract class Member{
    abstract void welcomeMessage();
}
class Student extends Member{
    @Override
    void welcomeMessage(){
        System.out.println("Welcome Students");
    }
}
class Teacher extends Member{
    @Override
    void welcomeMessage(){
        System.out.println("Welcome Teacher");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
     
        Member[]obj = new Member[4];
        obj[0]=new Student();
        obj[1]=new Student();
        obj[2]=new Teacher();
        obj[3]=new Teacher();

        for(Member m:obj){
            m.welcomeMessage();
        }
    }
    
}
