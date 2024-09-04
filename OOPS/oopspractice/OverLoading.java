/*public class OverLoading {
    static int max(int a,int b){
        return a>b?a:b;

    }                                                                           //same name with different argument or differnt count 
    static double max(double a,double b){
        return a>b?a:b;

    }
    static char max(char a,char b){
        return a>b?a:b;

    }
    public static void main(String[] args) {
        System.out.println(max(7,8));
        System.out.println(max(7.5,8.0));
        System.out.println(max('p','c'));
    }
    
}*/


/*public class OverLoading {
    static void test(){
       System.out.println("no arugent is passed");

    }
    static void test(int a){
        System.out.println("test method with 1 argument");

    }
    static void test(int a,int b){
        System.out.println("test method with 2 argument");

    }
    public static void main(String[] args) {
       test();
       test(5);
       test(5,7);
    }
    
}*/


class BankAccount {
    private double balance;

   
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

   
    public void deposit(String checkNumber, double amount) {
        balance += amount;
        System.out.println("Deposited check number: " + checkNumber + " with amount: " + amount);
    }

 
    public double getBalance() {
        return balance;
    }
}


public class OverLoading {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000.00);

      
        account.deposit(500.00); 
        account.deposit("CHK12345", 750.00); 

     
        System.out.println("Current balance: " + account.getBalance()); 
    }
}




