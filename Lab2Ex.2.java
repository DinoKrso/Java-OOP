import java.util.*;  
public class Main
{
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		int sum = 0 ;
		int read ;
		System.out.print("Type the first number: ");  
        int a= reader.nextInt();  
        System.out.print("Type the second number: ");  
        int b= reader.nextInt();  
        System.out.print("Type third number: ");  
        int c= reader.nextInt();  
        
        sum = a + b + c ; 
        System.out.println("Sum: " + sum) ;
        
		
	}
}
