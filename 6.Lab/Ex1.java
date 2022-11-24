public class Ex1 {
    public static int smallest(int[] array) {
        int numb = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < numb)
               numb = array[i];    
    }
    return numb;
}
    public static void main(String[] args) {
       
        int[] values = {6,5,8,7,11} ;
        System.out.println("smallest: " + smallest(values));
        
    }
}
