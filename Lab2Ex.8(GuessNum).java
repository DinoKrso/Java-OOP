import java.util.*; 
import java.util.Random;
public class Main{
       private static int drawNumber() {
        return new Random().nextInt(101);
    }
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    int guessNumber = drawNumber() ;
	    System.out.println(guessNumber);
	    int guessCount = 1 ;
	    while(true){
	            System.out.print("Guess a number : ");
	            int num = reader.nextInt() ;
	        if(num < guessNumber) {
	           System.out.println("The number is greater , guess made: " + guessCount);
	        }
	        else if(num > guessNumber) {
	            System.out.println("The number is lesser , guess made: " + guessCount);
	            
	        }
	       else if(num == guessNumber){
	           System.out.println("Congratulations, your guess is correct!");
	           break ;
	       }
	       guessCount++ ;
	    }
	    
	    
    
	}

}
