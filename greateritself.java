public class greateritself {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 4, 7, 8, 6 };
        int result = greateritself(arr);
        System.out.println("Count of elements:" + result);
    }

    public static int greateritself(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;

            }

        }
        int count = 0;
        for (int num : arr) {
            if (num < max) {
                count++;
            }
        }
        return count;

    }

}
