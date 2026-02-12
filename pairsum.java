/*given an array elemnts chek if there exist a pair (i,j) such that arr[i] + arr[j] = k and i!=j
note: i and j are index value k is gven sum
class pairsum {
    public static void main(String[] args) {
        int arr[] = {3,-2,1,4,3,6,8};
        int k =10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println("pair found at index "+i+" and "+j);
                
                }
            }
        }
    }
} */