package binarysearch;


public class BinarySearch {
    public static int bSearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 21, 35, 64, 99, 102, 1005, 5003};
        int binarySearch = BinarySearch.bSearch(arr, 5003);
        if (binarySearch == -1) {
            System.out.println("object not found");
        } else System.out.println("your object is in index : " + binarySearch);

    }
}
