import java.util.Scanner;

public class BinarySearch {

    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

       
        System.out.println("Enter " + size + " sorted elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        
        int result = binarySearch(arr, target);

        
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found in the array");

        scanner.close();
    }
}
