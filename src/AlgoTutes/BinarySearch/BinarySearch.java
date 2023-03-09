package AlgoTutes.BinarySearch;
import java.util.Arrays;

class BinarySearch {
    public static int binarySearch (int[] arr, int left, int right, int find) {
        if (right >= left) {
             int mid = left + (right - left) /2;

             if (arr[mid] == find) {
                 return mid;
             }

             if (find < mid) {
                 return binarySearch(arr, left, mid - 1, find);
             }

             if (find > mid) {
                 return binarySearch(arr, mid + 1, right, find);
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2,43,1,42,23,10,0};
        Arrays.sort(arr);
        int result = binarySearch(arr, 0, arr.length -1, 42);

        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Result is "+ arr[result]);
        }
    }

}
