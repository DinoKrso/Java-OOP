public class BinarySearch {
    
    public static boolean search(int[] array , int searchedValue){
        int lo = 0, hi = array.length - 1;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (array[mid] < searchedValue) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (array[lo] == searchedValue) {
          return true ;
        }
        else if (array[hi] == searchedValue) {
            return true ; 
        }
        else {
            return false ;
        }

    }
    
}
