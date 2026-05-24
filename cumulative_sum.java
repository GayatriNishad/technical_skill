//read the array and find its lenght
//create a pf sum array and store the cumulative sum of the array pf=[0] arr[0]
//for (i==0)
//pf [i] =arr[i-1]
//calcualte the left sum if i==0 left sum=0 else left sum =pf[i-1]
//calculate the right sum right sum=pf[n-1]-pf[i]
//if left sum == right sum incress the counter

public class cumulative_sum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        int leftsum, rightsum;
        for (int i = 1; i < arr.length; i++) {

        }
    }
}

// given an int A of size n in one second you can increase the value of one
// element by 1.
// find the minimum time in second to make the all the element of the array
// arr=[2,4,1,3]
// output =6
