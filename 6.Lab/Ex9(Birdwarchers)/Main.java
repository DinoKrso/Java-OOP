import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database newDatabase = new Database() ;
        Scanner reader = new Scanner(System.in) ;
        while(true){
        System.out.print("? ");
        String choice = reader.nextLine() ;
        if(choice.equals("Add")){
            System.out.print("Name: ");
            String name = reader.nextLine() ;
            System.out.print("Latin name: ") ;
            String latinName = reader.nextLine() ;
            Birds birds = new Birds(name,latinName) ;
            newDatabase.addBird(birds) ;

        }
        if(choice.equals("Observation")){
            System.out.print("What was observed: ? ") ;
            String observation = reader.nextLine() ;
            newDatabase.observationBird(observation) ;
            

        }
        if(choice.equals("Statistics")){
            newDatabase.printBrids() ;
        }
        if(choice.equals("Show")){
            System.out.print("What? ");
            String birdName = reader.nextLine();
            newDatabase.printSpecBird(birdName) ;
        }

        if(choice.equals("Quit")) break ;
        }

    }
    
}
