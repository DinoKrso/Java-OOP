import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library ;
    public Library(){
        this.library = new ArrayList<>() ;
    }

    public void addBook(Book newBook){
        this.library.add(newBook) ;

    }
    public void printBooks(){
        for(int i = 0 ; i < library.size() ; i++){
            System.out.println(library.get(i)) ;
        }

    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();

        for(int i = 0 ; i < library.size() ; i ++ ){
            if(StringUtils.included(library.get(i).title(), title ) ){
                found.add(library.get(i)) ;
            }
        }
        return found ;

    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(int i = 0 ; i < library.size() ; i ++ ){
            if(StringUtils.included(library.get(i).publisher(), publisher) ){
                found.add(library.get(i)) ;
            }
        }
        return found ;
       
    }

    public ArrayList<Book> searchByYear(int year){

        ArrayList<Book> found = new ArrayList<Book>();
        for(int i = 0 ; i < library.size() ; i ++ ){
            if(library.get(i).year() == year  ){
                found.add(library.get(i)) ;
            }
        }
        return found ;
    }

}
