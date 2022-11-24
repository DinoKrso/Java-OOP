public class Ex2 {
    public static int indexOfSmallest(int[] array) {
        int numb = array[0];
        int indexOfSmallest = 0 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < numb)
               numb = array[i];    
    }
        for(int i = 0 ; i < array.length; i++ ){
            if(numb == array[i]) indexOfSmallest = i ;
        }
        return indexOfSmallest ; 
   
}
    public static void main(String[] args) {
       
        int[] values = {6,5,8,7,11} ;
        System.out.println("smallest: " + indexOfSmallest(values));

    }
}
