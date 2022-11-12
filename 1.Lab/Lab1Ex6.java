import java.util.Scanner ;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Type a number : ");
       int  a = sc.nextInt();
        System.out.println("Type second number: ");
        int b = sc.nextInt() ; 
        
        if(a>b) System.out.println("Greater is : "+a ) ;
        else if(b>a) System.out.println("Greater is : "+b) ;
        else if (a==b) System.out.println("Numbers are equal" ) ;
        
       
    }
}
