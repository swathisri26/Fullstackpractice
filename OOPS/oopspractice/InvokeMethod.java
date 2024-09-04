
//invoking method with object
class Story{
    String title;
    String author;



 String displayauthor(){ //method header
     return  author; 
 }
 String  displaytitle(){ //method header
    return  title; 
} 

}
public class InvokeMethod {
 public static void main(String[] args) {
     Story book1 = new Story();
     Story book2 = new Story();
     book1.author="swathi";
     book2.title="The Great Gatsby";
   
     System.out.println(book1.displayauthor());
     System.out.println(book2.displaytitle());
 }    
}