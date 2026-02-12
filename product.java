/* given an array of integer a find and return the product  array of the same size where the ith element of the
 product array will we equals to the products of all elements divided by the ith element of the array 
 
 class product {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] productArr = new int[n];
        int totalProduct = 1;
        for (int i = 0; i < n; i++) {
            totalProduct *= arr[i];
        }
        for (int i = 0; i < n; i++) {
            productArr[i] = totalProduct / arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(productArr[i] + " ");
        }
        
    }
}*/
