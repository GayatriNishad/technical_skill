//Given  N array elements, check if there exits a pair(i,j) such that arr[i]+arr[j]==K and i!=j.
//Note: I and j are index value K is given sum.
// Arr=[3,-2,1,4,3,6,8]
//K=10
public class ith_element {
    public static void main(String[]args){
        int[] arr={3,-2,1,4,3,6,8};
        int n=arr.length;
        int total=1;
        for ( int i=0;i<arr.length;i++){
            total=total*arr[i];
        }
        int[] product arr =new int[n];
            for (int i=0;i<n;i++){
                product arr[i]=total/arr[i];
            }
            System.out .print("Product array:");
            for ( int i=0;i<n;i++){
                System.out.print(product+ arr[i]+" ");
            }
        }
}
