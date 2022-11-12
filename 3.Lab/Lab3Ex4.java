import java.util.* ; 
public class Main
{
    
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);  
    System.out.println("Type your name: ");
    String name = reader.nextLine();
    char[] resultarray = name.toCharArray();
    System.out.print("In reverse order: ");
    for (int i = resultarray.length -1 ;i>=0 ;i-- ){
        System.out.print(resultarray[i]);
        
    } 
   }
}
