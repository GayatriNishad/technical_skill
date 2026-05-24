//you are given an integer array A. 
// You have to find the second largest element/value 
//in the array or report that no such  element exits

public class largestElement {
    public static void main(String[] args) {
        int[]arr = {};
        if (arr <= -1) {
            return -1;
        }
        int maxi1 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxi1) {
                maxi1 = arr[i];
            }
        }
        int maxi2 = -1;
        for (int i = 0; i < arr.length; i++) {

        }

    }
}
