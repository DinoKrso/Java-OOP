public class Birds {
    private String name ; 
    private String latinName ;
    private int observed ;

    public Birds(String name , String latinName){
        this.name = name ;
        this.latinName = latinName ; 
        this.observed = 0 ;

    }
    
    public String name(){
        return this.name ;
    } 
    public String latinName(){
        return this.latinName ; 
    }
    public int observed(){
        return this.observed ;
    }

    public void setObserved(){
        this.observed ++ ;
    }

       
    public String toString(){
        return this.name + ", " +"(" +  this.latinName +")" + ", " + this.observed + "observations ";
        
    }
}
