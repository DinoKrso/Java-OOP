import java.util.*;  
public class Main
{
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = reader.nextInt();
		int result = 0;
		for (int i = 0;i<=a ;i++ ){
		    result += Math.pow(2,i) ;
		} 
		
		
	    System.out.println("Result: " + result);

    }
}
