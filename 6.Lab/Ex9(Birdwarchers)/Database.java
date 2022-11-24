import java.util.*;
public class Database {
   private ArrayList<Birds> database ;

   public Database(){
       this.database = new ArrayList<>() ;
   }

   public void addBird(Birds newBird){
    this.database.add(newBird) ;

}

 public void observationBird(String name){
    for(int i = 0 ; i < this.database.size() ; i ++ ){
        if(StringUtils.included(this.database.get(i).name(), name) ){
         this.database.get(i).setObserved();
         return ; 
        }
        
    }
    System.out.println("Is not a bird") ;
}

    public void printBrids(){
        for(int i = 0 ; i < database.size() ; i++){
            System.out.println(database.get(i)) ;
        }

    }

    public void printSpecBird(String name){
        for(int i = 0 ; i < database.size() ; i++){
            if(StringUtils.included(this.database.get(i).name(), name)) System.out.println(this.database.get(i)) ;
        }
    }

 }
    

