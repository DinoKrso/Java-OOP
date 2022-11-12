import java.util.* ; 
public class Main
{
    public static void palindrome(String word) {
        int j = 1 ;
        boolean check = false ; 
            for(int i = 0 ; i < word.length() ; i++){
                if(word.charAt(i) == word.charAt(word.length()-j)){
                    check = true ;
                }
                else break ;
            }
            if(check == true )System.out.println("The text is palindrome!");
            else System.out.println("The text is not a palindrome!");
           }    
    
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in) ; 
	    System.out.println("Type a text: ");
	    String word = reader.nextLine() ;
        palindrome(word) ;
	  
    }
    
}
