import java.util.Scanner ;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Type a number : ");
       int  a = sc.nextInt();
        if(a>0) System.out.println("Number is positive");
        else if(a<0) System.out.println("Number is negative");
       
       
    }
}
