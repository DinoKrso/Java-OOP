import java.util.*;  
public class Main
{
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.println("First: ");
		int a = reader.nextInt();
		System.out.println("Last: ");
		int b= reader.nextInt() ; 
		 int i = a ;
		while(i!=b){
		    if(a>b) break ;
		    else{
		    System.out.println(i);
		    i++ ; 
		    }
		}
    
    }
}
