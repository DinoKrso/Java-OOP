import java.util.* ; 
public class Main
{
    
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);  
    ArrayList<String> words  = new ArrayList<String>() ;
    System.out.print("Type a word : ") ;
            String word1 = reader.nextLine();
            words.add(word1) ;
    boolean check = false ; 
    for(int i = 0 ; i<words.size(); i++){
         System.out.print("Type a word : ") ;
            String word2 = reader.nextLine();
            words.add(word2) ;
        for(int j = 0 ; j<=i; j++){
                if(word2.equals(words.get(j))){
                        System.out.println("You gave the word "+ word2 + " twice");
                        check = true ;
                        break;
                     }


            }       
            if(check) break;
        }
        Collections.sort(words);
        System.out.println("Sorted words: ");
        for(int i = 0 ; i<words.size() ; i++){
            System.out.println(words.get(i));
        }
    }
    
}
