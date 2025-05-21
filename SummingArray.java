public class SummingArray {
    public int SumArray(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return recursiveSum(arr, 0);
    }

    private int recursiveSum(int arr[], int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + recursiveSum(arr, index + 1);
    }

    public static void main(String[] args) {
        SummingArray summer = new SummingArray();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(summer.SumArray(arr));
    }
}