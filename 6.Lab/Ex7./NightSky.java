import java.util.Random;

public class NightSky {
    private double density ; 
    private int width ; 
    private int height ; 
    private Random probability = new Random() ;
    private int countStars ;
    public NightSky(double density){
        this.density = density ;
        this.width = 20 ;
        this.height = 10 ;
    }
    public NightSky(int width, int height){

        this.width = width ; 
        this.height = height ; 
        this.density = 0.1 ;
    }
    public NightSky(double density, int width , int height){
        this.width = width ; 
        this.height = height ; 
        this.density = density ;
    }

    public void printLine(){
        for(int i  = 0 ; i < this.width ; i++){
            if(probability.nextDouble() == this.density){
                System.out.print("*") ;
            }
            else System.out.print(" ") ;
        }
        System.out.println() ;

    }
    
    public void print(){
        this.countStars = 0 ; 
        for(int j = 0 ; j < this.height ; j++){
        for(int i  = 0 ; i < this.width ; i++){
            if(probability.nextDouble() <= this.density){
                System.out.print("*") ;
                this.countStars++ ;
            }
            else System.out.print(" ") ;
        }
        System.out.println() ;
    }
    

    }
    public int starsInLastPrint(){
        return countStars ; 
    }
    
}
