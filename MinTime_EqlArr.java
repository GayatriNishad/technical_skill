public class MinTime_EqlArr {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int A [] = {2,4,1,3};
        int N = A.length;

        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
        }

        int time = 0;
        for(int i=0; i<N; i++){
            time += max-A[i];
        }
        System.out.println("Total Time = "+time);
    }
}