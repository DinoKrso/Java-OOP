import java.util.*;  
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
        String pass = "carrot" ;
       while (true){
           System.out.println("Type a password : ");
           String str = sc.next();
        if(str.equals(pass)){
            System.out.println("Correct!");
            System.out.println("The secret message is : jjjkj");
            break;
            
        } 
        else System.out.println("Wrong!") ;
       }
	    
	}
}
