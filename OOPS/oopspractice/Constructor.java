
class Library{
   String name;   //instance variable
   String address;
   int numofbooks;

   Library(String name,String address,int numofbooks){  //constructor
    this.name=name;
    this.address=address;
    this.numofbooks=numofbooks;
   }

   public void displayLibraryInfo(){
    System.out.println(name + address + numofbooks);
   }
}
public class Constructor{
    public static void main(String[]args){

        Library myLibrary=new Library("Central Library", "123 Library St", 5000);  //value initialized while object creation
        myLibrary.displayLibraryInfo();
    }
}


//no return type is used
//constructor name should be class name 