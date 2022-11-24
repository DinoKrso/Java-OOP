public class Ex3 {
    public static int indexOfSmallestStartingFrom(int[] array,int index) {
        int numb = array[index];
        int indexOfSmallest = 0 ;
        for (int i = index; i < array.length; i++) {
            if (array[i] < numb)
               numb = array[i];    
    }
        for(int i = index ; i < array.length; i++ ){
            if(numb == array[i]) indexOfSmallest = i ;
        }
        return indexOfSmallest ; 
   
}
    public static void main(String[] args) {
       
        int[] values = {-1,6,9,8,12} ;
        System.out.println("smallest: " + indexOfSmallestStartingFrom(values,1));
        System.out.println("smallest: " + indexOfSmallestStartingFrom(values,2));
        System.out.println("smallest: " + indexOfSmallestStartingFrom(values,4));

    }
}
