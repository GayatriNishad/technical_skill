//read the array and find its lenght
//create a pf sum array and store the cumulative sum of the array pf=[0] arr[0]
//for (i==0)
//pf [i] =arr[i-1]
//calcualte theleft sum if i==0 left sum=0 else left sum =pf[i-1]
//calculate the right sum right sum=pf[n-1]-pf[i]
//if left sum == right sum incress the counter

//arr=[-7,1,5,2,-4,3,0]
// pf=[1 3 6 10 15]
// pf[0]=arr[0]
// pf[i]=arr[i]+pf[i-1] solve this question*/
public class prifixSum {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] = arr[i] + pf[i - 1];
        }
        System.out.print("Sum Array: ");
        for (int sum : pf) {
            System.out.print(sum + " ");
        }
    }
}
// algorithm
// 1.read the a array and find its lenght
// 2.create the prefixdum of the array and store the cumultive sunm of the array
// 3.calculae the left sum if(i==0)leftsum=0 else leftsum=pf[i-1]




