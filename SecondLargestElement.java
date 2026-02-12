/* you are an given an integer array a  you have to find the
 second largest element value in the array or report 
that no such element exists without using and operator send me simple and easy code 
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {30, 40, 50, 20, 10};
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest) {
                if (arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
        }
        if (secondLargest == -1) {
            System.out.println("No such element exists");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}*/



    