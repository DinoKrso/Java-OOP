public class Player {

    private String name ;
    private int numberOfGoals ;

    Player(String name) {
        this.name = name ; 

    }

    Player(String name , int numberOfGoals){
        this.name = name ; 
        this.numberOfGoals = numberOfGoals ; 

    }

    public String getName(){
        return this.name ; 
    }

    public int getGoals(){
        return this.numberOfGoals ; 
    }

    public String toString(){
        return this.name + ", goals: " + this.numberOfGoals;
    }
    
}
