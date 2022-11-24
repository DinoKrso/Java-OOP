public class Main {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(8,4) ;
        nightSky.print() ;
        System.out.println("Numbers of stars: "+ nightSky.starsInLastPrint()) ;
        System.out.println("") ;

        nightSky.print() ;
        System.out.println("Numbers of stars: "+ nightSky.starsInLastPrint()) ;



    }
    
}
