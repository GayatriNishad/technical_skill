/*given n array elements 
find count number of element having atlest 1 element greaterthen itself write the program in java*/
public class CountElemenets{
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 5, 2};
        int result = countElements(arr);
        System.out.println("Count element: " + result);
    }
    public static int countElements(int[] arr) {
        int MAX = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > MAX) {
                MAX = num;
            }
        }
        int count = 0;
        for (int num : arr) {
            if (num < MAX) {
                count++;
            }
        }
        return count;
    }
}