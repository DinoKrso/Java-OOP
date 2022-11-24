public class Book {
    private String title ; 
    private String nameOfPublisher; 
    private int yearOfPublish ; 

    public Book(String title, String publisher, int year){
        this.title = title ;
        this.nameOfPublisher = publisher ; 
        this.yearOfPublish = year ;
    } 

    public String title(){
        return this.title ;
    } 
    public String publisher(){
        return this.nameOfPublisher ; 
    }
    public int year(){
        return yearOfPublish ;
    }
    
    public String toString(){
        return this.title + ", " + this.nameOfPublisher + ", " + this.yearOfPublish ;
        
    }
}
