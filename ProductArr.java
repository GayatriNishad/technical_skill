/* given an array of integer a find and return the product  array of the same size where the ith element of the
 product array will we equals to the products of all elements divided by the ith element of the array */
 
//  class product {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4};
//         int n = arr.length;
//         int[] productArr = new int[n];
//         int totalProduct = 1;
//         for (int i = 0; i < n; i++) {
//             totalProduct *= arr[i];
//         }
//         for (int i = 0; i < n; i++) {
//             productArr[i] = totalProduct / arr[i];
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(productArr[i] + " ");
//         }
        
//     }
// }


public class ProductArr {
    public static void main(String[] args){
        int arr[] = {5,1,10,1};
        // Declare product array
        int productArr[] = new int[arr.length];

        int TotalProduct = 1;

        // calculate Total Product 
        for(int i=0; i<arr.length; i++){
            TotalProduct *= arr[i];
        }

        // create product array using TotalProduct
        for(int i=0; i<productArr.length; i++){
            productArr[i] = TotalProduct / arr[i];
        }

        // print the Elements of the product array
        System.out.print("Product array : ");
        for(int i=0; i<productArr.length; i++){
            System.out.print(+productArr[i]+" ");
        }
        System.out.println();
    }
}
   


    