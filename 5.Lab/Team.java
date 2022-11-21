import java.util.ArrayList ; 

public class Team {
    private String name ; 
    private ArrayList<Player> players = new ArrayList<Player>(); 
    int maxSize = 16 ;
    
    Team(String name){
        this.name = name ; 
    }

    public String getName(){
        return this.name ; 
    }

    public void addPlayer(Player player){
        if(this.players.size()< this.maxSize){
            this.players.add(player) ; 
        }
    }
    public void printPlayers(){
        for(int i  = 0 ; i < players.size() ; i++){
            System.out.println(players.get(i)) ; 
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize ;

    }

    public int size(){
        return this.players.size() ;

    }
    public int goals(){
        int totalGoals = 0 ; 
        for(Player player : this.players){
            totalGoals = totalGoals + player.getGoals();
        }
        return totalGoals ;
    }

}
