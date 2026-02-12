//given an integer a of size n in one second you can increse the value of one element by one 
    //find the minimum time in seconds to make the all the ements of the array equal
    //arr=[2 4 1 3 ]
    //output 6
    public class Totaltimeinseconds {
        public static void main(String[] args) {
            int arr[] = {2, 4, 1, 3};
            int n = arr.length;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int time = 0;
            for (int i = 0; i < n; i++) {
                time += (max - arr[i]);
            }
            System.out.println("Minimum time in seconds: " + time);
        }
    }
            