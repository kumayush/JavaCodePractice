package revisioncodes;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid; // Element found

            if (arr[mid] < target)
                left = mid + 1; // Search in right half
            else
                right = mid - 1; // Search in left half
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int target = 12;

        int result = binarySearch(numbers, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}