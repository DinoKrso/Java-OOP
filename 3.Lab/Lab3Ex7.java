import java.util.* ; 
public class Main
{
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> countWords = new ArrayList<Integer>();
        for(int i = 0 ; i < list.size() ; i++){
            countWords.add(i, list.get(i).length()) ;
        }
        return countWords ;
        
    }
    
	public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list) ;
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
    
}
